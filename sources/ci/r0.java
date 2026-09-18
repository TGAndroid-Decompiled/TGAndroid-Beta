package ci;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;
public final class r0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f5394a;
    public final File f5395b;
    public MessageObject f5396c;
    public final p0 d;
    public final q0 e;
    public final o0 f5397f;

    public r0(int i10, o8 o8Var, File file, p0 p0Var, q0 q0Var, o0 o0Var) {
        this.f5394a = i10;
        this.f5395b = file;
        this.d = p0Var;
        this.e = q0Var;
        this.f5397f = o0Var;
        if (this.f5396c != null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f18317id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f5396c = new MessageObject(i10, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        o8Var.s(new ai.y1(this, 7));
    }

    public final void a(boolean z10) {
        if (this.f5396c == null) {
            return;
        }
        int i10 = this.f5394a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z10) {
            MediaController.getInstance().cancelVideoConvert(this.f5396c);
        }
        this.f5396c = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            MessageObject messageObject = (MessageObject) objArr[0];
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            if (((MessageObject) objArr[0]) == this.f5396c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f7 = (Float) objArr[4];
                f7.getClass();
                this.e.run(f7);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService.stop();
                    a(false);
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.f5396c) {
            a(false);
            try {
                File file = this.f5395b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f5397f.run();
        }
    }
}
