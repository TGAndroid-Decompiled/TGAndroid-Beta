package c5;

import java.util.ArrayList;
public final class z implements q0.a {
    public final int f4801a;
    public final Object f4802b;

    public z(Object obj, int i10) {
        this.f4801a = i10;
        this.f4802b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f4801a) {
            case 0:
                s sVar = new s(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.d0) this.f4802b).a((i) obj, sVar);
                return;
            case 1:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((n2.e) this.f4802b).a0(fVar);
                return;
            default:
                o0.f fVar2 = (o0.f) obj;
                synchronized (o0.g.f17524c) {
                    try {
                        a0.l lVar = o0.g.d;
                        ArrayList arrayList = (ArrayList) lVar.get((String) this.f4802b);
                        if (arrayList != null) {
                            lVar.remove((String) this.f4802b);
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
