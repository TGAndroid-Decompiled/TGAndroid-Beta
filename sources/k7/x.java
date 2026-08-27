package k7;

import java.util.Map;

public final class x implements r9.d {

    public static final x f15028b = new x(0);

    public static final x f15029c = new x(1);

    public final int f15030a;

    public x(int i10) {
        this.f15030a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f15030a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                r9.e eVar = (r9.e) obj2;
                eVar.a(y.f15046g, entry.getKey());
                eVar.a(y.h, entry.getValue());
                return;
            default:
                throw new r9.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
