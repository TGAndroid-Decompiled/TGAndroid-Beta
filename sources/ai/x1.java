package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class x1 extends e61 {
    static {
        e61.setup(new e61());
    }

    public static f61 a(int i10, v1 v1Var) {
        f61 J = f61.J(x1.class);
        J.f26149u = 1;
        J.f26153z = i10;
        J.G = v1Var;
        return J;
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        boolean z11;
        String str;
        y1 y1Var = (y1) view;
        v1 v1Var = (v1) f61Var.G;
        int i10 = f61Var.f26153z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        y1Var.f2470s = z11;
        org.telegram.ui.Components.w9 w9Var = y1Var.d;
        TextView textView = y1Var.e;
        yh.d1 d1Var = y1Var.f2466c;
        y1Var.v = v1Var;
        int i11 = -1;
        if (i10 == 0) {
            d1Var.d(null);
            d1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = v1Var.f2288c;
            textView.setText(stargiftattributemodel.name);
            y1.a(y1Var, stargiftattributemodel.document, 80, f61Var.G, true);
            w9Var.setColorFilter(null);
            d1Var.f50209w = org.telegram.ui.ActionBar.h6.Oh;
            str = k7.X1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = v1Var.f2286a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = v1Var.f2287b;
            d1Var.d(stargiftattributebackdrop);
            d1Var.e(stargiftattributepattern);
            d1Var.f50209w = org.telegram.ui.ActionBar.h6.f20986d6;
            textView.setText(stargiftattributebackdrop.name);
            y1.a(y1Var, stargiftattributepattern.document, 48, f61Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = k7.X1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = v1Var.f2286a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = v1Var.f2287b;
            d1Var.d(stargiftattributebackdrop2);
            d1Var.e(stargiftattributepattern2);
            d1Var.f50209w = org.telegram.ui.ActionBar.h6.f20986d6;
            textView.setText(stargiftattributepattern2.name);
            y1.a(y1Var, stargiftattributepattern2.document, 64, f61Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = k7.X1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21092j5, y1Var.f2464a);
        }
        textView.setTextColor(i11);
        y1Var.f2467f.setText(str);
        y1Var.h = numArr[0];
        y1Var.b();
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y1(context, d6Var);
    }
}
