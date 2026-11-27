package defpackage;

import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class dza extends ny0 implements fn7 {
    public final long S1;
    public final dr0 T1;
    public final FrameLayout U1;
    public final tj4 V1;
    public Runnable W1;
    public final TLRPC.InputPeer X1;
    public final boolean Y1;
    public l9c Z1;
    public boolean a2;

    public dza(android.content.Context r17, defpackage.vnb r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dza.<init>(android.content.Context, vnb, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    @Override
    public final void H() {
        super.H();
        jn7.f(this.a).n(this, jn7.x3);
        jn7.f(this.a).n(this, jn7.A3);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.a, 0, true, new hj8(this, (byte) 26), this.J0);
        this.Z1 = l9cVar;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        dr0 dr0Var = this.T1;
        if (dr0Var == null) {
            return null;
        }
        return ((TextView) dr0Var.b).getText();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Runnable runnable;
        if (i == jn7.x3 || i == jn7.A3) {
            l9c l9cVar = this.Z1;
            if (l9cVar != null) {
                l9cVar.O(true);
            }
            long j = jxa.v(this.a, false).m().amount;
            long j2 = this.S1;
            ((TextView) this.T1.b).setText(ob6.H(',', "StarsNeededTitle", (int) (j2 - j)));
            jy0 jy0Var = this.o1;
            if (jy0Var != null) {
                jy0Var.setTitle(K0());
            }
            if (j >= j2 && (runnable = this.W1) != null) {
                runnable.run();
                this.W1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        dr0 dr0Var = this.T1;
        if (dr0Var != null) {
            ((it4) dr0Var.c).setPaused(true);
        }
    }

    @Override
    public final void show() {
        nr1 nr1Var;
        if (!this.Y1) {
            bs2.v(null, 2131747124, new d31(o11.a(getContext()), this.J0), 2131624221, 36);
        } else if (jxa.v(this.a, false).m().amount >= this.S1) {
            Runnable runnable = this.W1;
            if (runnable != null) {
                runnable.run();
                this.W1 = null;
            }
        } else {
            e Q = LaunchActivity.Q();
            if (Q instanceof zu1) {
                zu1 zu1Var = (zu1) Q;
                if (zu1Var.Y7() && (nr1Var = zu1Var.a0) != null) {
                    nr1Var.U();
                }
            }
            super.show();
            jn7.f(this.a).b(this, jn7.x3);
            jn7.f(this.a).b(this, jn7.A3);
        }
    }
}
