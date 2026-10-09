package e6;

import android.util.Log;
import ci.n2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.a0;
public final class r {
    public final int f8696a;
    public final c f8697b;

    public r(c cVar, int i10) {
        this.f8696a = i10;
        this.f8697b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        o oVar = (o) qVar;
        switch (this.f8696a) {
            case 0:
                Status i10 = oVar.i();
                int i11 = i10.f6525a;
                c cVar = this.f8697b;
                if (i11 != 0) {
                    g6.b bVar = cVar.f8645a;
                    String str = i10.f6526b;
                    Log.w(bVar.f10323a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f8654l = null;
                if (!cVar.h.isEmpty()) {
                    a0 a0Var = cVar.f8651i;
                    n2 n2Var = cVar.f8652j;
                    a0Var.removeCallbacks(n2Var);
                    a0Var.postDelayed(n2Var, 500L);
                    return;
                }
                return;
            default:
                Status i12 = oVar.i();
                int i13 = i12.f6525a;
                c cVar2 = this.f8697b;
                if (i13 != 0) {
                    g6.b bVar2 = cVar2.f8645a;
                    String str2 = i12.f6526b;
                    Log.w(bVar2.f10323a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f8653k = null;
                if (!cVar2.h.isEmpty()) {
                    a0 a0Var2 = cVar2.f8651i;
                    n2 n2Var2 = cVar2.f8652j;
                    a0Var2.removeCallbacks(n2Var2);
                    a0Var2.postDelayed(n2Var2, 500L);
                    return;
                }
                return;
        }
    }
}
