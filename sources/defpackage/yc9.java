package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class yc9 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        zc9 zc9Var = (zc9) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) b8cVar.H;
        int i = b8cVar.A;
        String str = (String) b8cVar.m;
        boolean z2 = b8cVar.e;
        e29 e29Var = zc9Var.c;
        xc9 xc9Var = zc9Var.b0;
        if (xc9Var == null || zc9Var.a0 != stargiftattributemodel.document.id) {
            zc9Var.a0 = stargiftattributemodel.document.id;
            if (xc9Var != null) {
                xc9Var.o(e29Var);
            }
            zc9Var.b0 = new wl(3, zc9Var.W, stargiftattributemodel.document);
        }
        if (e29Var.isAttachedToWindow()) {
            zc9Var.b0.b(e29Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = hl.u1(spannableStringBuilder, str, zc9Var.P);
        }
        if (i > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i));
            spannableStringBuilder2.setSpan(new y7c(hl.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        zc9Var.j(spannableStringBuilder, 0, zc9Var.b0);
        zc9Var.setChecked(z2);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new zc9(i, vnbVar, context);
    }
}
