package dh;

import android.content.Context;
import android.view.View;
import ci.d1;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.li0;
import org.telegram.ui.g11;
import org.telegram.ui.q01;
import org.telegram.ui.wm;
public final class v extends g11 {
    public final li0 f9158f2;
    public final d2 f9159g2;
    public final a0 f9160h2;

    public v(a0 a0Var, d2 d2Var, Context context, int i3, boolean z10, e6 e6Var, li0 li0Var, d2 d2Var2) {
        super(d2Var, context, false, null, i3, z10, e6Var, 16);
        this.f9160h2 = a0Var;
        this.f9158f2 = li0Var;
        this.f9159g2 = d2Var2;
    }

    @Override
    public final void m() {
        this.f9160h2.f8931a.invalidate();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        ai.c0 c0Var = this.f9160h2.f8933c;
        li0 li0Var = this.f9158f2;
        d2 d2Var = this.f9159g2;
        if (d2Var != null && !li0Var.B0 && li0Var.getWindowType() != 13 && !h10.i(d2Var.getCurrentAccount()).q()) {
            try {
                c0Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new fc(c0Var, null).r(document, org.telegram.messenger.g0.X2(bd.M0(2131743871, null)), bd.M0(2131747041, null), new d1(this, 17)).j();
        } else if (l10 == null && document == null) {
        } else {
            if (document != null) {
                g5.g(h10.f22829t0).e(document);
            }
            if (l10 == null) {
                longValue = document.f27007id;
            } else {
                longValue = l10.longValue();
            }
            ?? obj = new Object();
            obj.f9098g = longValue;
            obj.h = longValue;
            li0Var.l(view, obj, false);
            org.telegram.messenger.g0.v1(c0Var);
        }
    }

    @Override
    public final void q() {
        a0 a0Var = this.f9160h2;
        if (!a0Var.v) {
            a0Var.v = true;
            if (!a0Var.d) {
                a0Var.f8932b.updateViewLayout(a0Var.f8933c, a0Var.b(true));
            }
            d2 d2Var = this.f9159g2;
            if (d2Var instanceof wm) {
                ((wm) d2Var).pa();
            }
            li0 li0Var = this.f9158f2;
            if (li0Var.getDelegate() != null) {
                li0Var.getDelegate().v();
            }
        }
    }

    @Override
    public final void r(q01 q01Var, n0 n0Var) {
        this.f9158f2.l(q01Var, n0Var, false);
        org.telegram.messenger.g0.v1(this.f9160h2.f8933c);
    }

    @Override
    public final boolean u() {
        li0 li0Var = this.f9158f2;
        if (li0Var.getDelegate() != null) {
            return li0Var.getDelegate().v();
        }
        return false;
    }
}
