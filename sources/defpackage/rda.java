package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class rda implements kba {
    public final nfa a;

    public rda(nfa nfaVar) {
        this.a = nfaVar;
    }

    @Override
    public final void a(TLRPC.WebPage webPage, k27 k27Var) {
        nfa nfaVar = this.a;
        ou3.I0(nfaVar.y1, k27Var, nfaVar.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean b() {
        return !this.a.F1;
    }

    @Override
    public final void c(String str, boolean z) {
        nfa nfaVar = this.a;
        d dVar = nfaVar.y1;
        if (z) {
            fx0 i = ug8.i(dVar.getParentActivity(), false, 1, null);
            i.P = str;
            i.Q = false;
            CharSequence[] charSequenceArr = {k96.M0(2131747624, "Open"), k96.M0(2131751755, "Copy")};
            fe feVar = new fe(this, str, (byte) 13);
            i.M = charSequenceArr;
            i.L = feVar;
            dVar.showDialog(i);
            return;
        }
        nfaVar.Y0(str);
    }
}
