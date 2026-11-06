package gi;

import android.widget.FrameLayout;
import android.widget.TextView;
import bi.ea;
import bi.nc;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.w6;
import org.telegram.ui.an;
import org.telegram.ui.qj;
public final class e extends na implements ls {
    public final cg.a P1;
    public final nc Q1;
    public final FrameLayout R1;
    public Runnable S1;
    public int T1;
    public f41 U1;

    public e(android.content.Context r16, org.telegram.ui.ActionBar.f6 r17, cg.a r18, boolean r19, java.lang.Runnable r20) {
        throw new UnsupportedOperationException("Method not decompiled: gi.e.<init>(android.content.Context, org.telegram.ui.ActionBar.f6, cg.a, boolean, java.lang.Runnable):void");
    }

    @Override
    public final void K() {
        super.K();
        qs.f(this.f28612a).n(this, qs.f25076v3);
        qs.f(this.f28612a).n(this, qs.f25097y3);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        f41 f41Var = new f41(this.f36328k1, getContext(), this.f28612a, 0, true, new ai.e(this, 25), this.I0);
        this.U1 = f41Var;
        return f41Var;
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
        if (i7 == qs.f25076v3 || i7 == qs.f25097y3) {
            f41 f41Var = this.U1;
            if (f41Var != null) {
                f41Var.O(true);
            }
            cg.a s5 = ea.y(this.f28612a, true).s();
            cg.a aVar = this.P1;
            ((TextView) this.Q1.f4436c).setText(hd.a0(null, null, 2131744046, cg.a.i(aVar.f6161b - s5.f6161b, cg.b.f6163b).d()));
            ja jaVar = this.l1;
            if (jaVar != null) {
                jaVar.setTitle(O0());
            }
            if (s5.f6161b >= aVar.f6161b && (runnable = this.S1) != null) {
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
            ((w6) ncVar.f4435b).setPaused(true);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = k6.w0(k6.f27921h5, this.I0);
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
        qj qjVar;
        if (ea.y(this.f28612a, true).s().f6161b >= this.P1.f6161b) {
            Runnable runnable = this.S1;
            if (runnable != null) {
                runnable.run();
                this.S1 = null;
                return;
            }
            return;
        }
        f2 Q = LaunchActivity.Q();
        if (Q instanceof an) {
            an anVar = (an) Q;
            if (anVar.T9() && (qjVar = anVar.Z) != null) {
                qjVar.L();
            }
        }
        super.show();
        qs.f(this.f28612a).c(this, qs.f25076v3);
        qs.f(this.f28612a).c(this, qs.f25097y3);
    }
}
