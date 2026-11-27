package defpackage;
public final class q5e extends ese {
    private static final lte zzd = new s9d((byte) 2);
    private static final q5e zze;
    private static volatile u0f zzf;
    private qte zzc = ese.i();

    static {
        q5e q5eVar = new q5e();
        zze = q5eVar;
        ese.g(q5e.class, q5eVar);
    }

    @Override
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new q5e();
            case 2:
                return new ase(zze);
            case 3:
                return new j1f(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", r7e.h});
            case 4:
                return zze;
            case 5:
                u0f u0fVar2 = zzf;
                if (u0fVar2 == null) {
                    synchronized (q5e.class) {
                        u0f u0fVar3 = zzf;
                        u0fVar = u0fVar3;
                        if (u0fVar3 == null) {
                            ?? obj = new Object();
                            zzf = obj;
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
