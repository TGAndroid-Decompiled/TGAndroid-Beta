package e6;

import android.util.Log;
import ci.o2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.c0;
public final class r {
    public final int f8701a;
    public final c f8702b;

    public r(c cVar, int i10) {
        this.f8701a = i10;
        this.f8702b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        o oVar = (o) qVar;
        switch (this.f8701a) {
            case 0:
                Status i10 = oVar.i();
                int i11 = i10.f6472a;
                c cVar = this.f8702b;
                if (i11 != 0) {
                    g6.b bVar = cVar.f8650a;
                    String str = i10.f6473b;
                    Log.w(bVar.f10249a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f8659l = null;
                if (!cVar.h.isEmpty()) {
                    c0 c0Var = cVar.f8656i;
                    o2 o2Var = cVar.f8657j;
                    c0Var.removeCallbacks(o2Var);
                    c0Var.postDelayed(o2Var, 500L);
                    return;
                }
                return;
            default:
                Status i12 = oVar.i();
                int i13 = i12.f6472a;
                c cVar2 = this.f8702b;
                if (i13 != 0) {
                    g6.b bVar2 = cVar2.f8650a;
                    String str2 = i12.f6473b;
                    Log.w(bVar2.f10249a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f8658k = null;
                if (!cVar2.h.isEmpty()) {
                    c0 c0Var2 = cVar2.f8656i;
                    o2 o2Var2 = cVar2.f8657j;
                    c0Var2.removeCallbacks(o2Var2);
                    c0Var2.postDelayed(o2Var2, 500L);
                    return;
                }
                return;
        }
    }
}
