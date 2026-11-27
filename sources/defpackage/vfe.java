package defpackage;
public final class vfe extends mnd {
    private static volatile qxd zzbg;
    private static final vfe zzbiv;
    private int zzbb;
    private String zzbis = "";
    private long zzbit;
    private long zzbiu;
    private int zzya;

    static {
        vfe vfeVar = new vfe();
        zzbiv = vfeVar;
        mnd.c(vfe.class, vfeVar);
    }

    public static ufe j() {
        return (ufe) ((knd) zzbiv.a(5));
    }

    @Override
    public final Object a(int i) {
        qxd qxdVar;
        switch (gge.a[i - 1]) {
            case 1:
                return new vfe();
            case 2:
                return new knd(zzbiv);
            case 3:
                return new vyd(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
            case 4:
                return zzbiv;
            case 5:
                qxd qxdVar2 = zzbg;
                if (qxdVar2 == null) {
                    synchronized (vfe.class) {
                        qxd qxdVar3 = zzbg;
                        qxdVar = qxdVar3;
                        if (qxdVar3 == null) {
                            ?? obj = new Object();
                            zzbg = obj;
                            qxdVar = obj;
                        }
                    }
                    return qxdVar;
                }
                return qxdVar2;
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
