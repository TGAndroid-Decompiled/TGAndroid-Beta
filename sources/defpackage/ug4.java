package defpackage;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;
public final class ug4 implements bfa {
    public final vg4 a;

    public ug4(vg4 vg4Var) {
        this.a = vg4Var;
    }

    @Override
    public final void a(TLRPC.WebPage webPage, r47 r47Var) {
        yg4 yg4Var = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = yg4.t0;
        iv3.J0(yg4Var.M, r47Var, yg4Var.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean b() {
        return !this.a.w.p0.u();
    }

    @Override
    public final void c(String str, boolean z) {
        yg4 yg4Var = this.a.w;
        if (z) {
            nx0 i = ik8.i(yg4Var.L, false, 1, null);
            i.P = str;
            i.Q = false;
            oh ohVar = new oh(this, str, (byte) 5);
            i.M = new CharSequence[]{ob6.M0(2131747544, null), ob6.M0(2131751732, null)};
            i.L = ohVar;
            yg4Var.M.showDialog(i);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = yg4.t0;
        yg4Var.g(str);
    }
}
