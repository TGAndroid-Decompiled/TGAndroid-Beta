package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class t1 extends x31 {
    static {
        x31.h(new x31());
    }

    public static y31 i(int i7, r1 r1Var) {
        y31 K = y31.K(t1.class);
        K.f40577u = 1;
        K.f40581z = i7;
        K.G = r1Var;
        return K;
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        boolean z10;
        String str;
        u1 u1Var = (u1) view;
        r1 r1Var = (r1) y31Var.G;
        int i7 = y31Var.f40581z;
        Integer[] numArr = new Integer[1];
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1Var.f4789s = z10;
        org.telegram.ui.Components.l9 l9Var = u1Var.d;
        TextView textView = u1Var.f4785e;
        zh.v0 v0Var = u1Var.f4784c;
        u1Var.f4790w = r1Var;
        if (i7 == 0) {
            v0Var.d(null);
            v0Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = r1Var.f4606c;
            textView.setText(stargiftattributemodel.name);
            u1.a(u1Var, stargiftattributemodel.document, 80, y31Var.G, true);
            l9Var.setColorFilter(null);
            v0Var.f60585y = org.telegram.ui.ActionBar.l6.Ci;
            str = k7.F1(stargiftattributemodel.rarity, numArr);
        } else if (i7 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = r1Var.f4604a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = r1Var.f4605b;
            v0Var.d(stargiftattributebackdrop);
            v0Var.e(stargiftattributepattern);
            v0Var.f60585y = org.telegram.ui.ActionBar.l6.f27865d6;
            textView.setText(stargiftattributebackdrop.name);
            u1.a(u1Var, stargiftattributepattern.document, 48, y31Var.G, false);
            l9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = k7.F1(stargiftattributebackdrop.rarity, numArr);
        } else if (i7 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = r1Var.f4604a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = r1Var.f4605b;
            v0Var.d(stargiftattributebackdrop2);
            v0Var.e(stargiftattributepattern2);
            v0Var.f60585y = org.telegram.ui.ActionBar.l6.f27865d6;
            textView.setText(stargiftattributepattern2.name);
            u1.a(u1Var, stargiftattributepattern2.document, 64, y31Var.G, false);
            l9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = k7.F1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i7 == 0) {
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27973j5, u1Var.f4782a);
        } else {
            org.telegram.ui.ActionBar.s6.q(textView);
            textView.setTextColor(-1);
        }
        u1Var.f4786f.setText(str);
        u1Var.h = numArr[0];
        u1Var.b();
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new u1(context, g6Var);
    }
}
