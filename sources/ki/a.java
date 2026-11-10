package ki;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.u7;
import hi.u1;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.u4;
public final class a extends ma {
    public m41 S1;
    public boolean T1;
    public final FrameLayout U1;
    public final boolean V1;
    public final boolean W1;
    public int X1;

    public a(android.content.Context r17, org.telegram.tgnet.TLRPC.Chat r18, long r19, org.telegram.messenger.c20 r21) {
        throw new UnsupportedOperationException("Method not decompiled: ki.a.<init>(android.content.Context, org.telegram.tgnet.TLRPC$Chat, long, org.telegram.messenger.c20):void");
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.f28669a, 0, false, new u1(this, 14), this.I0);
        this.S1 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        int i7;
        if (this.W1) {
            i7 = 2131751982;
        } else {
            i7 = 2131751977;
        }
        return id.M0(i7, null);
    }

    public final void d1(c20 c20Var, boolean z9, boolean z10) {
        int i7;
        if (z10 && !z9 && !this.W1) {
            Context context = getContext();
            h6 h6Var = this.I0;
            String M0 = id.M0(2131751970, null);
            if (this.V1) {
                i7 = 2131751973;
            } else {
                i7 = 2131751972;
            }
            u4.M(context, h6Var, M0, id.M0(i7, null), id.M0(2131754486, null), new u7(this, c20Var, z9, 6)).show();
            return;
        }
        c20Var.a(Boolean.valueOf(z9));
        dismiss();
    }

    public final void e1(boolean z9) {
        boolean z10;
        if (this.T1 != z9) {
            this.T1 = z9;
            pj0 pj0Var = this.n1;
            View T0 = pj0Var.T0(this.X1 + 1);
            if (T0 instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) T0).a(!z9);
                z10 = false;
            } else {
                z10 = true;
            }
            View T02 = pj0Var.T0(this.X1 + 2);
            if (T02 instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) T02).a(z9);
            } else {
                z10 = true;
            }
            if (z10) {
                this.S1.O(true);
            }
        }
    }
}
