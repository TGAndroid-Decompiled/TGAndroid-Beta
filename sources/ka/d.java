package ka;

import ia.g;
import java.util.Date;
import java.util.HashMap;
public final class d implements ja.a {
    public static final a e = new a(0);
    public static final b f13566f = new ia.f() {
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
    public static final b h = new ia.f() {
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
    public static final c f13567n = new Object();
    public final HashMap f13568a;
    public final HashMap f13569b;
    public final a f13570c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f13568a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f13569b = hashMap2;
        this.f13570c = e;
        this.d = false;
        hashMap2.put(String.class, f13566f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f13567n);
        hashMap.remove(Date.class);
    }

    @Override
    public final ja.a m(Class cls, ia.d dVar) {
        this.f13568a.put(cls, dVar);
        this.f13569b.remove(cls);
        return this;
    }
}
