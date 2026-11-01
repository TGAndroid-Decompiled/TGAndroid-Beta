package c5;

import java.util.ArrayList;
import org.telegram.messenger.s1;
import org.telegram.messenger.t1;
public final class v implements q0.a {
    public final int f3821a;
    public final Object f3822b;

    public v(h hVar, k6.h hVar2) {
        this.f3821a = 1;
        this.f3822b = hVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f3821a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                ((t1) ((s1) this.f3822b).f18056b).a((g) obj, arrayList);
                return;
            case 1:
                ((h) this.f3822b).a((g) obj);
                return;
            case 2:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((m5.e) this.f3822b).V(fVar);
                return;
            default:
                o0.f fVar2 = (o0.f) obj;
                synchronized (o0.g.f13925c) {
                    try {
                        a0.l lVar = o0.g.d;
                        ArrayList arrayList2 = (ArrayList) lVar.get((String) this.f3822b);
                        if (arrayList2 != null) {
                            lVar.remove((String) this.f3822b);
                            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                                ((q0.a) arrayList2.get(i10)).accept(fVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public v(Object obj, int i10) {
        this.f3821a = i10;
        this.f3822b = obj;
    }
}
