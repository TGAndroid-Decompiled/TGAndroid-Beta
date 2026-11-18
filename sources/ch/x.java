package ch;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.b11;
import org.telegram.ui.bn;
import org.telegram.ui.r11;
public final class x extends r11 {
    public final vi0 f5527f2;
    public final h2 f5528g2;
    public final b0 f5529h2;

    public x(b0 b0Var, h2 h2Var, Context context, int i7, boolean z10, i6 i6Var, vi0 vi0Var, h2 h2Var2) {
        super(h2Var, context, false, null, i7, z10, i6Var, 16);
        this.f5529h2 = b0Var;
        this.f5527f2 = vi0Var;
        this.f5528g2 = h2Var2;
    }

    @Override
    public final void m() {
        this.f5529h2.f5294a.invalidate();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        ai.k0 k0Var = this.f5529h2.f5296c;
        vi0 vi0Var = this.f5527f2;
        h2 h2Var = this.f5528g2;
        if (h2Var != null && !vi0Var.B0 && vi0Var.getWindowType() != 13 && !j10.i(h2Var.getCurrentAccount()).q()) {
            try {
                k0Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new lc(k0Var, null).r(document, org.telegram.messenger.g0.W2(gd.M0(2131743624, null)), gd.M0(2131746840, null), new ca.r(this, 4)).j();
        } else if (l10 == null && document == null) {
        } else {
            if (document != null) {
                o5.g(j10.f24770t0).e(document);
            }
            if (l10 == null) {
                longValue = document.f28409id;
            } else {
                longValue = l10.longValue();
            }
            ?? obj = new Object();
            obj.f5476g = longValue;
            obj.h = longValue;
            vi0Var.l(view, obj, false);
            org.telegram.messenger.g0.v1(k0Var);
        }
    }

    @Override
    public final void q() {
        b0 b0Var = this.f5529h2;
        if (!b0Var.v) {
            b0Var.v = true;
            if (!b0Var.d) {
                b0Var.f5295b.updateViewLayout(b0Var.f5296c, b0Var.b(true));
            }
            h2 h2Var = this.f5528g2;
            if (h2Var instanceof bn) {
                ((bn) h2Var).sa();
            }
            vi0 vi0Var = this.f5527f2;
            if (vi0Var.getDelegate() != null) {
                vi0Var.getDelegate().q();
            }
        }
    }

    @Override
    public final void r(b11 b11Var, p0 p0Var) {
        this.f5527f2.l(b11Var, p0Var, false);
        org.telegram.messenger.g0.v1(this.f5529h2.f5296c);
    }

    @Override
    public final boolean u() {
        vi0 vi0Var = this.f5527f2;
        if (vi0Var.getDelegate() != null) {
            return vi0Var.getDelegate().q();
        }
        return false;
    }
}
