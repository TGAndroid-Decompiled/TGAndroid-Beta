package ka;

import ia.g;
import java.util.Date;
import java.util.HashMap;
public final class d implements ja.a {
    public static final a f14765e = new a(0);
    public static final b f14766f = new ia.f() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).b((String) obj);
                    return;
                default:
                    ((g) obj2).d(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final b f14767g = new ia.f() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).b((String) obj);
                    return;
                default:
                    ((g) obj2).d(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final c h = new Object();
    public final HashMap f14768a;
    public final HashMap f14769b;
    public final a f14770c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f14768a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f14769b = hashMap2;
        this.f14770c = f14765e;
        this.d = false;
        hashMap2.put(String.class, f14766f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f14767g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    @Override
    public final ja.a a(Class cls, ia.d dVar) {
        this.f14768a.put(cls, dVar);
        this.f14769b.remove(cls);
        return this;
    }
}
