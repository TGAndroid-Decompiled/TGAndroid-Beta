package c8;

import java.util.Map;
public final class x implements na.d {
    public static final x f5065b = new x(0);
    public static final x f5066c = new x(1);
    public final int f5067a;

    public x(int i7) {
        this.f5067a = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f5067a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                na.e eVar = (na.e) obj2;
                eVar.a(y.f5095g, entry.getKey());
                eVar.a(y.h, entry.getValue());
                return;
            default:
                na.e eVar2 = (na.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
