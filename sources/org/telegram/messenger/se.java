package org.telegram.messenger;

import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.u40;
public final class se implements Runnable {
    public final int f26786a;
    public final double f26787b;
    public final Runnable f26788c;

    public se(Runnable runnable, double d, int i7) {
        this.f26786a = i7;
        this.f26788c = runnable;
        this.f26787b = d;
    }

    @Override
    public final void run() {
        int i7 = this.f26786a;
        double d = this.f26787b;
        Runnable runnable = this.f26788c;
        switch (i7) {
            case 0:
                MediaController mediaController = (MediaController) ((j6.o) runnable).f17296b;
                ls.f(mediaController.f22746i1).k(154, Integer.valueOf(mediaController.f22744h1), Double.valueOf(d));
                return;
            default:
                c50 c50Var = ((u40) ((t40) runnable).f39764b).I0;
                ls.f(c50Var.f34023e).k(154, Integer.valueOf(c50Var.V), Double.valueOf(d));
                return;
        }
    }
}
