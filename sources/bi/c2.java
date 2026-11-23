package bi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p9;
public final class c2 extends m41 {
    public static final int f3429b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        int i7;
        ah.r rVar = (ah.r) view;
        Drawable drawable = n41Var.f37654l;
        CharSequence charSequence = n41Var.f37655m;
        CharSequence charSequence2 = n41Var.f37656n;
        rVar.f1109x.setVisibility(8);
        rVar.I = null;
        rVar.J = null;
        p9 p9Var = rVar.f61342c;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        p9Var.setImageDrawable(drawable);
        fi.u3 u3Var = rVar.d;
        u3Var.k(charSequence);
        boolean[] zArr = rVar.f1107s;
        zArr[0] = false;
        rVar.setSubtitle(charSequence2);
        org.telegram.ui.ActionBar.n5 n5Var = rVar.f61343e;
        if (zArr[0]) {
            i7 = org.telegram.ui.ActionBar.n6.f29632n5;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29709r5;
        }
        org.telegram.ui.ActionBar.u6.X(n5Var, i7, rVar.f61340a);
        lp lpVar = rVar.f1108w;
        if (lpVar != null) {
            lpVar.setAlpha(1.0f);
        }
        u3Var.i(null);
        rVar.setDivider(z10);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        ah.r rVar = new ah.r(context, false, false, i6Var, false);
        rVar.setCellBackgroundVisible(false);
        return rVar;
    }
}
