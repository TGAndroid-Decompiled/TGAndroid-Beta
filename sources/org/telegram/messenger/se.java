package org.telegram.messenger;

import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.u40;
public final class se implements Runnable {
    public final int f26750a;
    public final double f26751b;
    public final Runnable f26752c;

    public se(Runnable runnable, double d, int i7) {
        this.f26750a = i7;
        this.f26752c = runnable;
        this.f26751b = d;
    }

    @Override
    public final void run() {
        int i7 = this.f26750a;
        double d = this.f26751b;
        Runnable runnable = this.f26752c;
        switch (i7) {
            case 0:
                MediaController mediaController = (MediaController) ((j6.o) runnable).f17262b;
                ls.f(mediaController.f22710i1).k(154, Integer.valueOf(mediaController.f22708h1), Double.valueOf(d));
                return;
            default:
                c50 c50Var = ((u40) ((t40) runnable).f39718b).I0;
                ls.f(c50Var.f33987e).k(154, Integer.valueOf(c50Var.V), Double.valueOf(d));
                return;
        }
    }
}
