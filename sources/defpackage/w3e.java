package defpackage;
public final class w3e extends qpe {
    private static final w3e zzf;
    private static volatile fye zzg;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        ?? qpeVar = new qpe();
        zzf = qpeVar;
        qpe.g(w3e.class, qpeVar);
    }

    @Override
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new qpe();
            case 2:
                return new mpe(zzf);
            case 3:
                return new uye(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                fye fyeVar2 = zzg;
                if (fyeVar2 == null) {
                    synchronized (w3e.class) {
                        fye fyeVar3 = zzg;
                        fyeVar = fyeVar3;
                        if (fyeVar3 == null) {
                            ?? obj = new Object();
                            zzg = obj;
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
