package lh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class g1 extends h51 {
    static {
        h51.setup(new h51());
    }

    public static i51 a(int i10, f1 f1Var) {
        i51 J = i51.J(g1.class);
        J.f25594u = 1;
        J.f25598z = i10;
        J.G = f1Var;
        return J;
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        boolean z10;
        String str;
        h1 h1Var = (h1) view;
        f1 f1Var = (f1) i51Var.G;
        int i10 = i51Var.f25598z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h1Var.f12518s = z10;
        org.telegram.ui.Components.p9 p9Var = h1Var.d;
        TextView textView = h1Var.e;
        kh.u1 u1Var = h1Var.f12514c;
        h1Var.v = f1Var;
        int i11 = -1;
        if (i10 == 0) {
            u1Var.d(null);
            u1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = f1Var.f12379c;
            textView.setText(stargiftattributemodel.name);
            h1.a(h1Var, stargiftattributemodel.document, 80, i51Var.G, true);
            p9Var.setColorFilter(null);
            u1Var.f10970w = org.telegram.ui.ActionBar.j6.Oh;
            str = g5.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = f1Var.f12377a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = f1Var.f12378b;
            u1Var.d(stargiftattributebackdrop);
            u1Var.e(stargiftattributepattern);
            u1Var.f10970w = org.telegram.ui.ActionBar.j6.f19881d6;
            textView.setText(stargiftattributebackdrop.name);
            h1.a(h1Var, stargiftattributepattern.document, 48, i51Var.G, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = g5.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = f1Var.f12377a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = f1Var.f12378b;
            u1Var.d(stargiftattributebackdrop2);
            u1Var.e(stargiftattributepattern2);
            u1Var.f10970w = org.telegram.ui.ActionBar.j6.f19881d6;
            textView.setText(stargiftattributepattern2.name);
            h1.a(h1Var, stargiftattributepattern2.document, 64, i51Var.G, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = g5.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            i11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, h1Var.f12512a);
        }
        textView.setTextColor(i11);
        h1Var.f12515f.setText(str);
        h1Var.h = numArr[0];
        h1Var.b();
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new h1(context, f6Var);
    }
}
