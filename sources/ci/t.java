package ci;

import ai.v1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t implements is {
    public final int f5491a;
    public final TLRPC.Document f5492b;
    public final int f5493c;
    public final v1 d;
    public boolean f5494e;
    public boolean f5495f;
    public boolean h;

    public t(int i7, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10, v1 v1Var) {
        this.f5491a = i7;
        this.f5492b = document;
        this.f5493c = i10;
        this.d = v1Var;
        ns.f(i7).b(this, ns.Y1);
        w7.G(i7);
        if (!w7.J(document, null, true, true).exists()) {
            w7.G(i7).W(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.f5494e && !this.f5495f) {
            w7.G(this.f5491a);
            if (w7.J(this.f5492b, null, true, true).exists()) {
                this.f5495f = true;
                ns.f(this.f5491a).n(this, ns.Y1);
                w7.G(this.f5491a);
                Utilities.f22416e.c(new c1.c(9, this, w7.J(this.f5492b, null, true, true)));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.Y1) {
            a();
        }
    }
}
