package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class co2 extends mz0 {
    public l7c S1;
    public boolean T1;
    public final FrameLayout U1;
    public final boolean V1;
    public final boolean W1;
    public int X1;

    public co2(android.content.Context r17, org.telegram.tgnet.TLRPC.Chat r18, long r19, defpackage.qac r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co2.<init>(android.content.Context, org.telegram.tgnet.TLRPC$Chat, long, qac):void");
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.a, 0, false, new h92(this, (byte) 7), this.J0);
        this.S1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        int i;
        if (this.W1) {
            i = 2131751919;
        } else {
            i = 2131751914;
        }
        return jb6.M0(i, null);
    }

    public final void Y0(qac qacVar, boolean z, boolean z2) {
        int i;
        if (z2 && !z && !this.W1) {
            Context context = getContext();
            ylb ylbVar = this.J0;
            String M0 = jb6.M0(2131751907, null);
            if (this.V1) {
                i = 2131751910;
            } else {
                i = 2131751909;
            }
            ik.M(context, ylbVar, M0, jb6.M0(i, null), jb6.M0(2131754483, null), new np6(this, qacVar, z, (byte) 16)).show();
            return;
        }
        qacVar.a(Boolean.valueOf(z));
        dismiss();
    }

    public final void Z0(boolean z) {
        boolean z2;
        if (this.T1 != z) {
            this.T1 = z;
            r59 r59Var = this.n1;
            View U0 = r59Var.U0(this.X1 + 1);
            if (U0 instanceof v09) {
                ((v09) U0).a(!z);
                z2 = false;
            } else {
                z2 = true;
            }
            View U02 = r59Var.U0(this.X1 + 2);
            if (U02 instanceof v09) {
                ((v09) U02).a(z);
            } else {
                z2 = true;
            }
            if (z2) {
                this.S1.O(true);
            }
        }
    }
}
