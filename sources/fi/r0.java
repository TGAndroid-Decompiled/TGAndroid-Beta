package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;
public final class r0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f11533a;
    public final File f11534b;
    public MessageObject f11535c;
    public final p0 d;
    public final q0 e;
    public final o0 f11536f;

    public r0(int i10, w7 w7Var, File file, p0 p0Var, q0 q0Var, o0 o0Var) {
        this.f11533a = i10;
        this.f11534b = file;
        this.d = p0Var;
        this.e = q0Var;
        this.f11536f = o0Var;
        if (this.f11535c != null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22048id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f11535c = new MessageObject(i10, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        w7Var.s(new ai.i(this, 17));
    }

    public final void a(boolean z10) {
        if (this.f11535c == null) {
            return;
        }
        int i10 = this.f11533a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z10) {
            MediaController.getInstance().cancelVideoConvert(this.f11535c);
        }
        this.f11535c = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            MessageObject messageObject = (MessageObject) objArr[0];
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            if (((MessageObject) objArr[0]) == this.f11535c) {
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
        } else if (i10 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.f11535c) {
            a(false);
            try {
                File file = this.f11534b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f11536f.run();
        }
    }
}
