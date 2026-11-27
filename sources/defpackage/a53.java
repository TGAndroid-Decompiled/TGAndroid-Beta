package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class a53 extends n1a {
    public final i49 f2;
    public final e g2;
    public final e53 h2;

    public a53(e53 e53Var, e eVar, Context context, int i, boolean z, vnb vnbVar, i49 i49Var, e eVar2) {
        super(eVar, context, false, null, i, z, vnbVar, 16);
        this.h2 = e53Var;
        this.f2 = i49Var;
        this.g2 = eVar2;
    }

    @Override
    public final void l() {
        this.h2.a.invalidate();
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        tt ttVar = this.h2.c;
        i49 i49Var = this.f2;
        e eVar = this.g2;
        if (eVar != null && !i49Var.B0 && i49Var.getWindowType() != 13 && !yac.h(eVar.getCurrentAccount()).p()) {
            try {
                ttVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new d31(ttVar, null).r(document, hl.S2(ob6.M0(2131743516, null)), ob6.M0(2131746762, null), new vd2(this, (byte) 23)).j();
        } else if (l == null && document == null) {
        } else {
            if (document != null) {
                wl.g(yac.t0).e(document);
            }
            if (l == null) {
                longValue = document.id;
            } else {
                longValue = l.longValue();
            }
            ?? obj = new Object();
            obj.g = longValue;
            obj.h = longValue;
            i49Var.i(view, obj, false);
            hl.t1(ttVar);
        }
    }

    @Override
    public final void p() {
        e53 e53Var = this.h2;
        if (!e53Var.v) {
            e53Var.v = true;
            if (!e53Var.d) {
                e53Var.b.updateViewLayout(e53Var.c, e53Var.b(true));
            }
            e eVar = this.g2;
            if (eVar instanceof zu1) {
                ((zu1) eVar).fa();
            }
            i49 i49Var = this.f2;
            if (i49Var.getDelegate() != null) {
                i49Var.getDelegate().k();
            }
        }
    }

    @Override
    public final void q(w0a w0aVar, w49 w49Var) {
        this.f2.i(w0aVar, w49Var, false);
        hl.t1(this.h2.c);
    }

    @Override
    public final boolean t() {
        i49 i49Var = this.f2;
        if (i49Var.getDelegate() != null) {
            return i49Var.getDelegate().k();
        }
        return false;
    }
}
