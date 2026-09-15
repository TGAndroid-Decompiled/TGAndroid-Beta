package e6;

import android.util.Log;
import ci.p2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.c0;
public final class r {
    public final int f8033a;
    public final c f8034b;

    public r(c cVar, int i10) {
        this.f8033a = i10;
        this.f8034b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        o oVar = (o) qVar;
        switch (this.f8033a) {
            case 0:
                Status i10 = oVar.i();
                int i11 = i10.f6017a;
                c cVar = this.f8034b;
                if (i11 != 0) {
                    g6.b bVar = cVar.f7985a;
                    String str = i10.f6018b;
                    Log.w(bVar.f9425a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f7993l = null;
                if (!cVar.h.isEmpty()) {
                    c0 c0Var = cVar.f7990i;
                    p2 p2Var = cVar.f7991j;
                    c0Var.removeCallbacks(p2Var);
                    c0Var.postDelayed(p2Var, 500L);
                    return;
                }
                return;
            default:
                Status i12 = oVar.i();
                int i13 = i12.f6017a;
                c cVar2 = this.f8034b;
                if (i13 != 0) {
                    g6.b bVar2 = cVar2.f7985a;
                    String str2 = i12.f6018b;
                    Log.w(bVar2.f9425a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f7992k = null;
                if (!cVar2.h.isEmpty()) {
                    c0 c0Var2 = cVar2.f7990i;
                    p2 p2Var2 = cVar2.f7991j;
                    c0Var2.removeCallbacks(p2Var2);
                    c0Var2.postDelayed(p2Var2, 500L);
                    return;
                }
                return;
        }
    }
}
