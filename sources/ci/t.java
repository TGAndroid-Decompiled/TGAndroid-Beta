package ci;

import ai.y1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t implements gs {
    public final int f5802a;
    public final TLRPC.Document f5803b;
    public final int f5804c;
    public final y1 d;
    public boolean f5805e;
    public boolean f5806f;
    public boolean h;

    public t(int i7, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10, y1 y1Var) {
        this.f5802a = i7;
        this.f5803b = document;
        this.f5804c = i10;
        this.d = y1Var;
        ls.f(i7).b(this, ls.Y1);
        w7.G(i7);
        if (!w7.J(document, null, true, true).exists()) {
            w7.G(i7).W(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.f5805e && !this.f5806f) {
            w7.G(this.f5802a);
            if (w7.J(this.f5803b, null, true, true).exists()) {
                this.f5806f = true;
                ls.f(this.f5802a).n(this, ls.Y1);
                w7.G(this.f5802a);
                Utilities.f22810e.c(new c1.a(10, this, w7.J(this.f5803b, null, true, true)));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.Y1) {
            a();
        }
    }
}
