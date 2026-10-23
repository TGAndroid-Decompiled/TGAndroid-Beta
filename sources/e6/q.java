package e6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.a0;
public final class q {
    public final int f8397a;
    public final c f8398b;

    public q(c cVar, int i10) {
        this.f8397a = i10;
        this.f8398b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        n nVar = (n) qVar;
        switch (this.f8397a) {
            case 0:
                Status h = nVar.h();
                int i10 = h.f6356a;
                c cVar = this.f8398b;
                if (i10 != 0) {
                    g6.b bVar = cVar.f8352a;
                    String str = h.f6357b;
                    Log.w(bVar.f10861a, bVar.d("Error fetching queue item ids, statusCode=" + i10 + ", statusMessage=" + str, new Object[0]));
                }
                cVar.f8360l = null;
                if (!cVar.h.isEmpty()) {
                    a0 a0Var = cVar.f8357i;
                    r rVar = cVar.f8358j;
                    a0Var.removeCallbacks(rVar);
                    a0Var.postDelayed(rVar, 500L);
                    return;
                }
                return;
            default:
                Status h10 = nVar.h();
                int i11 = h10.f6356a;
                c cVar2 = this.f8398b;
                if (i11 != 0) {
                    g6.b bVar2 = cVar2.f8352a;
                    String str2 = h10.f6357b;
                    Log.w(bVar2.f10861a, bVar2.d("Error fetching queue items, statusCode=" + i11 + ", statusMessage=" + str2, new Object[0]));
                }
                cVar2.f8359k = null;
                if (!cVar2.h.isEmpty()) {
                    a0 a0Var2 = cVar2.f8357i;
                    r rVar2 = cVar2.f8358j;
                    a0Var2.removeCallbacks(rVar2);
                    a0Var2.postDelayed(rVar2, 500L);
                    return;
                }
                return;
        }
    }
}
