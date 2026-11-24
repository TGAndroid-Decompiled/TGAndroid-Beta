package defpackage;
public final class f3e extends qpe {
    private static final f3e zzd;
    private static volatile fye zze;
    private nre zzc = wye.d;

    static {
        f3e f3eVar = new f3e();
        zzd = f3eVar;
        qpe.g(f3e.class, f3eVar);
    }

    @Override
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new f3e();
            case 2:
                return new mpe(zzd);
            case 3:
                return new uye(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", x3e.class});
            case 4:
                return zzd;
            case 5:
                fye fyeVar2 = zze;
                if (fyeVar2 == null) {
                    synchronized (f3e.class) {
                        fye fyeVar3 = zze;
                        fyeVar = fyeVar3;
                        if (fyeVar3 == null) {
                            ?? obj = new Object();
                            zze = obj;
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
