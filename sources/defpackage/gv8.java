package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
public final class gv8 {
    public static final gv8 c = new gv8();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final k6d a = new k6d((byte) 1);

    public final os9 a(Class cls) {
        boolean z;
        l84 l84Var;
        os9 w;
        Class cls2;
        mr5.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        os9 os9Var = (os9) concurrentHashMap.get(cls);
        if (os9Var == null) {
            Class cls3 = rs9.a;
            l84 l84Var2 = null;
            if (!gu4.class.isAssignableFrom(cls) && (cls2 = rs9.a) != null && !cls2.isAssignableFrom(cls)) {
                u36.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
            j19 a = ((bk6) this.a.b).a(cls);
            if ((a.d & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (gu4.class.isAssignableFrom(cls)) {
                    w = new k67(rs9.c, m84.a, a.a);
                } else {
                    t7c t7cVar = rs9.b;
                    l84 l84Var3 = m84.b;
                    if (l84Var3 != null) {
                        w = new k67(t7cVar, l84Var3, a.a);
                    } else {
                        dq9.m("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                }
            } else if (gu4.class.isAssignableFrom(cls)) {
                nl7 nl7Var = ol7.b;
                d76 d76Var = e76.b;
                t7c t7cVar2 = rs9.c;
                if (wi8.F(a.a()) != 1) {
                    l84Var2 = m84.a;
                }
                w = o57.w(a, nl7Var, d76Var, t7cVar2, l84Var2, gk6.b);
            } else {
                nl7 nl7Var2 = ol7.a;
                d76 d76Var2 = e76.a;
                t7c t7cVar3 = rs9.b;
                if (wi8.F(a.a()) != 1) {
                    l84 l84Var4 = m84.b;
                    if (l84Var4 != null) {
                        l84Var = l84Var4;
                    } else {
                        dq9.m("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    l84Var = null;
                }
                w = o57.w(a, nl7Var2, d76Var2, t7cVar3, l84Var, gk6.a);
            }
            os9 os9Var2 = (os9) concurrentHashMap.putIfAbsent(cls, w);
            if (os9Var2 != null) {
                return os9Var2;
            }
            return w;
        }
        return os9Var;
    }
}
