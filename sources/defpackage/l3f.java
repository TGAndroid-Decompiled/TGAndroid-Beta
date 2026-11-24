package defpackage;
public final class l3f extends vef {
    private static final l3f zzb;
    private int zzd;
    private h6f zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private t9f zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        ?? vefVar = new vef();
        zzb = vefVar;
        vef.e(l3f.class, vefVar);
    }

    public static k3f l() {
        return (k3f) zzb.j();
    }

    public static k3f m(l3f l3fVar) {
        uef j = zzb.j();
        vef vefVar = j.a;
        if (!vefVar.equals(l3fVar)) {
            if (!j.b.g()) {
                vef vefVar2 = (vef) vefVar.h(4, null);
                qgf.c.a(vefVar2.getClass()).d(vefVar2, j.b);
                j.b = vefVar2;
            }
            vef vefVar3 = j.b;
            qgf.c.a(vefVar3.getClass()).d(vefVar3, l3fVar);
        }
        return (k3f) j;
    }

    public static l3f n() {
        return zzb;
    }

    public static void o(l3f l3fVar, h6f h6fVar) {
        l3fVar.zze = h6fVar;
        l3fVar.zzd |= 1;
    }

    public static void p(l3f l3fVar, boolean z) {
        l3fVar.zzd |= 2;
        l3fVar.zzf = z;
    }

    public static void q(l3f l3fVar, long j) {
        l3fVar.zzd |= 4;
        l3fVar.zzg = j;
    }

    public static void r(l3f l3fVar, int i) {
        l3fVar.zzd |= 64;
        l3fVar.zzk = i;
    }

    public static void s(l3f l3fVar, int i) {
        l3fVar.zzd |= 128;
        l3fVar.zzl = i;
    }

    public static void t(l3f l3fVar, int i) {
        l3fVar.zzd |= 1024;
        l3fVar.zzo = i;
    }

    public static void u(l3f l3fVar, boolean z) {
        l3fVar.zzd |= 2048;
        l3fVar.zzp = z;
    }

    public static void v(l3f l3fVar, int i) {
        l3fVar.zzd |= 4096;
        l3fVar.zzq = i;
    }

    public static void w(l3f l3fVar, int i) {
        l3fVar.zzd |= 8192;
        l3fVar.zzr = i;
    }

    public static void x(l3f l3fVar, boolean z) {
        l3fVar.zzd |= 16384;
        l3fVar.zzs = z;
    }

    @Override
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new uef(zzb);
                }
                return new vef();
            }
            return new sgf(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", ize.n, "zzj", c6e.f, "zzk", "zzl", "zzm", "zzn", ie7.r, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        return (byte) 1;
    }
}
