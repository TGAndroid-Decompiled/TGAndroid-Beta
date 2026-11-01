package org.telegram.messenger;

import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.x40;
public final class te implements Runnable {
    public final int f18251a;
    public final double f18252b;
    public final Runnable f18253c;

    public te(Runnable runnable, double d, int i10) {
        this.f18251a = i10;
        this.f18253c = runnable;
        this.f18252b = d;
    }

    @Override
    public final void run() {
        int i10 = this.f18251a;
        double d = this.f18252b;
        Runnable runnable = this.f18253c;
        switch (i10) {
            case 0:
                MediaController mediaController = (MediaController) ((mg.c2) runnable).f13087b;
                at.f(mediaController.f14455g1).k(154, Integer.valueOf(mediaController.f14453f1), Double.valueOf(d));
                return;
            default:
                e50 e50Var = ((x40) ((w40) runnable).f32074b).H0;
                at.f(e50Var.e).k(154, Integer.valueOf(e50Var.U), Double.valueOf(d));
                return;
        }
    }
}
