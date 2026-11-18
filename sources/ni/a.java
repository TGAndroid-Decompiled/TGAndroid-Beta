package ni;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import di.p6;
import hi.e7;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
public final class a extends sa {
    public z41 T1;
    public boolean U1;
    public final FrameLayout V1;
    public final boolean W1;
    public final boolean X1;
    public int Y1;

    public a(android.content.Context r17, org.telegram.tgnet.TLRPC.Chat r18, long r19, org.telegram.messenger.x10 r21) {
        throw new UnsupportedOperationException("Method not decompiled: ni.a.<init>(android.content.Context, org.telegram.tgnet.TLRPC$Chat, long, org.telegram.messenger.x10):void");
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.f39534o1, getContext(), this.f30187a, 0, false, new e7(this, 24), this.J0);
        this.T1 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        int i7;
        if (this.X1) {
            i7 = 2131751971;
        } else {
            i7 = 2131751966;
        }
        return gd.M0(i7, null);
    }

    public final void e1(x10 x10Var, boolean z10, boolean z11) {
        int i7;
        if (z11 && !z10 && !this.X1) {
            Context context = getContext();
            i6 i6Var = this.J0;
            String M0 = gd.M0(2131751959, null);
            if (this.W1) {
                i7 = 2131751962;
            } else {
                i7 = 2131751961;
            }
            b5.M(context, i6Var, M0, gd.M0(i7, null), gd.M0(2131754484, null), new p6(this, x10Var, z10, 6)).show();
            return;
        }
        x10Var.a(Boolean.valueOf(z10));
        dismiss();
    }

    public final void f1(boolean z10) {
        boolean z11;
        if (this.U1 != z10) {
            this.U1 = z10;
            ck0 ck0Var = this.f39534o1;
            View T0 = ck0Var.T0(this.Y1 + 1);
            if (T0 instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) T0).a(!z10);
                z11 = false;
            } else {
                z11 = true;
            }
            View T02 = ck0Var.T0(this.Y1 + 2);
            if (T02 instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) T02).a(z10);
            } else {
                z11 = true;
            }
            if (z11) {
                this.T1.O(true);
            }
        }
    }
}
