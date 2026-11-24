package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
public final class qgf {
    public static final qgf c = new qgf();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final i4d a = new i4d((byte) 2);

    public final tgf a(Class cls) {
        boolean z;
        tgf j;
        Class cls2;
        Charset charset = eff.a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            tgf tgfVar = (tgf) concurrentHashMap.get(cls);
            if (tgfVar == null) {
                Class cls3 = ugf.a;
                if (!vef.class.isAssignableFrom(cls) && (cls2 = ugf.a) != null && !cls2.isAssignableFrom(cls)) {
                    w26.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                    return null;
                }
                sgf zzb = ((agf) this.a.a).zzb(cls);
                if ((zzb.d & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (vef.class.isAssignableFrom(cls)) {
                        j = new mgf(ugf.c, pef.a, zzb.a);
                    } else {
                        dhf dhfVar = ugf.b;
                        oef oefVar = pef.b;
                        if (oefVar != null) {
                            j = new mgf(dhfVar, oefVar, zzb.a);
                        } else {
                            sc8.j("Protobuf runtime is not correctly loaded.");
                            return null;
                        }
                    }
                } else if (vef.class.isAssignableFrom(cls)) {
                    if (zzb.a() - 1 != 1) {
                        int i = ogf.a;
                        wff wffVar = yff.b;
                        dhf dhfVar2 = ugf.c;
                        oef oefVar2 = pef.a;
                        int i2 = cgf.a;
                        j = lgf.j(zzb, wffVar, dhfVar2, oefVar2);
                    } else {
                        int i3 = ogf.a;
                        wff wffVar2 = yff.b;
                        dhf dhfVar3 = ugf.c;
                        int i4 = cgf.a;
                        j = lgf.j(zzb, wffVar2, dhfVar3, null);
                    }
                } else if (zzb.a() - 1 != 1) {
                    int i5 = ogf.a;
                    uff uffVar = yff.a;
                    dhf dhfVar4 = ugf.b;
                    oef oefVar3 = pef.b;
                    if (oefVar3 != null) {
                        int i6 = cgf.a;
                        j = lgf.j(zzb, uffVar, dhfVar4, oefVar3);
                    } else {
                        sc8.j("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    int i7 = ogf.a;
                    uff uffVar2 = yff.a;
                    dhf dhfVar5 = ugf.b;
                    int i8 = cgf.a;
                    j = lgf.j(zzb, uffVar2, dhfVar5, null);
                }
                tgf tgfVar2 = (tgf) concurrentHashMap.putIfAbsent(cls, j);
                if (tgfVar2 == null) {
                    return j;
                }
                return tgfVar2;
            }
            return tgfVar;
        }
        fvc.f("messageType");
        return null;
    }
}
