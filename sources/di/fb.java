package di;

import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.rj;
public final class fb extends org.telegram.ui.Components.sa implements fs {
    public final long T1;
    public final ah.a U1;
    public final FrameLayout V1;
    public final uz W1;
    public Runnable X1;
    public final TLRPC.InputPeer Y1;
    public final boolean Z1;
    public z41 f8837a2;
    public boolean f8838b2;

    public fb(android.content.Context r17, org.telegram.ui.ActionBar.i6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: di.fb.<init>(android.content.Context, org.telegram.ui.ActionBar.i6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    @Override
    public final void L() {
        super.L();
        ks.f(this.f30187a).n(this, ks.f25221x3);
        ks.f(this.f30187a).n(this, ks.A3);
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.f39534o1, getContext(), this.f30187a, 0, true, new bi.b(this, 20), this.J0);
        this.f8837a2 = z41Var;
        return z41Var;
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
        if (i7 == ks.f25221x3 || i7 == ks.A3) {
            z41 z41Var = this.f8837a2;
            if (z41Var != null) {
                z41Var.O(true);
            }
            long j3 = x8.y(this.f30187a, false).p().amount;
            long j10 = this.T1;
            ((TextView) this.U1.d).setText(gd.H(',', "StarsNeededTitle", (int) (j10 - j3)));
            org.telegram.ui.Components.na naVar = this.f39535p1;
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
            org.telegram.messenger.f3.n(null, 2131747204, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(getContext()), this.J0), 2131624227, 36);
        } else if (x8.y(this.f30187a, false).p().amount >= this.T1) {
            Runnable runnable = this.X1;
            if (runnable != null) {
                runnable.run();
                this.X1 = null;
            }
        } else {
            org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
            if (Q instanceof bn) {
                bn bnVar = (bn) Q;
                if (bnVar.V9() && (rjVar = bnVar.f45923a0) != null) {
                    rjVar.U();
                }
            }
            super.show();
            ks.f(this.f30187a).c(this, ks.f25221x3);
            ks.f(this.f30187a).c(this, ks.A3);
        }
    }
}
