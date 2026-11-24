package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
public final class rif {
    public static final rif c = new rif();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final k6d a = new k6d((byte) 2);

    public final uif a(Class cls) {
        boolean z;
        uif j;
        Class cls2;
        Charset charset = fhf.a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            uif uifVar = (uif) concurrentHashMap.get(cls);
            if (uifVar == null) {
                Class cls3 = vif.a;
                if (!wgf.class.isAssignableFrom(cls) && (cls2 = vif.a) != null && !cls2.isAssignableFrom(cls)) {
                    u36.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                    return null;
                }
                tif zzb = ((bif) this.a.b).zzb(cls);
                if ((zzb.d & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (wgf.class.isAssignableFrom(cls)) {
                        j = new nif(vif.c, qgf.a, zzb.a);
                    } else {
                        ejf ejfVar = vif.b;
                        pgf pgfVar = qgf.b;
                        if (pgfVar != null) {
                            j = new nif(ejfVar, pgfVar, zzb.a);
                        } else {
                            dq9.m("Protobuf runtime is not correctly loaded.");
                            return null;
                        }
                    }
                } else if (wgf.class.isAssignableFrom(cls)) {
                    if (zzb.a() - 1 != 1) {
                        int i = pif.a;
                        xhf xhfVar = zhf.b;
                        ejf ejfVar2 = vif.c;
                        pgf pgfVar2 = qgf.a;
                        int i2 = dif.a;
                        j = mif.j(zzb, xhfVar, ejfVar2, pgfVar2);
                    } else {
                        int i3 = pif.a;
                        xhf xhfVar2 = zhf.b;
                        ejf ejfVar3 = vif.c;
                        int i4 = dif.a;
                        j = mif.j(zzb, xhfVar2, ejfVar3, null);
                    }
                } else if (zzb.a() - 1 != 1) {
                    int i5 = pif.a;
                    vhf vhfVar = zhf.a;
                    ejf ejfVar4 = vif.b;
                    pgf pgfVar3 = qgf.b;
                    if (pgfVar3 != null) {
                        int i6 = dif.a;
                        j = mif.j(zzb, vhfVar, ejfVar4, pgfVar3);
                    } else {
                        dq9.m("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    int i7 = pif.a;
                    vhf vhfVar2 = zhf.a;
                    ejf ejfVar5 = vif.b;
                    int i8 = dif.a;
                    j = mif.j(zzb, vhfVar2, ejfVar5, null);
                }
                uif uifVar2 = (uif) concurrentHashMap.putIfAbsent(cls, j);
                if (uifVar2 == null) {
                    return j;
                }
                return uifVar2;
            }
            return uifVar;
        }
        gxc.d("messageType");
        return null;
    }
}
