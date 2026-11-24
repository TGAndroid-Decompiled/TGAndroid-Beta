package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
public final class ft8 {
    public static final ft8 c = new ft8();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final i4d a = new i4d((byte) 1);

    public final nq9 a(Class cls) {
        boolean z;
        c74 c74Var;
        nq9 w;
        Class cls2;
        mp5.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        nq9 nq9Var = (nq9) concurrentHashMap.get(cls);
        if (nq9Var == null) {
            Class cls3 = qq9.a;
            c74 c74Var2 = null;
            if (!fs4.class.isAssignableFrom(cls) && (cls2 = qq9.a) != null && !cls2.isAssignableFrom(cls)) {
                w26.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
            iz8 a = ((zh6) this.a.a).a(cls);
            if ((a.d & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (fs4.class.isAssignableFrom(cls)) {
                    w = new k47(qq9.c, d74.a, a.a);
                } else {
                    t5c t5cVar = qq9.b;
                    c74 c74Var3 = d74.b;
                    if (c74Var3 != null) {
                        w = new k47(t5cVar, c74Var3, a.a);
                    } else {
                        sc8.j("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                }
            } else if (fs4.class.isAssignableFrom(cls)) {
                kj7 kj7Var = lj7.b;
                d56 d56Var = e56.b;
                t5c t5cVar2 = qq9.c;
                if (ug8.F(a.a()) != 1) {
                    c74Var2 = d74.a;
                }
                w = o37.w(a, kj7Var, d56Var, t5cVar2, c74Var2, ei6.b);
            } else {
                kj7 kj7Var2 = lj7.a;
                d56 d56Var2 = e56.a;
                t5c t5cVar3 = qq9.b;
                if (ug8.F(a.a()) != 1) {
                    c74 c74Var4 = d74.b;
                    if (c74Var4 != null) {
                        c74Var = c74Var4;
                    } else {
                        sc8.j("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    c74Var = null;
                }
                w = o37.w(a, kj7Var2, d56Var2, t5cVar3, c74Var, ei6.a);
            }
            nq9 nq9Var2 = (nq9) concurrentHashMap.putIfAbsent(cls, w);
            if (nq9Var2 != null) {
                return nq9Var2;
            }
            return w;
        }
        return nq9Var;
    }
}
