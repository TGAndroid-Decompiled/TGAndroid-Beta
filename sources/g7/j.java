package g7;

import java.util.Map;

public final class j implements r9.d {

    public static final j f6508b = new j(0);

    public static final j f6509c = new j(1);

    public final int f6510a;

    public j(int i10) {
        this.f6510a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f6510a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                r9.e eVar = (r9.e) obj2;
                eVar.a(k.f6521g, entry.getKey());
                eVar.a(k.h, entry.getValue());
                return;
            default:
                throw new r9.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
