package ch;

import android.content.Context;
import android.view.View;
import bi.ab;
import bi.x5;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.cn;
import org.telegram.ui.d11;
import org.telegram.ui.t11;
public final class w extends t11 {
    public final ii0 f6408e2;
    public final f2 f6409f2;
    public final b0 f6410g2;

    public w(b0 b0Var, f2 f2Var, Context context, int i7, boolean z9, h6 h6Var, ii0 ii0Var, f2 f2Var2) {
        super(f2Var, context, false, null, i7, z9, h6Var, 16);
        this.f6410g2 = b0Var;
        this.f6408e2 = ii0Var;
        this.f6409f2 = f2Var2;
    }

    @Override
    public final void m() {
        this.f6410g2.f6186a.invalidate();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        x5 x5Var = this.f6410g2.f6188c;
        ii0 ii0Var = this.f6408e2;
        f2 f2Var = this.f6409f2;
        if (f2Var != null && !ii0Var.A0 && ii0Var.getWindowType() != 13 && !p10.i(f2Var.getCurrentAccount()).q()) {
            try {
                x5Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new gc(x5Var, null).r(document, org.telegram.messenger.g0.X2(id.M0(2131743861, null)), id.M0(2131747033, null), new ab(this, 10)).j();
        } else if (l10 == null && document == null) {
        } else {
            if (document != null) {
                h5.g(p10.f24474s0).e(document);
            }
            if (l10 == null) {
                longValue = document.f26966id;
            } else {
                longValue = l10.longValue();
            }
            ?? obj = new Object();
            obj.f6360g = longValue;
            obj.h = longValue;
            ii0Var.l(view, obj, false);
            org.telegram.messenger.g0.v1(x5Var);
        }
    }

    @Override
    public final void q() {
        b0 b0Var = this.f6410g2;
        if (!b0Var.v) {
            b0Var.v = true;
            if (!b0Var.d) {
                b0Var.f6187b.updateViewLayout(b0Var.f6188c, b0Var.b(true));
            }
            f2 f2Var = this.f6409f2;
            if (f2Var instanceof cn) {
                ((cn) f2Var).ra();
            }
            ii0 ii0Var = this.f6408e2;
            if (ii0Var.getDelegate() != null) {
                ii0Var.getDelegate().E();
            }
        }
    }

    @Override
    public final void r(d11 d11Var, o0 o0Var) {
        this.f6408e2.l(d11Var, o0Var, false);
        org.telegram.messenger.g0.v1(this.f6410g2.f6188c);
    }

    @Override
    public final boolean u() {
        ii0 ii0Var = this.f6408e2;
        if (ii0Var.getDelegate() != null) {
            return ii0Var.getDelegate().E();
        }
        return false;
    }
}
