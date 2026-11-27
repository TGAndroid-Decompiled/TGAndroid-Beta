package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.ui.o;
public final class dt implements Runnable {
    public final byte a;
    public final float b;
    public final fn7 c;
    public final Object d;

    public dt(fn7 fn7Var, Object obj, float f, byte b) {
        this.a = b;
        this.c = fn7Var;
        this.d = obj;
        this.b = f;
    }

    @Override
    public final void run() {
        byte b = this.a;
        float f = this.b;
        Object obj = this.d;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                o oVar = (o) fn7Var;
                fu5 fu5Var = (fu5) obj;
                oVar.i0.N.c(true, 0.0f);
                fu5Var.p = new jt(oVar, f, (byte) 0);
                fu5Var.a0();
                return;
            default:
                MediaController mediaController = (MediaController) fn7Var;
                r47 r47Var = (r47) obj;
                String[] strArr = MediaController.W1;
                if (mediaController.j0 != null && mediaController.v0 != null && !mediaController.h0) {
                    if (mediaController.K(r47Var)) {
                        mediaController.k0(mediaController.v0, f);
                    }
                    mediaController.j0.g0();
                    return;
                }
                return;
        }
    }
}
