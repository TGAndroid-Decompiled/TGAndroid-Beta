package gi;

import android.widget.FrameLayout;
import android.widget.TextView;
import bi.ea;
import bi.nc;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.u6;
import org.telegram.ui.cn;
import org.telegram.ui.sj;
public final class e extends na implements ls {
    public final cg.a P1;
    public final nc Q1;
    public final FrameLayout R1;
    public Runnable S1;
    public int T1;
    public m41 U1;

    public e(android.content.Context r16, org.telegram.ui.ActionBar.g6 r17, cg.a r18, boolean r19, java.lang.Runnable r20) {
        throw new UnsupportedOperationException("Method not decompiled: gi.e.<init>(android.content.Context, org.telegram.ui.ActionBar.g6, cg.a, boolean, java.lang.Runnable):void");
    }

    @Override
    public final void K() {
        super.K();
        qs.f(this.f28621a).n(this, qs.f25093v3);
        qs.f(this.f28621a).n(this, qs.f25114y3);
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(this.f36303k1, getContext(), this.f28621a, 0, true, new ai.e(this, 25), this.I0);
        this.U1 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        nc ncVar = this.Q1;
        if (ncVar == null) {
            return null;
        }
        return ((TextView) ncVar.f4436c).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == qs.f25093v3 || i7 == qs.f25114y3) {
            m41 m41Var = this.U1;
            if (m41Var != null) {
                m41Var.O(true);
            }
            cg.a s5 = ea.y(this.f28621a, true).s();
            cg.a aVar = this.P1;
            ((TextView) this.Q1.f4436c).setText(id.a0(null, null, 2131744045, cg.a.i(aVar.f6159b - s5.f6159b, cg.b.f6161b).d()));
            ja jaVar = this.l1;
            if (jaVar != null) {
                jaVar.setTitle(O0());
            }
            if (s5.f6159b >= aVar.f6159b && (runnable = this.S1) != null) {
                runnable.run();
                this.S1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        nc ncVar = this.Q1;
        if (ncVar != null) {
            ((u6) ncVar.f4435b).setPaused(true);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = l6.w0(l6.f27938h5, this.I0);
            if (w02 != this.T1) {
                this.T1 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        sj sjVar;
        if (ea.y(this.f28621a, true).s().f6159b >= this.P1.f6159b) {
            Runnable runnable = this.S1;
            if (runnable != null) {
                runnable.run();
                this.S1 = null;
                return;
            }
            return;
        }
        f2 Q = LaunchActivity.Q();
        if (Q instanceof cn) {
            cn cnVar = (cn) Q;
            if (cnVar.U9() && (sjVar = cnVar.Z) != null) {
                sjVar.L();
            }
        }
        super.show();
        qs.f(this.f28621a).c(this, qs.f25093v3);
        qs.f(this.f28621a).c(this, qs.f25114y3);
    }
}
