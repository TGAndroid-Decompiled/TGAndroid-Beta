package bi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;
public final class v0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f3771a;
    public final File f3772b;
    public MessageObject f3773c;
    public final t0 d;
    public final u0 e;
    public final s0 f3774f;

    public v0(int i10, r9 r9Var, File file, t0 t0Var, u0 u0Var, s0 s0Var) {
        this.f3771a = i10;
        this.f3772b = file;
        this.d = t0Var;
        this.e = u0Var;
        this.f3774f = s0Var;
        if (this.f3773c != null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f17216id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f3773c = new MessageObject(i10, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        r9Var.s(new ai.b(this, 3));
    }

    public final void a(boolean z10) {
        if (this.f3773c == null) {
            return;
        }
        int i10 = this.f3771a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z10) {
            MediaController.getInstance().cancelVideoConvert(this.f3773c);
        }
        this.f3773c = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            MessageObject messageObject = (MessageObject) objArr[0];
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            if (((MessageObject) objArr[0]) == this.f3773c) {
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
        } else if (i10 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.f3773c) {
            a(false);
            try {
                File file = this.f3772b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f3774f.run();
        }
    }
}
