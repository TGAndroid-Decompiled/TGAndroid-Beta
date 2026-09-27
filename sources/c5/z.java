package c5;

import java.util.ArrayList;
public final class z implements q0.a {
    public final int f3936a;
    public final Object f3937b;

    public z(Object obj, int i10) {
        this.f3936a = i10;
        this.f3937b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f3936a) {
            case 0:
                s sVar = new s(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.c0) this.f3937b).a((h) obj, sVar);
                return;
            case 1:
                o0.h hVar = (o0.h) obj;
                if (hVar == null) {
                    hVar = new o0.h(-3);
                }
                ((o0.a) this.f3937b).J(hVar);
                return;
            default:
                o0.h hVar2 = (o0.h) obj;
                synchronized (o0.i.f15538c) {
                    try {
                        a0.m mVar = o0.i.d;
                        ArrayList arrayList = (ArrayList) mVar.get((String) this.f3937b);
                        if (arrayList != null) {
                            mVar.remove((String) this.f3937b);
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                ((q0.a) arrayList.get(i10)).accept(hVar2);
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
