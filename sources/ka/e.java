package ka;

import java.util.Date;
import java.util.HashMap;
public final class e implements ja.a {
    public static final a e = new a(0);
    public static final b f13556f = new ia.f() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((ia.g) obj2).b((String) obj);
                    return;
                default:
                    ((ia.g) obj2).d(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final b h = new ia.f() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((ia.g) obj2).b((String) obj);
                    return;
                default:
                    ((ia.g) obj2).d(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final d f13557n = new Object();
    public final HashMap f13558a;
    public final HashMap f13559b;
    public final a f13560c;
    public boolean d;

    public e() {
        HashMap hashMap = new HashMap();
        this.f13558a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f13559b = hashMap2;
        this.f13560c = e;
        this.d = false;
        hashMap2.put(String.class, f13556f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f13557n);
        hashMap.remove(Date.class);
    }

    @Override
    public final ja.a m(Class cls, ia.d dVar) {
        this.f13558a.put(cls, dVar);
        this.f13559b.remove(cls);
        return this;
    }
}
