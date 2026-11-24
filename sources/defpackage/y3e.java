package defpackage;
public final class y3e extends qpe {
    private static final y3e zzh;
    private static volatile fye zzi;
    private int zzc;
    private f3e zzd;
    private int zze;
    private p3e zzf;
    private e3e zzg;

    static {
        ?? qpeVar = new qpe();
        zzh = qpeVar;
        qpe.g(y3e.class, qpeVar);
    }

    @Override
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new qpe();
            case 2:
                return new mpe(zzh);
            case 3:
                return new uye(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                fye fyeVar2 = zzi;
                if (fyeVar2 == null) {
                    synchronized (y3e.class) {
                        fye fyeVar3 = zzi;
                        fyeVar = fyeVar3;
                        if (fyeVar3 == null) {
                            ?? obj = new Object();
                            zzi = obj;
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
