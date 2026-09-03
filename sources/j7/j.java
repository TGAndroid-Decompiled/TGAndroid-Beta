package j7;

import java.util.Map;
public final class j implements u9.d {
    public static final j f9021b = new j(0);
    public static final j f9022c = new j(1);
    public final int f9023a;

    public j(int i10) {
        this.f9023a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f9023a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                u9.e eVar = (u9.e) obj2;
                eVar.e(k.f9037g, entry.getKey());
                eVar.e(k.h, entry.getValue());
                return;
            default:
                u9.e eVar2 = (u9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
