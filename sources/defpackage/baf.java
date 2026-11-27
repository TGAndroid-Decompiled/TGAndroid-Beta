package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
public final class baf {
    public final byte a;
    public final bu6 b;

    public baf(bu6 bu6Var, byte b) {
        this.a = b;
        this.b = bu6Var;
    }

    public final void a(ie9 ie9Var) {
        byte b = this.a;
        bu6 bu6Var = this.b;
        ohd ohdVar = (ohd) ie9Var;
        switch (b) {
            case 0:
                Status a = ohdVar.a();
                int i = a.a;
                if (i != 0) {
                    he6 he6Var = bu6Var.a;
                    Log.w(he6Var.a, he6Var.d(dze.d("Error fetching queue item ids, statusCode=", i, ", statusMessage=", a.b), new Object[0]));
                }
                bu6Var.l = null;
                if (!bu6Var.h.isEmpty()) {
                    b99 b99Var = bu6Var.i;
                    vw3 vw3Var = bu6Var.j;
                    b99Var.removeCallbacks(vw3Var);
                    b99Var.postDelayed(vw3Var, 500L);
                    return;
                }
                return;
            default:
                Status a2 = ohdVar.a();
                int i2 = a2.a;
                if (i2 != 0) {
                    he6 he6Var2 = bu6Var.a;
                    Log.w(he6Var2.a, he6Var2.d(dze.d("Error fetching queue items, statusCode=", i2, ", statusMessage=", a2.b), new Object[0]));
                }
                bu6Var.k = null;
                if (!bu6Var.h.isEmpty()) {
                    b99 b99Var2 = bu6Var.i;
                    vw3 vw3Var2 = bu6Var.j;
                    b99Var2.removeCallbacks(vw3Var2);
                    b99Var2.postDelayed(vw3Var2, 500L);
                    return;
                }
                return;
        }
    }
}
