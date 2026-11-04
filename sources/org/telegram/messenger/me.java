package org.telegram.messenger;

import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.k40;
public final class me implements Runnable {
    public final int f24191a;
    public final double f24192b;
    public final Runnable f24193c;

    public me(Runnable runnable, double d, int i3) {
        this.f24191a = i3;
        this.f24193c = runnable;
        this.f24192b = d;
    }

    @Override
    public final void run() {
        int i3 = this.f24191a;
        double d = this.f24192b;
        Runnable runnable = this.f24193c;
        switch (i3) {
            case 0:
                MediaController mediaController = (MediaController) ((mi.b0) runnable).f19470b;
                hs.f(mediaController.f21323i1).k(154, Integer.valueOf(mediaController.f21321h1), Double.valueOf(d));
                return;
            default:
                k40 k40Var = ((c40) ((b40) runnable).f32080b).I0;
                hs.f(k40Var.f35272e).k(154, Integer.valueOf(k40Var.V), Double.valueOf(d));
                return;
        }
    }
}
