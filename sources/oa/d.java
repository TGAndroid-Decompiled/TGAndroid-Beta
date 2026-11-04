package oa;

import java.util.Date;
import java.util.HashMap;
import ma.g;
public final class d implements na.a {
    public static final a f20944e = new a(0);
    public static final b f20945f = new ma.f() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).d((String) obj);
                    return;
                default:
                    ((g) obj2).g(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final b h = new ma.f() {
        @Override
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).d((String) obj);
                    return;
                default:
                    ((g) obj2).g(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final c f20946n = new Object();
    public final HashMap f20947a;
    public final HashMap f20948b;
    public final a f20949c;
    public boolean d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f20947a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f20948b = hashMap2;
        this.f20949c = f20944e;
        this.d = false;
        hashMap2.put(String.class, f20945f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f20946n);
        hashMap.remove(Date.class);
    }

    @Override
    public final na.a c(Class cls, ma.d dVar) {
        this.f20947a.put(cls, dVar);
        this.f20948b.remove(cls);
        return this;
    }
}
