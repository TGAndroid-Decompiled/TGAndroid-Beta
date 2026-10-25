package ma;

import java.util.Date;
import java.util.HashMap;
import ka.g;
public final class d implements la.a {
    public static final a e = new a(0);
    public static final b f18398f = new ka.f() {
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
    public static final c f18399n = new Object();
    public final HashMap f18400a;
    public final HashMap f18401b;
    public final a f18402c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f18400a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f18401b = hashMap2;
        this.f18402c = e;
        this.d = false;
        hashMap2.put(String.class, f18398f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f18399n);
        hashMap.remove(Date.class);
    }

    @Override
    public final la.a d(Class cls, ka.d dVar) {
        this.f18400a.put(cls, dVar);
        this.f18401b.remove(cls);
        return this;
    }
}
