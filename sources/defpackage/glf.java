package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
public final class glf {
    public static final glf c = new glf();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final z8d a = new z8d((byte) 2);

    public final jlf a(Class cls) {
        boolean z;
        jlf j;
        Class cls2;
        Charset charset = ujf.a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            jlf jlfVar = (jlf) concurrentHashMap.get(cls);
            if (jlfVar == null) {
                Class cls3 = klf.a;
                if (!ljf.class.isAssignableFrom(cls) && (cls2 = klf.a) != null && !cls2.isAssignableFrom(cls)) {
                    lq5.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                    return null;
                }
                ilf zzb = ((qkf) this.a.b).zzb(cls);
                if ((zzb.d & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (ljf.class.isAssignableFrom(cls)) {
                        j = new clf(klf.c, fjf.a, zzb.a);
                    } else {
                        tlf tlfVar = klf.b;
                        ejf ejfVar = fjf.b;
                        if (ejfVar != null) {
                            j = new clf(tlfVar, ejfVar, zzb.a);
                        } else {
                            grb.i("Protobuf runtime is not correctly loaded.");
                            return null;
                        }
                    }
                } else if (ljf.class.isAssignableFrom(cls)) {
                    if (zzb.a() - 1 != 1) {
                        int i = elf.a;
                        mkf mkfVar = okf.b;
                        tlf tlfVar2 = klf.c;
                        ejf ejfVar2 = fjf.a;
                        int i2 = skf.a;
                        j = blf.j(zzb, mkfVar, tlfVar2, ejfVar2);
                    } else {
                        int i3 = elf.a;
                        mkf mkfVar2 = okf.b;
                        tlf tlfVar3 = klf.c;
                        int i4 = skf.a;
                        j = blf.j(zzb, mkfVar2, tlfVar3, null);
                    }
                } else if (zzb.a() - 1 != 1) {
                    int i5 = elf.a;
                    kkf kkfVar = okf.a;
                    tlf tlfVar4 = klf.b;
                    ejf ejfVar3 = fjf.b;
                    if (ejfVar3 != null) {
                        int i6 = skf.a;
                        j = blf.j(zzb, kkfVar, tlfVar4, ejfVar3);
                    } else {
                        grb.i("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                } else {
                    int i7 = elf.a;
                    kkf kkfVar2 = okf.a;
                    tlf tlfVar5 = klf.b;
                    int i8 = skf.a;
                    j = blf.j(zzb, kkfVar2, tlfVar5, null);
                }
                jlf jlfVar2 = (jlf) concurrentHashMap.putIfAbsent(cls, j);
                if (jlfVar2 == null) {
                    return j;
                }
                return jlfVar2;
            }
            return jlfVar;
        }
        p3d.h("messageType");
        return null;
    }
}
