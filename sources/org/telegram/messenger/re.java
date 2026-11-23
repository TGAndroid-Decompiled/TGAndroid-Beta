package org.telegram.messenger;

import org.telegram.ui.Components.q40;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.z40;
public final class re implements Runnable {
    public final int f26673a;
    public final double f26674b;
    public final Runnable f26675c;

    public re(Runnable runnable, double d, int i7) {
        this.f26673a = i7;
        this.f26675c = runnable;
        this.f26674b = d;
    }

    @Override
    public final void run() {
        int i7 = this.f26673a;
        double d = this.f26674b;
        Runnable runnable = this.f26675c;
        switch (i7) {
            case 0:
                MediaController mediaController = (MediaController) ((i6.g) runnable).f16237b;
                ks.f(mediaController.f22813i1).k(154, Integer.valueOf(mediaController.f22811h1), Double.valueOf(d));
                return;
            default:
                z40 z40Var = ((r40) ((q40) runnable).f38686b).I0;
                ks.f(z40Var.f42665e).k(154, Integer.valueOf(z40Var.V), Double.valueOf(d));
                return;
        }
    }
}
