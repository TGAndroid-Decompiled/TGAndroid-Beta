package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jw2 implements View.OnClickListener {
    public final ArrayList a;
    public final boolean b;
    public final nw2 c;

    public jw2(nw2 nw2Var, ArrayList arrayList, boolean z) {
        this.c = nw2Var;
        this.a = arrayList;
        this.b = z;
    }

    @Override
    public final void onClick(View view) {
        rw2 rw2Var = this.c.a;
        if (rw2Var.w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    pw2 pw2Var = rw2Var.l;
                    if (pw2Var != null) {
                        pw2Var.P(rw2Var.a0, rw2Var.i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    ls6.d0(rw2Var.r).d(2, rw2Var.b0, rw2Var.W, (int) (System.currentTimeMillis() / 1000), this.b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = rw2Var.W;
                    Object obj = rw2Var.b0;
                    String str = rw2Var.Y;
                    pw2 pw2Var2 = rw2Var.l;
                    if (pw2Var2 == null) {
                        return;
                    }
                    jj.I(rw2Var.w, pw2Var2.a(), new pt((Object) pw2Var2, (Object) document, obj, str, (byte) 8));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    ls6.d0(rw2Var.r).d(0, rw2Var.b0, rw2Var.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    rw2Var.l.K(rw2Var.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    rw2Var.l.m(rw2Var.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    rw2Var.l.D(rw2Var.W);
                }
            } else {
                pw2 pw2Var3 = rw2Var.l;
                if (pw2Var3 != null) {
                    TLRPC.Document document2 = rw2Var.W;
                    String str2 = rw2Var.Y;
                    boolean z = true;
                    Object obj2 = rw2Var.b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z = false;
                    }
                    pw2Var3.k(document2, str2, obj2, z, 0, 0);
                }
            }
            rw2Var.d();
        }
    }
}
