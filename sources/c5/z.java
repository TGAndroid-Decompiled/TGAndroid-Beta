package c5;

import java.util.ArrayList;
public final class z implements q0.a {
    public final int f4255a;
    public final Object f4256b;

    public z(Object obj, int i10) {
        this.f4255a = i10;
        this.f4256b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f4255a) {
            case 0:
                s sVar = new s(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.d0) this.f4256b).a((h) obj, sVar);
                return;
            case 1:
                o0.g gVar = (o0.g) obj;
                if (gVar == null) {
                    gVar = new o0.g(-3);
                }
                ((o0.a) this.f4256b).E(gVar);
                return;
            default:
                o0.g gVar2 = (o0.g) obj;
                synchronized (o0.h.f16956c) {
                    try {
                        a0.m mVar = o0.h.d;
                        ArrayList arrayList = (ArrayList) mVar.get((String) this.f4256b);
                        if (arrayList != null) {
                            mVar.remove((String) this.f4256b);
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                ((q0.a) arrayList.get(i10)).accept(gVar2);
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
