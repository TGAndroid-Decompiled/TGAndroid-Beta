package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class i43 extends tx9 {
    public final t09 f2;
    public final d g2;
    public final m43 h2;

    public i43(m43 m43Var, d dVar, Context context, int i, boolean z, wjb wjbVar, t09 t09Var, d dVar2) {
        super(dVar, context, false, null, i, z, wjbVar, 16);
        this.h2 = m43Var;
        this.f2 = t09Var;
        this.g2 = dVar2;
    }

    @Override
    public final void l() {
        this.h2.a.invalidate();
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        st stVar = this.h2.c;
        t09 t09Var = this.f2;
        d dVar = this.g2;
        if (dVar != null && !t09Var.B0 && t09Var.getWindowType() != 13 && !y6c.h(dVar.getCurrentAccount()).p()) {
            try {
                stVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new u21(stVar, null).r(document, gl.S2(k96.M0(2131743622, null)), k96.M0(2131746842, null), new mk2(this, (byte) 17)).j();
        } else if (l == null && document == null) {
        } else {
            if (document != null) {
                vl.g(y6c.t0).e(document);
            }
            if (l == null) {
                longValue = document.id;
            } else {
                longValue = l.longValue();
            }
            ?? obj = new Object();
            obj.g = longValue;
            obj.h = longValue;
            t09Var.i(view, obj, false);
            gl.t1(stVar);
        }
    }

    @Override
    public final void p() {
        m43 m43Var = this.h2;
        if (!m43Var.v) {
            m43Var.v = true;
            if (!m43Var.d) {
                m43Var.b.updateViewLayout(m43Var.c, m43Var.b(true));
            }
            d dVar = this.g2;
            if (dVar instanceof mu1) {
                ((mu1) dVar).U9();
            }
            t09 t09Var = this.f2;
            if (t09Var.getDelegate() != null) {
                t09Var.getDelegate().u();
            }
        }
    }

    @Override
    public final void q(dx9 dx9Var, h19 h19Var) {
        this.f2.i(dx9Var, h19Var, false);
        gl.t1(this.h2.c);
    }

    @Override
    public final boolean t() {
        t09 t09Var = this.f2;
        if (t09Var.getDelegate() != null) {
            return t09Var.getDelegate().u();
        }
        return false;
    }
}
