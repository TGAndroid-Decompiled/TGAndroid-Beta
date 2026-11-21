package ii;

import android.widget.FrameLayout;
import android.widget.TextView;
import di.y8;
import di.za;
import hi.d7;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.sa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.m7;
import org.telegram.ui.bn;
import org.telegram.ui.rj;
public final class s extends sa implements fs {
    public final cg.a T1;
    public final za U1;
    public final FrameLayout V1;
    public Runnable W1;
    public int X1;
    public c51 Y1;

    public s(android.content.Context r16, org.telegram.ui.ActionBar.h6 r17, cg.a r18, boolean r19, java.lang.Runnable r20) {
        throw new UnsupportedOperationException("Method not decompiled: ii.s.<init>(android.content.Context, org.telegram.ui.ActionBar.h6, cg.a, boolean, java.lang.Runnable):void");
    }

    @Override
    public final void L() {
        super.L();
        ks.f(this.f30170a).n(this, ks.f25249x3);
        ks.f(this.f30170a).n(this, ks.A3);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.f39539o1, getContext(), this.f30170a, 0, true, new d7(this, 5), this.J0);
        this.Y1 = c51Var;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        za zaVar = this.U1;
        if (zaVar == null) {
            return null;
        }
        return ((TextView) zaVar.f10203c).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == ks.f25249x3 || i7 == ks.A3) {
            c51 c51Var = this.Y1;
            if (c51Var != null) {
                c51Var.O(true);
            }
            cg.a s5 = y8.y(this.f30170a, true).s();
            cg.a aVar = this.T1;
            ((TextView) this.U1.f10203c).setText(gd.a0(null, null, 2131743804, cg.a.j(aVar.f5301b - s5.f5301b, cg.b.f5303b).d()));
            na naVar = this.f39540p1;
            if (naVar != null) {
                naVar.setTitle(P0());
            }
            if (s5.f5301b >= aVar.f5301b && (runnable = this.W1) != null) {
                runnable.run();
                this.W1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        za zaVar = this.U1;
        if (zaVar != null) {
            ((m7) zaVar.f10202b).setPaused(true);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = m6.w0(m6.f29451h5, this.J0);
            if (w02 != this.X1) {
                this.X1 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        rj rjVar;
        if (y8.y(this.f30170a, true).s().f5301b >= this.T1.f5301b) {
            Runnable runnable = this.W1;
            if (runnable != null) {
                runnable.run();
                this.W1 = null;
                return;
            }
            return;
        }
        g2 Q = LaunchActivity.Q();
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
