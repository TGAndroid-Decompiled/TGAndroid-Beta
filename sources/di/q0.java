package di;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;
public final class q0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f7611a;
    public final File f7612b;
    public MessageObject f7613c;
    public final o0 d;
    public final p0 e;
    public final n0 f7614f;

    public q0(int i10, k8 k8Var, File file, o0 o0Var, p0 p0Var, n0 n0Var) {
        this.f7611a = i10;
        this.f7612b = file;
        this.d = o0Var;
        this.e = p0Var;
        this.f7614f = n0Var;
        if (this.f7613c != null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f19237id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f7613c = new MessageObject(i10, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        k8Var.s(new bi.o1(this, 7));
    }

    public final void a(boolean z10) {
        if (this.f7613c == null) {
            return;
        }
        int i10 = this.f7611a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z10) {
            MediaController.getInstance().cancelVideoConvert(this.f7613c);
        }
        this.f7613c = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            MessageObject messageObject = (MessageObject) objArr[0];
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            if (((MessageObject) objArr[0]) == this.f7613c) {
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
        } else if (i10 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.f7613c) {
            a(false);
            try {
                File file = this.f7612b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f7614f.run();
        }
    }
}
