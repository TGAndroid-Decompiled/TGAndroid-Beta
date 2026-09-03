package mh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class f1 extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, e1 e1Var) {
        h51 J = h51.J(f1.class);
        J.f27384u = 1;
        J.f27388z = i10;
        J.G = e1Var;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        boolean z10;
        String str;
        g1 g1Var = (g1) view;
        e1 e1Var = (e1) h51Var.G;
        int i10 = h51Var.f27388z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g1Var.f14075s = z10;
        org.telegram.ui.Components.p9 p9Var = g1Var.d;
        TextView textView = g1Var.f14071e;
        lh.u1 u1Var = g1Var.f14070c;
        g1Var.v = e1Var;
        int i11 = -1;
        if (i10 == 0) {
            u1Var.d(null);
            u1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = e1Var.f13934c;
            textView.setText(stargiftattributemodel.name);
            g1.a(g1Var, stargiftattributemodel.document, 80, h51Var.G, true);
            p9Var.setColorFilter(null);
            u1Var.f13013w = org.telegram.ui.ActionBar.k6.Oh;
            str = g5.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = e1Var.f13932a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = e1Var.f13933b;
            u1Var.d(stargiftattributebackdrop);
            u1Var.e(stargiftattributepattern);
            u1Var.f13013w = org.telegram.ui.ActionBar.k6.f21661d6;
            textView.setText(stargiftattributebackdrop.name);
            g1.a(g1Var, stargiftattributepattern.document, 48, h51Var.G, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = g5.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = e1Var.f13932a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = e1Var.f13933b;
            u1Var.d(stargiftattributebackdrop2);
            u1Var.e(stargiftattributepattern2);
            u1Var.f13013w = org.telegram.ui.ActionBar.k6.f21661d6;
            textView.setText(stargiftattributepattern2.name);
            g1.a(g1Var, stargiftattributepattern2.document, 64, h51Var.G, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = g5.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            i11 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21768j5, g1Var.f14068a);
        }
        textView.setTextColor(i11);
        g1Var.f14072f.setText(str);
        g1Var.h = numArr[0];
        g1Var.b();
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new g1(context, g6Var);
    }
}
