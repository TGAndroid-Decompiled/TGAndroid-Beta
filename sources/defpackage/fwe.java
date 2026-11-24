package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
public final class fwe {
    public static final fwe c = new fwe();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final l69 a = new l69((byte) 2);

    public final xwe a(Class cls) {
        boolean z;
        xwe l;
        Class cls2;
        Charset charset = foe.a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            xwe xweVar = (xwe) concurrentHashMap.get(cls);
            if (xweVar == null) {
                Class cls3 = fxe.a;
                if (!nne.class.isAssignableFrom(cls) && (cls2 = fxe.a) != null && !cls2.isAssignableFrom(cls)) {
                    w26.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                    return null;
                }
                swe zzb = ((vse) this.a.b).zzb(cls);
                if ((zzb.d & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (nne.class.isAssignableFrom(cls)) {
                        l = new yue(fxe.d, fle.a, zzb.a);
                    } else {
                        mze mzeVar = fxe.b;
                        wke wkeVar = fle.b;
                        if (wkeVar != null) {
                            l = new yue(mzeVar, wkeVar, zzb.a);
                        } else {
                            sc8.j("Protobuf runtime is not correctly loaded.");
                            return null;
                        }
                    }
                } else if (nne.class.isAssignableFrom(cls)) {
                    if ((zzb.d & 1) == 1) {
                        l = que.l(zzb, pve.b, zqe.b, fxe.d, fle.a, ute.b);
                    } else {
                        l = que.l(zzb, pve.b, zqe.b, fxe.d, null, ute.b);
                    }
                } else if ((zzb.d & 1) == 1) {
                    tve tveVar = pve.a;
                    jre jreVar = zqe.a;
                    mze mzeVar2 = fxe.b;
                    wke wkeVar2 = fle.b;
                    if (wkeVar2 != null) {
                        l = que.l(zzb, tveVar, jreVar, mzeVar2, wkeVar2, ute.a);
                    } else {
                        sc8.j("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    l = que.l(zzb, pve.a, zqe.a, fxe.c, null, ute.a);
                }
                xwe xweVar2 = (xwe) concurrentHashMap.putIfAbsent(cls, l);
                if (xweVar2 != null) {
                    return xweVar2;
                }
                return l;
            }
            return xweVar;
        }
        fvc.f("messageType");
        return null;
    }
}
