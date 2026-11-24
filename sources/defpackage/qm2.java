package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class qm2 extends fy0 {
    public l5c S1;
    public boolean T1;
    public final FrameLayout U1;
    public final boolean V1;
    public final boolean W1;
    public int X1;

    public qm2(android.content.Context r17, org.telegram.tgnet.TLRPC.Chat r18, long r19, defpackage.p8c r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm2.<init>(android.content.Context, org.telegram.tgnet.TLRPC$Chat, long, p8c):void");
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.a, 0, false, new w72(this, (byte) 7), this.J0);
        this.S1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        int i;
        if (this.W1) {
            i = 2131751970;
        } else {
            i = 2131751965;
        }
        return k96.M0(i, null);
    }

    public final void Y0(p8c p8cVar, boolean z, boolean z2) {
        int i;
        if (z2 && !z && !this.W1) {
            Context context = getContext();
            wjb wjbVar = this.J0;
            String M0 = k96.M0(2131751958, null);
            if (this.V1) {
                i = 2131751961;
            } else {
                i = 2131751960;
            }
            ij.M(context, wjbVar, M0, k96.M0(i, null), k96.M0(2131754483, null), new mn6(this, p8cVar, z, (byte) 16)).show();
            return;
        }
        p8cVar.a(Boolean.valueOf(z));
        dismiss();
    }

    public final void Z0(boolean z) {
        boolean z2;
        if (this.T1 != z) {
            this.T1 = z;
            o39 o39Var = this.n1;
            View U0 = o39Var.U0(this.X1 + 1);
            if (U0 instanceof uy8) {
                ((uy8) U0).a(!z);
                z2 = false;
            } else {
                z2 = true;
            }
            View U02 = o39Var.U0(this.X1 + 2);
            if (U02 instanceof uy8) {
                ((uy8) U02).a(z);
            } else {
                z2 = true;
            }
            if (z2) {
                this.S1.O(true);
            }
        }
    }
}
