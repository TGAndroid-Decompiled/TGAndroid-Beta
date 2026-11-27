package defpackage;
public final class c8f extends ljf {
    private static final c8f zzb;
    private int zzd;
    private yaf zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private kef zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        ?? ljfVar = new ljf();
        zzb = ljfVar;
        ljf.e(c8f.class, ljfVar);
    }

    public static b8f l() {
        return (b8f) zzb.j();
    }

    public static b8f m(c8f c8fVar) {
        kjf j = zzb.j();
        ljf ljfVar = j.a;
        if (!ljfVar.equals(c8fVar)) {
            if (!j.b.g()) {
                ljf ljfVar2 = (ljf) ljfVar.h(4, null);
                glf.c.a(ljfVar2.getClass()).c(ljfVar2, j.b);
                j.b = ljfVar2;
            }
            ljf ljfVar3 = j.b;
            glf.c.a(ljfVar3.getClass()).c(ljfVar3, c8fVar);
        }
        return (b8f) j;
    }

    public static c8f n() {
        return zzb;
    }

    public static void o(c8f c8fVar, yaf yafVar) {
        c8fVar.zze = yafVar;
        c8fVar.zzd |= 1;
    }

    public static void p(c8f c8fVar, boolean z) {
        c8fVar.zzd |= 2;
        c8fVar.zzf = z;
    }

    public static void q(c8f c8fVar, long j) {
        c8fVar.zzd |= 4;
        c8fVar.zzg = j;
    }

    public static void r(c8f c8fVar, int i) {
        c8fVar.zzd |= 64;
        c8fVar.zzk = i;
    }

    public static void s(c8f c8fVar, int i) {
        c8fVar.zzd |= 128;
        c8fVar.zzl = i;
    }

    public static void t(c8f c8fVar, int i) {
        c8fVar.zzd |= 1024;
        c8fVar.zzo = i;
    }

    public static void u(c8f c8fVar, boolean z) {
        c8fVar.zzd |= 2048;
        c8fVar.zzp = z;
    }

    public static void v(c8f c8fVar, int i) {
        c8fVar.zzd |= 4096;
        c8fVar.zzq = i;
    }

    public static void w(c8f c8fVar, int i) {
        c8fVar.zzd |= 8192;
        c8fVar.zzr = i;
    }

    public static void x(c8f c8fVar, boolean z) {
        c8fVar.zzd |= 16384;
        c8fVar.zzs = z;
    }

    @Override
    public final Object h(int i, ljf ljfVar) {
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
                    return new kjf(zzb);
                }
                return new ljf();
            }
            return new ilf(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", z3f.n, "zzj", sae.f, "zzk", "zzl", "zzm", "zzn", sg7.r, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        return (byte) 1;
    }
}
