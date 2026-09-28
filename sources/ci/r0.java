package ci;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;
public final class r0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f5420a;
    public final File f5421b;
    public MessageObject f5422c;
    public final p0 d;
    public final q0 e;
    public final o0 f5423f;

    public r0(int i10, l8 l8Var, File file, p0 p0Var, q0 q0Var, o0 o0Var) {
        this.f5420a = i10;
        this.f5421b = file;
        this.d = p0Var;
        this.e = q0Var;
        this.f5423f = o0Var;
        if (this.f5422c != null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f18356id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f5422c = new MessageObject(i10, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        l8Var.s(new ai.y1(this, 7));
    }

    public final void a(boolean z10) {
        if (this.f5422c == null) {
            return;
        }
        int i10 = this.f5420a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z10) {
            MediaController.getInstance().cancelVideoConvert(this.f5422c);
        }
        this.f5422c = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            MessageObject messageObject = (MessageObject) objArr[0];
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            if (((MessageObject) objArr[0]) == this.f5422c) {
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
        } else if (i10 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.f5422c) {
            a(false);
            try {
                File file = this.f5421b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f5423f.run();
        }
    }
}
