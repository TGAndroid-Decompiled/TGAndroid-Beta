package bi;

import ai.o1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t implements cs {
    public final int f3850a;
    public final TLRPC.Document f3851b;
    public final int f3852c;
    public final o1 d;
    public boolean f3853e;
    public boolean f3854f;
    public boolean h;

    public t(int i3, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10, o1 o1Var) {
        this.f3850a = i3;
        this.f3851b = document;
        this.f3852c = i10;
        this.d = o1Var;
        hs.f(i3).b(this, hs.Y1);
        w7.G(i3);
        if (!w7.K(document, null, true, true).exists()) {
            w7.G(i3).X(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (!this.f3853e && !this.f3854f) {
            w7.G(this.f3850a);
            if (w7.K(this.f3851b, null, true, true).exists()) {
                this.f3854f = true;
                hs.f(this.f3850a).n(this, hs.Y1);
                w7.G(this.f3850a);
                Utilities.f21387e.c(new a1.f(11, this, w7.K(this.f3851b, null, true, true)));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.Y1) {
            a();
        }
    }
}
