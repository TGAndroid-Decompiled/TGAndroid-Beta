package ka;

import java.util.Date;
import java.util.HashMap;
public final class e implements ja.a {
    public static final a e = new a(0);
    public static final b f13569f = new ia.f() {
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
    public static final d f13570n = new Object();
    public final HashMap f13571a;
    public final HashMap f13572b;
    public final a f13573c;
    public boolean d;

    public e() {
        HashMap hashMap = new HashMap();
        this.f13571a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f13572b = hashMap2;
        this.f13573c = e;
        this.d = false;
        hashMap2.put(String.class, f13569f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f13570n);
        hashMap.remove(Date.class);
    }

    @Override
    public final ja.a m(Class cls, ia.d dVar) {
        this.f13571a.put(cls, dVar);
        this.f13572b.remove(cls);
        return this;
    }
}
