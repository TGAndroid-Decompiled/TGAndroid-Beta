package g7;

import java.util.Map;
public final class e implements q9.d {
    public static final e f7159b = new e(0);
    public static final e f7160c = new e(1);
    public final int f7161a;

    public e(int i9) {
        this.f7161a = i9;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f7161a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                q9.e eVar = (q9.e) obj2;
                eVar.g(f.f7168g, entry.getKey());
                eVar.g(f.h, entry.getValue());
                return;
            default:
                q9.e eVar2 = (q9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
