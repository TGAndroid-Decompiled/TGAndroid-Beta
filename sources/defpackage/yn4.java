package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
public final class yn4 {
    public boolean a = false;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public op4 c;
    public final go4 d;

    public yn4(go4 go4Var) {
        this.d = go4Var;
    }

    public final void a() {
        boolean K = go4.K(3);
        go4 go4Var = this.d;
        if (K) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + go4Var);
        }
        if (go4.K(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + go4Var.h);
        }
        id0 id0Var = go4Var.h;
        if (id0Var != null) {
            id0Var.r = false;
            id0Var.d();
            id0 id0Var2 = go4Var.h;
            s54 s54Var = new s54(go4Var, (byte) 24);
            ArrayList arrayList = id0Var2.p;
            if (arrayList == null) {
                arrayList = new ArrayList();
                id0Var2.p = arrayList;
            }
            arrayList.add(s54Var);
            go4Var.h.e(false, true);
            go4Var.i = true;
            go4Var.A(true);
            go4Var.E();
            go4Var.i = false;
            go4Var.h = null;
        }
    }
}
