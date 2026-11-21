package bi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.q9;
public final class b2 extends n41 {
    public static final int f3430b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        int i7;
        ah.r rVar = (ah.r) view;
        Drawable drawable = o41Var.f38097l;
        CharSequence charSequence = o41Var.f38098m;
        CharSequence charSequence2 = o41Var.f38099n;
        rVar.f1109x.setVisibility(8);
        rVar.I = null;
        rVar.J = null;
        q9 q9Var = rVar.f61254c;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        q9Var.setImageDrawable(drawable);
        fi.u3 u3Var = rVar.d;
        u3Var.k(charSequence);
        boolean[] zArr = rVar.f1107s;
        zArr[0] = false;
        rVar.setSubtitle(charSequence2);
        org.telegram.ui.ActionBar.m5 m5Var = rVar.f61255e;
        if (zArr[0]) {
            i7 = org.telegram.ui.ActionBar.m6.f29559n5;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f29636r5;
        }
        org.telegram.ui.ActionBar.t6.X(m5Var, i7, rVar.f61252a);
        op opVar = rVar.f1108w;
        if (opVar != null) {
            opVar.setAlpha(1.0f);
        }
        u3Var.i(null);
        rVar.setDivider(z10);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        ah.r rVar = new ah.r(context, false, false, h6Var, false);
        rVar.setCellBackgroundVisible(false);
        return rVar;
    }
}
