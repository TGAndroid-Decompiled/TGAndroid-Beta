package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
public final class ow8 {
    public static final ow8 c = new ow8();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final z8d a = new z8d((byte) 1);

    public final fu9 a(Class cls) {
        boolean z;
        w74 w74Var;
        fu9 w;
        Class cls2;
        pr5.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        fu9 fu9Var = (fu9) concurrentHashMap.get(cls);
        if (fu9Var == null) {
            Class cls3 = iu9.a;
            w74 w74Var2 = null;
            if (!ju4.class.isAssignableFrom(cls) && (cls2 = iu9.a) != null && !cls2.isAssignableFrom(cls)) {
                lq5.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
            v29 a = ((dk6) this.a.b).a(cls);
            if ((a.d & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (ju4.class.isAssignableFrom(cls)) {
                    w = new r67(iu9.c, x74.a, a.a);
                } else {
                    t9c t9cVar = iu9.b;
                    w74 w74Var3 = x74.b;
                    if (w74Var3 != null) {
                        w = new r67(t9cVar, w74Var3, a.a);
                    } else {
                        grb.i("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                }
            } else if (ju4.class.isAssignableFrom(cls)) {
                tl7 tl7Var = ul7.b;
                h76 h76Var = i76.b;
                t9c t9cVar2 = iu9.c;
                if (ik8.F(a.a()) != 1) {
                    w74Var2 = x74.a;
                }
                w = v57.w(a, tl7Var, h76Var, t9cVar2, w74Var2, ik6.b);
            } else {
                tl7 tl7Var2 = ul7.a;
                h76 h76Var2 = i76.a;
                t9c t9cVar3 = iu9.b;
                if (ik8.F(a.a()) != 1) {
                    w74 w74Var4 = x74.b;
                    if (w74Var4 != null) {
                        w74Var = w74Var4;
                    } else {
                        grb.i("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    w74Var = null;
                }
                w = v57.w(a, tl7Var2, h76Var2, t9cVar3, w74Var, ik6.a);
            }
            fu9 fu9Var2 = (fu9) concurrentHashMap.putIfAbsent(cls, w);
            if (fu9Var2 != null) {
                return fu9Var2;
            }
            return w;
        }
        return fu9Var;
    }
}
