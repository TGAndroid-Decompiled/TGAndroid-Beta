package e5;

import java.util.ArrayList;
import mi.h0;
import org.telegram.messenger.p1;
import org.telegram.messenger.q1;
public final class t implements q0.a {
    public final int f9630a;
    public final Object f9631b;

    public t(com.google.android.gms.internal.clearcut.e eVar, g gVar) {
        this.f9630a = 1;
        this.f9631b = gVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f9630a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                ((q1) ((p1) this.f9631b).f24685b).k((f) obj, arrayList);
                return;
            case 1:
                ((g) this.f9631b).a((f) obj);
                return;
            case 2:
                o0.g gVar = (o0.g) obj;
                if (gVar == null) {
                    gVar = new o0.g(-3);
                }
                ((h0) this.f9631b).U(gVar);
                return;
            default:
                o0.g gVar2 = (o0.g) obj;
                synchronized (o0.h.f20493c) {
                    try {
                        a0.l lVar = o0.h.d;
                        ArrayList arrayList2 = (ArrayList) lVar.get((String) this.f9631b);
                        if (arrayList2 != null) {
                            lVar.remove((String) this.f9631b);
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                ((q0.a) arrayList2.get(i3)).accept(gVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public t(Object obj, int i3) {
        this.f9630a = i3;
        this.f9631b = obj;
    }
}
