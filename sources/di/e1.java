package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class e1 extends k41 {
    static {
        k41.h(new k41());
    }

    public static l41 i(int i7, c1 c1Var) {
        l41 K = l41.K(e1.class);
        K.v = 1;
        K.A = i7;
        K.H = c1Var;
        return K;
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        boolean z11;
        String str;
        f1 f1Var = (f1) view;
        c1 c1Var = (c1) l41Var.H;
        int i7 = l41Var.A;
        Integer[] numArr = new Integer[1];
        if (i7 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        f1Var.f8756s = z11;
        org.telegram.ui.Components.q9 q9Var = f1Var.d;
        TextView textView = f1Var.f8752e;
        bi.y2 y2Var = f1Var.f8751c;
        f1Var.f8757w = c1Var;
        if (i7 == 0) {
            y2Var.d(null);
            y2Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = c1Var.f8593c;
            textView.setText(stargiftattributemodel.name);
            f1.a(f1Var, stargiftattributemodel.document, 80, l41Var.H, true);
            q9Var.setColorFilter(null);
            y2Var.f4273y = org.telegram.ui.ActionBar.n6.Fi;
            str = f6.L1(stargiftattributemodel.rarity, numArr);
        } else if (i7 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = c1Var.f8591a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = c1Var.f8592b;
            y2Var.d(stargiftattributebackdrop);
            y2Var.e(stargiftattributepattern);
            y2Var.f4273y = org.telegram.ui.ActionBar.n6.f29396d6;
            textView.setText(stargiftattributebackdrop.name);
            f1.a(f1Var, stargiftattributepattern.document, 48, l41Var.H, false);
            q9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = f6.L1(stargiftattributebackdrop.rarity, numArr);
        } else if (i7 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = c1Var.f8591a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = c1Var.f8592b;
            y2Var.d(stargiftattributebackdrop2);
            y2Var.e(stargiftattributepattern2);
            y2Var.f4273y = org.telegram.ui.ActionBar.n6.f29396d6;
            textView.setText(stargiftattributepattern2.name);
            f1.a(f1Var, stargiftattributepattern2.document, 64, l41Var.H, false);
            q9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = f6.L1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i7 == 0) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29504j5, f1Var.f8749a);
        } else {
            org.telegram.ui.ActionBar.u6.q(textView);
            textView.setTextColor(-1);
        }
        f1Var.f8753f.setText(str);
        f1Var.h = numArr[0];
        f1Var.b();
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new f1(context, i6Var);
    }
}
