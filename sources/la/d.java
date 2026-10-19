package la;

import ja.g;
import java.util.Date;
import java.util.HashMap;
public final class d implements ka.a {
    public static final a e = new a(0);
    public static final b f15985f = new ja.f() {
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
    public static final b f15986g = new ja.f() {
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
    public final HashMap f15987a;
    public final HashMap f15988b;
    public final a f15989c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f15987a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f15988b = hashMap2;
        this.f15989c = e;
        this.d = false;
        hashMap2.put(String.class, f15985f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f15986g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    @Override
    public final ka.a a(Class cls, ja.d dVar) {
        this.f15987a.put(cls, dVar);
        this.f15988b.remove(cls);
        return this;
    }
}
