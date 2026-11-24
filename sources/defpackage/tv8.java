package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class tv8 implements gk7 {
    public final int a;
    public final TLRPC.Document b;
    public final int c;
    public final x15 d;
    public boolean e;
    public boolean f;
    public boolean h;

    public tv8(int i, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i2, x15 x15Var) {
        this.a = i;
        this.b = document;
        this.c = i2;
        this.d = x15Var;
        kk7.f(i).a(this, kk7.X1);
        ba4.G(i);
        if (!ba4.J(document, null, true, true).exists()) {
            ba4.G(i).X(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.e && !this.f) {
            ba4.G(this.a);
            if (ba4.J(this.b, null, true, true).exists()) {
                this.f = true;
                kk7.f(this.a).n(this, kk7.X1);
                ba4.G(this.a);
                Utilities.e.c(new ll8(this, ba4.J(this.b, null, true, true), (byte) 22));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.X1) {
            a();
        }
    }
}
