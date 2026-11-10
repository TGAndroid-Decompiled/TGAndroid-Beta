package f5;

import aa.c0;
import java.util.ArrayList;
import m4.d0;
import org.telegram.messenger.j1;
import org.telegram.messenger.q1;
public final class t implements q0.a {
    public final int f11192a;
    public final Object f11193b;

    public t(c0 c0Var, g gVar) {
        this.f11192a = 1;
        this.f11193b = gVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f11192a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                ((q1) ((j1) this.f11193b).f23469b).a((f) obj, arrayList);
                return;
            case 1:
                ((g) this.f11193b).a((f) obj);
                return;
            case 2:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((d0) this.f11193b).l0(fVar);
                return;
            default:
                o0.f fVar2 = (o0.f) obj;
                synchronized (o0.g.f20695c) {
                    try {
                        a0.l lVar = o0.g.d;
                        ArrayList arrayList2 = (ArrayList) lVar.get((String) this.f11193b);
                        if (arrayList2 != null) {
                            lVar.remove((String) this.f11193b);
                            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                                ((q0.a) arrayList2.get(i7)).accept(fVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public t(Object obj, int i7) {
        this.f11192a = i7;
        this.f11193b = obj;
    }
}
