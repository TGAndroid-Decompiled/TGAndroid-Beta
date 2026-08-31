package n7;

import java.util.Map;
public final class x implements u9.d {
    public static final x f15787b = new x(0);
    public static final x f15788c = new x(1);
    public final int f15789a;

    public x(int i10) {
        this.f15789a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f15789a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                u9.e eVar = (u9.e) obj2;
                eVar.e(y.f15822g, entry.getKey());
                eVar.e(y.h, entry.getValue());
                return;
            default:
                u9.e eVar2 = (u9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
