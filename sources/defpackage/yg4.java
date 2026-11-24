package defpackage;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.TLRPC;
public final class yg4 implements kda {
    public final zg4 a;

    public yg4(zg4 zg4Var) {
        this.a = zg4Var;
    }

    @Override
    public final void a(TLRPC.WebPage webPage, k47 k47Var) {
        ch4 ch4Var = this.a.w;
        SpannableStringBuilder[] spannableStringBuilderArr = ch4.t0;
        zv3.I0(ch4Var.M, k47Var, ch4Var.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean b() {
        return !this.a.w.p0.u();
    }

    @Override
    public final void c(String str, boolean z) {
        ch4 ch4Var = this.a.w;
        if (z) {
            my0 i = wi8.i(ch4Var.L, false, 1, null);
            i.P = str;
            i.Q = false;
            ff ffVar = new ff(this, str, (byte) 5);
            i.M = new CharSequence[]{jb6.M0(2131747550, null), jb6.M0(2131751704, null)};
            i.L = ffVar;
            ch4Var.M.showDialog(i);
            return;
        }
        SpannableStringBuilder[] spannableStringBuilderArr = ch4.t0;
        ch4Var.g(str);
    }
}
