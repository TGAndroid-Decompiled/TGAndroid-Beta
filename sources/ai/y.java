package ai;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y implements ls {
    public final int f1684a;
    public final TLRPC.Document f1685b;
    public final int f1686c;
    public final f1 d;
    public boolean f1687e;
    public boolean f1688f;
    public boolean h;

    public y(int i7, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10, f1 f1Var) {
        this.f1684a = i7;
        this.f1685b = document;
        this.f1686c = i10;
        this.d = f1Var;
        qs.f(i7).b(this, qs.Y1);
        w7.G(i7);
        if (!w7.J(document, null, true, true).exists()) {
            w7.G(i7).W(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.f1687e && !this.f1688f) {
            w7.G(this.f1684a);
            if (w7.J(this.f1685b, null, true, true).exists()) {
                this.f1688f = true;
                qs.f(this.f1684a).n(this, qs.Y1);
                w7.G(this.f1684a);
                Utilities.f21336e.c(new a1.e(9, this, w7.J(this.f1685b, null, true, true)));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.Y1) {
            a();
        }
    }
}
