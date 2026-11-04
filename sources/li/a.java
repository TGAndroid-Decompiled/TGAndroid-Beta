package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.v6;
import gi.q4;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tj0;
public final class a extends ma {
    public f41 Q1;
    public boolean R1;
    public final FrameLayout S1;
    public final boolean T1;
    public final boolean U1;
    public int V1;

    public a(android.content.Context r17, org.telegram.tgnet.TLRPC.Chat r18, long r19, org.telegram.messenger.u10 r21) {
        throw new UnsupportedOperationException("Method not decompiled: li.a.<init>(android.content.Context, org.telegram.tgnet.TLRPC$Chat, long, org.telegram.messenger.u10):void");
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.f36102l1, getContext(), this.f28583a, 0, false, new q4(this, 24), this.J0);
        this.Q1 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        int i3;
        if (this.U1) {
            i3 = 2131751982;
        } else {
            i3 = 2131751977;
        }
        return bd.M0(i3, null);
    }

    public final void d1(u10 u10Var, boolean z10, boolean z11) {
        int i3;
        if (z11 && !z10 && !this.U1) {
            Context context = getContext();
            e6 e6Var = this.J0;
            String M0 = bd.M0(2131751970, null);
            if (this.T1) {
                i3 = 2131751973;
            } else {
                i3 = 2131751972;
            }
            t4.O(context, e6Var, M0, bd.M0(i3, null), bd.M0(2131754486, null), new v6(this, u10Var, z10, 6)).show();
            return;
        }
        u10Var.a(Boolean.valueOf(z10));
        dismiss();
    }

    public final void e1(boolean z10) {
        boolean z11;
        if (this.R1 != z10) {
            this.R1 = z10;
            tj0 tj0Var = this.f36102l1;
            View T0 = tj0Var.T0(this.V1 + 1);
            if (T0 instanceof g6) {
                ((g6) T0).a(!z10);
                z11 = false;
            } else {
                z11 = true;
            }
            View T02 = tj0Var.T0(this.V1 + 2);
            if (T02 instanceof g6) {
                ((g6) T02).a(z10);
            } else {
                z11 = true;
            }
            if (z11) {
                this.Q1.O(true);
            }
        }
    }
}
