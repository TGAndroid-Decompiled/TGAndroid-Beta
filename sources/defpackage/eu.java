package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.ui.o;
public final class eu implements Runnable {
    public final byte a;
    public final float b;
    public final jm7 c;
    public final Object d;

    public eu(jm7 jm7Var, Object obj, float f, byte b) {
        this.a = b;
        this.c = jm7Var;
        this.d = obj;
        this.b = f;
    }

    @Override
    public final void run() {
        byte b = this.a;
        float f = this.b;
        Object obj = this.d;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                o oVar = (o) jm7Var;
                bu5 bu5Var = (bu5) obj;
                oVar.i0.N.c(true, 0.0f);
                bu5Var.p = new ku(oVar, f, (byte) 0);
                bu5Var.a0();
                return;
            default:
                MediaController mediaController = (MediaController) jm7Var;
                k47 k47Var = (k47) obj;
                String[] strArr = MediaController.W1;
                if (mediaController.j0 != null && mediaController.v0 != null && !mediaController.h0) {
                    if (mediaController.G(k47Var)) {
                        mediaController.h0(mediaController.v0, f);
                    }
                    mediaController.j0.g0();
                    return;
                }
                return;
        }
    }
}
