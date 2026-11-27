package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
public final class c9f extends ljf {
    private static final c9f zzb;
    private int zzd;
    private yaf zze;
    private long zzf;
    private int zzg;
    private tjf zzh;
    private tjf zzi;
    private tjf zzj;
    private tjf zzk;

    static {
        c9f c9fVar = new c9f();
        zzb = c9fVar;
        ljf.e(c9f.class, c9fVar);
    }

    public c9f() {
        hlf hlfVar = hlf.d;
        this.zzh = hlfVar;
        this.zzi = hlfVar;
        this.zzj = hlfVar;
        this.zzk = hlfVar;
    }

    public static a9f l() {
        return (a9f) zzb.j();
    }

    public static void m(c9f c9fVar, yaf yafVar) {
        c9fVar.zze = yafVar;
        c9fVar.zzd |= 1;
    }

    public static void n(c9f c9fVar, long j) {
        c9fVar.zzd |= 2;
        c9fVar.zzf = j;
    }

    public static void o(c9f c9fVar, ArrayList arrayList) {
        tjf tjfVar = c9fVar.zzh;
        if (!((bif) tjfVar).a) {
            tjfVar = ljf.b(tjfVar);
            c9fVar.zzh = tjfVar;
        }
        Charset charset = ujf.a;
        if (tjfVar instanceof ArrayList) {
            ((ArrayList) tjfVar).ensureCapacity(arrayList.size() + tjfVar.size());
        }
        int size = tjfVar.size();
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            if (obj == null) {
                String n = qd4.n(tjfVar.size() - size, "Element at index ", " is null.");
                int size3 = tjfVar.size();
                while (true) {
                    size3--;
                    if (size3 >= size) {
                        tjfVar.remove(size3);
                    } else {
                        p3d.h(n);
                        return;
                    }
                }
            } else {
                tjfVar.add(obj);
            }
        }
    }

    public static void p(c9f c9fVar, ArrayList arrayList) {
        tjf tjfVar = c9fVar.zzi;
        if (!((bif) tjfVar).a) {
            tjfVar = ljf.b(tjfVar);
            c9fVar.zzi = tjfVar;
        }
        Charset charset = ujf.a;
        if (tjfVar instanceof ArrayList) {
            ((ArrayList) tjfVar).ensureCapacity(arrayList.size() + tjfVar.size());
        }
        int size = tjfVar.size();
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            if (obj == null) {
                String n = qd4.n(tjfVar.size() - size, "Element at index ", " is null.");
                int size3 = tjfVar.size();
                while (true) {
                    size3--;
                    if (size3 >= size) {
                        tjfVar.remove(size3);
                    } else {
                        p3d.h(n);
                        return;
                    }
                }
            } else {
                tjfVar.add(obj);
            }
        }
    }

    public static void q(c9f c9fVar, ArrayList arrayList) {
        tjf tjfVar = c9fVar.zzj;
        if (!((bif) tjfVar).a) {
            tjfVar = ljf.b(tjfVar);
            c9fVar.zzj = tjfVar;
        }
        Charset charset = ujf.a;
        if (tjfVar instanceof ArrayList) {
            ((ArrayList) tjfVar).ensureCapacity(arrayList.size() + tjfVar.size());
        }
        int size = tjfVar.size();
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            if (obj == null) {
                String n = qd4.n(tjfVar.size() - size, "Element at index ", " is null.");
                int size3 = tjfVar.size();
                while (true) {
                    size3--;
                    if (size3 >= size) {
                        tjfVar.remove(size3);
                    } else {
                        p3d.h(n);
                        return;
                    }
                }
            } else {
                tjfVar.add(obj);
            }
        }
    }

    public static void r(c9f c9fVar, ArrayList arrayList) {
        tjf tjfVar = c9fVar.zzk;
        if (!((bif) tjfVar).a) {
            tjfVar = ljf.b(tjfVar);
            c9fVar.zzk = tjfVar;
        }
        Charset charset = ujf.a;
        if (tjfVar instanceof ArrayList) {
            ((ArrayList) tjfVar).ensureCapacity(arrayList.size() + tjfVar.size());
        }
        int size = tjfVar.size();
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            if (obj == null) {
                String n = qd4.n(tjfVar.size() - size, "Element at index ", " is null.");
                int size3 = tjfVar.size();
                while (true) {
                    size3--;
                    if (size3 >= size) {
                        tjfVar.remove(size3);
                    } else {
                        p3d.h(n);
                        return;
                    }
                }
            } else {
                tjfVar.add(obj);
            }
        }
    }

    @Override
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new kjf(zzb);
                }
                return new c9f();
            }
            return new ilf(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", z6f.y, "zzh", y8f.class, "zzi", u8f.class, "zzj", l9f.class, "zzk", g9f.class});
        }
        return (byte) 1;
    }
}
