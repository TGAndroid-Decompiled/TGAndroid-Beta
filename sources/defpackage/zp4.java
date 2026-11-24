package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
public final class zp4 {
    public boolean a = false;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public pr4 c;
    public final hq4 d;

    public zp4(hq4 hq4Var) {
        this.d = hq4Var;
    }

    public final void a() {
        boolean K = hq4.K(3);
        hq4 hq4Var = this.d;
        if (K) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + hq4Var);
        }
        if (hq4.K(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + hq4Var.h);
        }
        ie0 ie0Var = hq4Var.h;
        if (ie0Var != null) {
            ie0Var.r = false;
            ie0Var.d();
            ie0 ie0Var2 = hq4Var.h;
            qn4 qn4Var = new qn4(hq4Var, (byte) 1);
            ArrayList arrayList = ie0Var2.p;
            if (arrayList == null) {
                arrayList = new ArrayList();
                ie0Var2.p = arrayList;
            }
            arrayList.add(qn4Var);
            hq4Var.h.e(false, true);
            hq4Var.i = true;
            hq4Var.A(true);
            hq4Var.E();
            hq4Var.i = false;
            hq4Var.h = null;
        }
    }
}
