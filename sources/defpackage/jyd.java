package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
public final class jyd {
    public static final jyd c = new jyd();
    public final ysd a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public jyd() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        ysd ysdVar = null;
        for (int i = 0; i <= 0; i++) {
            try {
                ysdVar = (ysd) Class.forName(strArr[0]).getConstructor(null).newInstance(null);
            } catch (Throwable unused) {
                ysdVar = null;
            }
            if (ysdVar != null) {
                break;
            }
        }
        this.a = ysdVar == null ? new ysd() : ysdVar;
    }

    public final lzd a(Class cls) {
        boolean z;
        exd exdVar;
        krd krdVar;
        z2e z2eVar;
        akd akdVar;
        oud oudVar;
        lzd n;
        Class cls2;
        Charset charset = vnd.a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            lzd lzdVar = (lzd) concurrentHashMap.get(cls);
            if (lzdVar == null) {
                ysd ysdVar = this.a;
                ysdVar.getClass();
                Class cls3 = wzd.a;
                if (!mnd.class.isAssignableFrom(cls) && (cls2 = wzd.a) != null && !cls2.isAssignableFrom(cls)) {
                    lq5.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                    return null;
                }
                vyd zzb = ysdVar.a.zzb(cls);
                if ((zzb.b.d & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (mnd.class.isAssignableFrom(cls)) {
                        n = new nwd(wzd.d, kkd.a, zzb.a);
                    } else {
                        z2e z2eVar2 = wzd.b;
                        akd akdVar2 = kkd.b;
                        if (akdVar2 != null) {
                            n = new nwd(z2eVar2, akdVar2, zzb.a);
                        } else {
                            grb.i("Protobuf runtime is not correctly loaded.");
                            return null;
                        }
                    }
                } else {
                    if (mnd.class.isAssignableFrom(cls)) {
                        int i = zzb.b.d & 1;
                        exdVar = lxd.b;
                        if (i == 1) {
                            krdVar = krd.b;
                            z2eVar = wzd.d;
                            akdVar = kkd.a;
                        } else {
                            krdVar = krd.b;
                            z2eVar = wzd.d;
                            akdVar = null;
                        }
                        oudVar = uud.b;
                    } else {
                        if ((zzb.b.d & 1) == 1) {
                            exdVar = lxd.a;
                            krdVar = krd.a;
                            z2eVar = wzd.b;
                            akdVar = kkd.b;
                            if (akdVar == null) {
                                grb.i("Protobuf runtime is not correctly loaded.");
                                return null;
                            }
                        } else {
                            exdVar = lxd.a;
                            krdVar = krd.a;
                            z2eVar = wzd.c;
                            akdVar = null;
                        }
                        oudVar = uud.a;
                    }
                    n = cwd.n(zzb, exdVar, krdVar, z2eVar, akdVar, oudVar);
                }
                lzd lzdVar2 = (lzd) concurrentHashMap.putIfAbsent(cls, n);
                if (lzdVar2 != null) {
                    return lzdVar2;
                }
                return n;
            }
            return lzdVar;
        }
        p3d.h("messageType");
        return null;
    }
}
