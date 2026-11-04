package hi;

import android.widget.FrameLayout;
import android.widget.TextView;
import ci.e9;
import ci.gb;
import gi.q4;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.u6;
import org.telegram.ui.mj;
import org.telegram.ui.wm;
public final class f extends ma implements cs {
    public final dg.a Q1;
    public final gb R1;
    public final FrameLayout S1;
    public Runnable T1;
    public int U1;
    public f41 V1;

    public f(android.content.Context r16, org.telegram.ui.ActionBar.e6 r17, dg.a r18, boolean r19, java.lang.Runnable r20) {
        throw new UnsupportedOperationException("Method not decompiled: hi.f.<init>(android.content.Context, org.telegram.ui.ActionBar.e6, dg.a, boolean, java.lang.Runnable):void");
    }

    @Override
    public final void K() {
        super.K();
        hs.f(this.f28583a).n(this, hs.f23322v3);
        hs.f(this.f28583a).n(this, hs.f23343y3);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.f36102l1, getContext(), this.f28583a, 0, true, new q4(this, 5), this.J0);
        this.V1 = f41Var;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        gb gbVar = this.R1;
        if (gbVar == null) {
            return null;
        }
        return ((TextView) gbVar.f5199c).getText();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        Runnable runnable;
        if (i3 == hs.f23322v3 || i3 == hs.f23343y3) {
            f41 f41Var = this.V1;
            if (f41Var != null) {
                f41Var.O(true);
            }
            dg.a s6 = e9.y(this.f28583a, true).s();
            dg.a aVar = this.Q1;
            ((TextView) this.R1.f5199c).setText(bd.a0(null, null, 2131744055, dg.a.i(aVar.f8924b - s6.f8924b, dg.b.f8926b).d()));
            ia iaVar = this.m1;
            if (iaVar != null) {
                iaVar.setTitle(O0());
            }
            if (s6.f8924b >= aVar.f8924b && (runnable = this.T1) != null) {
                runnable.run();
                this.T1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        gb gbVar = this.R1;
        if (gbVar != null) {
            ((u6) gbVar.f5198b).setPaused(true);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = k6.w0(k6.f27954h5, this.J0);
            if (w02 != this.U1) {
                this.U1 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        mj mjVar;
        if (e9.y(this.f28583a, true).s().f8924b >= this.Q1.f8924b) {
            Runnable runnable = this.T1;
            if (runnable != null) {
                runnable.run();
                this.T1 = null;
                return;
            }
            return;
        }
        d2 Q = LaunchActivity.Q();
        if (Q instanceof wm) {
            wm wmVar = (wm) Q;
            if (wmVar.T9() && (mjVar = wmVar.f51237a0) != null) {
                mjVar.L();
            }
        }
        super.show();
        hs.f(this.f28583a).c(this, hs.f23322v3);
        hs.f(this.f28583a).c(this, hs.f23343y3);
    }
}
