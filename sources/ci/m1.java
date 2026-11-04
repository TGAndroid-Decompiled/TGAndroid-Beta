package ci;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class m1 extends q31 {
    static {
        q31.h(new q31());
    }

    public static r31 i(int i3, k1 k1Var) {
        r31 K = r31.K(m1.class);
        K.f37636u = 1;
        K.f37640z = i3;
        K.G = k1Var;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        boolean z11;
        String str;
        n1 n1Var = (n1) view;
        k1 k1Var = (k1) r31Var.G;
        int i3 = r31Var.f37640z;
        Integer[] numArr = new Integer[1];
        if (i3 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        n1Var.f5583s = z11;
        org.telegram.ui.Components.k9 k9Var = n1Var.d;
        TextView textView = n1Var.f5579e;
        ai.m2 m2Var = n1Var.f5578c;
        n1Var.f5584w = k1Var;
        if (i3 == 0) {
            m2Var.d(null);
            m2Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = k1Var.f5373c;
            textView.setText(stargiftattributemodel.name);
            n1.a(n1Var, stargiftattributemodel.document, 80, r31Var.G, true);
            k9Var.setColorFilter(null);
            m2Var.f819y = org.telegram.ui.ActionBar.k6.Ci;
            str = l6.G1(stargiftattributemodel.rarity, numArr);
        } else if (i3 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = k1Var.f5371a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = k1Var.f5372b;
            m2Var.d(stargiftattributebackdrop);
            m2Var.e(stargiftattributepattern);
            m2Var.f819y = org.telegram.ui.ActionBar.k6.f27878d6;
            textView.setText(stargiftattributebackdrop.name);
            n1.a(n1Var, stargiftattributepattern.document, 48, r31Var.G, false);
            k9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = l6.G1(stargiftattributebackdrop.rarity, numArr);
        } else if (i3 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = k1Var.f5371a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = k1Var.f5372b;
            m2Var.d(stargiftattributebackdrop2);
            m2Var.e(stargiftattributepattern2);
            m2Var.f819y = org.telegram.ui.ActionBar.k6.f27878d6;
            textView.setText(stargiftattributepattern2.name);
            n1.a(n1Var, stargiftattributepattern2.document, 64, r31Var.G, false);
            k9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = l6.G1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i3 == 0) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, n1Var.f5576a);
        } else {
            org.telegram.ui.ActionBar.r6.r(textView);
            textView.setTextColor(-1);
        }
        n1Var.f5580f.setText(str);
        n1Var.h = numArr[0];
        n1Var.b();
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new n1(context, e6Var);
    }
}
