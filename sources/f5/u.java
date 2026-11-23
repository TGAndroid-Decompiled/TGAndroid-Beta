package f5;

import java.util.ArrayList;
import org.telegram.messenger.j1;
import org.telegram.messenger.q1;
public final class u implements q0.a {
    public final int f11316a;
    public final Object f11317b;

    public u(g gVar, h hVar) {
        this.f11316a = 1;
        this.f11317b = hVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f11316a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                ((q1) ((j1) this.f11317b).f24781b).a((f) obj, arrayList);
                return;
            case 1:
                ((h) this.f11317b).a((f) obj);
                return;
            case 2:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((k8.a) this.f11317b).P0(fVar);
                return;
            default:
                o0.f fVar2 = (o0.f) obj;
                synchronized (o0.g.f21569c) {
                    try {
                        a0.l lVar = o0.g.d;
                        ArrayList arrayList2 = (ArrayList) lVar.get((String) this.f11317b);
                        if (arrayList2 != null) {
                            lVar.remove((String) this.f11317b);
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

    public u(Object obj, int i7) {
        this.f11316a = i7;
        this.f11317b = obj;
    }
}
