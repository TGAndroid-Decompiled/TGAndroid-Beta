package ci;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;
public final class q0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f5749a;
    public final File f5750b;
    public MessageObject f5751c;
    public final o0 d;
    public final p0 f5752e;
    public final n0 f5753f;

    public q0(int i10, l8 l8Var, File file, o0 o0Var, p0 p0Var, n0 n0Var) {
        this.f5749a = i10;
        this.f5750b = file;
        this.d = o0Var;
        this.f5752e = p0Var;
        this.f5753f = n0Var;
        if (this.f5751c != null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f19823id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f5751c = new MessageObject(i10, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        l8Var.s(new ai.y1(this, 7));
    }

    public final void a(boolean z10) {
        if (this.f5751c == null) {
            return;
        }
        int i10 = this.f5749a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z10) {
            MediaController.getInstance().cancelVideoConvert(this.f5751c);
        }
        this.f5751c = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            MessageObject messageObject = (MessageObject) objArr[0];
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            if (((MessageObject) objArr[0]) == this.f5751c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f7 = (Float) objArr[4];
                f7.getClass();
                this.f5752e.run(f7);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService.stop();
                    a(false);
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.f5751c) {
            a(false);
            try {
                File file = this.f5750b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f5753f.run();
        }
    }
}
