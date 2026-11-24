package defpackage;
public final class y0e extends nne {
    private static final y0e zzf;
    private static volatile dwe zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    static {
        y0e y0eVar = new y0e();
        zzf = y0eVar;
        nne.g(y0e.class, y0eVar);
    }

    public static x0e k() {
        return (x0e) ((jne) zzf.d(5));
    }

    @Override
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new y0e();
            case 2:
                return new jne(zzf);
            case 3:
                return new swe(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                dwe dweVar2 = zzg;
                if (dweVar2 == null) {
                    synchronized (y0e.class) {
                        dwe dweVar3 = zzg;
                        dweVar = dweVar3;
                        if (dweVar3 == null) {
                            ?? obj = new Object();
                            zzg = obj;
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
