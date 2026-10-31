package la;

import ja.g;
import java.util.Date;
import java.util.HashMap;
public final class d implements ka.a {
    public static final a e = new a(0);
    public static final b f11725f = new ja.f() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).b((String) obj);
                    return;
                default:
                    ((g) obj2).c(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final b h = new ja.f() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).b((String) obj);
                    return;
                default:
                    ((g) obj2).c(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final c f11726n = new Object();
    public final HashMap f11727a;
    public final HashMap f11728b;
    public final a f11729c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f11727a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f11728b = hashMap2;
        this.f11729c = e;
        this.d = false;
        hashMap2.put(String.class, f11725f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f11726n);
        hashMap.remove(Date.class);
    }

    @Override
    public final ka.a e(Class cls, ja.d dVar) {
        this.f11727a.put(cls, dVar);
        this.f11728b.remove(cls);
        return this;
    }
}
