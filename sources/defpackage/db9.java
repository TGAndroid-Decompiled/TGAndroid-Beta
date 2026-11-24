package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class db9 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        eb9 eb9Var = (eb9) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) c6cVar.H;
        int i = c6cVar.A;
        String str = (String) c6cVar.m;
        boolean z2 = c6cVar.e;
        eb9Var.getClass();
        ShapeDrawable K = cmb.K(gm.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        SpannableStringBuilder spannableStringBuilder = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = gm.u1(spannableStringBuilder, str, eb9Var.P);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i));
            spannableStringBuilder2.setSpan(new z5c(gm.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        eb9Var.j(spannableStringBuilder, 0, K);
        eb9Var.setChecked(z2);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        a8 a8Var = new a8(0, ylbVar, context, false, false);
        a8Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        a8Var.c(cmb.D8, cmb.E8);
        a8Var.g(-1, PorterDuff.Mode.MULTIPLY);
        a8Var.c.setTranslationX(gm.L(2.0f));
        a8Var.a(2);
        a8Var.setBackground(null);
        return a8Var;
    }
}
