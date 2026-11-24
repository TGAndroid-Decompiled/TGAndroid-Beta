package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class n99 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        o99 o99Var = (o99) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) c4cVar.H;
        int i = c4cVar.A;
        String str = (String) c4cVar.m;
        boolean z2 = c4cVar.e;
        wjb wjbVar = o99Var.P;
        ry8 ry8Var = o99Var.c;
        m99 m99Var = o99Var.b0;
        if (m99Var == null || o99Var.a0 != stargiftattributepattern.document.id) {
            o99Var.a0 = stargiftattributepattern.document.id;
            if (m99Var != null) {
                m99Var.o(ry8Var);
            }
            ?? vlVar = new vl(3, o99Var.W, stargiftattributepattern.document);
            o99Var.b0 = vlVar;
            zkb.x(o99Var, vlVar, bkb.D8, wjbVar, PorterDuff.Mode.SRC_IN);
        }
        if (ry8Var.isAttachedToWindow()) {
            o99Var.b0.b(ry8Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = gl.u1(spannableStringBuilder, str, wjbVar);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i));
            spannableStringBuilder2.setSpan(new z3c(gl.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        o99Var.j(spannableStringBuilder, 0, o99Var.b0);
        o99Var.setChecked(z2);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new o99(i, wjbVar, context);
    }
}
