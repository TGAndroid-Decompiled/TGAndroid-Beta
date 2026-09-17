package e6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.c0;
import di.p2;
public final class r {
    public final int f8901a;
    public final c f8902b;

    public r(c cVar, int i10) {
        this.f8901a = i10;
        this.f8902b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        o oVar = (o) qVar;
        switch (this.f8901a) {
            case 0:
                Status i10 = oVar.i();
                int i11 = i10.f4946a;
                c cVar = this.f8902b;
                if (i11 != 0) {
                    g6.b bVar = cVar.f8850a;
                    String str = i10.f4947b;
                    Log.w(bVar.f10386a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f8859l = null;
                if (!cVar.h.isEmpty()) {
                    c0 c0Var = cVar.f8856i;
                    p2 p2Var = cVar.f8857j;
                    c0Var.removeCallbacks(p2Var);
                    c0Var.postDelayed(p2Var, 500L);
                    return;
                }
                return;
            default:
                Status i12 = oVar.i();
                int i13 = i12.f4946a;
                c cVar2 = this.f8902b;
                if (i13 != 0) {
                    g6.b bVar2 = cVar2.f8850a;
                    String str2 = i12.f4947b;
                    Log.w(bVar2.f10386a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f8858k = null;
                if (!cVar2.h.isEmpty()) {
                    c0 c0Var2 = cVar2.f8856i;
                    p2 p2Var2 = cVar2.f8857j;
                    c0Var2.removeCallbacks(p2Var2);
                    c0Var2.postDelayed(p2Var2, 500L);
                    return;
                }
                return;
        }
    }
}
