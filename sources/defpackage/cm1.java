package defpackage;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
public final class cm1 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final fn7 e;

    public cm1(zu1 zu1Var, long j, boolean z, boolean z2) {
        this.a = (byte) 0;
        this.e = zu1Var;
        this.d = j;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        byte b = this.a;
        int i = 2131751879;
        long j = this.d;
        boolean z = this.c;
        boolean z2 = this.b;
        fn7 fn7Var = this.e;
        switch (b) {
            case 0:
                ((zu1) fn7Var).d9(j, z2, z);
                return;
            case 1:
                xn2 xn2Var = (xn2) fn7Var;
                String M0 = ob6.M0(2131751880, null);
                if (z2) {
                    i = 2131751882;
                } else if (z) {
                    i = 2131751881;
                }
                jj.s0(xn2Var, M0, ob6.M0(i, null), ob6.M0(2131746048, null), true, new rn2(xn2Var, j, (byte) 0));
                return;
            case 2:
                xo2 xo2Var = (xo2) fn7Var;
                Context context = xo2Var.getContext();
                vnb vnbVar = xo2Var.J0;
                String M02 = ob6.M0(2131751880, null);
                if (z2) {
                    i = 2131751882;
                } else if (z) {
                    i = 2131751881;
                }
                id M = jj.M(context, vnbVar, M02, ob6.M0(i, null), ob6.M0(2131746048, null), new kt(xo2Var, j, (byte) 10));
                M.show();
                TextView textView = (TextView) M.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, null);
                    return;
                }
                return;
            default:
                uc7 uc7Var = (uc7) fn7Var;
                if (z2) {
                    arrayList = uc7Var.m0;
                } else {
                    arrayList = uc7Var.l0;
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

    public cm1(fn7 fn7Var, boolean z, boolean z2, long j, byte b) {
        this.a = b;
        this.e = fn7Var;
        this.b = z;
        this.c = z2;
        this.d = j;
    }
}
