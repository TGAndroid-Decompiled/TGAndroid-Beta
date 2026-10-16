package c5;

import java.util.ArrayList;
public final class a0 implements q0.a {
    public final int f4328a;
    public final Object f4329b;

    public a0(Object obj, int i10) {
        this.f4328a = i10;
        this.f4329b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f4328a) {
            case 0:
                t tVar = new t(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.d0) this.f4329b).a((i) obj, tVar);
                return;
            case 1:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((n3.b) this.f4329b).H(fVar);
                return;
            default:
                o0.f fVar2 = (o0.f) obj;
                synchronized (o0.g.f16127c) {
                    try {
                        a0.l lVar = o0.g.d;
                        ArrayList arrayList = (ArrayList) lVar.get((String) this.f4329b);
                        if (arrayList != null) {
                            lVar.remove((String) this.f4329b);
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
