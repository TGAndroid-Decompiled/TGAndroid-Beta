package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.ui.o;
public final class dt implements Runnable {
    public final byte a;
    public final float b;
    public final gk7 c;
    public final Object d;

    public dt(gk7 gk7Var, Object obj, float f, byte b) {
        this.a = b;
        this.c = gk7Var;
        this.d = obj;
        this.b = f;
    }

    @Override
    public final void run() {
        byte b = this.a;
        float f = this.b;
        Object obj = this.d;
        gk7 gk7Var = this.c;
        switch (b) {
            case 0:
                o oVar = (o) gk7Var;
                cs5 cs5Var = (cs5) obj;
                oVar.i0.N.c(true, 0.0f);
                cs5Var.p = new kt(oVar, f, (byte) 0);
                cs5Var.a0();
                return;
            default:
                MediaController mediaController = (MediaController) gk7Var;
                k27 k27Var = (k27) obj;
                String[] strArr = MediaController.W1;
                if (mediaController.j0 != null && mediaController.v0 != null && !mediaController.h0) {
                    if (mediaController.G(k27Var)) {
                        mediaController.h0(mediaController.v0, f);
                    }
                    mediaController.j0.g0();
                    return;
                }
                return;
        }
    }
}
