package ci;

import ai.v1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t implements fs {
    public final int f5773a;
    public final TLRPC.Document f5774b;
    public final int f5775c;
    public final v1 d;
    public boolean f5776e;
    public boolean f5777f;
    public boolean h;

    public t(int i7, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10, v1 v1Var) {
        this.f5773a = i7;
        this.f5774b = document;
        this.f5775c = i10;
        this.d = v1Var;
        ks.f(i7).b(this, ks.Y1);
        w7.G(i7);
        if (!w7.J(document, null, true, true).exists()) {
            w7.G(i7).W(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.f5776e && !this.f5777f) {
            w7.G(this.f5773a);
            if (w7.J(this.f5774b, null, true, true).exists()) {
                this.f5777f = true;
                ks.f(this.f5773a).n(this, ks.Y1);
                w7.G(this.f5773a);
                Utilities.f22782e.c(new c1.c(8, this, w7.J(this.f5774b, null, true, true)));
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
