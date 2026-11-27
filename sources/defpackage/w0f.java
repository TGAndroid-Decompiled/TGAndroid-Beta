package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
public final class w0f {
    public static final w0f c = new w0f();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ri6 a = new ri6((byte) 1);

    public final o1f a(Class cls) {
        boolean z;
        o1f l;
        Class cls2;
        Charset charset = xse.a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            o1f o1fVar = (o1f) concurrentHashMap.get(cls);
            if (o1fVar == null) {
                Class cls3 = w1f.a;
                if (!ese.class.isAssignableFrom(cls) && (cls2 = w1f.a) != null && !cls2.isAssignableFrom(cls)) {
                    lq5.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                    return null;
                }
                j1f zzb = ((mxe) this.a.b).zzb(cls);
                if ((zzb.d & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (ese.class.isAssignableFrom(cls)) {
                        l = new pze(w1f.d, wpe.a, zzb.a);
                    } else {
                        d4f d4fVar = w1f.b;
                        npe npeVar = wpe.b;
                        if (npeVar != null) {
                            l = new pze(d4fVar, npeVar, zzb.a);
                        } else {
                            grb.i("Protobuf runtime is not correctly loaded.");
                            return null;
                        }
                    }
                } else if (ese.class.isAssignableFrom(cls)) {
                    if ((zzb.d & 1) == 1) {
                        l = hze.l(zzb, g0f.b, qve.b, w1f.d, wpe.a, lye.b);
                    } else {
                        l = hze.l(zzb, g0f.b, qve.b, w1f.d, null, lye.b);
                    }
                } else if ((zzb.d & 1) == 1) {
                    k0f k0fVar = g0f.a;
                    awe aweVar = qve.a;
                    d4f d4fVar2 = w1f.b;
                    npe npeVar2 = wpe.b;
                    if (npeVar2 != null) {
                        l = hze.l(zzb, k0fVar, aweVar, d4fVar2, npeVar2, lye.a);
                    } else {
                        grb.i("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    l = hze.l(zzb, g0f.a, qve.a, w1f.c, null, lye.a);
                }
                o1f o1fVar2 = (o1f) concurrentHashMap.putIfAbsent(cls, l);
                if (o1fVar2 != null) {
                    return o1fVar2;
                }
                return l;
            }
            return o1fVar;
        }
        p3d.h("messageType");
        return null;
    }
}
