package defpackage;
public final class b3e extends qpe {
    private static final b3e zzf;
    private static volatile fye zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    static {
        b3e b3eVar = new b3e();
        zzf = b3eVar;
        qpe.g(b3e.class, b3eVar);
    }

    public static a3e k() {
        return (a3e) ((mpe) zzf.d(5));
    }

    @Override
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new b3e();
            case 2:
                return new mpe(zzf);
            case 3:
                return new uye(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                fye fyeVar2 = zzg;
                if (fyeVar2 == null) {
                    synchronized (b3e.class) {
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
