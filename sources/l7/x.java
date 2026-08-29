package l7;

import java.util.Map;
public final class x implements s9.d {
    public static final x f15033b = new x(0);
    public static final x f15034c = new x(1);
    public final int f15035a;

    public x(int i10) {
        this.f15035a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f15035a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                s9.e eVar = (s9.e) obj2;
                eVar.e(y.f15051g, entry.getKey());
                eVar.e(y.h, entry.getValue());
                return;
            default:
                s9.e eVar2 = (s9.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
