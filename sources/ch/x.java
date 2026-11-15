package ch;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.an;
import org.telegram.ui.n11;
import org.telegram.ui.x01;
public final class x extends n11 {
    public final mi0 f5244f2;
    public final e2 f5245g2;
    public final b0 f5246h2;

    public x(b0 b0Var, e2 e2Var, Context context, int i7, boolean z10, e6 e6Var, mi0 mi0Var, e2 e2Var2) {
        super(e2Var, context, false, null, i7, z10, e6Var, 16);
        this.f5246h2 = b0Var;
        this.f5244f2 = mi0Var;
        this.f5245g2 = e2Var2;
    }

    @Override
    public final void m() {
        this.f5246h2.f5011a.invalidate();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        ai.k0 k0Var = this.f5246h2.f5013c;
        mi0 mi0Var = this.f5244f2;
        e2 e2Var = this.f5245g2;
        if (e2Var != null && !mi0Var.B0 && mi0Var.getWindowType() != 13 && !m10.i(e2Var.getCurrentAccount()).q()) {
            try {
                k0Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new cc(k0Var, null).r(document, org.telegram.messenger.g0.X2(hd.M0(2131743861, null)), hd.M0(2131747033, null), new w(this, 0)).j();
        } else if (l10 == null && document == null) {
        } else {
            if (document != null) {
                g5.g(m10.f24940t0).e(document);
            }
            if (l10 == null) {
                longValue = document.f28057id;
            } else {
                longValue = l10.longValue();
            }
            ?? obj = new Object();
            obj.f5192g = longValue;
            obj.h = longValue;
            mi0Var.l(view, obj, false);
            org.telegram.messenger.g0.v1(k0Var);
        }
    }

    @Override
    public final void q() {
        b0 b0Var = this.f5246h2;
        if (!b0Var.v) {
            b0Var.v = true;
            if (!b0Var.d) {
                b0Var.f5012b.updateViewLayout(b0Var.f5013c, b0Var.b(true));
            }
            e2 e2Var = this.f5245g2;
            if (e2Var instanceof an) {
                ((an) e2Var).sa();
            }
            mi0 mi0Var = this.f5244f2;
            if (mi0Var.getDelegate() != null) {
                mi0Var.getDelegate().B();
            }
        }
    }

    @Override
    public final void r(x01 x01Var, p0 p0Var) {
        this.f5244f2.l(x01Var, p0Var, false);
        org.telegram.messenger.g0.v1(this.f5246h2.f5013c);
    }

    @Override
    public final boolean u() {
        mi0 mi0Var = this.f5244f2;
        if (mi0Var.getDelegate() != null) {
            return mi0Var.getDelegate().B();
        }
        return false;
    }
}
