package bi;

import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.sj;
public final class tc extends org.telegram.ui.Components.na implements ls {
    public final long P1;
    public final ah.a Q1;
    public final FrameLayout R1;
    public final kz S1;
    public Runnable T1;
    public final TLRPC.InputPeer U1;
    public final boolean V1;
    public m41 W1;
    public boolean X1;

    public tc(android.content.Context r17, org.telegram.ui.ActionBar.g6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: bi.tc.<init>(android.content.Context, org.telegram.ui.ActionBar.g6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    @Override
    public final void K() {
        super.K();
        qs.f(this.f28621a).n(this, qs.f25093v3);
        qs.f(this.f28621a).n(this, qs.f25114y3);
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(this.f36303k1, getContext(), this.f28621a, 0, true, new ai.e(this, 10), this.I0);
        this.W1 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        ah.a aVar = this.Q1;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == qs.f25093v3 || i7 == qs.f25114y3) {
            m41 m41Var = this.W1;
            if (m41Var != null) {
                m41Var.O(true);
            }
            long j3 = ea.y(this.f28621a, false).p().amount;
            long j10 = this.P1;
            ((TextView) this.Q1.d).setText(org.telegram.messenger.id.H(',', "StarsNeededTitle", (int) (j10 - j3)));
            org.telegram.ui.Components.ja jaVar = this.l1;
            if (jaVar != null) {
                jaVar.setTitle(O0());
            }
            if (j3 >= j10 && (runnable = this.T1) != null) {
                runnable.run();
                this.T1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ah.a aVar = this.Q1;
        if (aVar != null) {
            ((vg.m) aVar.f1057b).setPaused(true);
        }
    }

    @Override
    public final void show() {
        sj sjVar;
        if (!this.V1) {
            org.telegram.messenger.k5.o(null, 2131747397, new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(getContext()), this.I0), 2131624226, 36);
        } else if (ea.y(this.f28621a, false).p().amount >= this.P1) {
            Runnable runnable = this.T1;
            if (runnable != null) {
                runnable.run();
                this.T1 = null;
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
            qs.f(this.f28621a).c(this, qs.f25093v3);
            qs.f(this.f28621a).c(this, qs.f25114y3);
        }
    }
}
