package c5;

import java.util.ArrayList;
public final class z implements q0.a {
    public final int f3943a;
    public final Object f3944b;

    public z(Object obj, int i10) {
        this.f3943a = i10;
        this.f3944b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f3943a) {
            case 0:
                s sVar = new s(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.c0) this.f3944b).a((h) obj, sVar);
                return;
            case 1:
                o0.f fVar = (o0.f) obj;
                if (fVar == null) {
                    fVar = new o0.f(-3);
                }
                ((m5.e) this.f3944b).K(fVar);
                return;
            default:
                o0.f fVar2 = (o0.f) obj;
                synchronized (o0.g.f15488c) {
                    try {
                        a0.m mVar = o0.g.d;
                        ArrayList arrayList = (ArrayList) mVar.get((String) this.f3944b);
                        if (arrayList != null) {
                            mVar.remove((String) this.f3944b);
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
