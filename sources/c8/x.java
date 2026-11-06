package c8;

import java.util.Map;
public final class x implements na.d {
    public static final x f5932b = new x(0);
    public static final x f5933c = new x(1);
    public final int f5934a;

    public x(int i7) {
        this.f5934a = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f5934a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                na.e eVar = (na.e) obj2;
                eVar.a(y.f5962g, entry.getKey());
                eVar.a(y.h, entry.getValue());
                return;
            default:
                na.e eVar2 = (na.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
