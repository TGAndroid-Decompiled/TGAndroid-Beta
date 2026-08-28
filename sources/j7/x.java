package j7;

import java.util.Map;
public final class x implements q9.d {
    public static final x f14174b = new x(0);
    public static final x f14175c = new x(1);
    public final int f14176a;

    public x(int i9) {
        this.f14176a = i9;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f14176a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                q9.e eVar = (q9.e) obj2;
                eVar.g(y.f14192g, entry.getKey());
                eVar.g(y.h, entry.getValue());
                return;
            default:
                q9.e eVar2 = (q9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
