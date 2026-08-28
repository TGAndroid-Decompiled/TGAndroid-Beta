package o5;

import android.util.Log;
import c2.u0;
import com.google.android.gms.common.api.Status;
import kh.j2;
public final class q {
    public final int f19006a;
    public final c f19007b;

    public q(c cVar, int i9) {
        this.f19006a = i9;
        this.f19007b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        m mVar = (m) qVar;
        switch (this.f19006a) {
            case 0:
                Status i9 = mVar.i();
                int i10 = i9.f2741a;
                c cVar = this.f19007b;
                if (i10 != 0) {
                    q5.b bVar = cVar.f18958a;
                    String str = i9.f2742b;
                    Log.w(bVar.f46009a, bVar.d("Error fetching queue item ids, statusCode=" + i10 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f18967l = null;
                if (!cVar.h.isEmpty()) {
                    u0 u0Var = cVar.f18964i;
                    j2 j2Var = cVar.f18965j;
                    u0Var.removeCallbacks(j2Var);
                    u0Var.postDelayed(j2Var, 500L);
                    return;
                }
                return;
            default:
                Status i11 = mVar.i();
                int i12 = i11.f2741a;
                c cVar2 = this.f19007b;
                if (i12 != 0) {
                    q5.b bVar2 = cVar2.f18958a;
                    String str2 = i11.f2742b;
                    Log.w(bVar2.f46009a, bVar2.d("Error fetching queue items, statusCode=" + i12 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f18966k = null;
                if (!cVar2.h.isEmpty()) {
                    u0 u0Var2 = cVar2.f18964i;
                    j2 j2Var2 = cVar2.f18965j;
                    u0Var2.removeCallbacks(j2Var2);
                    u0Var2.postDelayed(j2Var2, 500L);
                    return;
                }
                return;
        }
    }
}
