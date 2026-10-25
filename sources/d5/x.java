package d5;

import java.util.ArrayList;
import m4.w1;
public final class x implements q0.a {
    public final int f8021a;
    public final Object f8022b;

    public x(Object obj, int i10) {
        this.f8021a = i10;
        this.f8022b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f8021a) {
            case 0:
                s sVar = new s(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.g0) this.f8022b).a((i) obj, sVar);
                return;
            case 1:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((w1) this.f8022b).Q(fVar);
                return;
            default:
                o0.f fVar2 = (o0.f) obj;
                synchronized (o0.g.f18936c) {
                    try {
                        a0.l lVar = o0.g.d;
                        ArrayList arrayList = (ArrayList) lVar.get((String) this.f8022b);
                        if (arrayList != null) {
                            lVar.remove((String) this.f8022b);
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
