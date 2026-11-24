package defpackage;

import android.media.AudioRecord;
import org.telegram.messenger.MediaController;
public final class bn6 implements Runnable {
    public final byte a;
    public final MediaController b;
    public final boolean c;

    public bn6(MediaController mediaController, boolean z, byte b) {
        this.a = b;
        this.b = mediaController;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        MediaController mediaController = this.b;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                mp3 mp3Var = mediaController.N1;
                if (mediaController.g1 != null && mediaController.k1 != null) {
                    boolean z2 = mediaController.e1;
                    mediaController.e1 = !z2;
                    if (!z2) {
                        AudioRecord audioRecord = mediaController.f1;
                        if (audioRecord != null) {
                            mediaController.C1 = (byte) 4;
                            audioRecord.stop();
                            mediaController.f1.release();
                            mediaController.f1 = null;
                            mp3Var.c(new bn6(mediaController, z, (byte) 1));
                            return;
                        }
                        return;
                    }
                    mp3Var.a(mediaController.P1);
                    mp3Var.c(new zm6(mediaController, (byte) 6));
                    return;
                }
                return;
            default:
                String[] strArr2 = MediaController.W1;
                mediaController.L(z);
                return;
        }
    }
}
