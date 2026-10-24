package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class x1 extends k61 {
    static {
        k61.setup(new k61());
    }

    public static l61 a(int i10, v1 v1Var) {
        l61 J = l61.J(x1.class);
        J.f28236u = 1;
        J.f28240z = i10;
        J.G = v1Var;
        return J;
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        boolean z11;
        String str;
        y1 y1Var = (y1) view;
        v1 v1Var = (v1) l61Var.G;
        int i10 = l61Var.f28240z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        y1Var.f2480s = z11;
        org.telegram.ui.Components.u9 u9Var = y1Var.d;
        TextView textView = y1Var.e;
        yh.d1 d1Var = y1Var.f2476c;
        y1Var.v = v1Var;
        if (i10 == 0) {
            d1Var.d(null);
            d1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = v1Var.f2289c;
            textView.setText(stargiftattributemodel.name);
            y1.a(y1Var, stargiftattributemodel.document, 80, l61Var.G, true);
            u9Var.setColorFilter(null);
            d1Var.f50663y = org.telegram.ui.ActionBar.k6.Oh;
            str = l7.d2(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = v1Var.f2287a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = v1Var.f2288b;
            d1Var.d(stargiftattributebackdrop);
            d1Var.e(stargiftattributepattern);
            d1Var.f50663y = org.telegram.ui.ActionBar.k6.f21184d6;
            textView.setText(stargiftattributebackdrop.name);
            y1.a(y1Var, stargiftattributepattern.document, 48, l61Var.G, false);
            u9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = l7.d2(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = v1Var.f2287a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = v1Var.f2288b;
            d1Var.d(stargiftattributebackdrop2);
            d1Var.e(stargiftattributepattern2);
            d1Var.f50663y = org.telegram.ui.ActionBar.k6.f21184d6;
            textView.setText(stargiftattributepattern2.name);
            y1.a(y1Var, stargiftattributepattern2.document, 64, l61Var.G, false);
            u9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = l7.d2(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, y1Var.f2474a);
        } else {
            org.telegram.ui.ActionBar.r6.r(textView);
            textView.setTextColor(-1);
        }
        y1Var.f2477f.setText(str);
        y1Var.h = numArr[0];
        y1Var.b();
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new y1(context, g6Var);
    }
}
