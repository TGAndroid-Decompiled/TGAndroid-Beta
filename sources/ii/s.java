package ii;

import android.widget.FrameLayout;
import android.widget.TextView;
import di.y8;
import di.za;
import hi.y7;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.ra;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.n7;
import org.telegram.ui.bn;
import org.telegram.ui.rj;
public final class s extends ra implements fs {
    public final cg.a T1;
    public final za U1;
    public final FrameLayout V1;
    public Runnable W1;
    public int X1;
    public b51 Y1;

    public s(android.content.Context r16, org.telegram.ui.ActionBar.i6 r17, cg.a r18, boolean r19, java.lang.Runnable r20) {
        throw new UnsupportedOperationException("Method not decompiled: ii.s.<init>(android.content.Context, org.telegram.ui.ActionBar.i6, cg.a, boolean, java.lang.Runnable):void");
    }

    @Override
    public final void L() {
        super.L();
        ks.f(this.f30223a).n(this, ks.f25320x3);
        ks.f(this.f30223a).n(this, ks.A3);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(this.f39246o1, getContext(), this.f30223a, 0, true, new y7(this, 5), this.J0);
        this.Y1 = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        za zaVar = this.U1;
        if (zaVar == null) {
            return null;
        }
        return ((TextView) zaVar.f10167c).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == ks.f25320x3 || i7 == ks.A3) {
            b51 b51Var = this.Y1;
            if (b51Var != null) {
                b51Var.O(true);
            }
            cg.a s5 = y8.y(this.f30223a, true).s();
            cg.a aVar = this.T1;
            ((TextView) this.U1.f10167c).setText(gd.a0(null, null, 2131743800, cg.a.j(aVar.f5267b - s5.f5267b, cg.b.f5269b).d()));
            ma maVar = this.f39247p1;
            if (maVar != null) {
                maVar.setTitle(P0());
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
            ((n7) zaVar.f10166b).setPaused(true);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = n6.w0(n6.f29524h5, this.J0);
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
        if (y8.y(this.f30223a, true).s().f5267b >= this.T1.f5267b) {
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
            if (bnVar.V9() && (rjVar = bnVar.f46118a0) != null) {
                rjVar.U();
            }
        }
        super.show();
        ks.f(this.f30223a).c(this, ks.f25320x3);
        ks.f(this.f30223a).c(this, ks.A3);
    }
}
