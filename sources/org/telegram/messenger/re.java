package org.telegram.messenger;

import org.telegram.ui.Components.q40;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.z40;
public final class re implements Runnable {
    public final int f26572a;
    public final double f26573b;
    public final Runnable f26574c;

    public re(Runnable runnable, double d, int i7) {
        this.f26572a = i7;
        this.f26574c = runnable;
        this.f26573b = d;
    }

    @Override
    public final void run() {
        int i7 = this.f26572a;
        double d = this.f26573b;
        Runnable runnable = this.f26574c;
        switch (i7) {
            case 0:
                MediaController mediaController = (MediaController) ((j6.o) runnable).f17268b;
                ks.f(mediaController.f22715i1).k(154, Integer.valueOf(mediaController.f22713h1), Double.valueOf(d));
                return;
            default:
                z40 z40Var = ((r40) ((q40) runnable).f38694b).I0;
                ks.f(z40Var.f42770e).k(154, Integer.valueOf(z40Var.V), Double.valueOf(d));
                return;
        }
    }
}
