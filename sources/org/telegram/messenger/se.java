package org.telegram.messenger;

import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.r40;
public final class se implements Runnable {
    public final int f26443a;
    public final double f26444b;
    public final Runnable f26445c;

    public se(Runnable runnable, double d, int i7) {
        this.f26443a = i7;
        this.f26445c = runnable;
        this.f26444b = d;
    }

    @Override
    public final void run() {
        int i7 = this.f26443a;
        double d = this.f26444b;
        Runnable runnable = this.f26445c;
        switch (i7) {
            case 0:
                MediaController mediaController = (MediaController) ((j6.o) runnable).f16886b;
                ns.f(mediaController.f22352i1).k(154, Integer.valueOf(mediaController.f22350h1), Double.valueOf(d));
                return;
            default:
                r40 r40Var = ((j40) ((i40) runnable).f35437b).I0;
                ns.f(r40Var.f38844e).k(154, Integer.valueOf(r40Var.V), Double.valueOf(d));
                return;
        }
    }
}
