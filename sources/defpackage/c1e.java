package defpackage;
public final class c1e extends nne {
    private static final c1e zzd;
    private static volatile dwe zze;
    private kpe zzc = uwe.d;

    static {
        c1e c1eVar = new c1e();
        zzd = c1eVar;
        nne.g(c1e.class, c1eVar);
    }

    @Override
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new c1e();
            case 2:
                return new jne(zzd);
            case 3:
                return new swe(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", u1e.class});
            case 4:
                return zzd;
            case 5:
                dwe dweVar2 = zze;
                if (dweVar2 == null) {
                    synchronized (c1e.class) {
                        dwe dweVar3 = zze;
                        dweVar = dweVar3;
                        if (dweVar3 == null) {
                            ?? obj = new Object();
                            zze = obj;
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
