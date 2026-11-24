package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
public final class n6f extends wgf {
    private static final n6f zzb;
    private int zzd;
    private j8f zze;
    private long zzf;
    private int zzg;
    private ehf zzh;
    private ehf zzi;
    private ehf zzj;
    private ehf zzk;

    static {
        n6f n6fVar = new n6f();
        zzb = n6fVar;
        wgf.e(n6f.class, n6fVar);
    }

    public n6f() {
        sif sifVar = sif.d;
        this.zzh = sifVar;
        this.zzi = sifVar;
        this.zzj = sifVar;
        this.zzk = sifVar;
    }

    public static l6f l() {
        return (l6f) zzb.j();
    }

    public static void m(n6f n6fVar, j8f j8fVar) {
        n6fVar.zze = j8fVar;
        n6fVar.zzd |= 1;
    }

    public static void n(n6f n6fVar, long j) {
        n6fVar.zzd |= 2;
        n6fVar.zzf = j;
    }

    public static void o(n6f n6fVar, ArrayList arrayList) {
        ehf ehfVar = n6fVar.zzh;
        if (!((mff) ehfVar).a) {
            ehfVar = wgf.b(ehfVar);
            n6fVar.zzh = ehfVar;
        }
        Charset charset = fhf.a;
        if (ehfVar instanceof ArrayList) {
            ((ArrayList) ehfVar).ensureCapacity(arrayList.size() + ehfVar.size());
        }
        int size = ehfVar.size();
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            if (obj == null) {
                String o = td4.o(ehfVar.size() - size, "Element at index ", " is null.");
                int size3 = ehfVar.size();
                while (true) {
                    size3--;
                    if (size3 >= size) {
                        ehfVar.remove(size3);
                    } else {
                        gxc.d(o);
                        return;
                    }
                }
            } else {
                ehfVar.add(obj);
            }
        }
    }

    public static void p(n6f n6fVar, ArrayList arrayList) {
        ehf ehfVar = n6fVar.zzi;
        if (!((mff) ehfVar).a) {
            ehfVar = wgf.b(ehfVar);
            n6fVar.zzi = ehfVar;
        }
        Charset charset = fhf.a;
        if (ehfVar instanceof ArrayList) {
            ((ArrayList) ehfVar).ensureCapacity(arrayList.size() + ehfVar.size());
        }
        int size = ehfVar.size();
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            if (obj == null) {
                String o = td4.o(ehfVar.size() - size, "Element at index ", " is null.");
                int size3 = ehfVar.size();
                while (true) {
                    size3--;
                    if (size3 >= size) {
                        ehfVar.remove(size3);
                    } else {
                        gxc.d(o);
                        return;
                    }
                }
            } else {
                ehfVar.add(obj);
            }
        }
    }

    public static void q(n6f n6fVar, ArrayList arrayList) {
        ehf ehfVar = n6fVar.zzj;
        if (!((mff) ehfVar).a) {
            ehfVar = wgf.b(ehfVar);
            n6fVar.zzj = ehfVar;
        }
        Charset charset = fhf.a;
        if (ehfVar instanceof ArrayList) {
            ((ArrayList) ehfVar).ensureCapacity(arrayList.size() + ehfVar.size());
        }
        int size = ehfVar.size();
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            if (obj == null) {
                String o = td4.o(ehfVar.size() - size, "Element at index ", " is null.");
                int size3 = ehfVar.size();
                while (true) {
                    size3--;
                    if (size3 >= size) {
                        ehfVar.remove(size3);
                    } else {
                        gxc.d(o);
                        return;
                    }
                }
            } else {
                ehfVar.add(obj);
            }
        }
    }

    public static void r(n6f n6fVar, ArrayList arrayList) {
        ehf ehfVar = n6fVar.zzk;
        if (!((mff) ehfVar).a) {
            ehfVar = wgf.b(ehfVar);
            n6fVar.zzk = ehfVar;
        }
        Charset charset = fhf.a;
        if (ehfVar instanceof ArrayList) {
            ((ArrayList) ehfVar).ensureCapacity(arrayList.size() + ehfVar.size());
        }
        int size = ehfVar.size();
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            if (obj == null) {
                String o = td4.o(ehfVar.size() - size, "Element at index ", " is null.");
                int size3 = ehfVar.size();
                while (true) {
                    size3--;
                    if (size3 >= size) {
                        ehfVar.remove(size3);
                    } else {
                        gxc.d(o);
                        return;
                    }
                }
            } else {
                ehfVar.add(obj);
            }
        }
    }

    @Override
    public final Object h(int i, wgf wgfVar) {
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
                    return new vgf(zzb);
                }
                return new n6f();
            }
            return new tif(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", k4f.y, "zzh", j6f.class, "zzi", f6f.class, "zzj", w6f.class, "zzk", r6f.class});
        }
        return (byte) 1;
    }
}
