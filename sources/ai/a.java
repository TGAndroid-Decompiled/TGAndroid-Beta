package ai;

import ag.j0;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.dd;
import org.telegram.messenger.r20;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.l6;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
public final class a extends ha {
    public q51 P1;
    public boolean Q1;
    public final FrameLayout R1;
    public final boolean S1;
    public final boolean T1;
    public int U1;

    public a(android.content.Context r17, org.telegram.tgnet.TLRPC.Chat r18, long r19, org.telegram.messenger.r20 r21) {
        throw new UnsupportedOperationException("Method not decompiled: ai.a.<init>(android.content.Context, org.telegram.tgnet.TLRPC$Chat, long, org.telegram.messenger.r20):void");
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(this.f26724k1, getContext(), this.f21584a, 0, false, new ag.a(this, 9), this.I0);
        this.P1 = q51Var;
        q51Var.f29638r = false;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        int i10;
        if (this.T1) {
            i10 = 2131751982;
        } else {
            i10 = 2131751977;
        }
        return dd.L0(i10, null);
    }

    public final void d1(r20 r20Var, boolean z10, boolean z11) {
        int i10;
        if (z11 && !z10 && !this.T1) {
            Context context = getContext();
            p6 p6Var = this.I0;
            String L0 = dd.L0(2131751970, null);
            if (this.S1) {
                i10 = 2131751973;
            } else {
                i10 = 2131751972;
            }
            s4.O(context, p6Var, L0, dd.L0(i10, null), dd.L0(2131754486, null), new j0(this, r20Var, z10, 1)).show();
            return;
        }
        r20Var.a(Boolean.valueOf(z10));
        dismiss();
    }

    public final void e1(boolean z10) {
        boolean z11;
        if (this.Q1 != z10) {
            this.Q1 = z10;
            uk0 uk0Var = this.f26724k1;
            View T0 = uk0Var.T0(this.U1 + 1);
            if (T0 instanceof l6) {
                ((l6) T0).a(!z10);
                z11 = false;
            } else {
                z11 = true;
            }
            View T02 = uk0Var.T0(this.U1 + 2);
            if (T02 instanceof l6) {
                ((l6) T02).a(z10);
            } else {
                z11 = true;
            }
            if (z11) {
                this.P1.O(true);
            }
        }
    }
}
