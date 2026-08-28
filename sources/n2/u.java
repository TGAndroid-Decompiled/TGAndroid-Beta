package n2;

import java.util.ArrayList;
public final class u implements q0.a {
    public final int f18355a;
    public final Object f18356b;

    public u(Object obj, int i9) {
        this.f18355a = i9;
        this.f18356b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f18355a) {
            case 0:
                q qVar = new q(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.d) this.f18356b).a((g) obj, qVar);
                return;
            case 1:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((g5.b) this.f18356b).s(fVar);
                return;
            default:
                o0.f fVar2 = (o0.f) obj;
                synchronized (o0.g.f18762c) {
                    try {
                        a0.k kVar = o0.g.d;
                        ArrayList arrayList = (ArrayList) kVar.get((String) this.f18356b);
                        if (arrayList != null) {
                            kVar.remove((String) this.f18356b);
                            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                                ((q0.a) arrayList.get(i9)).accept(fVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
