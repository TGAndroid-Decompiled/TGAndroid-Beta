package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class kb9 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        lb9 lb9Var = (lb9) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) c6cVar.H;
        int i = c6cVar.A;
        String str = (String) c6cVar.m;
        boolean z2 = c6cVar.e;
        s09 s09Var = lb9Var.c;
        jb9 jb9Var = lb9Var.b0;
        if (jb9Var == null || lb9Var.a0 != stargiftattributemodel.document.id) {
            lb9Var.a0 = stargiftattributemodel.document.id;
            if (jb9Var != null) {
                jb9Var.o(s09Var);
            }
            lb9Var.b0 = new vm(3, lb9Var.W, stargiftattributemodel.document);
        }
        if (s09Var.isAttachedToWindow()) {
            lb9Var.b0.b(s09Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = gm.u1(spannableStringBuilder, str, lb9Var.P);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i));
            spannableStringBuilder2.setSpan(new z5c(gm.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        lb9Var.j(spannableStringBuilder, 0, lb9Var.b0);
        lb9Var.setChecked(z2);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new lb9(i, ylbVar, context);
    }
}
