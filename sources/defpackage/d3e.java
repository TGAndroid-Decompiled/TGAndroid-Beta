package defpackage;
public final class d3e extends qpe {
    private static final xqe zzd = new b7d((byte) 2);
    private static final d3e zze;
    private static volatile fye zzf;
    private cre zzc = qpe.i();

    static {
        d3e d3eVar = new d3e();
        zze = d3eVar;
        qpe.g(d3e.class, d3eVar);
    }

    @Override
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new d3e();
            case 2:
                return new mpe(zze);
            case 3:
                return new uye(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", e5e.h});
            case 4:
                return zze;
            case 5:
                fye fyeVar2 = zzf;
                if (fyeVar2 == null) {
                    synchronized (d3e.class) {
                        fye fyeVar3 = zzf;
                        fyeVar = fyeVar3;
                        if (fyeVar3 == null) {
                            ?? obj = new Object();
                            zzf = obj;
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
