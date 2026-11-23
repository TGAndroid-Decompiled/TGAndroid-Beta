package h6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.y;
public final class q {
    public final int f13938a;
    public final c f13939b;

    public q(c cVar, int i7) {
        this.f13938a = i7;
        this.f13939b = cVar;
    }

    public final void a(com.google.android.gms.common.api.r rVar) {
        n nVar = (n) rVar;
        switch (this.f13938a) {
            case 0:
                Status a10 = nVar.a();
                int i7 = a10.f6189a;
                c cVar = this.f13939b;
                if (i7 != 0) {
                    j6.b bVar = cVar.f13887a;
                    String str = a10.f6190b;
                    Log.w(bVar.f17235a, bVar.d("Error fetching queue item ids, statusCode=" + i7 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f13896l = null;
                if (!cVar.h.isEmpty()) {
                    y yVar = cVar.f13893i;
                    r rVar2 = cVar.f13894j;
                    yVar.removeCallbacks(rVar2);
                    yVar.postDelayed(rVar2, 500L);
                    return;
                }
                return;
            default:
                Status a11 = nVar.a();
                int i10 = a11.f6189a;
                c cVar2 = this.f13939b;
                if (i10 != 0) {
                    j6.b bVar2 = cVar2.f13887a;
                    String str2 = a11.f6190b;
                    Log.w(bVar2.f17235a, bVar2.d("Error fetching queue items, statusCode=" + i10 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f13895k = null;
                if (!cVar2.h.isEmpty()) {
                    y yVar2 = cVar2.f13893i;
                    r rVar3 = cVar2.f13894j;
                    yVar2.removeCallbacks(rVar3);
                    yVar2.postDelayed(rVar3, 500L);
                    return;
                }
                return;
        }
    }
}
