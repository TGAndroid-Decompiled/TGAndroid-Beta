package defpackage;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
public final class yp1 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final jm7 e;

    public yp1(yv1 yv1Var, long j, boolean z, boolean z2) {
        this.a = (byte) 0;
        this.e = yv1Var;
        this.d = j;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        byte b = this.a;
        int i = 2131751851;
        long j = this.d;
        boolean z = this.c;
        boolean z2 = this.b;
        jm7 jm7Var = this.e;
        switch (b) {
            case 0:
                ((yv1) jm7Var).c9(j, z2, z);
                return;
            case 1:
                po2 po2Var = (po2) jm7Var;
                String M0 = jb6.M0(2131751852, null);
                if (z2) {
                    i = 2131751854;
                } else if (z) {
                    i = 2131751853;
                }
                ik.s0(po2Var, M0, jb6.M0(i, null), jb6.M0(2131746054, null), true, new jo2(po2Var, j, (byte) 0));
                return;
            case 2:
                pp2 pp2Var = (pp2) jm7Var;
                Context context = pp2Var.getContext();
                ylb ylbVar = pp2Var.J0;
                String M02 = jb6.M0(2131751852, null);
                if (z2) {
                    i = 2131751854;
                } else if (z) {
                    i = 2131751853;
                }
                he M = ik.M(context, ylbVar, M02, jb6.M0(i, null), jb6.M0(2131746054, null), new fu(pp2Var, j, (byte) 10));
                M.show();
                TextView textView = (TextView) M.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
                    return;
                }
                return;
            default:
                oc7 oc7Var = (oc7) jm7Var;
                if (z2) {
                    arrayList = oc7Var.m0;
                } else {
                    arrayList = oc7Var.l0;
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

    public yp1(jm7 jm7Var, boolean z, boolean z2, long j, byte b) {
        this.a = b;
        this.e = jm7Var;
        this.b = z;
        this.c = z2;
        this.d = j;
    }
}
