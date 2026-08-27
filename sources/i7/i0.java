package i7;

import java.util.Map;

public final class i0 implements r9.d {

    public static final i0 f10659b = new i0(0);

    public static final i0 f10660c = new i0(1);

    public final int f10661a;

    public i0(int i10) {
        this.f10661a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f10661a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                r9.e eVar = (r9.e) obj2;
                eVar.a(j0.f10678g, entry.getKey());
                eVar.a(j0.h, entry.getValue());
                return;
            default:
                throw new r9.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
