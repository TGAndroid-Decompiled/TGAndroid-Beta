package ii;

import android.widget.FrameLayout;
import android.widget.TextView;
import di.y8;
import di.za;
import hi.e7;
import org.telegram.messenger.a8;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
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
public final class s extends sa implements gs {
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
        ls.f(this.f30139a).n(this, ls.f25379x3);
        ls.f(this.f30139a).n(this, ls.A3);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.f39487o1, getContext(), this.f30139a, 0, true, new e7(this, 5), this.J0);
        this.Y1 = c51Var;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        za zaVar = this.U1;
        if (zaVar == null) {
            return null;
        }
        return ((TextView) zaVar.f10169c).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == ls.f25379x3 || i7 == ls.A3) {
            c51 c51Var = this.Y1;
            if (c51Var != null) {
                c51Var.O(true);
            }
            cg.a s5 = y8.y(this.f30139a, true).s();
            cg.a aVar = this.T1;
            ((TextView) this.U1.f10169c).setText(hd.a0(null, null, 2131743804, cg.a.j(aVar.f5267b - s5.f5267b, cg.b.f5269b).d()));
            na naVar = this.f39488p1;
            if (naVar != null) {
                naVar.setTitle(P0());
            }
            if (s5.f5267b >= aVar.f5267b && (runnable = this.W1) != null) {
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
            ((m7) zaVar.f10168b).setPaused(true);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = m6.w0(m6.f29420h5, this.J0);
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
        if (y8.y(this.f30139a, true).s().f5267b >= this.T1.f5267b) {
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
            if (bnVar.V9() && (rjVar = bnVar.f45903a0) != null) {
                rjVar.U();
            }
        }
        super.show();
        ls.f(this.f30139a).c(this, ls.f25379x3);
        ls.f(this.f30139a).c(this, ls.A3);
    }
}
