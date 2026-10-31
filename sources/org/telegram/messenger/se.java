package org.telegram.messenger;

import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.x40;
public final class se implements Runnable {
    public final int f17900a;
    public final double f17901b;
    public final Runnable f17902c;

    public se(Runnable runnable, double d, int i10) {
        this.f17900a = i10;
        this.f17902c = runnable;
        this.f17901b = d;
    }

    @Override
    public final void run() {
        int i10 = this.f17900a;
        double d = this.f17901b;
        Runnable runnable = this.f17902c;
        switch (i10) {
            case 0:
                MediaController mediaController = (MediaController) ((mg.c2) runnable).f13086b;
                zs.f(mediaController.f14454g1).k(154, Integer.valueOf(mediaController.f14452f1), Double.valueOf(d));
                return;
            default:
                e50 e50Var = ((x40) ((w40) runnable).f31994b).H0;
                zs.f(e50Var.e).k(154, Integer.valueOf(e50Var.U), Double.valueOf(d));
                return;
        }
    }
}
