package defpackage;
public final class s1e extends nne {
    private static final s1e zzj;
    private static volatile dwe zzk;
    private int zzc;
    private long zze;
    private y0e zzf;
    private l1e zzh;
    private a1e zzi;
    private String zzd = "";
    private String zzg = "";

    static {
        s1e s1eVar = new s1e();
        zzj = s1eVar;
        nne.g(s1e.class, s1eVar);
    }

    @Override
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new s1e();
            case 2:
                return new jne(zzj);
            case 3:
                return new swe(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                dwe dweVar2 = zzk;
                if (dweVar2 == null) {
                    synchronized (s1e.class) {
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
