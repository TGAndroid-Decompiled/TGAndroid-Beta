package e6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.a0;
import di.n2;
public final class q {
    public final int f8510a;
    public final c f8511b;

    public q(c cVar, int i10) {
        this.f8510a = i10;
        this.f8511b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        n nVar = (n) qVar;
        switch (this.f8510a) {
            case 0:
                Status h = nVar.h();
                int i10 = h.f4885a;
                c cVar = this.f8511b;
                if (i10 != 0) {
                    g6.b bVar = cVar.f8465a;
                    String str = h.f4886b;
                    Log.w(bVar.f9934a, bVar.d("Error fetching queue item ids, statusCode=" + i10 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f8473l = null;
                if (!cVar.h.isEmpty()) {
                    a0 a0Var = cVar.f8470i;
                    n2 n2Var = cVar.f8471j;
                    a0Var.removeCallbacks(n2Var);
                    a0Var.postDelayed(n2Var, 500L);
                    return;
                }
                return;
            default:
                Status h10 = nVar.h();
                int i11 = h10.f4885a;
                c cVar2 = this.f8511b;
                if (i11 != 0) {
                    g6.b bVar2 = cVar2.f8465a;
                    String str2 = h10.f4886b;
                    Log.w(bVar2.f9934a, bVar2.d("Error fetching queue items, statusCode=" + i11 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f8472k = null;
                if (!cVar2.h.isEmpty()) {
                    a0 a0Var2 = cVar2.f8470i;
                    n2 n2Var2 = cVar2.f8471j;
                    a0Var2.removeCallbacks(n2Var2);
                    a0Var2.postDelayed(n2Var2, 500L);
                    return;
                }
                return;
        }
    }
}
