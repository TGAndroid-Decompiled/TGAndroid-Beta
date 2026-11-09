package org.telegram.messenger;

import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.p40;
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
                p40 p40Var = ((h40) ((g40) runnable).f33859b).H0;
                qs.f(p40Var.f36891e).k(154, Integer.valueOf(p40Var.U), Double.valueOf(d));
                return;
        }
    }
}
