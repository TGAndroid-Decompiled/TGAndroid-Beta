package defpackage;
public final class x1e extends nne {
    private static final x1e zzi;
    private static volatile dwe zzj;
    private int zzc;
    private e1e zzd;
    private s1e zze;
    private o1e zzf;
    private int zzg;
    private boolean zzh;

    static {
        ?? nneVar = new nne();
        zzi = nneVar;
        nne.g(x1e.class, nneVar);
    }

    public static w1e k() {
        return (w1e) ((jne) zzi.d(5));
    }

    @Override
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new nne();
            case 2:
                return new jne(zzi);
            case 3:
                return new swe(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                dwe dweVar2 = zzj;
                if (dweVar2 == null) {
                    synchronized (x1e.class) {
                        dwe dweVar3 = zzj;
                        dweVar = dweVar3;
                        if (dweVar3 == null) {
                            ?? obj = new Object();
                            zzj = obj;
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

    public final void j(o1e o1eVar) {
        this.zzf = o1eVar;
        this.zzc |= 4;
    }
}
