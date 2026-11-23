package ni;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import di.p6;
import hi.y7;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ra;
public final class a extends ra {
    public b51 T1;
    public boolean U1;
    public final FrameLayout V1;
    public final boolean W1;
    public final boolean X1;
    public int Y1;

    public a(android.content.Context r17, org.telegram.tgnet.TLRPC.Chat r18, long r19, org.telegram.messenger.w10 r21) {
        throw new UnsupportedOperationException("Method not decompiled: ni.a.<init>(android.content.Context, org.telegram.tgnet.TLRPC$Chat, long, org.telegram.messenger.w10):void");
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(this.f39246o1, getContext(), this.f30223a, 0, false, new y7(this, 24), this.J0);
        this.T1 = b51Var;
        b51Var.f33631r = false;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        int i7;
        if (this.X1) {
            i7 = 2131751970;
        } else {
            i7 = 2131751965;
        }
        return gd.N0(i7, null);
    }

    public final void e1(w10 w10Var, boolean z10, boolean z11) {
        int i7;
        if (z11 && !z10 && !this.X1) {
            Context context = getContext();
            i6 i6Var = this.J0;
            String N0 = gd.N0(2131751958, null);
            if (this.W1) {
                i7 = 2131751961;
            } else {
                i7 = 2131751960;
            }
            b5.M(context, i6Var, N0, gd.N0(i7, null), gd.N0(2131754483, null), new p6(this, w10Var, z10, 6)).show();
            return;
        }
        w10Var.a(Boolean.valueOf(z10));
        dismiss();
    }

    public final void f1(boolean z10) {
        boolean z11;
        if (this.U1 != z10) {
            this.U1 = z10;
            ek0 ek0Var = this.f39246o1;
            View T0 = ek0Var.T0(this.Y1 + 1);
            if (T0 instanceof h6) {
                ((h6) T0).a(!z10);
                z11 = false;
            } else {
                z11 = true;
            }
            View T02 = ek0Var.T0(this.Y1 + 2);
            if (T02 instanceof h6) {
                ((h6) T02).a(z10);
            } else {
                z11 = true;
            }
            if (z11) {
                this.T1.O(true);
            }
        }
    }
}
