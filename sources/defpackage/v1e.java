package defpackage;
public final class v1e extends nne {
    private static final v1e zzh;
    private static volatile dwe zzi;
    private int zzc;
    private c1e zzd;
    private int zze;
    private m1e zzf;
    private b1e zzg;

    static {
        ?? nneVar = new nne();
        zzh = nneVar;
        nne.g(v1e.class, nneVar);
    }

    @Override
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new nne();
            case 2:
                return new jne(zzh);
            case 3:
                return new swe(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                dwe dweVar2 = zzi;
                if (dweVar2 == null) {
                    synchronized (v1e.class) {
                        dwe dweVar3 = zzi;
                        dweVar = dweVar3;
                        if (dweVar3 == null) {
                            ?? obj = new Object();
                            zzi = obj;
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
}
