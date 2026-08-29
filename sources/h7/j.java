package h7;

import java.util.Map;
public final class j implements s9.d {
    public static final j f7652b = new j(0);
    public static final j f7653c = new j(1);
    public final int f7654a;

    public j(int i10) {
        this.f7654a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f7654a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                s9.e eVar = (s9.e) obj2;
                eVar.e(k.f7670g, entry.getKey());
                eVar.e(k.h, entry.getValue());
                return;
            default:
                s9.e eVar2 = (s9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
