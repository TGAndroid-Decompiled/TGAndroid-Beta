package defpackage;

import java.util.Date;
import java.util.HashMap;
public final class vw5 implements m34 {
    public static final sw5 e = new sw5((byte) 0);
    public static final tw5 f = new ycc() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((zcc) obj2).b((String) obj);
                    return;
                default:
                    ((zcc) obj2).c(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final tw5 h = new ycc() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((zcc) obj2).b((String) obj);
                    return;
                default:
                    ((zcc) obj2).c(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final uw5 n = new Object();
    public final HashMap a;
    public final HashMap b;
    public final sw5 c;
    public boolean d;

    public vw5() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, n);
        hashMap.remove(Date.class);
    }

    @Override
    public final m34 a(Class cls, zq7 zq7Var) {
        this.a.put(cls, zq7Var);
        this.b.remove(cls);
        return this;
    }
}
