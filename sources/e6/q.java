package e6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.z;
public final class q {
    public final int f6306a;
    public final c f6307b;

    public q(c cVar, int i10) {
        this.f6306a = i10;
        this.f6307b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        m mVar = (m) qVar;
        switch (this.f6306a) {
            case 0:
                Status a2 = mVar.a();
                int i10 = a2.f4334a;
                c cVar = this.f6307b;
                if (i10 != 0) {
                    g6.b bVar = cVar.f6261a;
                    String str = a2.f4335b;
                    Log.w(bVar.f7368a, bVar.d("Error fetching queue item ids, statusCode=" + i10 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f6269l = null;
                if (!cVar.h.isEmpty()) {
                    z zVar = cVar.f6266i;
                    r rVar = cVar.f6267j;
                    zVar.removeCallbacks(rVar);
                    zVar.postDelayed(rVar, 500L);
                    return;
                }
                return;
            default:
                Status a10 = mVar.a();
                int i11 = a10.f4334a;
                c cVar2 = this.f6307b;
                if (i11 != 0) {
                    g6.b bVar2 = cVar2.f6261a;
                    String str2 = a10.f4335b;
                    Log.w(bVar2.f7368a, bVar2.d("Error fetching queue items, statusCode=" + i11 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f6268k = null;
                if (!cVar2.h.isEmpty()) {
                    z zVar2 = cVar2.f6266i;
                    r rVar2 = cVar2.f6267j;
                    zVar2.removeCallbacks(rVar2);
                    zVar2.postDelayed(rVar2, 500L);
                    return;
                }
                return;
        }
    }
}
