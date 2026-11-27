package defpackage;
public final class u5e extends ese {
    private static final u5e zzl;
    private static volatile u0f zzm;
    private int zzc;
    private boolean zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private String zzd = "";
    private String zzj = "";

    static {
        u5e u5eVar = new u5e();
        zzl = u5eVar;
        ese.g(u5e.class, u5eVar);
    }

    @Override
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new u5e();
            case 2:
                return new ase(zzl);
            case 3:
                return new j1f(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", r7e.b, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                u0f u0fVar2 = zzm;
                if (u0fVar2 == null) {
                    synchronized (u5e.class) {
                        u0f u0fVar3 = zzm;
                        u0fVar = u0fVar3;
                        if (u0fVar3 == null) {
                            ?? obj = new Object();
                            zzm = obj;
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
