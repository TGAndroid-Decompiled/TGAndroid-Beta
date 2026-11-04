package b8;

import java.util.Map;
public final class f0 implements ma.d {
    public static final f0 f2582b = new f0(0);
    public static final f0 f2583c = new f0(1);
    public final int f2584a;

    public f0(int i3) {
        this.f2584a = i3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f2584a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ma.e eVar = (ma.e) obj2;
                eVar.a(g0.f2620g, entry.getKey());
                eVar.a(g0.h, entry.getValue());
                return;
            default:
                ma.e eVar2 = (ma.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
