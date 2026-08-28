package h7;

import java.util.Map;
public final class i0 implements q9.d {
    public static final i0 f9950b = new i0(0);
    public static final i0 f9951c = new i0(1);
    public final int f9952a;

    public i0(int i9) {
        this.f9952a = i9;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f9952a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                q9.e eVar = (q9.e) obj2;
                eVar.g(j0.f9969g, entry.getKey());
                eVar.g(j0.h, entry.getValue());
                return;
            default:
                q9.e eVar2 = (q9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
