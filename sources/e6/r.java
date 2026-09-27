package e6;

import android.util.Log;
import ci.o2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.c0;
public final class r {
    public final int f8022a;
    public final c f8023b;

    public r(c cVar, int i10) {
        this.f8022a = i10;
        this.f8023b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        o oVar = (o) qVar;
        switch (this.f8022a) {
            case 0:
                Status i10 = oVar.i();
                int i11 = i10.f6006a;
                c cVar = this.f8023b;
                if (i11 != 0) {
                    g6.b bVar = cVar.f7974a;
                    String str = i10.f6007b;
                    Log.w(bVar.f9417a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f7982l = null;
                if (!cVar.h.isEmpty()) {
                    c0 c0Var = cVar.f7979i;
                    o2 o2Var = cVar.f7980j;
                    c0Var.removeCallbacks(o2Var);
                    c0Var.postDelayed(o2Var, 500L);
                    return;
                }
                return;
            default:
                Status i12 = oVar.i();
                int i13 = i12.f6006a;
                c cVar2 = this.f8023b;
                if (i13 != 0) {
                    g6.b bVar2 = cVar2.f7974a;
                    String str2 = i12.f6007b;
                    Log.w(bVar2.f9417a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f7981k = null;
                if (!cVar2.h.isEmpty()) {
                    c0 c0Var2 = cVar2.f7979i;
                    o2 o2Var2 = cVar2.f7980j;
                    c0Var2.removeCallbacks(o2Var2);
                    c0Var2.postDelayed(o2Var2, 500L);
                    return;
                }
                return;
        }
    }
}
