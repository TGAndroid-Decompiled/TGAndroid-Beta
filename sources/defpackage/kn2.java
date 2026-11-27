package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class kn2 extends ny0 {
    public l9c S1;
    public boolean T1;
    public final FrameLayout U1;
    public final boolean V1;
    public final boolean W1;
    public int X1;

    public kn2(android.content.Context r17, org.telegram.tgnet.TLRPC.Chat r18, long r19, defpackage.pcc r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kn2.<init>(android.content.Context, org.telegram.tgnet.TLRPC$Chat, long, pcc):void");
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.a, 0, false, new n82(this, (byte) 7), this.J0);
        this.S1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        int i;
        if (this.W1) {
            i = 2131751947;
        } else {
            i = 2131751942;
        }
        return ob6.M0(i, null);
    }

    public final void Z0(pcc pccVar, boolean z, boolean z2) {
        int i;
        if (z2 && !z && !this.W1) {
            Context context = getContext();
            vnb vnbVar = this.J0;
            String M0 = ob6.M0(2131751935, null);
            if (this.V1) {
                i = 2131751938;
            } else {
                i = 2131751937;
            }
            jj.M(context, vnbVar, M0, ob6.M0(i, null), ob6.M0(2131754479, null), new ds6(this, pccVar, z, (byte) 16)).show();
            return;
        }
        pccVar.a(Boolean.valueOf(z));
        dismiss();
    }

    public final void a1(boolean z) {
        boolean z2;
        if (this.T1 != z) {
            this.T1 = z;
            d79 d79Var = this.n1;
            View V0 = d79Var.V0(this.X1 + 1);
            if (V0 instanceof h29) {
                ((h29) V0).a(!z);
                z2 = false;
            } else {
                z2 = true;
            }
            View V02 = d79Var.V0(this.X1 + 2);
            if (V02 instanceof h29) {
                ((h29) V02).a(z);
            } else {
                z2 = true;
            }
            if (z2) {
                this.S1.O(true);
            }
        }
    }
}
