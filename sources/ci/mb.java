package ci;

import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mj;
import org.telegram.ui.wm;
public final class mb extends org.telegram.ui.Components.ma implements cs {
    public final long Q1;
    public final bh.a R1;
    public final FrameLayout S1;
    public final gz T1;
    public Runnable U1;
    public final TLRPC.InputPeer V1;
    public final boolean W1;
    public f41 X1;
    public boolean Y1;

    public mb(android.content.Context r17, org.telegram.ui.ActionBar.e6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: ci.mb.<init>(android.content.Context, org.telegram.ui.ActionBar.e6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    @Override
    public final void K() {
        super.K();
        hs.f(this.f28583a).n(this, hs.f23322v3);
        hs.f(this.f28583a).n(this, hs.f23343y3);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.f36102l1, getContext(), this.f28583a, 0, true, new ai.c(this, 20), this.J0);
        this.X1 = f41Var;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        bh.a aVar = this.R1;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        Runnable runnable;
        if (i3 == hs.f23322v3 || i3 == hs.f23343y3) {
            f41 f41Var = this.X1;
            if (f41Var != null) {
                f41Var.O(true);
            }
            long j10 = e9.y(this.f28583a, false).p().amount;
            long j11 = this.Q1;
            ((TextView) this.R1.d).setText(bd.H(',', "StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.ia iaVar = this.m1;
            if (iaVar != null) {
                iaVar.setTitle(O0());
            }
            if (j10 >= j11 && (runnable = this.U1) != null) {
                runnable.run();
                this.U1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        bh.a aVar = this.R1;
        if (aVar != null) {
            ((wg.m) aVar.f3299b).setPaused(true);
        }
    }

    @Override
    public final void show() {
        mj mjVar;
        if (!this.W1) {
            org.telegram.messenger.k5.o(null, 2131747405, new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(getContext()), this.J0), 2131624226, 36);
        } else if (e9.y(this.f28583a, false).p().amount >= this.Q1) {
            Runnable runnable = this.U1;
            if (runnable != null) {
                runnable.run();
                this.U1 = null;
            }
        } else {
            org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
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
}
