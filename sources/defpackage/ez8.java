package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ez8 implements fn7 {
    public final int a;
    public final TLRPC.Document b;
    public final int c;
    public final v35 d;
    public boolean e;
    public boolean f;
    public boolean h;

    public ez8(int i, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i2, v35 v35Var) {
        this.a = i;
        this.b = document;
        this.c = i2;
        this.d = v35Var;
        jn7.f(i).a(this, jn7.Y1);
        xb4.G(i);
        if (!xb4.J(document, null, true, true).exists()) {
            xb4.G(i).X(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.e && !this.f) {
            xb4.G(this.a);
            if (xb4.J(this.b, null, true, true).exists()) {
                this.f = true;
                jn7.f(this.a).n(this, jn7.Y1);
                xb4.G(this.a);
                Utilities.e.c(new ep8(this, xb4.J(this.b, null, true, true), (byte) 21));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.Y1) {
            a();
        }
    }
}
