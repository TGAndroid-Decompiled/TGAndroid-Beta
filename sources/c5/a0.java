package c5;

import java.util.ArrayList;
public final class a0 implements q0.a {
    public final int f4325a;
    public final Object f4326b;

    public a0(Object obj, int i10) {
        this.f4325a = i10;
        this.f4326b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f4325a) {
            case 0:
                t tVar = new t(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.e0) this.f4326b).a((i) obj, tVar);
                return;
            case 1:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((n6.o) this.f4326b).G(fVar);
                return;
            default:
                o0.f fVar2 = (o0.f) obj;
                synchronized (o0.g.f16434c) {
                    try {
                        a0.l lVar = o0.g.d;
                        ArrayList arrayList = (ArrayList) lVar.get((String) this.f4326b);
                        if (arrayList != null) {
                            lVar.remove((String) this.f4326b);
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                ((q0.a) arrayList.get(i10)).accept(fVar2);
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
