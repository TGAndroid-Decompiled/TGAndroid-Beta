package mh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class f1 extends i51 {
    static {
        i51.setup(new i51());
    }

    public static j51 a(int i10, e1 e1Var) {
        j51 J = j51.J(f1.class);
        J.f28023u = 1;
        J.f28027z = i10;
        J.G = e1Var;
        return J;
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        boolean z10;
        String str;
        g1 g1Var = (g1) view;
        e1 e1Var = (e1) j51Var.G;
        int i10 = j51Var.f28027z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g1Var.f14073s = z10;
        org.telegram.ui.Components.p9 p9Var = g1Var.d;
        TextView textView = g1Var.f14069e;
        lh.u1 u1Var = g1Var.f14068c;
        g1Var.v = e1Var;
        int i11 = -1;
        if (i10 == 0) {
            u1Var.d(null);
            u1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = e1Var.f13932c;
            textView.setText(stargiftattributemodel.name);
            g1.a(g1Var, stargiftattributemodel.document, 80, j51Var.G, true);
            p9Var.setColorFilter(null);
            u1Var.f13011w = org.telegram.ui.ActionBar.k6.Oh;
            str = g5.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = e1Var.f13930a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = e1Var.f13931b;
            u1Var.d(stargiftattributebackdrop);
            u1Var.e(stargiftattributepattern);
            u1Var.f13011w = org.telegram.ui.ActionBar.k6.f21659d6;
            textView.setText(stargiftattributebackdrop.name);
            g1.a(g1Var, stargiftattributepattern.document, 48, j51Var.G, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = g5.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = e1Var.f13930a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = e1Var.f13931b;
            u1Var.d(stargiftattributebackdrop2);
            u1Var.e(stargiftattributepattern2);
            u1Var.f13011w = org.telegram.ui.ActionBar.k6.f21659d6;
            textView.setText(stargiftattributepattern2.name);
            g1.a(g1Var, stargiftattributepattern2.document, 64, j51Var.G, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = g5.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            i11 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21766j5, g1Var.f14066a);
        }
        textView.setTextColor(i11);
        g1Var.f14070f.setText(str);
        g1Var.h = numArr[0];
        g1Var.b();
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new g1(context, g6Var);
    }
}
