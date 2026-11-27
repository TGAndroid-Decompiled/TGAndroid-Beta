package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class iha implements bfa {
    public final eja a;

    public iha(eja ejaVar) {
        this.a = ejaVar;
    }

    @Override
    public final void a(TLRPC.WebPage webPage, r47 r47Var) {
        eja ejaVar = this.a;
        iv3.J0(ejaVar.y1, r47Var, ejaVar.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean b() {
        return !this.a.F1;
    }

    @Override
    public final void c(String str, boolean z) {
        eja ejaVar = this.a;
        e eVar = ejaVar.y1;
        if (z) {
            nx0 i = ik8.i(eVar.getParentActivity(), false, 1, null);
            i.P = str;
            i.Q = false;
            CharSequence[] charSequenceArr = {ob6.M0(2131747544, "Open"), ob6.M0(2131751732, "Copy")};
            oh ohVar = new oh(this, str, (byte) 13);
            i.M = charSequenceArr;
            i.L = ohVar;
            eVar.showDialog(i);
            return;
        }
        ejaVar.Y0(str);
    }
}
