package e6;

import android.util.Log;
import ci.n2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.a0;
public final class r {
    public final int f8693a;
    public final c f8694b;

    public r(c cVar, int i10) {
        this.f8693a = i10;
        this.f8694b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        o oVar = (o) qVar;
        switch (this.f8693a) {
            case 0:
                Status i10 = oVar.i();
                int i11 = i10.f6523a;
                c cVar = this.f8694b;
                if (i11 != 0) {
                    g6.b bVar = cVar.f8642a;
                    String str = i10.f6524b;
                    Log.w(bVar.f10321a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f8651l = null;
                if (!cVar.h.isEmpty()) {
                    a0 a0Var = cVar.f8648i;
                    n2 n2Var = cVar.f8649j;
                    a0Var.removeCallbacks(n2Var);
                    a0Var.postDelayed(n2Var, 500L);
                    return;
                }
                return;
            default:
                Status i12 = oVar.i();
                int i13 = i12.f6523a;
                c cVar2 = this.f8694b;
                if (i13 != 0) {
                    g6.b bVar2 = cVar2.f8642a;
                    String str2 = i12.f6524b;
                    Log.w(bVar2.f10321a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f8650k = null;
                if (!cVar2.h.isEmpty()) {
                    a0 a0Var2 = cVar2.f8648i;
                    n2 n2Var2 = cVar2.f8649j;
                    a0Var2.removeCallbacks(n2Var2);
                    a0Var2.postDelayed(n2Var2, 500L);
                    return;
                }
                return;
        }
    }
}
