package a8;

import java.util.Map;
public final class o0 implements na.d {
    public static final o0 f555b = new o0(0);
    public static final o0 f556c = new o0(1);
    public final int f557a;

    public o0(int i7) {
        this.f557a = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f557a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                na.e eVar = (na.e) obj2;
                eVar.a(q0.f585g, entry.getKey());
                eVar.a(q0.h, entry.getValue());
                return;
            default:
                na.e eVar2 = (na.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
