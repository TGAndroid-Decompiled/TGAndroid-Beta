package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
public final class l4f extends vef {
    private static final l4f zzb;
    private int zzd;
    private h6f zze;
    private long zzf;
    private int zzg;
    private dff zzh;
    private dff zzi;
    private dff zzj;
    private dff zzk;

    static {
        l4f l4fVar = new l4f();
        zzb = l4fVar;
        vef.e(l4f.class, l4fVar);
    }

    public l4f() {
        rgf rgfVar = rgf.d;
        this.zzh = rgfVar;
        this.zzi = rgfVar;
        this.zzj = rgfVar;
        this.zzk = rgfVar;
    }

    public static j4f l() {
        return (j4f) zzb.j();
    }

    public static void m(l4f l4fVar, h6f h6fVar) {
        l4fVar.zze = h6fVar;
        l4fVar.zzd |= 1;
    }

    public static void n(l4f l4fVar, long j) {
        l4fVar.zzd |= 2;
        l4fVar.zzf = j;
    }

    public static void o(l4f l4fVar, ArrayList arrayList) {
        dff dffVar = l4fVar.zzh;
        if (!((ldf) dffVar).a) {
            dffVar = vef.b(dffVar);
            l4fVar.zzh = dffVar;
        }
        Charset charset = eff.a;
        if (dffVar instanceof ArrayList) {
            ((ArrayList) dffVar).ensureCapacity(arrayList.size() + dffVar.size());
        }
        int size = dffVar.size();
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            if (obj == null) {
                String n = tb4.n(dffVar.size() - size, "Element at index ", " is null.");
                int size3 = dffVar.size();
                while (true) {
                    size3--;
                    if (size3 >= size) {
                        dffVar.remove(size3);
                    } else {
                        fvc.f(n);
                        return;
                    }
                }
            } else {
                dffVar.add(obj);
            }
        }
    }

    public static void p(l4f l4fVar, ArrayList arrayList) {
        dff dffVar = l4fVar.zzi;
        if (!((ldf) dffVar).a) {
            dffVar = vef.b(dffVar);
            l4fVar.zzi = dffVar;
        }
        Charset charset = eff.a;
        if (dffVar instanceof ArrayList) {
            ((ArrayList) dffVar).ensureCapacity(arrayList.size() + dffVar.size());
        }
        int size = dffVar.size();
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            if (obj == null) {
                String n = tb4.n(dffVar.size() - size, "Element at index ", " is null.");
                int size3 = dffVar.size();
                while (true) {
                    size3--;
                    if (size3 >= size) {
                        dffVar.remove(size3);
                    } else {
                        fvc.f(n);
                        return;
                    }
                }
            } else {
                dffVar.add(obj);
            }
        }
    }

    public static void q(l4f l4fVar, ArrayList arrayList) {
        dff dffVar = l4fVar.zzj;
        if (!((ldf) dffVar).a) {
            dffVar = vef.b(dffVar);
            l4fVar.zzj = dffVar;
        }
        Charset charset = eff.a;
        if (dffVar instanceof ArrayList) {
            ((ArrayList) dffVar).ensureCapacity(arrayList.size() + dffVar.size());
        }
        int size = dffVar.size();
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            if (obj == null) {
                String n = tb4.n(dffVar.size() - size, "Element at index ", " is null.");
                int size3 = dffVar.size();
                while (true) {
                    size3--;
                    if (size3 >= size) {
                        dffVar.remove(size3);
                    } else {
                        fvc.f(n);
                        return;
                    }
                }
            } else {
                dffVar.add(obj);
            }
        }
    }

    public static void r(l4f l4fVar, ArrayList arrayList) {
        dff dffVar = l4fVar.zzk;
        if (!((ldf) dffVar).a) {
            dffVar = vef.b(dffVar);
            l4fVar.zzk = dffVar;
        }
        Charset charset = eff.a;
        if (dffVar instanceof ArrayList) {
            ((ArrayList) dffVar).ensureCapacity(arrayList.size() + dffVar.size());
        }
        int size = dffVar.size();
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            if (obj == null) {
                String n = tb4.n(dffVar.size() - size, "Element at index ", " is null.");
                int size3 = dffVar.size();
                while (true) {
                    size3--;
                    if (size3 >= size) {
                        dffVar.remove(size3);
                    } else {
                        fvc.f(n);
                        return;
                    }
                }
            } else {
                dffVar.add(obj);
            }
        }
    }

    @Override
    public final Object h(int i, vef vefVar) {
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
                    return new uef(zzb);
                }
                return new l4f();
            }
            return new sgf(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", i2f.y, "zzh", h4f.class, "zzi", d4f.class, "zzj", u4f.class, "zzk", p4f.class});
        }
        return (byte) 1;
    }
}
