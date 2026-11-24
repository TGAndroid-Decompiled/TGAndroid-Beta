package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
public final class fo4 implements do4 {
    public final go4 a;

    public fo4(go4 go4Var) {
        this.a = go4Var;
    }

    @Override
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean U;
        go4 go4Var = this.a;
        ArrayList arrayList3 = go4Var.n;
        if (go4.K(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + go4Var.a);
        }
        if (go4Var.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            U = false;
        } else {
            id0 id0Var = (id0) b00.f(1, go4Var.d);
            go4Var.h = id0Var;
            ArrayList arrayList4 = id0Var.a;
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                bn4 bn4Var = ((wo4) obj).b;
                if (bn4Var != null) {
                    bn4Var.y = true;
                }
            }
            U = go4Var.U(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                linkedHashSet.addAll(go4.F((id0) obj2));
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                if (obj3 == null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        bn4 bn4Var2 = (bn4) it.next();
                        throw null;
                    }
                } else {
                    fyb.g();
                    return false;
                }
            }
        }
        return U;
    }
}
