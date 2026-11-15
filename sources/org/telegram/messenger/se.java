package org.telegram.messenger;

import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.r40;
public final class se implements Runnable {
    public final int f26433a;
    public final double f26434b;
    public final Runnable f26435c;

    public se(Runnable runnable, double d, int i7) {
        this.f26433a = i7;
        this.f26435c = runnable;
        this.f26434b = d;
    }

    @Override
    public final void run() {
        int i7 = this.f26433a;
        double d = this.f26434b;
        Runnable runnable = this.f26435c;
        switch (i7) {
            case 0:
                MediaController mediaController = (MediaController) ((j6.o) runnable).f16886b;
                ns.f(mediaController.f22352i1).k(154, Integer.valueOf(mediaController.f22350h1), Double.valueOf(d));
                return;
            default:
                r40 r40Var = ((j40) ((i40) runnable).f35446b).I0;
                ns.f(r40Var.f38846e).k(154, Integer.valueOf(r40Var.V), Double.valueOf(d));
                return;
        }
    }
}
