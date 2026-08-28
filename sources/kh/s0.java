package kh;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;
public final class s0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f16004a;
    public final File f16005b;
    public MessageObject f16006c;
    public final q0 d;
    public final r0 f16007e;
    public final p0 f16008f;

    public s0(int i9, a8 a8Var, File file, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.f16004a = i9;
        this.f16005b = file;
        this.d = q0Var;
        this.f16007e = r0Var;
        this.f16008f = p0Var;
        if (this.f16006c != null) {
            return;
        }
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22401id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f16006c = new MessageObject(i9, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        a8Var.s(new bg.i(this, 24));
    }

    public final void a(boolean z10) {
        if (this.f16006c == null) {
            return;
        }
        int i9 = this.f16004a;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z10) {
            MediaController.getInstance().cancelVideoConvert(this.f16006c);
        }
        this.f16006c = null;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.filePreparingStarted) {
            MessageObject messageObject = (MessageObject) objArr[0];
        } else if (i9 == NotificationCenter.fileNewChunkAvailable) {
            if (((MessageObject) objArr[0]) == this.f16006c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                f10.getClass();
                this.f16007e.run(f10);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService.stop();
                    a(false);
                }
            }
        } else if (i9 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.f16006c) {
            a(false);
            try {
                File file = this.f16005b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f16008f.run();
        }
    }
}
