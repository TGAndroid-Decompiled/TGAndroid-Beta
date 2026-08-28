package f7;

import java.util.Map;
public final class j implements q9.d {
    public static final j f5706b = new j(0);
    public static final j f5707c = new j(1);
    public final int f5708a;

    public j(int i9) {
        this.f5708a = i9;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f5708a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                q9.e eVar = (q9.e) obj2;
                eVar.g(k.f5719g, entry.getKey());
                eVar.g(k.h, entry.getValue());
                return;
            default:
                q9.e eVar2 = (q9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
