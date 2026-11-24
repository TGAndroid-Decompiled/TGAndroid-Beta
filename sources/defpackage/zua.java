package defpackage;

import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class zua extends fy0 implements gk7 {
    public final long S1;
    public final dr0 T1;
    public final FrameLayout U1;
    public final qh4 V1;
    public Runnable W1;
    public final TLRPC.InputPeer X1;
    public final boolean Y1;
    public l5c Z1;
    public boolean a2;

    public zua(android.content.Context r17, defpackage.wjb r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zua.<init>(android.content.Context, wjb, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.a, 0, true, new tf8(this, (byte) 26), this.J0);
        this.Z1 = l5cVar;
        return l5cVar;
    }

    @Override
    public final void I() {
        super.I();
        kk7.f(this.a).n(this, kk7.w3);
        kk7.f(this.a).n(this, kk7.z3);
    }

    @Override
    public final CharSequence J0() {
        dr0 dr0Var = this.T1;
        if (dr0Var == null) {
            return null;
        }
        return ((TextView) dr0Var.b).getText();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Runnable runnable;
        if (i == kk7.w3 || i == kk7.z3) {
            l5c l5cVar = this.Z1;
            if (l5cVar != null) {
                l5cVar.O(true);
            }
            long j = gta.v(this.a, false).m().amount;
            long j2 = this.S1;
            ((TextView) this.T1.b).setText(k96.H(',', "StarsNeededTitle", (int) (j2 - j)));
            by0 by0Var = this.o1;
            if (by0Var != null) {
                by0Var.setTitle(J0());
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
            ((er4) dr0Var.c).setPaused(true);
        }
    }

    @Override
    public final void show() {
        ar1 ar1Var;
        if (!this.Y1) {
            ir2.v(null, 2131747204, new u21(f11.a(getContext()), this.J0), 2131624222, 36);
        } else if (gta.v(this.a, false).m().amount >= this.S1) {
            Runnable runnable = this.W1;
            if (runnable != null) {
                runnable.run();
                this.W1 = null;
            }
        } else {
            d Q = LaunchActivity.Q();
            if (Q instanceof mu1) {
                mu1 mu1Var = (mu1) Q;
                if (mu1Var.O7() && (ar1Var = mu1Var.a0) != null) {
                    ar1Var.S();
                }
            }
            super.show();
            kk7.f(this.a).b(this, kk7.w3);
            kk7.f(this.a).b(this, kk7.z3);
        }
    }
}
