package bi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.z41;
public final class x1 extends k41 {
    public static final int f4176b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        int i7;
        ah.r rVar = (ah.r) view;
        Drawable drawable = l41Var.f37017l;
        CharSequence charSequence = l41Var.f37018m;
        CharSequence charSequence2 = l41Var.f37019n;
        rVar.f1109x.setVisibility(8);
        rVar.I = null;
        rVar.J = null;
        q9 q9Var = rVar.f61213c;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        q9Var.setImageDrawable(drawable);
        fi.u3 u3Var = rVar.d;
        u3Var.k(charSequence);
        boolean[] zArr = rVar.f1107s;
        zArr[0] = false;
        rVar.setSubtitle(charSequence2);
        org.telegram.ui.ActionBar.n5 n5Var = rVar.f61214e;
        if (zArr[0]) {
            i7 = org.telegram.ui.ActionBar.n6.f29575n5;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29652r5;
        }
        org.telegram.ui.ActionBar.u6.X(n5Var, i7, rVar.f61211a);
        mp mpVar = rVar.f1108w;
        if (mpVar != null) {
            mpVar.setAlpha(1.0f);
        }
        u3Var.i(null);
        rVar.setDivider(z10);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        ah.r rVar = new ah.r(context, false, false, i6Var, false);
        rVar.setCellBackgroundVisible(false);
        return rVar;
    }
}
