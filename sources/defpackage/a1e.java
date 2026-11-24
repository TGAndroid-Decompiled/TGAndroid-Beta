package defpackage;
public final class a1e extends nne {
    private static final uoe zzd = new z4d((byte) 2);
    private static final a1e zze;
    private static volatile dwe zzf;
    private zoe zzc = nne.i();

    static {
        a1e a1eVar = new a1e();
        zze = a1eVar;
        nne.g(a1e.class, a1eVar);
    }

    @Override
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new a1e();
            case 2:
                return new jne(zze);
            case 3:
                return new swe(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", b3e.h});
            case 4:
                return zze;
            case 5:
                dwe dweVar2 = zzf;
                if (dweVar2 == null) {
                    synchronized (a1e.class) {
                        dwe dweVar3 = zzf;
                        dweVar = dweVar3;
                        if (dweVar3 == null) {
                            ?? obj = new Object();
                            zzf = obj;
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
