package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public final class rx2 implements View.OnClickListener {
    public final byte a;
    public final xx2 b;

    public rx2(xx2 xx2Var, byte b) {
        this.a = b;
        this.b = xx2Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        xx2 xx2Var = this.b;
        switch (b) {
            case 0:
                lj9 lj9Var = xx2Var.f2;
                if (lj9Var != null) {
                    ArrayList arrayList = new ArrayList(xx2Var.e2.keySet());
                    k62 k62Var = (k62) lj9Var.b;
                    ArrayList arrayList2 = k62Var.Q0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i = k62Var.M0;
                    if (i >= 0) {
                        k62Var.r.g(i);
                    }
                }
                xx2Var.dismiss();
                return;
            case 1:
                lj9 lj9Var2 = xx2Var.f2;
                if (lj9Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(xx2Var.e2.keySet());
                    k62 k62Var2 = (k62) lj9Var2.b;
                    ArrayList arrayList4 = k62Var2.Q0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i2 = k62Var2.M0;
                    if (i2 >= 0) {
                        k62Var2.r.g(i2);
                    }
                }
                xx2Var.dismiss();
                return;
            case 2:
                HashMap hashMap = xx2Var.e2;
                hashMap.clear();
                xx2Var.c2.b();
                xx2Var.Y1.O(true);
                xx2Var.Z1.c(hashMap.size(), true);
                return;
            case 3:
                xx2Var.b1(view);
                return;
            default:
                int i3 = xx2.m2;
                xx2Var.b1(view);
                return;
        }
    }
}
