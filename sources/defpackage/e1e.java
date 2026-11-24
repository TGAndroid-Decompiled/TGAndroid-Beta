package defpackage;
public final class e1e extends nne {
    private static final e1e zzl;
    private static volatile dwe zzm;
    private int zzc;
    private boolean zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private String zzd = "";
    private String zzj = "";

    static {
        e1e e1eVar = new e1e();
        zzl = e1eVar;
        nne.g(e1e.class, e1eVar);
    }

    @Override
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new e1e();
            case 2:
                return new jne(zzl);
            case 3:
                return new swe(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", b3e.b, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                dwe dweVar2 = zzm;
                if (dweVar2 == null) {
                    synchronized (e1e.class) {
                        dwe dweVar3 = zzm;
                        dweVar = dweVar3;
                        if (dweVar3 == null) {
                            ?? obj = new Object();
                            zzm = obj;
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
