package defpackage;
public final class lle extends c2e {
    private static final lle zzb;
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
        lle lleVar = new lle();
        zzb = lleVar;
        c2e.k(lle.class, lleVar);
    }

    public static void n(lle lleVar, int i) {
        lleVar.zzd |= 128;
        lleVar.zzl = i;
    }

    public static void o(lle lleVar, int i) {
        lleVar.zzd |= 256;
        lleVar.zzm = i;
    }

    public static void p(lle lleVar, int i) {
        lleVar.zzd |= 8;
        lleVar.zzh = i;
    }

    public static void q(lle lleVar, long j) {
        lleVar.zzd |= 16;
        lleVar.zzi = j;
    }

    public static void r(lle lleVar, long j) {
        lleVar.zzd |= 32;
        lleVar.zzj = j;
    }

    public static void s(lle lleVar) {
        lleVar.zzd |= 512;
        lleVar.zzn = 772604006L;
    }

    public static void t(lle lleVar, String str) {
        str.getClass();
        lleVar.zzd |= 4;
        lleVar.zzg = str;
    }

    public static void u(lle lleVar) {
        lleVar.zzd |= 64;
        lleVar.zzk = false;
    }

    public static void v(lle lleVar) {
        lleVar.zzd |= 1;
        lleVar.zze = "8.0.0";
    }

    public static void w(lle lleVar, String str) {
        lleVar.zzd |= 2;
        lleVar.zzf = str;
    }

    public static ale x() {
        return (ale) zzb.f();
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
                    return new e0e(zzb);
                }
                return new lle();
            }
            return new vae(zzb, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        return (byte) 1;
    }
}
