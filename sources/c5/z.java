package c5;

import java.util.ArrayList;
public final class z implements q0.a {
    public final int f4254a;
    public final Object f4255b;

    public z(Object obj, int i10) {
        this.f4254a = i10;
        this.f4255b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f4254a) {
            case 0:
                s sVar = new s(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.c0) this.f4255b).a((h) obj, sVar);
                return;
            case 1:
                o0.g gVar = (o0.g) obj;
                if (gVar == null) {
                    gVar = new o0.g(-3);
                }
                ((o0.a) this.f4255b).I(gVar);
                return;
            default:
                o0.g gVar2 = (o0.g) obj;
                synchronized (o0.h.f16946c) {
                    try {
                        a0.m mVar = o0.h.d;
                        ArrayList arrayList = (ArrayList) mVar.get((String) this.f4255b);
                        if (arrayList != null) {
                            mVar.remove((String) this.f4255b);
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
