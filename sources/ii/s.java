package ii;

import android.widget.FrameLayout;
import android.widget.TextView;
import di.x8;
import di.za;
import hi.e7;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
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
    public z41 Y1;

    public s(android.content.Context r16, org.telegram.ui.ActionBar.i6 r17, cg.a r18, boolean r19, java.lang.Runnable r20) {
        throw new UnsupportedOperationException("Method not decompiled: ii.s.<init>(android.content.Context, org.telegram.ui.ActionBar.i6, cg.a, boolean, java.lang.Runnable):void");
    }

    @Override
    public final void L() {
        super.L();
        ks.f(this.f30187a).n(this, ks.f25221x3);
        ks.f(this.f30187a).n(this, ks.A3);
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.f39534o1, getContext(), this.f30187a, 0, true, new e7(this, 5), this.J0);
        this.Y1 = z41Var;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        za zaVar = this.U1;
        if (zaVar == null) {
            return null;
        }
        return ((TextView) zaVar.f10174c).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == ks.f25221x3 || i7 == ks.A3) {
            z41 z41Var = this.Y1;
            if (z41Var != null) {
                z41Var.O(true);
            }
            cg.a s5 = x8.y(this.f30187a, true).s();
            cg.a aVar = this.T1;
            ((TextView) this.U1.f10174c).setText(gd.a0(null, null, 2131743810, cg.a.j(aVar.f5272b - s5.f5272b, cg.b.f5274b).d()));
            na naVar = this.f39535p1;
            if (naVar != null) {
                naVar.setTitle(P0());
            }
            if (s5.f5272b >= aVar.f5272b && (runnable = this.W1) != null) {
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
            ((m7) zaVar.f10173b).setPaused(true);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = n6.w0(n6.f29467h5, this.J0);
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
        if (x8.y(this.f30187a, true).s().f5272b >= this.T1.f5272b) {
            Runnable runnable = this.W1;
            if (runnable != null) {
                runnable.run();
                this.W1 = null;
                return;
            }
            return;
        }
        h2 Q = LaunchActivity.Q();
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
