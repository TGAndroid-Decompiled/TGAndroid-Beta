package ch;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q10;
import r0.m1;
import r0.o;

public final class b implements q10, o {

    public final h f2903a;

    public b(h hVar) {
        this.f2903a = hVar;
    }

    @Override
    public m1 I0(View view, m1 m1Var) {
        WindowInsets windowInsetsG = m1Var.g();
        h hVar = this.f2903a;
        hVar.processLegacyContainerInsets(windowInsetsG);
        hVar.U.a(m1Var.f46619a.f(8).d > 0, true);
        return m1.f46618b;
    }

    @Override
    public void a(int i10) {
        int iMin = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            iMin -= AndroidUtilities.dp(8.0f);
        }
        h hVar = this.f2903a;
        if (hVar.f2923h0 != iMin) {
            hVar.f2923h0 = iMin;
            hVar.T.a(iMin);
            hVar.f2919d0.postOnAnimation(new af.e(hVar, 26));
        }
    }
}
