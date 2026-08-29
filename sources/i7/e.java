package i7;

import java.util.Map;
public final class e implements s9.d {
    public static final e f8294b = new e(0);
    public static final e f8295c = new e(1);
    public final int f8296a;

    public e(int i10) {
        this.f8296a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f8296a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                s9.e eVar = (s9.e) obj2;
                eVar.e(f.f8311g, entry.getKey());
                eVar.e(f.h, entry.getValue());
                return;
            default:
                s9.e eVar2 = (s9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
