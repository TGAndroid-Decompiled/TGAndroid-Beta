package defpackage;
public final class o5e extends ese {
    private static final o5e zzf;
    private static volatile u0f zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    static {
        o5e o5eVar = new o5e();
        zzf = o5eVar;
        ese.g(o5e.class, o5eVar);
    }

    public static n5e k() {
        return (n5e) ((ase) zzf.d(5));
    }

    @Override
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new o5e();
            case 2:
                return new ase(zzf);
            case 3:
                return new j1f(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                u0f u0fVar2 = zzg;
                if (u0fVar2 == null) {
                    synchronized (o5e.class) {
                        u0f u0fVar3 = zzg;
                        u0fVar = u0fVar3;
                        if (u0fVar3 == null) {
                            ?? obj = new Object();
                            zzg = obj;
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

    public final void j(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    public final void m(String str) {
        this.zzc |= 2;
        this.zze = str;
    }
}
