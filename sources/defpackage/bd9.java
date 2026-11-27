package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class bd9 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        cd9 cd9Var = (cd9) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) b8cVar.H;
        int i = b8cVar.A;
        String str = (String) b8cVar.m;
        boolean z2 = b8cVar.e;
        vnb vnbVar = cd9Var.P;
        e29 e29Var = cd9Var.c;
        ad9 ad9Var = cd9Var.b0;
        if (ad9Var == null || cd9Var.a0 != stargiftattributepattern.document.id) {
            cd9Var.a0 = stargiftattributepattern.document.id;
            if (ad9Var != null) {
                ad9Var.o(e29Var);
            }
            ?? wlVar = new wl(3, cd9Var.W, stargiftattributepattern.document);
            cd9Var.b0 = wlVar;
            yob.x(cd9Var, wlVar, aob.E8, vnbVar, PorterDuff.Mode.SRC_IN);
        }
        if (e29Var.isAttachedToWindow()) {
            cd9Var.b0.b(e29Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = hl.u1(spannableStringBuilder, str, vnbVar);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i));
            spannableStringBuilder2.setSpan(new y7c(hl.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        cd9Var.j(spannableStringBuilder, 0, cd9Var.b0);
        cd9Var.setChecked(z2);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new cd9(i, vnbVar, context);
    }
}
