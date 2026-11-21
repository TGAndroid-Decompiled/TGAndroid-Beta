package org.telegram.messenger;

import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.u40;
public final class re implements Runnable {
    public final int f26600a;
    public final double f26601b;
    public final Runnable f26602c;

    public re(Runnable runnable, double d, int i7) {
        this.f26600a = i7;
        this.f26602c = runnable;
        this.f26601b = d;
    }

    @Override
    public final void run() {
        int i7 = this.f26600a;
        double d = this.f26601b;
        Runnable runnable = this.f26602c;
        switch (i7) {
            case 0:
                MediaController mediaController = (MediaController) ((j6.o) runnable).f17293b;
                ks.f(mediaController.f22743i1).k(154, Integer.valueOf(mediaController.f22741h1), Double.valueOf(d));
                return;
            default:
                c50 c50Var = ((u40) ((t40) runnable).f39771b).I0;
                ks.f(c50Var.f34029e).k(154, Integer.valueOf(c50Var.V), Double.valueOf(d));
                return;
        }
    }
}
