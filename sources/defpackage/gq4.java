package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
public final class gq4 implements eq4 {
    public final hq4 a;

    public gq4(hq4 hq4Var) {
        this.a = hq4Var;
    }

    @Override
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean U;
        hq4 hq4Var = this.a;
        ArrayList arrayList3 = hq4Var.n;
        if (hq4.K(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + hq4Var.a);
        }
        if (hq4Var.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            U = false;
        } else {
            ie0 ie0Var = (ie0) b10.f(1, hq4Var.d);
            hq4Var.h = ie0Var;
            ArrayList arrayList4 = ie0Var.a;
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                dp4 dp4Var = ((xq4) obj).b;
                if (dp4Var != null) {
                    dp4Var.y = true;
                }
            }
            U = hq4Var.U(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                linkedHashSet.addAll(hq4.F((ie0) obj2));
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                if (obj3 == null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        dp4 dp4Var2 = (dp4) it.next();
                        throw null;
                    }
                } else {
                    rjb.p();
                    return false;
                }
            }
        }
        return U;
    }
}
