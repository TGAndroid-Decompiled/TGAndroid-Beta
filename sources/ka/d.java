package ka;

import ia.g;
import java.util.Date;
import java.util.HashMap;
public final class d implements ja.a {
    public static final a f14877e = new a(0);
    public static final b f14878f = new ia.f() {
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
    public static final c f14879n = new Object();
    public final HashMap f14880a;
    public final HashMap f14881b;
    public final a f14882c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f14880a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f14881b = hashMap2;
        this.f14882c = f14877e;
        this.d = false;
        hashMap2.put(String.class, f14878f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f14879n);
        hashMap.remove(Date.class);
    }

    @Override
    public final ja.a j(Class cls, ia.d dVar) {
        this.f14880a.put(cls, dVar);
        this.f14881b.remove(cls);
        return this;
    }
}
