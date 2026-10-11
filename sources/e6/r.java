package e6;

import android.util.Log;
import ci.n2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.a0;
public final class r {
    public final int f8695a;
    public final c f8696b;

    public r(c cVar, int i10) {
        this.f8695a = i10;
        this.f8696b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        o oVar = (o) qVar;
        switch (this.f8695a) {
            case 0:
                Status i10 = oVar.i();
                int i11 = i10.f6524a;
                c cVar = this.f8696b;
                if (i11 != 0) {
                    g6.b bVar = cVar.f8644a;
                    String str = i10.f6525b;
                    Log.w(bVar.f10322a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f8653l = null;
                if (!cVar.h.isEmpty()) {
                    a0 a0Var = cVar.f8650i;
                    n2 n2Var = cVar.f8651j;
                    a0Var.removeCallbacks(n2Var);
                    a0Var.postDelayed(n2Var, 500L);
                    return;
                }
                return;
            default:
                Status i12 = oVar.i();
                int i13 = i12.f6524a;
                c cVar2 = this.f8696b;
                if (i13 != 0) {
                    g6.b bVar2 = cVar2.f8644a;
                    String str2 = i12.f6525b;
                    Log.w(bVar2.f10322a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f8652k = null;
                if (!cVar2.h.isEmpty()) {
                    a0 a0Var2 = cVar2.f8650i;
                    n2 n2Var2 = cVar2.f8651j;
                    a0Var2.removeCallbacks(n2Var2);
                    a0Var2.postDelayed(n2Var2, 500L);
                    return;
                }
                return;
        }
    }
}
