package ei;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;
public final class r0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f9699a;
    public final File f9700b;
    public MessageObject f9701c;
    public final p0 d;
    public final q0 e;
    public final o0 f9702f;

    public r0(int i10, a8 a8Var, File file, p0 p0Var, q0 q0Var, o0 o0Var) {
        this.f9699a = i10;
        this.f9700b = file;
        this.d = p0Var;
        this.e = q0Var;
        this.f9702f = o0Var;
        if (this.f9701c != null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20296id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f9701c = new MessageObject(i10, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        a8Var.s(new ai.r0(this, 13));
    }

    public final void a(boolean z10) {
        if (this.f9701c == null) {
            return;
        }
        int i10 = this.f9699a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z10) {
            MediaController.getInstance().cancelVideoConvert(this.f9701c);
        }
        this.f9701c = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            MessageObject messageObject = (MessageObject) objArr[0];
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            if (((MessageObject) objArr[0]) == this.f9701c) {
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
        } else if (i10 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.f9701c) {
            a(false);
            try {
                File file = this.f9700b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f9702f.run();
        }
    }
}
