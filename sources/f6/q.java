package f6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.y;
public final class q {
    public final int f10235a;
    public final c f10236b;

    public q(c cVar, int i10) {
        this.f10235a = i10;
        this.f10236b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        n nVar = (n) qVar;
        switch (this.f10235a) {
            case 0:
                Status h = nVar.h();
                int i10 = h.f6466a;
                c cVar = this.f10236b;
                if (i10 != 0) {
                    h6.b bVar = cVar.f10190a;
                    String str = h.f6467b;
                    Log.w(bVar.f12621a, bVar.d("Error fetching queue item ids, statusCode=" + i10 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f10198l = null;
                if (!cVar.h.isEmpty()) {
                    y yVar = cVar.f10195i;
                    r rVar = cVar.f10196j;
                    yVar.removeCallbacks(rVar);
                    yVar.postDelayed(rVar, 500L);
                    return;
                }
                return;
            default:
                Status h10 = nVar.h();
                int i11 = h10.f6466a;
                c cVar2 = this.f10236b;
                if (i11 != 0) {
                    h6.b bVar2 = cVar2.f10190a;
                    String str2 = h10.f6467b;
                    Log.w(bVar2.f12621a, bVar2.d("Error fetching queue items, statusCode=" + i11 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f10197k = null;
                if (!cVar2.h.isEmpty()) {
                    y yVar2 = cVar2.f10195i;
                    r rVar2 = cVar2.f10196j;
                    yVar2.removeCallbacks(rVar2);
                    yVar2.postDelayed(rVar2, 500L);
                    return;
                }
                return;
        }
    }
}
