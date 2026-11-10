package h6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.y;
import fi.h2;
public final class q {
    public final int f14273a;
    public final c f14274b;

    public q(c cVar, int i7) {
        this.f14273a = i7;
        this.f14274b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        n nVar = (n) qVar;
        switch (this.f14273a) {
            case 0:
                Status a10 = nVar.a();
                int i7 = a10.f6532a;
                c cVar = this.f14274b;
                if (i7 != 0) {
                    j6.b bVar = cVar.f14223a;
                    String str = a10.f6533b;
                    Log.w(bVar.f16508a, bVar.d("Error fetching queue item ids, statusCode=" + i7 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f14232l = null;
                if (!cVar.h.isEmpty()) {
                    y yVar = cVar.f14229i;
                    h2 h2Var = cVar.f14230j;
                    yVar.removeCallbacks(h2Var);
                    yVar.postDelayed(h2Var, 500L);
                    return;
                }
                return;
            default:
                Status a11 = nVar.a();
                int i10 = a11.f6532a;
                c cVar2 = this.f14274b;
                if (i10 != 0) {
                    j6.b bVar2 = cVar2.f14223a;
                    String str2 = a11.f6533b;
                    Log.w(bVar2.f16508a, bVar2.d("Error fetching queue items, statusCode=" + i10 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f14231k = null;
                if (!cVar2.h.isEmpty()) {
                    y yVar2 = cVar2.f14229i;
                    h2 h2Var2 = cVar2.f14230j;
                    yVar2.removeCallbacks(h2Var2);
                    yVar2.postDelayed(h2Var2, 500L);
                    return;
                }
                return;
        }
    }
}
