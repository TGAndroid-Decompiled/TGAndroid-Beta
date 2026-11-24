package defpackage;
public final class t1e extends nne {
    private static final t1e zzf;
    private static volatile dwe zzg;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        ?? nneVar = new nne();
        zzf = nneVar;
        nne.g(t1e.class, nneVar);
    }

    @Override
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new nne();
            case 2:
                return new jne(zzf);
            case 3:
                return new swe(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                dwe dweVar2 = zzg;
                if (dweVar2 == null) {
                    synchronized (t1e.class) {
                        dwe dweVar3 = zzg;
                        dweVar = dweVar3;
                        if (dweVar3 == null) {
                            ?? obj = new Object();
                            zzg = obj;
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
