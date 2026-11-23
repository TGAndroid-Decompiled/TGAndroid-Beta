package ci;

import ai.s1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t implements fs {
    public final int f5765a;
    public final TLRPC.Document f5766b;
    public final int f5767c;
    public final s1 d;
    public boolean f5768e;
    public boolean f5769f;
    public boolean h;

    public t(int i7, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10, s1 s1Var) {
        this.f5765a = i7;
        this.f5766b = document;
        this.f5767c = i10;
        this.d = s1Var;
        ks.f(i7).b(this, ks.Y1);
        w7.G(i7);
        if (!w7.J(document, null, true, true).exists()) {
            w7.G(i7).W(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.f5768e && !this.f5769f) {
            w7.G(this.f5765a);
            if (w7.J(this.f5766b, null, true, true).exists()) {
                this.f5769f = true;
                ks.f(this.f5765a).n(this, ks.Y1);
                w7.G(this.f5765a);
                Utilities.f22877e.c(new c1.a(10, this, w7.J(this.f5766b, null, true, true)));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.Y1) {
            a();
        }
    }
}
