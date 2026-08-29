package jh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class g1 extends v41 {
    static {
        v41.setup(new v41());
    }

    public static w41 a(int i10, f1 f1Var) {
        w41 J = w41.J(g1.class);
        J.f34309u = 1;
        J.f34313z = i10;
        J.G = f1Var;
        return J;
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        boolean z11;
        String str;
        h1 h1Var = (h1) view;
        f1 f1Var = (f1) w41Var.G;
        int i10 = w41Var.f34313z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        h1Var.f12153s = z11;
        org.telegram.ui.Components.t9 t9Var = h1Var.d;
        TextView textView = h1Var.f12149e;
        ih.v1 v1Var = h1Var.f12148c;
        h1Var.v = f1Var;
        int i11 = -1;
        if (i10 == 0) {
            v1Var.d(null);
            v1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = f1Var.f12045c;
            textView.setText(stargiftattributemodel.name);
            h1.a(h1Var, stargiftattributemodel.document, 80, w41Var.G, true);
            t9Var.setColorFilter(null);
            v1Var.f9453w = org.telegram.ui.ActionBar.g6.Oh;
            str = h5.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = f1Var.f12043a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = f1Var.f12044b;
            v1Var.d(stargiftattributebackdrop);
            v1Var.e(stargiftattributepattern);
            v1Var.f9453w = org.telegram.ui.ActionBar.g6.f23062d6;
            textView.setText(stargiftattributebackdrop.name);
            h1.a(h1Var, stargiftattributepattern.document, 48, w41Var.G, false);
            t9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = h5.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = f1Var.f12043a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = f1Var.f12044b;
            v1Var.d(stargiftattributebackdrop2);
            v1Var.e(stargiftattributepattern2);
            v1Var.f9453w = org.telegram.ui.ActionBar.g6.f23062d6;
            textView.setText(stargiftattributepattern2.name);
            h1.a(h1Var, stargiftattributepattern2.document, 64, w41Var.G, false);
            t9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = h5.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            i11 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, h1Var.f12146a);
        }
        textView.setTextColor(i11);
        h1Var.f12150f.setText(str);
        h1Var.h = numArr[0];
        h1Var.b();
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new h1(context, c6Var);
    }
}
