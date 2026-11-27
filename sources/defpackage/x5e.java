package defpackage;

import java.util.List;
public final class x5e extends ese {
    private static final x5e zzl;
    private static volatile u0f zzm;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private bue zzf;
    private int zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private bue zzk;

    static {
        x5e x5eVar = new x5e();
        zzl = x5eVar;
        ese.g(x5e.class, x5eVar);
    }

    public x5e() {
        l1f l1fVar = l1f.d;
        this.zzf = l1fVar;
        this.zzh = "";
        this.zzk = l1fVar;
    }

    public static w5e m() {
        return (w5e) ((ase) zzl.d(5));
    }

    @Override
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new x5e();
            case 2:
                return new ase(zzl);
            case 3:
                return new j1f(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", r7e.c, "zzh", "zzi", "zzj", "zzk", l6e.class});
            case 4:
                return zzl;
            case 5:
                u0f u0fVar2 = zzm;
                if (u0fVar2 == null) {
                    synchronized (x5e.class) {
                        u0f u0fVar3 = zzm;
                        u0fVar = u0fVar3;
                        if (u0fVar3 == null) {
                            ?? obj = new Object();
                            zzm = obj;
                            u0fVar = obj;
                        }
                    }
                    return u0fVar;
                }
                return u0fVar2;
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

    public final void j(long j) {
        this.zzc |= 16;
        this.zzi = j;
    }

    public final void k(List list) {
        int i;
        bue bueVar = this.zzk;
        if (!bueVar.zza()) {
            int size = bueVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            this.zzk = bueVar.zza(i);
        }
        hie.a(list, this.zzk);
    }

    public final void l(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    public final void n(long j) {
        this.zzc |= 32;
        this.zzj = j;
    }
}
