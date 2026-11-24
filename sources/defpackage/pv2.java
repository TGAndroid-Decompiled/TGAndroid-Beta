package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pv2 implements View.OnClickListener {
    public final ArrayList a;
    public final boolean b;
    public final tv2 c;

    public pv2(tv2 tv2Var, ArrayList arrayList, boolean z) {
        this.c = tv2Var;
        this.a = arrayList;
        this.b = z;
    }

    @Override
    public final void onClick(View view) {
        xv2 xv2Var = this.c.a;
        if (xv2Var.w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    vv2 vv2Var = xv2Var.l;
                    if (vv2Var != null) {
                        vv2Var.N(xv2Var.a0, xv2Var.i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    hq6.d0(xv2Var.r).d(2, xv2Var.b0, xv2Var.W, (int) (System.currentTimeMillis() / 1000), this.b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = xv2Var.W;
                    Object obj = xv2Var.b0;
                    String str = xv2Var.Y;
                    vv2 vv2Var2 = xv2Var.l;
                    if (vv2Var2 == null) {
                        return;
                    }
                    ij.I(xv2Var.w, vv2Var2.a(), new lt((Object) vv2Var2, (Object) document, obj, str, (byte) 8));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    hq6.d0(xv2Var.r).d(0, xv2Var.b0, xv2Var.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    xv2Var.l.H(xv2Var.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    xv2Var.l.m(xv2Var.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    xv2Var.l.B(xv2Var.W);
                }
            } else {
                vv2 vv2Var3 = xv2Var.l;
                if (vv2Var3 != null) {
                    TLRPC.Document document2 = xv2Var.W;
                    String str2 = xv2Var.Y;
                    boolean z = true;
                    Object obj2 = xv2Var.b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z = false;
                    }
                    vv2Var3.k(document2, str2, obj2, z, 0, 0);
                }
            }
            xv2Var.d();
        }
    }
}
