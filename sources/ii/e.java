package ii;

import android.widget.FrameLayout;
import android.widget.TextView;
import di.u8;
import di.va;
import hi.q4;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.w6;
import org.telegram.ui.an;
import org.telegram.ui.qj;
public final class e extends ja implements is {
    public final cg.a T1;
    public final va U1;
    public final FrameLayout V1;
    public Runnable W1;
    public int X1;
    public p41 Y1;

    public e(android.content.Context r16, org.telegram.ui.ActionBar.e6 r17, cg.a r18, boolean r19, java.lang.Runnable r20) {
        throw new UnsupportedOperationException("Method not decompiled: ii.e.<init>(android.content.Context, org.telegram.ui.ActionBar.e6, cg.a, boolean, java.lang.Runnable):void");
    }

    @Override
    public final void L() {
        super.L();
        ns.f(this.f29679a).n(this, ns.f25590v3);
        ns.f(this.f29679a).n(this, ns.f25611y3);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.f35931o1, getContext(), this.f29679a, 0, true, new q4(this, 5), this.J0);
        this.Y1 = p41Var;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        va vaVar = this.U1;
        if (vaVar == null) {
            return null;
        }
        return ((TextView) vaVar.f9623c).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == ns.f25590v3 || i7 == ns.f25611y3) {
            p41 p41Var = this.Y1;
            if (p41Var != null) {
                p41Var.O(true);
            }
            cg.a s5 = u8.y(this.f29679a, true).s();
            cg.a aVar = this.T1;
            ((TextView) this.U1.f9623c).setText(hd.a0(null, null, 2131744045, cg.a.i(aVar.f4989b - s5.f4989b, cg.b.f4991b).d()));
            fa faVar = this.f35932p1;
            if (faVar != null) {
                faVar.setTitle(O0());
            }
            if (s5.f4989b >= aVar.f4989b && (runnable = this.W1) != null) {
                runnable.run();
                this.W1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        va vaVar = this.U1;
        if (vaVar != null) {
            ((w6) vaVar.f9622b).setPaused(true);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = j6.w0(j6.f28922h5, this.J0);
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
        qj qjVar;
        if (u8.y(this.f29679a, true).s().f4989b >= this.T1.f4989b) {
            Runnable runnable = this.W1;
            if (runnable != null) {
                runnable.run();
                this.W1 = null;
                return;
            }
            return;
        }
        e2 Q = LaunchActivity.Q();
        if (Q instanceof an) {
            an anVar = (an) Q;
            if (anVar.V9() && (qjVar = anVar.f45117a0) != null) {
                qjVar.S();
            }
        }
        super.show();
        ns.f(this.f29679a).c(this, ns.f25590v3);
        ns.f(this.f29679a).c(this, ns.f25611y3);
    }
}
