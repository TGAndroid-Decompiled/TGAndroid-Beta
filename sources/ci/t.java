package ci;

import ai.u1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t implements is {
    public final int f5488a;
    public final TLRPC.Document f5489b;
    public final int f5490c;
    public final u1 d;
    public boolean f5491e;
    public boolean f5492f;
    public boolean h;

    public t(int i7, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10, u1 u1Var) {
        this.f5488a = i7;
        this.f5489b = document;
        this.f5490c = i10;
        this.d = u1Var;
        ns.f(i7).b(this, ns.Y1);
        w7.G(i7);
        if (!w7.J(document, null, true, true).exists()) {
            w7.G(i7).W(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.f5491e && !this.f5492f) {
            w7.G(this.f5488a);
            if (w7.J(this.f5489b, null, true, true).exists()) {
                this.f5492f = true;
                ns.f(this.f5488a).n(this, ns.Y1);
                w7.G(this.f5488a);
                Utilities.f22416e.c(new c1.c(9, this, w7.J(this.f5489b, null, true, true)));
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
