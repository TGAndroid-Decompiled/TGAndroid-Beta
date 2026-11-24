package defpackage;
public final class l1e extends nne {
    private static final l1e zzj;
    private static volatile dwe zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    static {
        ?? nneVar = new nne();
        zzj = nneVar;
        nne.g(l1e.class, nneVar);
    }

    @Override
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new nne();
            case 2:
                return new jne(zzj);
            case 3:
                return new swe(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", b3e.f, "zze", b3e.e, "zzf", b3e.d, "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                dwe dweVar2 = zzk;
                if (dweVar2 == null) {
                    synchronized (l1e.class) {
                        dwe dweVar3 = zzk;
                        dweVar = dweVar3;
                        if (dweVar3 == null) {
                            ?? obj = new Object();
                            zzk = obj;
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
