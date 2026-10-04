package ci;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;
public final class r0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f5827a;
    public final File f5828b;
    public MessageObject f5829c;
    public final p0 d;
    public final q0 f5830e;
    public final o0 f5831f;

    public r0(int i10, k8 k8Var, File file, p0 p0Var, q0 q0Var, o0 o0Var) {
        this.f5827a = i10;
        this.f5828b = file;
        this.d = p0Var;
        this.f5830e = q0Var;
        this.f5831f = o0Var;
        if (this.f5829c != null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20058id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f5829c = new MessageObject(i10, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        k8Var.s(new ai.y1(this, 7));
    }

    public final void a(boolean z10) {
        if (this.f5829c == null) {
            return;
        }
        int i10 = this.f5827a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z10) {
            MediaController.getInstance().cancelVideoConvert(this.f5829c);
        }
        this.f5829c = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            MessageObject messageObject = (MessageObject) objArr[0];
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            if (((MessageObject) objArr[0]) == this.f5829c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f7 = (Float) objArr[4];
                f7.getClass();
                this.f5830e.run(f7);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService.stop();
                    a(false);
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.f5829c) {
            a(false);
            try {
                File file = this.f5828b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f5831f.run();
        }
    }
}
