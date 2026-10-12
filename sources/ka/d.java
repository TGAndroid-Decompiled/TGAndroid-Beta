package ka;

import ia.g;
import java.util.Date;
import java.util.HashMap;
public final class d implements ja.a {
    public static final a f14764e = new a(0);
    public static final b f14765f = new ia.f() {
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
    public static final b f14766g = new ia.f() {
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
    public static final c h = new Object();
    public final HashMap f14767a;
    public final HashMap f14768b;
    public final a f14769c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f14767a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f14768b = hashMap2;
        this.f14769c = f14764e;
        this.d = false;
        hashMap2.put(String.class, f14765f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f14766g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    @Override
    public final ja.a a(Class cls, ia.d dVar) {
        this.f14767a.put(cls, dVar);
        this.f14768b.remove(cls);
        return this;
    }
}
