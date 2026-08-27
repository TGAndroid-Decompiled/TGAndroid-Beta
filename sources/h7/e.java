package h7;

import java.util.Map;

public final class e implements r9.d {

    public static final e f8330b = new e(0);

    public static final e f8331c = new e(1);

    public final int f8332a;

    public e(int i10) {
        this.f8332a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f8332a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                r9.e eVar = (r9.e) obj2;
                eVar.a(f.f8339g, entry.getKey());
                eVar.a(f.h, entry.getValue());
                return;
            default:
                throw new r9.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
