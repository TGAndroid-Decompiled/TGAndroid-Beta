package defpackage;
public final class v3e extends qpe {
    private static final v3e zzj;
    private static volatile fye zzk;
    private int zzc;
    private long zze;
    private b3e zzf;
    private o3e zzh;
    private d3e zzi;
    private String zzd = "";
    private String zzg = "";

    static {
        v3e v3eVar = new v3e();
        zzj = v3eVar;
        qpe.g(v3e.class, v3eVar);
    }

    @Override
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new v3e();
            case 2:
                return new mpe(zzj);
            case 3:
                return new uye(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                fye fyeVar2 = zzk;
                if (fyeVar2 == null) {
                    synchronized (v3e.class) {
                        fye fyeVar3 = zzk;
                        fyeVar = fyeVar3;
                        if (fyeVar3 == null) {
                            ?? obj = new Object();
                            zzk = obj;
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
