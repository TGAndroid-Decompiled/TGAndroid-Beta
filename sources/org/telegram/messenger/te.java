package org.telegram.messenger;

import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.o40;
public final class te implements Runnable {
    public final int f25611a;
    public final double f25612b;
    public final Runnable f25613c;

    public te(Runnable runnable, double d, int i7) {
        this.f25611a = i7;
        this.f25613c = runnable;
        this.f25612b = d;
    }

    @Override
    public final void run() {
        int i7 = this.f25611a;
        double d = this.f25612b;
        Runnable runnable = this.f25613c;
        switch (i7) {
            case 0:
                MediaController mediaController = (MediaController) ((m.f3) runnable).f19105b;
                qs.f(mediaController.f21270h1).k(154, Integer.valueOf(mediaController.f21268g1), Double.valueOf(d));
                return;
            default:
                o40 o40Var = ((g40) ((f40) runnable).f33458b).H0;
                qs.f(o40Var.f36542e).k(154, Integer.valueOf(o40Var.U), Double.valueOf(d));
                return;
        }
    }
}
