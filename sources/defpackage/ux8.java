package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ux8 implements jm7 {
    public final int a;
    public final TLRPC.Document b;
    public final int c;
    public final u35 d;
    public boolean e;
    public boolean f;
    public boolean h;

    public ux8(int i, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i2, u35 u35Var) {
        this.a = i;
        this.b = document;
        this.c = i2;
        this.d = u35Var;
        nm7.f(i).a(this, nm7.Y1);
        bc4.G(i);
        if (!bc4.J(document, null, true, true).exists()) {
            bc4.G(i).X(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.e && !this.f) {
            bc4.G(this.a);
            if (bc4.J(this.b, null, true, true).exists()) {
                this.f = true;
                nm7.f(this.a).n(this, nm7.Y1);
                bc4.G(this.a);
                Utilities.e.c(new mn8(this, bc4.J(this.b, null, true, true), (byte) 24));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.Y1) {
            a();
        }
    }
}
