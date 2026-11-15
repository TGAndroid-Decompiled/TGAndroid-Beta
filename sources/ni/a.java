package ni;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import di.m6;
import hi.q4;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
public final class a extends ja {
    public p41 T1;
    public boolean U1;
    public final FrameLayout V1;
    public final boolean W1;
    public final boolean X1;
    public int Y1;

    public a(android.content.Context r17, org.telegram.tgnet.TLRPC.Chat r18, long r19, org.telegram.messenger.z10 r21) {
        throw new UnsupportedOperationException("Method not decompiled: ni.a.<init>(android.content.Context, org.telegram.tgnet.TLRPC$Chat, long, org.telegram.messenger.z10):void");
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.f35931o1, getContext(), this.f29679a, 0, false, new q4(this, 24), this.J0);
        this.T1 = p41Var;
        p41Var.f38199r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        int i7;
        if (this.X1) {
            i7 = 2131751982;
        } else {
            i7 = 2131751977;
        }
        return hd.M0(i7, null);
    }

    public final void d1(z10 z10Var, boolean z10, boolean z11) {
        int i7;
        if (z11 && !z10 && !this.X1) {
            Context context = getContext();
            e6 e6Var = this.J0;
            String M0 = hd.M0(2131751970, null);
            if (this.W1) {
                i7 = 2131751973;
            } else {
                i7 = 2131751972;
            }
            t4.M(context, e6Var, M0, hd.M0(i7, null), hd.M0(2131754486, null), new m6(this, z10Var, z10, 6)).show();
            return;
        }
        z10Var.a(Boolean.valueOf(z10));
        dismiss();
    }

    public final void e1(boolean z10) {
        boolean z11;
        if (this.U1 != z10) {
            this.U1 = z10;
            uj0 uj0Var = this.f35931o1;
            View T0 = uj0Var.T0(this.Y1 + 1);
            if (T0 instanceof g6) {
                ((g6) T0).a(!z10);
                z11 = false;
            } else {
                z11 = true;
            }
            View T02 = uj0Var.T0(this.Y1 + 2);
            if (T02 instanceof g6) {
                ((g6) T02).a(z10);
            } else {
                z11 = true;
            }
            if (z11) {
                this.T1.O(true);
            }
        }
    }
}
