package defpackage;

import java.util.ArrayList;
public final class o1e extends nne {
    private static final o1e zzg;
    private static volatile dwe zzh;
    private int zzc;
    private r1e zzd;
    private t1e zze;
    private kpe zzf = uwe.d;

    static {
        o1e o1eVar = new o1e();
        zzg = o1eVar;
        nne.g(o1e.class, o1eVar);
    }

    public static n1e l() {
        return (n1e) ((jne) zzg.d(5));
    }

    @Override
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new o1e();
            case 2:
                return new jne(zzg);
            case 3:
                return new swe(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", h1e.class});
            case 4:
                return zzg;
            case 5:
                dwe dweVar2 = zzh;
                if (dweVar2 == null) {
                    synchronized (o1e.class) {
                        dwe dweVar3 = zzh;
                        dweVar = dweVar3;
                        if (dweVar3 == null) {
                            ?? obj = new Object();
                            zzh = obj;
                            dweVar = obj;
                        }
                    }
                    return dweVar;
                }
                return dweVar2;
            case 6:
                return (byte) 1;
            case 7:
                break;
            default:
                fvc.b();
                break;
        }
        return null;
    }

    public final void j(r1e r1eVar) {
        this.zzd = r1eVar;
        this.zzc |= 1;
    }

    public final void k(ArrayList arrayList) {
        int i;
        kpe kpeVar = this.zzf;
        if (!kpeVar.zza()) {
            int size = kpeVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            this.zzf = kpeVar.zza(i);
        }
        qde.a(arrayList, this.zzf);
    }
}
