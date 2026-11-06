package h6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.y;
import fi.h2;
public final class q {
    public final int f14271a;
    public final c f14272b;

    public q(c cVar, int i7) {
        this.f14271a = i7;
        this.f14272b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        n nVar = (n) qVar;
        switch (this.f14271a) {
            case 0:
                Status a10 = nVar.a();
                int i7 = a10.f6529a;
                c cVar = this.f14272b;
                if (i7 != 0) {
                    j6.b bVar = cVar.f14221a;
                    String str = a10.f6530b;
                    Log.w(bVar.f16505a, bVar.d("Error fetching queue item ids, statusCode=" + i7 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f14230l = null;
                if (!cVar.h.isEmpty()) {
                    y yVar = cVar.f14227i;
                    h2 h2Var = cVar.f14228j;
                    yVar.removeCallbacks(h2Var);
                    yVar.postDelayed(h2Var, 500L);
                    return;
                }
                return;
            default:
                Status a11 = nVar.a();
                int i10 = a11.f6529a;
                c cVar2 = this.f14272b;
                if (i10 != 0) {
                    j6.b bVar2 = cVar2.f14221a;
                    String str2 = a11.f6530b;
                    Log.w(bVar2.f16505a, bVar2.d("Error fetching queue items, statusCode=" + i10 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f14229k = null;
                if (!cVar2.h.isEmpty()) {
                    y yVar2 = cVar2.f14227i;
                    h2 h2Var2 = cVar2.f14228j;
                    yVar2.removeCallbacks(h2Var2);
                    yVar2.postDelayed(h2Var2, 500L);
                    return;
                }
                return;
        }
    }
}
