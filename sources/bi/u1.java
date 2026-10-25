package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class u1 extends s61 {
    static {
        s61.setup(new s61());
    }

    public static t61 a(int i10, s1 s1Var) {
        t61 K = t61.K(u1.class);
        K.f32881u = 1;
        K.f32885z = i10;
        K.G = s1Var;
        return K;
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        boolean z11;
        String str;
        v1 v1Var = (v1) view;
        s1 s1Var = (s1) t61Var.G;
        int i10 = t61Var.f32885z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v1Var.f5544s = z11;
        org.telegram.ui.Components.y9 y9Var = v1Var.d;
        TextView textView = v1Var.e;
        zh.d1 d1Var = v1Var.f5540c;
        v1Var.v = s1Var;
        if (i10 == 0) {
            d1Var.d(null);
            d1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = s1Var.f5386c;
            textView.setText(stargiftattributemodel.name);
            v1.a(v1Var, stargiftattributemodel.document, 80, t61Var.G, true);
            y9Var.setColorFilter(null);
            d1Var.f52950y = org.telegram.ui.ActionBar.y6.Oh;
            str = h7.d2(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = s1Var.f5384a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = s1Var.f5385b;
            d1Var.d(stargiftattributebackdrop);
            d1Var.e(stargiftattributepattern);
            d1Var.f52950y = org.telegram.ui.ActionBar.y6.f23354d6;
            textView.setText(stargiftattributebackdrop.name);
            v1.a(v1Var, stargiftattributepattern.document, 48, t61Var.G, false);
            y9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = h7.d2(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = s1Var.f5384a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = s1Var.f5385b;
            d1Var.d(stargiftattributebackdrop2);
            d1Var.e(stargiftattributepattern2);
            d1Var.f52950y = org.telegram.ui.ActionBar.y6.f23354d6;
            textView.setText(stargiftattributepattern2.name);
            v1.a(v1Var, stargiftattributepattern2.document, 64, t61Var.G, false);
            y9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = h7.d2(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23462j5, v1Var.f5538a);
        } else {
            org.telegram.ui.ActionBar.f7.r(textView);
            textView.setTextColor(-1);
        }
        v1Var.f5541f.setText(str);
        v1Var.h = numArr[0];
        v1Var.b();
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new v1(context, u6Var);
    }
}
