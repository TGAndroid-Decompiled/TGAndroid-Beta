package lh;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;

public final class r0 implements NotificationCenter.NotificationCenterDelegate {

    public final int f16617a;

    public final File f16618b;

    public MessageObject f16619c;
    public final p0 d;

    public final q0 f16620e;

    public final o0 f16621f;

    public r0(int i10, z7 z7Var, File file, p0 p0Var, q0 q0Var, o0 o0Var) {
        this.f16617a = i10;
        this.f16618b = file;
        this.d = p0Var;
        this.f16620e = q0Var;
        this.f16621f = o0Var;
        if (this.f16619c != null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22401id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f16619c = new MessageObject(i10, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        z7Var.s(new ag.n0(this, 26));
    }

    public final void a(boolean z10) {
        if (this.f16619c == null) {
            return;
        }
        int i10 = this.f16617a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z10) {
            MediaController.getInstance().cancelVideoConvert(this.f16619c);
        }
        this.f16619c = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            return;
        }
        if (i10 != NotificationCenter.fileNewChunkAvailable) {
            if (i10 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.f16619c) {
                a(false);
                try {
                    File file = this.f16618b;
                    if (file != null) {
                        file.delete();
                    }
                } catch (Exception unused) {
                }
                this.f16621f.run();
                return;
            }
            return;
        }
        if (((MessageObject) objArr[0]) == this.f16619c) {
            ((Long) objArr[2]).getClass();
            long jLongValue = ((Long) objArr[3]).longValue();
            Float f10 = (Float) objArr[4];
            f10.getClass();
            this.f16620e.run(f10);
            if (jLongValue > 0) {
                this.d.run();
                VideoEncodingService.stop();
                a(false);
            }
        }
    }
}
