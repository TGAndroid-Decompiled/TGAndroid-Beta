package ki;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.u7;
import hi.u1;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.v4;
public final class a extends na {
    public m41 P1;
    public boolean Q1;
    public final FrameLayout R1;
    public final boolean S1;
    public final boolean T1;
    public int U1;

    public a(android.content.Context r17, org.telegram.tgnet.TLRPC.Chat r18, long r19, org.telegram.messenger.c20 r21) {
        throw new UnsupportedOperationException("Method not decompiled: ki.a.<init>(android.content.Context, org.telegram.tgnet.TLRPC$Chat, long, org.telegram.messenger.c20):void");
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(this.f36303k1, getContext(), this.f28621a, 0, false, new u1(this, 14), this.I0);
        this.P1 = m41Var;
        m41Var.f35945r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        int i7;
        if (this.T1) {
            i7 = 2131751982;
        } else {
            i7 = 2131751977;
        }
        return id.M0(i7, null);
    }

    public final void d1(c20 c20Var, boolean z9, boolean z10) {
        int i7;
        if (z10 && !z9 && !this.T1) {
            Context context = getContext();
            g6 g6Var = this.I0;
            String M0 = id.M0(2131751970, null);
            if (this.S1) {
                i7 = 2131751973;
            } else {
                i7 = 2131751972;
            }
            v4.M(context, g6Var, M0, id.M0(i7, null), id.M0(2131754486, null), new u7(this, c20Var, z9, 6)).show();
            return;
        }
        c20Var.a(Boolean.valueOf(z9));
        dismiss();
    }

    public final void e1(boolean z9) {
        boolean z10;
        if (this.Q1 != z9) {
            this.Q1 = z9;
            qj0 qj0Var = this.f36303k1;
            View T0 = qj0Var.T0(this.U1 + 1);
            if (T0 instanceof h6) {
                ((h6) T0).a(!z9);
                z10 = false;
            } else {
                z10 = true;
            }
            View T02 = qj0Var.T0(this.U1 + 2);
            if (T02 instanceof h6) {
                ((h6) T02).a(z9);
            } else {
                z10 = true;
            }
            if (z10) {
                this.P1.O(true);
            }
        }
    }
}
