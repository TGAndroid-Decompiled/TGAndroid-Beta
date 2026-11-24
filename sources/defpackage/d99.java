package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class d99 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        e99 e99Var = (e99) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) c4cVar.H;
        int i = c4cVar.A;
        String str = (String) c4cVar.m;
        boolean z2 = c4cVar.e;
        e99Var.getClass();
        ShapeDrawable K = bkb.K(gl.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        SpannableStringBuilder spannableStringBuilder = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = gl.u1(spannableStringBuilder, str, e99Var.P);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i));
            spannableStringBuilder2.setSpan(new z3c(gl.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        e99Var.j(spannableStringBuilder, 0, K);
        e99Var.setChecked(z2);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        a8 a8Var = new a8(0, wjbVar, context, false, false);
        a8Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        a8Var.c(bkb.D8, bkb.E8);
        a8Var.g(-1, PorterDuff.Mode.MULTIPLY);
        a8Var.c.setTranslationX(gl.L(2.0f));
        a8Var.a(2);
        a8Var.setBackground(null);
        return a8Var;
    }
}
