package defpackage;
public final class y3f extends vef {
    private static final y3f zzb;
    private dff zzA;
    private dff zzB;
    private dff zzC;
    private z9f zzD;
    private int zzE;
    private int zzF;
    private h6f zzG;
    private int zzH;
    private v3f zzI;
    private dff zzJ;
    private h6f zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private vaf zzR;
    private l3f zzS;
    private l4f zzT;
    private h2f zzU;
    private b8f zzV;
    private w9f zzW;
    private h8f zzX;
    private dff zzY;
    private int zzZ;
    private t8f zzaa;
    private dff zzab;
    private boolean zzac;
    private boolean zzad;
    private int zzae;
    private q2f zzaf;
    private q9f zzag;
    private s7f zzah;
    private q5f zzai;
    private q8f zzaj;
    private jaf zzak;
    private s5f zzal;
    private int zzam;
    private int zzan;
    private int zzao;
    private dff zzap;
    private kbf zzaq;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private b7f zzi;
    private d9f zzj;
    private y6f zzk;
    private r6f zzl;
    private r3f zzm;
    private a9f zzn;
    private e3f zzo;
    private saf zzp;
    private o6f zzr;
    private xae zzs;
    private int zzv;
    private n8f zzw;
    private dff zzz;
    private byte zzar = 2;
    private String zzq = "";
    private String zzt = "";
    private String zzu = "";
    private String zzx = "";
    private yef zzy = wef.d;

    static {
        y3f y3fVar = new y3f();
        zzb = y3fVar;
        vef.e(y3f.class, y3fVar);
    }

    public y3f() {
        rgf rgfVar = rgf.d;
        this.zzz = rgfVar;
        this.zzA = rgfVar;
        this.zzB = rgfVar;
        this.zzC = rgfVar;
        this.zzJ = rgfVar;
        this.zzY = rgfVar;
        this.zzab = rgfVar;
        this.zzap = rgfVar;
    }

    public static w3f m() {
        return (w3f) zzb.j();
    }

    public static w3f n(y3f y3fVar) {
        uef j = zzb.j();
        vef vefVar = j.a;
        if (!vefVar.equals(y3fVar)) {
            if (!j.b.g()) {
                vef vefVar2 = (vef) vefVar.h(4, null);
                qgf.c.a(vefVar2.getClass()).d(vefVar2, j.b);
                j.b = vefVar2;
            }
            vef vefVar3 = j.b;
            qgf.c.a(vefVar3.getClass()).d(vefVar3, y3fVar);
        }
        return (w3f) j;
    }

    public static void o(y3f y3fVar, int i) {
        y3fVar.zzd |= Integer.MIN_VALUE;
        y3fVar.zzQ = i;
    }

    public static void p(y3f y3fVar, l3f l3fVar) {
        y3fVar.zzS = l3fVar;
        y3fVar.zze |= 2;
    }

    public static void q(y3f y3fVar, l4f l4fVar) {
        y3fVar.zzT = l4fVar;
        y3fVar.zze |= 4;
    }

    public static void r(y3f y3fVar, i3f i3fVar) {
        dff dffVar = y3fVar.zzY;
        if (!((ldf) dffVar).a) {
            dffVar = vef.b(dffVar);
            y3fVar.zzY = dffVar;
        }
        dffVar.add(i3fVar);
    }

    public static void s(y3f y3fVar, q2f q2fVar) {
        y3fVar.zzaf = q2fVar;
        y3fVar.zze |= 4096;
    }

    public static void t(y3f y3fVar, long j) {
        y3fVar.zzd |= 2;
        y3fVar.zzg = j;
    }

    public static void u(y3f y3fVar, String str) {
        y3fVar.zzd |= 2048;
        y3fVar.zzq = str;
    }

    public static void v(y3f y3fVar, String str) {
        str.getClass();
        y3fVar.zzd |= 16384;
        y3fVar.zzt = str;
    }

    public static void w(y3f y3fVar, String str) {
        str.getClass();
        y3fVar.zzd |= 32768;
        y3fVar.zzu = str;
    }

    public static void x(y3f y3fVar, int i) {
        y3fVar.zzd |= 65536;
        y3fVar.zzv = i;
    }

    public static void y(y3f y3fVar, String str) {
        y3fVar.zzd |= 262144;
        y3fVar.zzx = str;
    }

    @Override
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (vefVar == null) {
                                b = 0;
                            }
                            this.zzar = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new uef(zzb);
                }
                return new y3f();
            }
            return new sgf(zzb, "\u0001@\u0000\u0002\u0001@@\u0000\t\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u0011\u0011ဈ\u0012\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017᠌\u0014\u0018ဉ\u0018\u0019\u001b\u001aဉ\u0019\u001b᠌\u001b\u001cင\u001c\u001dင\u001d\u001eင\u001e\u001fဆ\u001f ဉ !ဉ!\"ဉ##᠌\u0015$ဉ\u0016%ᐉ$&ဉ%'ဉ&(\u001b)᠌'*ဉ(+\u001b,᠌\u001a-ဇ).ဇ*/᠌+0ဉ,1င\u00172ဉ-3ဉ.4ဉ05ဉ16ဉ27᠌38᠌49᠌5:\u001b;ဈ\u000f<ဉ6=ဉ/>ဉ\u0013?ဉ\"@င\u0010", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", c6e.w, "zzi", "zzj", "zzk", "zzl", "zzm", "zzt", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzw", "zzx", "zzy", "zzz", e7f.class, "zzA", v7f.class, "zzB", x5f.class, "zzC", caf.class, "zzE", o5f.x, "zzI", "zzJ", h6f.class, "zzK", "zzM", cff.w, "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzU", "zzF", ize.x, "zzG", "zzV", "zzW", "zzX", "zzY", i3f.class, "zzZ", i2f.x, "zzaa", "zzab", o3f.class, "zzL", eef.r, "zzac", "zzad", "zzae", ize.s, "zzaf", "zzH", "zzag", "zzah", "zzaj", "zzak", "zzal", "zzam", pd5.n, "zzan", i2f.w, "zzao", vi2.n, "zzap", maf.class, "zzu", "zzaq", "zzai", "zzD", "zzT", "zzv"});
        }
        return Byte.valueOf(this.zzar);
    }

    public final l3f l() {
        l3f l3fVar = this.zzS;
        if (l3fVar == null) {
            return l3f.n();
        }
        return l3fVar;
    }
}
