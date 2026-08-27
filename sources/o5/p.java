package o5;

import android.util.Log;
import c2.t0;
import com.google.android.gms.common.api.Status;
import lh.h2;

public final class p {

    public final int f19352a;

    public final c f19353b;

    public p(c cVar, int i10) {
        this.f19352a = i10;
        this.f19353b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        m mVar = (m) qVar;
        switch (this.f19352a) {
            case 0:
                Status statusI = mVar.i();
                int i10 = statusI.f3186a;
                c cVar = this.f19353b;
                if (i10 != 0) {
                    r5.b bVar = cVar.f19305a;
                    Log.w(bVar.f46768a, bVar.d("Error fetching queue item ids, statusCode=" + i10 + ", statusMessage=" + statusI.f3187b, new Object[0]));
                }
                cVar.f19314l = null;
                if (!cVar.h.isEmpty()) {
                    t0 t0Var = cVar.f19311i;
                    h2 h2Var = cVar.f19312j;
                    t0Var.removeCallbacks(h2Var);
                    t0Var.postDelayed(h2Var, 500L);
                }
                break;
            default:
                Status statusI2 = mVar.i();
                int i11 = statusI2.f3186a;
                c cVar2 = this.f19353b;
                if (i11 != 0) {
                    r5.b bVar2 = cVar2.f19305a;
                    Log.w(bVar2.f46768a, bVar2.d("Error fetching queue items, statusCode=" + i11 + ", statusMessage=" + statusI2.f3187b, new Object[0]));
                }
                cVar2.f19313k = null;
                if (!cVar2.h.isEmpty()) {
                    t0 t0Var2 = cVar2.f19311i;
                    h2 h2Var2 = cVar2.f19312j;
                    t0Var2.removeCallbacks(h2Var2);
                    t0Var2.postDelayed(h2Var2, 500L);
                }
                break;
        }
    }
}
