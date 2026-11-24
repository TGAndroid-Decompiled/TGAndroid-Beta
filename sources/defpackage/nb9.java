package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class nb9 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ob9 ob9Var = (ob9) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) c6cVar.H;
        int i = c6cVar.A;
        String str = (String) c6cVar.m;
        boolean z2 = c6cVar.e;
        ylb ylbVar = ob9Var.P;
        s09 s09Var = ob9Var.c;
        mb9 mb9Var = ob9Var.b0;
        if (mb9Var == null || ob9Var.a0 != stargiftattributepattern.document.id) {
            ob9Var.a0 = stargiftattributepattern.document.id;
            if (mb9Var != null) {
                mb9Var.o(s09Var);
            }
            ?? vmVar = new vm(3, ob9Var.W, stargiftattributepattern.document);
            ob9Var.b0 = vmVar;
            anb.x(ob9Var, vmVar, cmb.D8, ylbVar, PorterDuff.Mode.SRC_IN);
        }
        if (s09Var.isAttachedToWindow()) {
            ob9Var.b0.b(s09Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = gm.u1(spannableStringBuilder, str, ylbVar);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i));
            spannableStringBuilder2.setSpan(new z5c(gm.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        ob9Var.j(spannableStringBuilder, 0, ob9Var.b0);
        ob9Var.setChecked(z2);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new ob9(i, ylbVar, context);
    }
}
