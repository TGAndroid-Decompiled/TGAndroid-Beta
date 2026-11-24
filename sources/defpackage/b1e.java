package defpackage;
public final class b1e extends nne {
    private static final b1e zzg;
    private static volatile dwe zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        b1e b1eVar = new b1e();
        zzg = b1eVar;
        nne.g(b1e.class, b1eVar);
    }

    @Override
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new b1e();
            case 2:
                return new jne(zzg);
            case 3:
                return new swe(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", b3e.h, "zze", b3e.i, "zzf"});
            case 4:
                return zzg;
            case 5:
                dwe dweVar2 = zzh;
                if (dweVar2 == null) {
                    synchronized (b1e.class) {
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
}
