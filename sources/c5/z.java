package c5;

import java.util.ArrayList;
public final class z implements q0.a {
    public final int f4305a;
    public final Object f4306b;

    public z(Object obj, int i10) {
        this.f4305a = i10;
        this.f4306b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f4305a) {
            case 0:
                s sVar = new s(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.d0) this.f4306b).a((h) obj, sVar);
                return;
            case 1:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((n6.t) this.f4306b).K(fVar);
                return;
            default:
                o0.f fVar2 = (o0.f) obj;
                synchronized (o0.g.f16901c) {
                    try {
                        a0.m mVar = o0.g.d;
                        ArrayList arrayList = (ArrayList) mVar.get((String) this.f4306b);
                        if (arrayList != null) {
                            mVar.remove((String) this.f4306b);
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
