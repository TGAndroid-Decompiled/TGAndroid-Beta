package la;

import ja.g;
import java.util.Date;
import java.util.HashMap;
public final class d implements ka.a {
    public static final a e = new a(0);
    public static final b f11726f = new ja.f() {
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
    public static final c f11727n = new Object();
    public final HashMap f11728a;
    public final HashMap f11729b;
    public final a f11730c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f11728a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f11729b = hashMap2;
        this.f11730c = e;
        this.d = false;
        hashMap2.put(String.class, f11726f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f11727n);
        hashMap.remove(Date.class);
    }

    @Override
    public final ka.a e(Class cls, ja.d dVar) {
        this.f11728a.put(cls, dVar);
        this.f11729b.remove(cls);
        return this;
    }
}
