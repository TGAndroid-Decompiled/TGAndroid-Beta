package ka;

import ia.g;
import java.util.Date;
import java.util.HashMap;
public final class d implements ja.a {
    public static final a e = new a(0);
    public static final b f12410f = new ia.f() {
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
    public static final c f12411n = new Object();
    public final HashMap f12412a;
    public final HashMap f12413b;
    public final a f12414c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f12412a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f12413b = hashMap2;
        this.f12414c = e;
        this.d = false;
        hashMap2.put(String.class, f12410f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f12411n);
        hashMap.remove(Date.class);
    }

    @Override
    public final ja.a m(Class cls, ia.d dVar) {
        this.f12412a.put(cls, dVar);
        this.f12413b.remove(cls);
        return this;
    }
}
