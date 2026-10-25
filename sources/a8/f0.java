package a8;

import java.util.Map;
public final class f0 implements ka.d {
    public static final f0 f444b = new f0(0);
    public static final f0 f445c = new f0(1);
    public final int f446a;

    public f0(int i10) {
        this.f446a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f446a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ka.e eVar = (ka.e) obj2;
                eVar.a(g0.f476g, entry.getKey());
                eVar.a(g0.h, entry.getValue());
                return;
            default:
                ka.e eVar2 = (ka.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
