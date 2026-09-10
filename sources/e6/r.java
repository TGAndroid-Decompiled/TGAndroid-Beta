package e6;

import android.util.Log;
import bi.b3;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.c0;
public final class r {
    public final int f7338a;
    public final c f7339b;

    public r(c cVar, int i10) {
        this.f7338a = i10;
        this.f7339b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        o oVar = (o) qVar;
        switch (this.f7338a) {
            case 0:
                Status i10 = oVar.i();
                int i11 = i10.f4796a;
                c cVar = this.f7339b;
                if (i11 != 0) {
                    g6.b bVar = cVar.f7290a;
                    String str = i10.f4797b;
                    Log.w(bVar.f8558a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f7298l = null;
                if (!cVar.h.isEmpty()) {
                    c0 c0Var = cVar.f7295i;
                    b3 b3Var = cVar.f7296j;
                    c0Var.removeCallbacks(b3Var);
                    c0Var.postDelayed(b3Var, 500L);
                    return;
                }
                return;
            default:
                Status i12 = oVar.i();
                int i13 = i12.f4796a;
                c cVar2 = this.f7339b;
                if (i13 != 0) {
                    g6.b bVar2 = cVar2.f7290a;
                    String str2 = i12.f4797b;
                    Log.w(bVar2.f8558a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f7297k = null;
                if (!cVar2.h.isEmpty()) {
                    c0 c0Var2 = cVar2.f7295i;
                    b3 b3Var2 = cVar2.f7296j;
                    c0Var2.removeCallbacks(b3Var2);
                    c0Var2.postDelayed(b3Var2, 500L);
                    return;
                }
                return;
        }
    }
}
