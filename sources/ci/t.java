package ci;

import ai.x1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t implements fs {
    public final int f5799a;
    public final TLRPC.Document f5800b;
    public final int f5801c;
    public final x1 d;
    public boolean f5802e;
    public boolean f5803f;
    public boolean h;

    public t(int i7, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10, x1 x1Var) {
        this.f5799a = i7;
        this.f5800b = document;
        this.f5801c = i10;
        this.d = x1Var;
        ks.f(i7).b(this, ks.Y1);
        w7.G(i7);
        if (!w7.J(document, null, true, true).exists()) {
            w7.G(i7).W(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.f5802e && !this.f5803f) {
            w7.G(this.f5799a);
            if (w7.J(this.f5800b, null, true, true).exists()) {
                this.f5803f = true;
                ks.f(this.f5799a).n(this, ks.Y1);
                w7.G(this.f5799a);
                Utilities.f22807e.c(new c1.a(10, this, w7.J(this.f5800b, null, true, true)));
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
