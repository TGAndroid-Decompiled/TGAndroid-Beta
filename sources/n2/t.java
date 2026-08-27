package n2;

import java.util.ArrayList;

public final class t implements q0.a {

    public final int f18181a;

    public final Object f18182b;

    public t(Object obj, int i10) {
        this.f18181a = i10;
        this.f18182b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f18181a) {
            case 0:
                p pVar = new p(new ArrayList(), new ArrayList());
                ((org.telegram.messenger.d) this.f18182b).a((g) obj, pVar);
                return;
            case 1:
                o0.g gVar = (o0.g) obj;
                if (gVar == null) {
                    gVar = new o0.g(-3);
                }
                ((g5.b) this.f18182b).s(gVar);
                return;
            default:
                o0.g gVar2 = (o0.g) obj;
                synchronized (o0.h.f19106c) {
                    try {
                        a0.k kVar = o0.h.d;
                        ArrayList arrayList = (ArrayList) kVar.get((String) this.f18182b);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f18182b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((q0.a) arrayList.get(i10)).accept(gVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
