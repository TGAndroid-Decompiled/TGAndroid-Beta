package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class e1 extends m41 {
    static {
        m41.h(new m41());
    }

    public static n41 i(int i7, c1 c1Var) {
        n41 K = n41.K(e1.class);
        K.v = 1;
        K.A = i7;
        K.H = c1Var;
        return K;
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        boolean z11;
        String str;
        f1 f1Var = (f1) view;
        c1 c1Var = (c1) n41Var.H;
        int i7 = n41Var.A;
        Integer[] numArr = new Integer[1];
        if (i7 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        f1Var.f8740s = z11;
        org.telegram.ui.Components.p9 p9Var = f1Var.d;
        TextView textView = f1Var.f8736e;
        bi.e3 e3Var = f1Var.f8735c;
        f1Var.f8741w = c1Var;
        if (i7 == 0) {
            e3Var.d(null);
            e3Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = c1Var.f8580c;
            textView.setText(stargiftattributemodel.name);
            f1.a(f1Var, stargiftattributemodel.document, 80, n41Var.H, true);
            p9Var.setColorFilter(null);
            e3Var.f3502y = org.telegram.ui.ActionBar.n6.Fi;
            str = f6.L1(stargiftattributemodel.rarity, numArr);
        } else if (i7 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = c1Var.f8578a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = c1Var.f8579b;
            e3Var.d(stargiftattributebackdrop);
            e3Var.e(stargiftattributepattern);
            e3Var.f3502y = org.telegram.ui.ActionBar.n6.f29451d6;
            textView.setText(stargiftattributebackdrop.name);
            f1.a(f1Var, stargiftattributepattern.document, 48, n41Var.H, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = f6.L1(stargiftattributebackdrop.rarity, numArr);
        } else if (i7 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = c1Var.f8578a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = c1Var.f8579b;
            e3Var.d(stargiftattributebackdrop2);
            e3Var.e(stargiftattributepattern2);
            e3Var.f3502y = org.telegram.ui.ActionBar.n6.f29451d6;
            textView.setText(stargiftattributepattern2.name);
            f1.a(f1Var, stargiftattributepattern2.document, 64, n41Var.H, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = f6.L1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i7 == 0) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, f1Var.f8733a);
        } else {
            org.telegram.ui.ActionBar.u6.q(textView);
            textView.setTextColor(-1);
        }
        f1Var.f8737f.setText(str);
        f1Var.h = numArr[0];
        f1Var.b();
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new f1(context, i6Var);
    }
}
