package defpackage;

import java.util.Date;
import java.util.HashMap;
public final class qw5 implements c44 {
    public static final nw5 e = new nw5((byte) 0);
    public static final ow5 f = new zac() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((abc) obj2).b((String) obj);
                    return;
                default:
                    ((abc) obj2).c(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final ow5 h = new zac() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((abc) obj2).b((String) obj);
                    return;
                default:
                    ((abc) obj2).c(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final pw5 n = new Object();
    public final HashMap a;
    public final HashMap b;
    public final nw5 c;
    public boolean d;

    public qw5() {
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
    public final c44 a(Class cls, cq7 cq7Var) {
        this.a.put(cls, cq7Var);
        this.b.remove(cls);
        return this;
    }
}
