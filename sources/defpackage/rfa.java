package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class rfa implements kda {
    public final nha a;

    public rfa(nha nhaVar) {
        this.a = nhaVar;
    }

    @Override
    public final void a(TLRPC.WebPage webPage, k47 k47Var) {
        nha nhaVar = this.a;
        zv3.I0(nhaVar.y1, k47Var, nhaVar.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
    }

    @Override
    public final boolean b() {
        return !this.a.F1;
    }

    @Override
    public final void c(String str, boolean z) {
        nha nhaVar = this.a;
        d dVar = nhaVar.y1;
        if (z) {
            my0 i = wi8.i(dVar.getParentActivity(), false, 1, null);
            i.P = str;
            i.Q = false;
            CharSequence[] charSequenceArr = {jb6.M0(2131747550, "Open"), jb6.M0(2131751704, "Copy")};
            ff ffVar = new ff(this, str, (byte) 13);
            i.M = charSequenceArr;
            i.L = ffVar;
            dVar.showDialog(i);
            return;
        }
        nhaVar.Y0(str);
    }
}
