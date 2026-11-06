package fi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.g90;
public final class g4 implements r1.c {
    public final int f12065a;
    public final FrameLayout f12066b;
    public final boolean f12067c;

    public g4(FrameLayout frameLayout, boolean z9, int i7) {
        this.f12065a = i7;
        this.f12066b = frameLayout;
        this.f12067c = z9;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        int i7;
        switch (this.f12065a) {
            case 0:
                o5 o5Var = (o5) this.f12066b;
                w4 w4Var = o5Var.f12523f1;
                if (gVar == o5Var.l1) {
                    o5Var.l1 = null;
                    if (!this.f12067c) {
                        w4Var.setVisibility(8);
                        sg.l0.e(o5Var.f12538o1).g();
                        w4Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                o5 o5Var2 = (o5) this.f12066b;
                tg.j1 j1Var = o5Var2.V0;
                if (gVar == o5Var2.f12521e1) {
                    o5Var2.f12521e1 = null;
                    if (!this.f12067c) {
                        j1Var.setVisibility(8);
                    }
                    j1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                g90 g90Var = (g90) this.f12066b;
                if (!z9) {
                    g90Var.K = null;
                    boolean z10 = this.f12067c;
                    if (z10) {
                        i7 = 8;
                    } else {
                        i7 = 0;
                    }
                    g90Var.setVisibility(i7);
                    if (g90Var.N && z10) {
                        g90Var.N = false;
                        g90Var.f33868b.setLayoutManager(g90Var.getNeededLayoutManager());
                        g90Var.I = true;
                        g90Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
