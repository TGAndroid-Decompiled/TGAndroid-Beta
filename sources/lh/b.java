package lh;

import android.view.View;
import android.view.WindowInsets;
import lg.s;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.i10;
import r0.j1;
import r0.m;
public final class b implements i10, m {
    public final g f12007a;

    public b(g gVar) {
        this.f12007a = gVar;
    }

    @Override
    public j1 R0(View view, j1 j1Var) {
        boolean z10;
        WindowInsets g10 = j1Var.g();
        g gVar = this.f12007a;
        gVar.t0(g10);
        fe.b bVar = gVar.Q1;
        if (j1Var.f46143a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        return j1.f46142b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, i0.L(144.0f));
        if (i10 > 0) {
            min -= i0.L(8.0f);
        }
        g gVar = this.f12007a;
        if (gVar.f12020d2 != min) {
            gVar.f12020d2 = min;
            gVar.P1.a(min);
            gVar.Z1.postOnAnimation(new s(gVar, 2));
        }
    }
}
