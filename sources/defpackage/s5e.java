package defpackage;
public final class s5e extends ese {
    private static final s5e zzd;
    private static volatile u0f zze;
    private bue zzc = l1f.d;

    static {
        s5e s5eVar = new s5e();
        zzd = s5eVar;
        ese.g(s5e.class, s5eVar);
    }

    @Override
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new s5e();
            case 2:
                return new ase(zzd);
            case 3:
                return new j1f(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", k6e.class});
            case 4:
                return zzd;
            case 5:
                u0f u0fVar2 = zze;
                if (u0fVar2 == null) {
                    synchronized (s5e.class) {
                        u0f u0fVar3 = zze;
                        u0fVar = u0fVar3;
                        if (u0fVar3 == null) {
                            ?? obj = new Object();
                            zze = obj;
                            u0fVar = obj;
                        }
                    }
                    return u0fVar;
                }
                return u0fVar2;
            case 6:
                return (byte) 1;
            case 7:
                break;
            default:
                p3d.a();
                break;
        }
        return null;
    }
}
