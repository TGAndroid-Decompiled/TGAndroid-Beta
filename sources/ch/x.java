package ch;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.b11;
import org.telegram.ui.bn;
import org.telegram.ui.r11;
public final class x extends r11 {
    public final xi0 f5522f2;
    public final g2 f5523g2;
    public final b0 f5524h2;

    public x(b0 b0Var, g2 g2Var, Context context, int i7, boolean z10, h6 h6Var, xi0 xi0Var, g2 g2Var2) {
        super(g2Var, context, false, null, i7, z10, h6Var, 16);
        this.f5524h2 = b0Var;
        this.f5522f2 = xi0Var;
        this.f5523g2 = g2Var2;
    }

    @Override
    public final void m() {
        this.f5524h2.f5289a.invalidate();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        ai.g0 g0Var = this.f5524h2.f5291c;
        xi0 xi0Var = this.f5522f2;
        g2 g2Var = this.f5523g2;
        if (g2Var != null && !xi0Var.B0 && xi0Var.getWindowType() != 13 && !k10.i(g2Var.getCurrentAccount()).q()) {
            try {
                g0Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new lc(g0Var, null).r(document, org.telegram.messenger.g0.W2(hd.N0(2131743618, null)), hd.N0(2131746839, null), new ca.r(this, 3)).j();
        } else if (l10 == null && document == null) {
        } else {
            if (document != null) {
                p5.g(k10.f24932t0).e(document);
            }
            if (l10 == null) {
                longValue = document.f28404id;
            } else {
                longValue = l10.longValue();
            }
            ?? obj = new Object();
            obj.f5471g = longValue;
            obj.h = longValue;
            xi0Var.l(view, obj, false);
            org.telegram.messenger.g0.v1(g0Var);
        }
    }

    @Override
    public final void q() {
        b0 b0Var = this.f5524h2;
        if (!b0Var.v) {
            b0Var.v = true;
            if (!b0Var.d) {
                b0Var.f5290b.updateViewLayout(b0Var.f5291c, b0Var.b(true));
            }
            g2 g2Var = this.f5523g2;
            if (g2Var instanceof bn) {
                ((bn) g2Var).sa();
            }
            xi0 xi0Var = this.f5522f2;
            if (xi0Var.getDelegate() != null) {
                xi0Var.getDelegate().q();
            }
        }
    }

    @Override
    public final void r(b11 b11Var, p0 p0Var) {
        this.f5522f2.l(b11Var, p0Var, false);
        org.telegram.messenger.g0.v1(this.f5524h2.f5291c);
    }

    @Override
    public final boolean u() {
        xi0 xi0Var = this.f5522f2;
        if (xi0Var.getDelegate() != null) {
            return xi0Var.getDelegate().q();
        }
        return false;
    }
}
