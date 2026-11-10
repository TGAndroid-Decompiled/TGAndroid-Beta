package org.telegram.messenger;

import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.o40;
public final class te implements Runnable {
    public final int f25615a;
    public final double f25616b;
    public final Runnable f25617c;

    public te(Runnable runnable, double d, int i7) {
        this.f25615a = i7;
        this.f25617c = runnable;
        this.f25616b = d;
    }

    @Override
    public final void run() {
        int i7 = this.f25615a;
        double d = this.f25616b;
        Runnable runnable = this.f25617c;
        switch (i7) {
            case 0:
                MediaController mediaController = (MediaController) ((m.f3) runnable).f19110b;
                qs.f(mediaController.f21275h1).k(154, Integer.valueOf(mediaController.f21273g1), Double.valueOf(d));
                return;
            default:
                o40 o40Var = ((g40) ((f40) runnable).f33457b).H0;
                qs.f(o40Var.f36482e).k(154, Integer.valueOf(o40Var.U), Double.valueOf(d));
                return;
        }
    }
}
