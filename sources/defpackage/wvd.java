package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
public final class wvd {
    public static final wvd c = new wvd();
    public final lqd a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public wvd() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        lqd lqdVar = null;
        for (int i = 0; i <= 0; i++) {
            try {
                lqdVar = (lqd) Class.forName(strArr[0]).getConstructor(null).newInstance(null);
            } catch (Throwable unused) {
                lqdVar = null;
            }
            if (lqdVar != null) {
                break;
            }
        }
        this.a = lqdVar == null ? new lqd() : lqdVar;
    }

    public final ywd a(Class cls) {
        boolean z;
        rud rudVar;
        wod wodVar;
        m0e m0eVar;
        khd khdVar;
        bsd bsdVar;
        ywd n;
        Class cls2;
        Charset charset = gld.a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            ywd ywdVar = (ywd) concurrentHashMap.get(cls);
            if (ywdVar == null) {
                lqd lqdVar = this.a;
                lqdVar.getClass();
                Class cls3 = jxd.a;
                if (!xkd.class.isAssignableFrom(cls) && (cls2 = jxd.a) != null && !cls2.isAssignableFrom(cls)) {
                    u36.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                    return null;
                }
                iwd zzb = lqdVar.a.zzb(cls);
                if ((zzb.b.d & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (xkd.class.isAssignableFrom(cls)) {
                        n = new aud(jxd.d, uhd.a, zzb.a);
                    } else {
                        m0e m0eVar2 = jxd.b;
                        khd khdVar2 = uhd.b;
                        if (khdVar2 != null) {
                            n = new aud(m0eVar2, khdVar2, zzb.a);
                        } else {
                            dq9.m("Protobuf runtime is not correctly loaded.");
                            return null;
                        }
                    }
                } else {
                    if (xkd.class.isAssignableFrom(cls)) {
                        int i = zzb.b.d & 1;
                        rudVar = yud.b;
                        if (i == 1) {
                            wodVar = wod.b;
                            m0eVar = jxd.d;
                            khdVar = uhd.a;
                        } else {
                            wodVar = wod.b;
                            m0eVar = jxd.d;
                            khdVar = null;
                        }
                        bsdVar = hsd.b;
                    } else {
                        if ((zzb.b.d & 1) == 1) {
                            rudVar = yud.a;
                            wodVar = wod.a;
                            m0eVar = jxd.b;
                            khdVar = uhd.b;
                            if (khdVar == null) {
                                dq9.m("Protobuf runtime is not correctly loaded.");
                                return null;
                            }
                        } else {
                            rudVar = yud.a;
                            wodVar = wod.a;
                            m0eVar = jxd.c;
                            khdVar = null;
                        }
                        bsdVar = hsd.a;
                    }
                    n = ptd.n(zzb, rudVar, wodVar, m0eVar, khdVar, bsdVar);
                }
                ywd ywdVar2 = (ywd) concurrentHashMap.putIfAbsent(cls, n);
                if (ywdVar2 != null) {
                    return ywdVar2;
                }
                return n;
            }
            return ywdVar;
        }
        gxc.d("messageType");
        return null;
    }
}
