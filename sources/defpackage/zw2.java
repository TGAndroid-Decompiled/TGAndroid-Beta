package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zw2 implements View.OnClickListener {
    public final ArrayList a;
    public final boolean b;
    public final dx2 c;

    public zw2(dx2 dx2Var, ArrayList arrayList, boolean z) {
        this.c = dx2Var;
        this.a = arrayList;
        this.b = z;
    }

    @Override
    public final void onClick(View view) {
        hx2 hx2Var = this.c.a;
        if (hx2Var.w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    fx2 fx2Var = hx2Var.l;
                    if (fx2Var != null) {
                        fx2Var.P(hx2Var.a0, hx2Var.i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    hs6.d0(hx2Var.r).d(2, hx2Var.b0, hx2Var.W, (int) (System.currentTimeMillis() / 1000), this.b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = hx2Var.W;
                    Object obj = hx2Var.b0;
                    String str = hx2Var.Y;
                    fx2 fx2Var2 = hx2Var.l;
                    if (fx2Var2 == null) {
                        return;
                    }
                    ik.I(hx2Var.w, fx2Var2.a(), new lu((Object) fx2Var2, (Object) document, obj, str, (byte) 8));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    hs6.d0(hx2Var.r).d(0, hx2Var.b0, hx2Var.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    hx2Var.l.J(hx2Var.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    hx2Var.l.m(hx2Var.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    hx2Var.l.D(hx2Var.W);
                }
            } else {
                fx2 fx2Var3 = hx2Var.l;
                if (fx2Var3 != null) {
                    TLRPC.Document document2 = hx2Var.W;
                    String str2 = hx2Var.Y;
                    boolean z = true;
                    Object obj2 = hx2Var.b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z = false;
                    }
                    fx2Var3.k(document2, str2, obj2, z, 0, 0);
                }
            }
            hx2Var.d();
        }
    }
}
