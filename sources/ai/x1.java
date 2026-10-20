package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class x1 extends g61 {
    static {
        g61.setup(new g61());
    }

    public static h61 a(int i10, v1 v1Var) {
        h61 J = h61.J(x1.class);
        J.f26791u = 1;
        J.f26795z = i10;
        J.G = v1Var;
        return J;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        boolean z11;
        String str;
        y1 y1Var = (y1) view;
        v1 v1Var = (v1) h61Var.G;
        int i10 = h61Var.f26795z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        y1Var.f2473s = z11;
        org.telegram.ui.Components.w9 w9Var = y1Var.d;
        TextView textView = y1Var.e;
        yh.d1 d1Var = y1Var.f2469c;
        y1Var.v = v1Var;
        int i11 = -1;
        if (i10 == 0) {
            d1Var.d(null);
            d1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = v1Var.f2287c;
            textView.setText(stargiftattributemodel.name);
            y1.a(y1Var, stargiftattributemodel.document, 80, h61Var.G, true);
            w9Var.setColorFilter(null);
            d1Var.f50215w = org.telegram.ui.ActionBar.h6.Oh;
            str = l7.e2(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = v1Var.f2285a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = v1Var.f2286b;
            d1Var.d(stargiftattributebackdrop);
            d1Var.e(stargiftattributepattern);
            d1Var.f50215w = org.telegram.ui.ActionBar.h6.f20990d6;
            textView.setText(stargiftattributebackdrop.name);
            y1.a(y1Var, stargiftattributepattern.document, 48, h61Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = l7.e2(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = v1Var.f2285a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = v1Var.f2286b;
            d1Var.d(stargiftattributebackdrop2);
            d1Var.e(stargiftattributepattern2);
            d1Var.f50215w = org.telegram.ui.ActionBar.h6.f20990d6;
            textView.setText(stargiftattributepattern2.name);
            y1.a(y1Var, stargiftattributepattern2.document, 64, h61Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = l7.e2(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21096j5, y1Var.f2467a);
        }
        textView.setTextColor(i11);
        y1Var.f2470f.setText(str);
        y1Var.h = numArr[0];
        y1Var.b();
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y1(context, d6Var);
    }
}
