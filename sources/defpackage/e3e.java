package defpackage;
public final class e3e extends qpe {
    private static final e3e zzg;
    private static volatile fye zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        e3e e3eVar = new e3e();
        zzg = e3eVar;
        qpe.g(e3e.class, e3eVar);
    }

    @Override
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new e3e();
            case 2:
                return new mpe(zzg);
            case 3:
                return new uye(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", e5e.h, "zze", e5e.i, "zzf"});
            case 4:
                return zzg;
            case 5:
                fye fyeVar2 = zzh;
                if (fyeVar2 == null) {
                    synchronized (e3e.class) {
                        fye fyeVar3 = zzh;
                        fyeVar = fyeVar3;
                        if (fyeVar3 == null) {
                            ?? obj = new Object();
                            zzh = obj;
                            fyeVar = obj;
                        }
                    }
                    return fyeVar;
                }
                return fyeVar2;
            case 6:
                return (byte) 1;
            case 7:
                break;
            default:
                gxc.b();
                break;
        }
        return null;
    }
}
