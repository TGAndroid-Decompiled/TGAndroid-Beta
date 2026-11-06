package org.telegram.messenger;

import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.o40;
public final class te implements Runnable {
    public final int f25610a;
    public final double f25611b;
    public final Runnable f25612c;

    public te(Runnable runnable, double d, int i7) {
        this.f25610a = i7;
        this.f25612c = runnable;
        this.f25611b = d;
    }

    @Override
    public final void run() {
        int i7 = this.f25610a;
        double d = this.f25611b;
        Runnable runnable = this.f25612c;
        switch (i7) {
            case 0:
                MediaController mediaController = (MediaController) ((m.f3) runnable).f19102b;
                qs.f(mediaController.f21267h1).k(154, Integer.valueOf(mediaController.f21265g1), Double.valueOf(d));
                return;
            default:
                o40 o40Var = ((g40) ((f40) runnable).f33451b).H0;
                qs.f(o40Var.f36522e).k(154, Integer.valueOf(o40Var.U), Double.valueOf(d));
                return;
        }
    }
}
