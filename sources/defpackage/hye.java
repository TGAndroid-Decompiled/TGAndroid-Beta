package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
public final class hye {
    public static final hye c = new hye();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ni6 a = new ni6((byte) 1);

    public final zye a(Class cls) {
        boolean z;
        zye l;
        Class cls2;
        Charset charset = iqe.a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            zye zyeVar = (zye) concurrentHashMap.get(cls);
            if (zyeVar == null) {
                Class cls3 = hze.a;
                if (!qpe.class.isAssignableFrom(cls) && (cls2 = hze.a) != null && !cls2.isAssignableFrom(cls)) {
                    u36.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                    return null;
                }
                uye zzb = ((yue) this.a.b).zzb(cls);
                if ((zzb.d & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (qpe.class.isAssignableFrom(cls)) {
                        l = new axe(hze.d, hne.a, zzb.a);
                    } else {
                        o1f o1fVar = hze.b;
                        yme ymeVar = hne.b;
                        if (ymeVar != null) {
                            l = new axe(o1fVar, ymeVar, zzb.a);
                        } else {
                            dq9.m("Protobuf runtime is not correctly loaded.");
                            return null;
                        }
                    }
                } else if (qpe.class.isAssignableFrom(cls)) {
                    if ((zzb.d & 1) == 1) {
                        l = swe.l(zzb, rxe.b, cte.b, hze.d, hne.a, xve.b);
                    } else {
                        l = swe.l(zzb, rxe.b, cte.b, hze.d, null, xve.b);
                    }
                } else if ((zzb.d & 1) == 1) {
                    vxe vxeVar = rxe.a;
                    mte mteVar = cte.a;
                    o1f o1fVar2 = hze.b;
                    yme ymeVar2 = hne.b;
                    if (ymeVar2 != null) {
                        l = swe.l(zzb, vxeVar, mteVar, o1fVar2, ymeVar2, xve.a);
                    } else {
                        dq9.m("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    l = swe.l(zzb, rxe.a, cte.a, hze.c, null, xve.a);
                }
                zye zyeVar2 = (zye) concurrentHashMap.putIfAbsent(cls, l);
                if (zyeVar2 != null) {
                    return zyeVar2;
                }
                return l;
            }
            return zyeVar;
        }
        gxc.d("messageType");
        return null;
    }
}
