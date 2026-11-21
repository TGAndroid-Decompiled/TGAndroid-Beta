package di;

import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.rj;
public final class fb extends org.telegram.ui.Components.sa implements fs {
    public final long T1;
    public final ah.a U1;
    public final FrameLayout V1;
    public final wz W1;
    public Runnable X1;
    public final TLRPC.InputPeer Y1;
    public final boolean Z1;
    public c51 f8870a2;
    public boolean f8871b2;

    public fb(android.content.Context r17, org.telegram.ui.ActionBar.h6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: di.fb.<init>(android.content.Context, org.telegram.ui.ActionBar.h6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    @Override
    public final void L() {
        super.L();
        ks.f(this.f30170a).n(this, ks.f25249x3);
        ks.f(this.f30170a).n(this, ks.A3);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.f39539o1, getContext(), this.f30170a, 0, true, new bi.b(this, 20), this.J0);
        this.f8870a2 = c51Var;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        ah.a aVar = this.U1;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == ks.f25249x3 || i7 == ks.A3) {
            c51 c51Var = this.f8870a2;
            if (c51Var != null) {
                c51Var.O(true);
            }
            long j3 = y8.y(this.f30170a, false).p().amount;
            long j10 = this.T1;
            ((TextView) this.U1.d).setText(gd.H(',', "StarsNeededTitle", (int) (j10 - j3)));
            org.telegram.ui.Components.na naVar = this.f39540p1;
            if (naVar != null) {
                naVar.setTitle(P0());
            }
            if (j3 >= j10 && (runnable = this.X1) != null) {
                runnable.run();
                this.X1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ah.a aVar = this.U1;
        if (aVar != null) {
            ((vg.m) aVar.f1054b).setPaused(true);
        }
    }

    @Override
    public final void show() {
        rj rjVar;
        if (!this.Z1) {
            org.telegram.messenger.f3.n(null, 2131747203, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(getContext()), this.J0), 2131624227, 36);
        } else if (y8.y(this.f30170a, false).p().amount >= this.T1) {
            Runnable runnable = this.X1;
            if (runnable != null) {
                runnable.run();
                this.X1 = null;
            }
        } else {
            org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
            if (Q instanceof bn) {
                bn bnVar = (bn) Q;
                if (bnVar.V9() && (rjVar = bnVar.f45946a0) != null) {
                    rjVar.U();
                }
            }
            super.show();
            ks.f(this.f30170a).c(this, ks.f25249x3);
            ks.f(this.f30170a).c(this, ks.A3);
        }
    }
}
