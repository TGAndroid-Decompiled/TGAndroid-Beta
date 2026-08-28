package bh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n10;
import r0.m1;
import r0.o;
public final class b implements n10, o {
    public final j f2015a;

    public b(j jVar) {
        this.f2015a = jVar;
    }

    @Override
    public m1 L0(View view, m1 m1Var) {
        boolean z10;
        WindowInsets g10 = m1Var.g();
        j jVar = this.f2015a;
        jVar.processLegacyContainerInsets(g10);
        td.a aVar = jVar.U;
        if (m1Var.f46929a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        return m1.f46928b;
    }

    @Override
    public void a(int i9) {
        int min = Math.min(i9, AndroidUtilities.dp(144.0f));
        if (i9 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        j jVar = this.f2015a;
        if (jVar.f2042h0 != min) {
            jVar.f2042h0 = min;
            jVar.T.a(min);
            jVar.f2038d0.postOnAnimation(new af.e(jVar, 14));
        }
    }
}
