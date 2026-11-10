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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.x6;
import org.telegram.ui.cn;
import org.telegram.ui.sj;
public final class e extends ma implements ls {
    public final cg.a S1;
    public final nc T1;
    public final FrameLayout U1;
    public Runnable V1;
    public int W1;
    public m41 X1;

    public e(android.content.Context r16, org.telegram.ui.ActionBar.h6 r17, cg.a r18, boolean r19, java.lang.Runnable r20) {
        throw new UnsupportedOperationException("Method not decompiled: gi.e.<init>(android.content.Context, org.telegram.ui.ActionBar.h6, cg.a, boolean, java.lang.Runnable):void");
    }

    @Override
    public final void K() {
        super.K();
        qs.f(this.f28669a).n(this, qs.f25097v3);
        qs.f(this.f28669a).n(this, qs.f25118y3);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.f28669a, 0, true, new ai.e(this, 25), this.I0);
        this.X1 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        nc ncVar = this.T1;
        if (ncVar == null) {
            return null;
        }
        return ((TextView) ncVar.f4436c).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == qs.f25097v3 || i7 == qs.f25118y3) {
            m41 m41Var = this.X1;
            if (m41Var != null) {
                m41Var.O(true);
            }
            cg.a s5 = ea.y(this.f28669a, true).s();
            cg.a aVar = this.S1;
            ((TextView) this.T1.f4436c).setText(id.a0(null, null, 2131744045, cg.a.i(aVar.f6164b - s5.f6164b, cg.b.f6166b).d()));
            ia iaVar = this.f35902o1;
            if (iaVar != null) {
                iaVar.setTitle(O0());
            }
            if (s5.f6164b >= aVar.f6164b && (runnable = this.V1) != null) {
                runnable.run();
                this.V1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        nc ncVar = this.T1;
        if (ncVar != null) {
            ((x6) ncVar.f4435b).setPaused(true);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = m6.w0(m6.f27963h5, this.I0);
            if (w02 != this.W1) {
                this.W1 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        sj sjVar;
        if (ea.y(this.f28669a, true).s().f6164b >= this.S1.f6164b) {
            Runnable runnable = this.V1;
            if (runnable != null) {
                runnable.run();
                this.V1 = null;
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
        qs.f(this.f28669a).c(this, qs.f25097v3);
        qs.f(this.f28669a).c(this, qs.f25118y3);
    }
}
