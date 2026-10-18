package e6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.a0;
public final class q {
    public final int f8391a;
    public final c f8392b;

    public q(c cVar, int i10) {
        this.f8391a = i10;
        this.f8392b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        n nVar = (n) qVar;
        switch (this.f8391a) {
            case 0:
                Status h = nVar.h();
                int i10 = h.f6345a;
                c cVar = this.f8392b;
                if (i10 != 0) {
                    g6.b bVar = cVar.f8346a;
                    String str = h.f6346b;
                    Log.w(bVar.f10843a, bVar.d("Error fetching queue item ids, statusCode=" + i10 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f8354l = null;
                if (!cVar.h.isEmpty()) {
                    a0 a0Var = cVar.f8351i;
                    r rVar = cVar.f8352j;
                    a0Var.removeCallbacks(rVar);
                    a0Var.postDelayed(rVar, 500L);
                    return;
                }
                return;
            default:
                Status h10 = nVar.h();
                int i11 = h10.f6345a;
                c cVar2 = this.f8392b;
                if (i11 != 0) {
                    g6.b bVar2 = cVar2.f8346a;
                    String str2 = h10.f6346b;
                    Log.w(bVar2.f10843a, bVar2.d("Error fetching queue items, statusCode=" + i11 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f8353k = null;
                if (!cVar2.h.isEmpty()) {
                    a0 a0Var2 = cVar2.f8351i;
                    r rVar2 = cVar2.f8352j;
                    a0Var2.removeCallbacks(rVar2);
                    a0Var2.postDelayed(rVar2, 500L);
                    return;
                }
                return;
        }
    }
}
