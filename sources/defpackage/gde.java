package defpackage;
public final class gde extends xkd {
    private static volatile dvd zzbg;
    private static final gde zzbiv;
    private int zzbb;
    private String zzbis = "";
    private long zzbit;
    private long zzbiu;
    private int zzya;

    static {
        gde gdeVar = new gde();
        zzbiv = gdeVar;
        xkd.c(gde.class, gdeVar);
    }

    public static fde j() {
        return (fde) ((vkd) zzbiv.a(5));
    }

    @Override
    public final Object a(int i) {
        dvd dvdVar;
        switch (rde.a[i - 1]) {
            case 1:
                return new gde();
            case 2:
                return new vkd(zzbiv);
            case 3:
                return new iwd(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
            case 4:
                return zzbiv;
            case 5:
                dvd dvdVar2 = zzbg;
                if (dvdVar2 == null) {
                    synchronized (gde.class) {
                        dvd dvdVar3 = zzbg;
                        dvdVar = dvdVar3;
                        if (dvdVar3 == null) {
                            ?? obj = new Object();
                            zzbg = obj;
                            dvdVar = obj;
                        }
                    }
                    return dvdVar;
                }
                return dvdVar2;
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

    public final int e() {
        return this.zzya;
    }

    public final boolean f() {
        if ((this.zzbb & 1) == 1) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.zzbis;
    }

    public final long h() {
        return this.zzbit;
    }

    public final long i() {
        return this.zzbiu;
    }

    public final void k(String str) {
        this.zzbb |= 2;
        this.zzbis = str;
    }

    public final void l(long j) {
        this.zzbb |= 4;
        this.zzbit = j;
    }

    public final void m(long j) {
        this.zzbb |= 8;
        this.zzbiu = j;
    }
}
