package j7;

import java.util.Map;
public final class i0 implements s9.d {
    public static final i0 f11031b = new i0(0);
    public static final i0 f11032c = new i0(1);
    public final int f11033a;

    public i0(int i10) {
        this.f11033a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f11033a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                s9.e eVar = (s9.e) obj2;
                eVar.e(j0.f11043g, entry.getKey());
                eVar.e(j0.h, entry.getValue());
                return;
            default:
                s9.e eVar2 = (s9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
