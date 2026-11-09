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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.c11;
import org.telegram.ui.cn;
import org.telegram.ui.s11;
public final class w extends s11 {
    public final ji0 f6403e2;
    public final f2 f6404f2;
    public final b0 f6405g2;

    public w(b0 b0Var, f2 f2Var, Context context, int i7, boolean z9, g6 g6Var, ji0 ji0Var, f2 f2Var2) {
        super(f2Var, context, false, null, i7, z9, g6Var, 16);
        this.f6405g2 = b0Var;
        this.f6403e2 = ji0Var;
        this.f6404f2 = f2Var2;
    }

    @Override
    public final void m() {
        this.f6405g2.f6181a.invalidate();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        x5 x5Var = this.f6405g2.f6183c;
        ji0 ji0Var = this.f6403e2;
        f2 f2Var = this.f6404f2;
        if (f2Var != null && !ji0Var.A0 && ji0Var.getWindowType() != 13 && !p10.i(f2Var.getCurrentAccount()).q()) {
            try {
                x5Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new hc(x5Var, null).r(document, org.telegram.messenger.g0.X2(id.M0(2131743861, null)), id.M0(2131747033, null), new ab(this, 10)).j();
        } else if (l10 == null && document == null) {
        } else {
            if (document != null) {
                i5.g(p10.f24470s0).e(document);
            }
            if (l10 == null) {
                longValue = document.f26962id;
            } else {
                longValue = l10.longValue();
            }
            ?? obj = new Object();
            obj.f6355g = longValue;
            obj.h = longValue;
            ji0Var.l(view, obj, false);
            org.telegram.messenger.g0.v1(x5Var);
        }
    }

    @Override
    public final void q() {
        b0 b0Var = this.f6405g2;
        if (!b0Var.v) {
            b0Var.v = true;
            if (!b0Var.d) {
                b0Var.f6182b.updateViewLayout(b0Var.f6183c, b0Var.b(true));
            }
            f2 f2Var = this.f6404f2;
            if (f2Var instanceof cn) {
                ((cn) f2Var).ra();
            }
            ji0 ji0Var = this.f6403e2;
            if (ji0Var.getDelegate() != null) {
                ji0Var.getDelegate().E();
            }
        }
    }

    @Override
    public final void r(c11 c11Var, o0 o0Var) {
        this.f6403e2.l(c11Var, o0Var, false);
        org.telegram.messenger.g0.v1(this.f6405g2.f6183c);
    }

    @Override
    public final boolean u() {
        ji0 ji0Var = this.f6403e2;
        if (ji0Var.getDelegate() != null) {
            return ji0Var.getDelegate().E();
        }
        return false;
    }
}
