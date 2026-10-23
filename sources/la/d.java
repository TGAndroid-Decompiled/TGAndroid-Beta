package la;

import ja.g;
import java.util.Date;
import java.util.HashMap;
public final class d implements ka.a {
    public static final a e = new a(0);
    public static final b f16048f = new ja.f() {
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
    public static final b f16049g = new ja.f() {
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
    public static final c h = new Object();
    public final HashMap f16050a;
    public final HashMap f16051b;
    public final a f16052c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f16050a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f16051b = hashMap2;
        this.f16052c = e;
        this.d = false;
        hashMap2.put(String.class, f16048f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f16049g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    @Override
    public final ka.a a(Class cls, ja.d dVar) {
        this.f16050a.put(cls, dVar);
        this.f16051b.remove(cls);
        return this;
    }
}
