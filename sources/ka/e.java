package ka;

import java.util.Date;
import java.util.HashMap;
public final class e implements ja.a {
    public static final a e = new a(0);
    public static final b f13568f = new ia.f() {
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
    public static final d f13569n = new Object();
    public final HashMap f13570a;
    public final HashMap f13571b;
    public final a f13572c;
    public boolean d;

    public e() {
        HashMap hashMap = new HashMap();
        this.f13570a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f13571b = hashMap2;
        this.f13572c = e;
        this.d = false;
        hashMap2.put(String.class, f13568f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f13569n);
        hashMap.remove(Date.class);
    }

    @Override
    public final ja.a m(Class cls, ia.d dVar) {
        this.f13570a.put(cls, dVar);
        this.f13571b.remove(cls);
        return this;
    }
}
