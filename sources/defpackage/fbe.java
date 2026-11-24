package defpackage;
public final class fbe extends vid {
    private static volatile atd zzbg;
    private static final fbe zzbiv;
    private int zzbb;
    private String zzbis = "";
    private long zzbit;
    private long zzbiu;
    private int zzya;

    static {
        fbe fbeVar = new fbe();
        zzbiv = fbeVar;
        vid.c(fbe.class, fbeVar);
    }

    public static ebe j() {
        return (ebe) ((tid) zzbiv.a(5));
    }

    @Override
    public final Object a(int i) {
        atd atdVar;
        switch (qbe.a[i - 1]) {
            case 1:
                return new fbe();
            case 2:
                return new tid(zzbiv);
            case 3:
                return new fud(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
            case 4:
                return zzbiv;
            case 5:
                atd atdVar2 = zzbg;
                if (atdVar2 == null) {
                    synchronized (fbe.class) {
                        atd atdVar3 = zzbg;
                        atdVar = atdVar3;
                        if (atdVar3 == null) {
                            ?? obj = new Object();
                            zzbg = obj;
                            atdVar = obj;
                        }
                    }
                    return atdVar;
                }
                return atdVar2;
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
