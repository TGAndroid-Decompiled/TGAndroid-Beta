package defpackage;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;
public final class we4 implements kba {
    public final xe4 a;

    public we4(xe4 xe4Var) {
        this.a = xe4Var;
    }

    @Override
    public final void a(TLRPC.WebPage webPage, k27 k27Var) {
        af4 af4Var = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = af4.t0;
        ou3.I0(af4Var.M, k27Var, af4Var.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean b() {
        return !this.a.w.p0.t();
    }

    @Override
    public final void c(String str, boolean z) {
        af4 af4Var = this.a.w;
        if (z) {
            fx0 i = ug8.i(af4Var.L, false, 1, null);
            i.P = str;
            i.Q = false;
            fe feVar = new fe(this, str, (byte) 5);
            i.M = new CharSequence[]{k96.M0(2131747624, null), k96.M0(2131751755, null)};
            i.L = feVar;
            af4Var.M.showDialog(i);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = af4.t0;
        af4Var.g(str);
    }
}
