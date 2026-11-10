package bi;

import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.sj;
public final class tc extends org.telegram.ui.Components.ma implements ls {
    public final long S1;
    public final ah.a T1;
    public final FrameLayout U1;
    public final jz V1;
    public Runnable W1;
    public final TLRPC.InputPeer X1;
    public final boolean Y1;
    public m41 Z1;
    public boolean f4769a2;

    public tc(android.content.Context r17, org.telegram.ui.ActionBar.h6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: bi.tc.<init>(android.content.Context, org.telegram.ui.ActionBar.h6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    @Override
    public final void K() {
        super.K();
        qs.f(this.f28669a).n(this, qs.f25097v3);
        qs.f(this.f28669a).n(this, qs.f25118y3);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.f28669a, 0, true, new ai.e(this, 10), this.I0);
        this.Z1 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        ah.a aVar = this.T1;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == qs.f25097v3 || i7 == qs.f25118y3) {
            m41 m41Var = this.Z1;
            if (m41Var != null) {
                m41Var.O(true);
            }
            long j3 = ea.y(this.f28669a, false).p().amount;
            long j10 = this.S1;
            ((TextView) this.T1.d).setText(org.telegram.messenger.id.H(',', "StarsNeededTitle", (int) (j10 - j3)));
            org.telegram.ui.Components.ia iaVar = this.f35902o1;
            if (iaVar != null) {
                iaVar.setTitle(O0());
            }
            if (j3 >= j10 && (runnable = this.W1) != null) {
                runnable.run();
                this.W1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ah.a aVar = this.T1;
        if (aVar != null) {
            ((vg.m) aVar.f1057b).setPaused(true);
        }
    }

    @Override
    public final void show() {
        sj sjVar;
        if (!this.Y1) {
            org.telegram.messenger.k5.o(null, 2131747397, new org.telegram.ui.Components.gc(org.telegram.ui.Components.wa.a(getContext()), this.I0), 2131624226, 36);
        } else if (ea.y(this.f28669a, false).p().amount >= this.S1) {
            Runnable runnable = this.W1;
            if (runnable != null) {
                runnable.run();
                this.W1 = null;
            }
        } else {
            org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
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
}
