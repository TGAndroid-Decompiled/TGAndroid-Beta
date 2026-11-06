package ch;

import android.content.Context;
import android.view.View;
import bi.ab;
import bi.x5;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.a11;
import org.telegram.ui.an;
import org.telegram.ui.q11;
public final class w extends q11 {
    public final ii0 f6405e2;
    public final f2 f6406f2;
    public final b0 f6407g2;

    public w(b0 b0Var, f2 f2Var, Context context, int i7, boolean z9, f6 f6Var, ii0 ii0Var, f2 f2Var2) {
        super(f2Var, context, false, null, i7, z9, f6Var, 16);
        this.f6407g2 = b0Var;
        this.f6405e2 = ii0Var;
        this.f6406f2 = f2Var2;
    }

    @Override
    public final void m() {
        this.f6407g2.f6183a.invalidate();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        x5 x5Var = this.f6407g2.f6185c;
        ii0 ii0Var = this.f6405e2;
        f2 f2Var = this.f6406f2;
        if (f2Var != null && !ii0Var.A0 && ii0Var.getWindowType() != 13 && !p10.i(f2Var.getCurrentAccount()).q()) {
            try {
                x5Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new hc(x5Var, null).r(document, org.telegram.messenger.g0.X2(hd.M0(2131743862, null)), hd.M0(2131747032, null), new ab(this, 10)).j();
        } else if (l10 == null && document == null) {
        } else {
            if (document != null) {
                i5.g(p10.f24459s0).e(document);
            }
            if (l10 == null) {
                longValue = document.f26958id;
            } else {
                longValue = l10.longValue();
            }
            ?? obj = new Object();
            obj.f6357g = longValue;
            obj.h = longValue;
            ii0Var.l(view, obj, false);
            org.telegram.messenger.g0.v1(x5Var);
        }
    }

    @Override
    public final void q() {
        b0 b0Var = this.f6407g2;
        if (!b0Var.v) {
            b0Var.v = true;
            if (!b0Var.d) {
                b0Var.f6184b.updateViewLayout(b0Var.f6185c, b0Var.b(true));
            }
            f2 f2Var = this.f6406f2;
            if (f2Var instanceof an) {
                ((an) f2Var).pa();
            }
            ii0 ii0Var = this.f6405e2;
            if (ii0Var.getDelegate() != null) {
                ii0Var.getDelegate().E();
            }
        }
    }

    @Override
    public final void r(a11 a11Var, o0 o0Var) {
        this.f6405e2.l(a11Var, o0Var, false);
        org.telegram.messenger.g0.v1(this.f6407g2.f6185c);
    }

    @Override
    public final boolean u() {
        ii0 ii0Var = this.f6405e2;
        if (ii0Var.getDelegate() != null) {
            return ii0Var.getDelegate().E();
        }
        return false;
    }
}
