package ka;

import ia.g;
import java.util.Date;
import java.util.HashMap;
public final class d implements ja.a {
    public static final a f14903e = new a(0);
    public static final b f14904f = new ia.f() {
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
    public static final c f14905n = new Object();
    public final HashMap f14906a;
    public final HashMap f14907b;
    public final a f14908c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f14906a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f14907b = hashMap2;
        this.f14908c = f14903e;
        this.d = false;
        hashMap2.put(String.class, f14904f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f14905n);
        hashMap.remove(Date.class);
    }

    @Override
    public final ja.a j(Class cls, ia.d dVar) {
        this.f14906a.put(cls, dVar);
        this.f14907b.remove(cls);
        return this;
    }
}
