package defpackage;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
public final class mo1 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final gk7 e;

    public mo1(mu1 mu1Var, long j, boolean z, boolean z2) {
        this.a = (byte) 0;
        this.e = mu1Var;
        this.d = j;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        byte b = this.a;
        int i = 2131751902;
        long j = this.d;
        boolean z = this.c;
        boolean z2 = this.b;
        gk7 gk7Var = this.e;
        switch (b) {
            case 0:
                ((mu1) gk7Var).Q8(j, z2, z);
                return;
            case 1:
                en2 en2Var = (en2) gk7Var;
                String M0 = k96.M0(2131751903, null);
                if (z2) {
                    i = 2131751905;
                } else if (z) {
                    i = 2131751904;
                }
                ij.s0(en2Var, M0, k96.M0(i, null), k96.M0(2131746128, null), true, new ym2(en2Var, j, (byte) 0));
                return;
            case 2:
                eo2 eo2Var = (eo2) gk7Var;
                Context context = eo2Var.getContext();
                wjb wjbVar = eo2Var.J0;
                String M02 = k96.M0(2131751903, null);
                if (z2) {
                    i = 2131751905;
                } else if (z) {
                    i = 2131751904;
                }
                hd M = ij.M(context, wjbVar, M02, k96.M0(i, null), k96.M0(2131746128, null), new et(eo2Var, j, (byte) 10));
                M.show();
                TextView textView = (TextView) M.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, null);
                    return;
                }
                return;
            default:
                na7 na7Var = (na7) gk7Var;
                if (z2) {
                    arrayList = na7Var.m0;
                } else {
                    arrayList = na7Var.l0;
                }
                if (z) {
                    if (!arrayList.contains(Long.valueOf(j))) {
                        arrayList.add(Long.valueOf(j));
                        return;
                    }
                    return;
                }
                arrayList.remove(Long.valueOf(j));
                return;
        }
    }

    public mo1(gk7 gk7Var, boolean z, boolean z2, long j, byte b) {
        this.a = b;
        this.e = gk7Var;
        this.b = z;
        this.c = z2;
        this.d = j;
    }
}
