package defpackage;
public final class cqe extends s6e {
    private static final cqe zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;

    static {
        cqe cqeVar = new cqe();
        zzb = cqeVar;
        s6e.k(cqe.class, cqeVar);
    }

    public static void n(cqe cqeVar, int i) {
        cqeVar.zzd |= 128;
        cqeVar.zzl = i;
    }

    public static void o(cqe cqeVar, int i) {
        cqeVar.zzd |= 256;
        cqeVar.zzm = i;
    }

    public static void p(cqe cqeVar, int i) {
        cqeVar.zzd |= 8;
        cqeVar.zzh = i;
    }

    public static void q(cqe cqeVar, long j) {
        cqeVar.zzd |= 16;
        cqeVar.zzi = j;
    }

    public static void r(cqe cqeVar, long j) {
        cqeVar.zzd |= 32;
        cqeVar.zzj = j;
    }

    public static void s(cqe cqeVar) {
        cqeVar.zzd |= 512;
        cqeVar.zzn = 772604006L;
    }

    public static void t(cqe cqeVar, String str) {
        str.getClass();
        cqeVar.zzd |= 4;
        cqeVar.zzg = str;
    }

    public static void u(cqe cqeVar) {
        cqeVar.zzd |= 64;
        cqeVar.zzk = false;
    }

    public static void v(cqe cqeVar) {
        cqeVar.zzd |= 1;
        cqeVar.zze = "8.0.0";
    }

    public static void w(cqe cqeVar, String str) {
        cqeVar.zzd |= 2;
        cqeVar.zzf = str;
    }

    public static rpe x() {
        return (rpe) zzb.f();
    }

    @Override
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new u4e(zzb);
                }
                return new cqe();
            }
            return new lfe(zzb, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        return (byte) 1;
    }
}
