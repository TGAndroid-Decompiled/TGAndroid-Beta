package c1;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import rd.p;
public final class c extends i implements p {
    public final int f5249a;

    public c(int i7, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i7, obj, cls, str, str2, i10);
        this.f5249a = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        boolean z9;
        switch (this.f5249a) {
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
            case 4:
                ((b1.a) this.receiver).getClass();
                return b1.a.b((String) obj, (String) obj2);
            default:
                me.d p02 = (me.d) obj;
                int intValue = ((Number) obj2).intValue();
                j.e(p02, "p0");
                qe.e eVar = (qe.e) this.receiver;
                eVar.getClass();
                if (!p02.j(intValue) && p02.i(intValue).c()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                eVar.f54106b = z9;
                return Boolean.valueOf(z9);
        }
    }
}
