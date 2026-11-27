package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
public final class jq4 implements hq4 {
    public final kq4 a;

    public jq4(kq4 kq4Var) {
        this.a = kq4Var;
    }

    @Override
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean U;
        kq4 kq4Var = this.a;
        ArrayList arrayList3 = kq4Var.n;
        if (kq4.K(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + kq4Var.a);
        }
        if (kq4Var.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            U = false;
        } else {
            kd0 kd0Var = (kd0) c00.g(1, kq4Var.d);
            kq4Var.h = kd0Var;
            ArrayList arrayList4 = kd0Var.a;
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                gp4 gp4Var = ((ar4) obj).b;
                if (gp4Var != null) {
                    gp4Var.y = true;
                }
            }
            U = kq4Var.U(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                linkedHashSet.addAll(kq4.F((kd0) obj2));
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                if (obj3 == null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        gp4 gp4Var2 = (gp4) it.next();
                        throw null;
                    }
                } else {
                    grb.o();
                    return false;
                }
            }
        }
        return U;
    }
}
