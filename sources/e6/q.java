package e6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.a0;
import di.n2;
public final class q {
    public final int f8513a;
    public final c f8514b;

    public q(c cVar, int i10) {
        this.f8513a = i10;
        this.f8514b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        n nVar = (n) qVar;
        switch (this.f8513a) {
            case 0:
                Status h = nVar.h();
                int i10 = h.f4888a;
                c cVar = this.f8514b;
                if (i10 != 0) {
                    g6.b bVar = cVar.f8468a;
                    String str = h.f4889b;
                    Log.w(bVar.f9937a, bVar.d("Error fetching queue item ids, statusCode=" + i10 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f8476l = null;
                if (!cVar.h.isEmpty()) {
                    a0 a0Var = cVar.f8473i;
                    n2 n2Var = cVar.f8474j;
                    a0Var.removeCallbacks(n2Var);
                    a0Var.postDelayed(n2Var, 500L);
                    return;
                }
                return;
            default:
                Status h10 = nVar.h();
                int i11 = h10.f4888a;
                c cVar2 = this.f8514b;
                if (i11 != 0) {
                    g6.b bVar2 = cVar2.f8468a;
                    String str2 = h10.f4889b;
                    Log.w(bVar2.f9937a, bVar2.d("Error fetching queue items, statusCode=" + i11 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f8475k = null;
                if (!cVar2.h.isEmpty()) {
                    a0 a0Var2 = cVar2.f8473i;
                    n2 n2Var2 = cVar2.f8474j;
                    a0Var2.removeCallbacks(n2Var2);
                    a0Var2.postDelayed(n2Var2, 500L);
                    return;
                }
                return;
        }
    }
}
