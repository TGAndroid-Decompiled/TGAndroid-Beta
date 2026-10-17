package c5;

import java.util.ArrayList;
public final class z implements q0.a {
    public final int f4800a;
    public final Object f4801b;

    public z(Object obj, int i10) {
        this.f4800a = i10;
        this.f4801b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f4800a) {
            case 0:
                s sVar = new s(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.e0) this.f4801b).a((i) obj, sVar);
                return;
            case 1:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((n2.e) this.f4801b).a0(fVar);
                return;
            default:
                o0.f fVar2 = (o0.f) obj;
                synchronized (o0.g.f17521c) {
                    try {
                        a0.l lVar = o0.g.d;
                        ArrayList arrayList = (ArrayList) lVar.get((String) this.f4801b);
                        if (arrayList != null) {
                            lVar.remove((String) this.f4801b);
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
