package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class k99 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        l99 l99Var = (l99) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) c4cVar.H;
        int i = c4cVar.A;
        String str = (String) c4cVar.m;
        boolean z2 = c4cVar.e;
        ry8 ry8Var = l99Var.c;
        j99 j99Var = l99Var.b0;
        if (j99Var == null || l99Var.a0 != stargiftattributemodel.document.id) {
            l99Var.a0 = stargiftattributemodel.document.id;
            if (j99Var != null) {
                j99Var.o(ry8Var);
            }
            l99Var.b0 = new vl(3, l99Var.W, stargiftattributemodel.document);
        }
        if (ry8Var.isAttachedToWindow()) {
            l99Var.b0.b(ry8Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = gl.u1(spannableStringBuilder, str, l99Var.P);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i));
            spannableStringBuilder2.setSpan(new z3c(gl.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        l99Var.j(spannableStringBuilder, 0, l99Var.b0);
        l99Var.setChecked(z2);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new l99(i, wjbVar, context);
    }
}
