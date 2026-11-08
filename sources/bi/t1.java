package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class t1 extends w31 {
    static {
        w31.h(new w31());
    }

    public static x31 i(int i7, r1 r1Var) {
        x31 K = x31.K(t1.class);
        K.f40189u = 1;
        K.f40193z = i7;
        K.G = r1Var;
        return K;
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        boolean z10;
        String str;
        u1 u1Var = (u1) view;
        r1 r1Var = (r1) x31Var.G;
        int i7 = x31Var.f40193z;
        Integer[] numArr = new Integer[1];
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1Var.f4791s = z10;
        org.telegram.ui.Components.l9 l9Var = u1Var.d;
        TextView textView = u1Var.f4787e;
        zh.v0 v0Var = u1Var.f4786c;
        u1Var.f4792w = r1Var;
        if (i7 == 0) {
            v0Var.d(null);
            v0Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = r1Var.f4606c;
            textView.setText(stargiftattributemodel.name);
            u1.a(u1Var, stargiftattributemodel.document, 80, x31Var.G, true);
            l9Var.setColorFilter(null);
            v0Var.f60567y = org.telegram.ui.ActionBar.k6.Ci;
            str = k7.G1(stargiftattributemodel.rarity, numArr);
        } else if (i7 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = r1Var.f4604a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = r1Var.f4605b;
            v0Var.d(stargiftattributebackdrop);
            v0Var.e(stargiftattributepattern);
            v0Var.f60567y = org.telegram.ui.ActionBar.k6.f27852d6;
            textView.setText(stargiftattributebackdrop.name);
            u1.a(u1Var, stargiftattributepattern.document, 48, x31Var.G, false);
            l9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = k7.G1(stargiftattributebackdrop.rarity, numArr);
        } else if (i7 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = r1Var.f4604a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = r1Var.f4605b;
            v0Var.d(stargiftattributebackdrop2);
            v0Var.e(stargiftattributepattern2);
            v0Var.f60567y = org.telegram.ui.ActionBar.k6.f27852d6;
            textView.setText(stargiftattributepattern2.name);
            u1.a(u1Var, stargiftattributepattern2.document, 64, x31Var.G, false);
            l9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = k7.G1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i7 == 0) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27960j5, u1Var.f4784a);
        } else {
            org.telegram.ui.ActionBar.r6.r(textView);
            textView.setTextColor(-1);
        }
        u1Var.f4788f.setText(str);
        u1Var.h = numArr[0];
        u1Var.b();
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new u1(context, f6Var);
    }
}
