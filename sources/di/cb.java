package di;

import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.qj;
public final class cb extends org.telegram.ui.Components.ja implements is {
    public final long T1;
    public final ah.a U1;
    public final FrameLayout V1;
    public final nz W1;
    public Runnable X1;
    public final TLRPC.InputPeer Y1;
    public final boolean Z1;
    public p41 f8382a2;
    public boolean f8383b2;

    public cb(android.content.Context r17, org.telegram.ui.ActionBar.e6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: di.cb.<init>(android.content.Context, org.telegram.ui.ActionBar.e6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    @Override
    public final void L() {
        super.L();
        ns.f(this.f29679a).n(this, ns.f25589v3);
        ns.f(this.f29679a).n(this, ns.f25610y3);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.f35936o1, getContext(), this.f29679a, 0, true, new bi.b(this, 21), this.J0);
        this.f8382a2 = p41Var;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        ah.a aVar = this.U1;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == ns.f25589v3 || i7 == ns.f25610y3) {
            p41 p41Var = this.f8382a2;
            if (p41Var != null) {
                p41Var.O(true);
            }
            long j3 = v8.y(this.f29679a, false).p().amount;
            long j10 = this.T1;
            ((TextView) this.U1.d).setText(hd.H(',', "StarsNeededTitle", (int) (j10 - j3)));
            org.telegram.ui.Components.fa faVar = this.f35937p1;
            if (faVar != null) {
                faVar.setTitle(O0());
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
            ((vg.m) aVar.f1055b).setPaused(true);
        }
    }

    @Override
    public final void show() {
        qj qjVar;
        if (!this.Z1) {
            org.telegram.messenger.k5.n(null, 2131747397, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(getContext()), this.J0), 2131624227, 36);
        } else if (v8.y(this.f29679a, false).p().amount >= this.T1) {
            Runnable runnable = this.X1;
            if (runnable != null) {
                runnable.run();
                this.X1 = null;
            }
        } else {
            org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
            if (Q instanceof an) {
                an anVar = (an) Q;
                if (anVar.V9() && (qjVar = anVar.f45118a0) != null) {
                    qjVar.S();
                }
            }
            super.show();
            ns.f(this.f29679a).c(this, ns.f25589v3);
            ns.f(this.f29679a).c(this, ns.f25610y3);
        }
    }
}
