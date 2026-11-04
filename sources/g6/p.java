package g6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.z;
public final class p {
    public final int f12028a;
    public final c f12029b;

    public p(c cVar, int i3) {
        this.f12028a = i3;
        this.f12029b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        m mVar = (m) qVar;
        switch (this.f12028a) {
            case 0:
                Status a10 = mVar.a();
                int i3 = a10.f6581a;
                c cVar = this.f12029b;
                if (i3 != 0) {
                    i6.b bVar = cVar.f11980a;
                    String str = a10.f6582b;
                    Log.w(bVar.f14620a, bVar.d("Error fetching queue item ids, statusCode=" + i3 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f11989l = null;
                if (!cVar.h.isEmpty()) {
                    z zVar = cVar.f11986i;
                    q qVar2 = cVar.f11987j;
                    zVar.removeCallbacks(qVar2);
                    zVar.postDelayed(qVar2, 500L);
                    return;
                }
                return;
            default:
                Status a11 = mVar.a();
                int i10 = a11.f6581a;
                c cVar2 = this.f12029b;
                if (i10 != 0) {
                    i6.b bVar2 = cVar2.f11980a;
                    String str2 = a11.f6582b;
                    Log.w(bVar2.f14620a, bVar2.d("Error fetching queue items, statusCode=" + i10 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f11988k = null;
                if (!cVar2.h.isEmpty()) {
                    z zVar2 = cVar2.f11986i;
                    q qVar3 = cVar2.f11987j;
                    zVar2.removeCallbacks(qVar3);
                    zVar2.postDelayed(qVar3, 500L);
                    return;
                }
                return;
        }
    }
}
