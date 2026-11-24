package defpackage;

import java.util.Date;
import java.util.HashMap;
public final class qu5 implements r24 {
    public static final nu5 e = new nu5((byte) 0);
    public static final ou5 f = new y8c() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((z8c) obj2).b((String) obj);
                    return;
                default:
                    ((z8c) obj2).c(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final ou5 h = new y8c() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((z8c) obj2).b((String) obj);
                    return;
                default:
                    ((z8c) obj2).c(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final pu5 n = new Object();
    public final HashMap a;
    public final HashMap b;
    public final nu5 c;
    public boolean d;

    public qu5() {
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
    public final r24 a(Class cls, zn7 zn7Var) {
        this.a.put(cls, zn7Var);
        this.b.remove(cls);
        return this;
    }
}
