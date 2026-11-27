package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class oc9 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        pc9 pc9Var = (pc9) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) b8cVar.H;
        int i = b8cVar.A;
        String str = (String) b8cVar.m;
        boolean z2 = b8cVar.e;
        pc9Var.getClass();
        ShapeDrawable K = aob.K(hl.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        SpannableStringBuilder spannableStringBuilder = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = hl.u1(spannableStringBuilder, str, pc9Var.P);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i));
            spannableStringBuilder2.setSpan(new y7c(hl.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        pc9Var.j(spannableStringBuilder, 0, K);
        pc9Var.setChecked(z2);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        b8 b8Var = new b8(0, vnbVar, context, false, false);
        b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        b8Var.c(aob.E8, aob.F8);
        b8Var.g(-1, PorterDuff.Mode.MULTIPLY);
        b8Var.c.setTranslationX(hl.L(2.0f));
        b8Var.a(2);
        b8Var.setBackground(null);
        return b8Var;
    }
}
