package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class sc9 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        rc9 rc9Var;
        tc9 tc9Var = (tc9) view;
        TL_stars.StarGift starGift = (TL_stars.StarGift) b8cVar.H;
        String str = (String) b8cVar.m;
        boolean z2 = b8cVar.e;
        e29 e29Var = tc9Var.c;
        TLRPC.Document document = starGift.getDocument();
        if (document != null && ((rc9Var = tc9Var.b0) == null || tc9Var.a0 != document.id)) {
            tc9Var.a0 = document.id;
            if (rc9Var != null) {
                rc9Var.o(e29Var);
            }
            tc9Var.b0 = new wl(3, tc9Var.W, document);
        }
        if (tc9Var.b0 != null && e29Var.isAttachedToWindow()) {
            tc9Var.b0.b(e29Var);
        }
        CharSequence charSequence = starGift.title;
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.isEmpty(str)) {
            charSequence = hl.u1(charSequence, str, tc9Var.P);
        }
        SpannableStringBuilder spannableStringBuilder = charSequence;
        if (starGift.availability_resale > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) ob6.E(starGift.availability_resale, ','));
            spannableStringBuilder2.setSpan(new y7c(hl.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        tc9Var.j(spannableStringBuilder, 0, tc9Var.b0);
        tc9Var.setChecked(z2);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new tc9(i, vnbVar, context);
    }
}
