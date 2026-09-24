package ka;

import java.util.Date;
import java.util.HashMap;
public final class e implements ja.a {
    public static final a e = new a(0);
    public static final b f13554f = new ia.f() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((ia.g) obj2).b((String) obj);
                    return;
                default:
                    ((ia.g) obj2).d(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final b f13555g = new ia.f() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((ia.g) obj2).b((String) obj);
                    return;
                default:
                    ((ia.g) obj2).d(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final d h = new Object();
    public final HashMap f13556a;
    public final HashMap f13557b;
    public final a f13558c;
    public boolean d;

    public e() {
        HashMap hashMap = new HashMap();
        this.f13556a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f13557b = hashMap2;
        this.f13558c = e;
        this.d = false;
        hashMap2.put(String.class, f13554f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f13555g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    @Override
    public final ja.a a(Class cls, ia.d dVar) {
        this.f13556a.put(cls, dVar);
        this.f13557b.remove(cls);
        return this;
    }
}
