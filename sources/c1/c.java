package c1;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import od.p;
public final class c extends i implements p {
    public final int f3963a;

    public c(int i3, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i3, obj, cls, str, str2, i10);
        this.f3963a = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        switch (this.f3963a) {
            case 0:
                ((b1.a) this.receiver).getClass();
                return b1.a.b((String) obj, (String) obj2);
            case 1:
                ((b1.a) this.receiver).getClass();
                return b1.a.a((String) obj, (String) obj2);
            case 2:
                ((b1.a) this.receiver).getClass();
                return b1.a.a((String) obj, (String) obj2);
            case 3:
                ((b1.a) this.receiver).getClass();
                return b1.a.b((String) obj, (String) obj2);
            default:
                je.d p02 = (je.d) obj;
                int intValue = ((Number) obj2).intValue();
                j.e(p02, "p0");
                ne.e eVar = (ne.e) this.receiver;
                eVar.getClass();
                if (!p02.j(intValue) && p02.i(intValue).c()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eVar.f20349b = z10;
                return Boolean.valueOf(z10);
        }
    }
}
