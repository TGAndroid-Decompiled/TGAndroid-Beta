package ma;

import java.util.Date;
import java.util.HashMap;
import ka.g;
public final class d implements la.a {
    public static final a e = new a(0);
    public static final b f18397f = new ka.f() {
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
    public static final b h = new ka.f() {
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
    public static final c f18398n = new Object();
    public final HashMap f18399a;
    public final HashMap f18400b;
    public final a f18401c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f18399a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f18400b = hashMap2;
        this.f18401c = e;
        this.d = false;
        hashMap2.put(String.class, f18397f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f18398n);
        hashMap.remove(Date.class);
    }

    @Override
    public final la.a d(Class cls, ka.d dVar) {
        this.f18399a.put(cls, dVar);
        this.f18400b.remove(cls);
        return this;
    }
}
