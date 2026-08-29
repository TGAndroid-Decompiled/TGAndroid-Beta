package nh;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;
public final class r0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f18495a;
    public final File f18496b;
    public MessageObject f18497c;
    public final p0 d;
    public final q0 f18498e;
    public final o0 f18499f;

    public r0(int i10, o7 o7Var, File file, p0 p0Var, q0 q0Var, o0 o0Var) {
        this.f18495a = i10;
        this.f18496b = file;
        this.d = p0Var;
        this.f18498e = q0Var;
        this.f18499f = o0Var;
        if (this.f18497c != null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22413id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f18497c = new MessageObject(i10, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        o7Var.s(new b0(this, 1));
    }

    public final void a(boolean z10) {
        if (this.f18497c == null) {
            return;
        }
        int i10 = this.f18495a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z10) {
            MediaController.getInstance().cancelVideoConvert(this.f18497c);
        }
        this.f18497c = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            MessageObject messageObject = (MessageObject) objArr[0];
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            if (((MessageObject) objArr[0]) == this.f18497c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f9 = (Float) objArr[4];
                f9.getClass();
                this.f18498e.run(f9);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService.stop();
                    a(false);
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.f18497c) {
            a(false);
            try {
                File file = this.f18496b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f18499f.run();
        }
    }
}
