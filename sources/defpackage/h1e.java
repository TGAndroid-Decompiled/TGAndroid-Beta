package defpackage;

import java.util.List;
public final class h1e extends nne {
    private static final h1e zzl;
    private static volatile dwe zzm;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private kpe zzf;
    private int zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private kpe zzk;

    static {
        h1e h1eVar = new h1e();
        zzl = h1eVar;
        nne.g(h1e.class, h1eVar);
    }

    public h1e() {
        uwe uweVar = uwe.d;
        this.zzf = uweVar;
        this.zzh = "";
        this.zzk = uweVar;
    }

    public static g1e m() {
        return (g1e) ((jne) zzl.d(5));
    }

    @Override
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new h1e();
            case 2:
                return new jne(zzl);
            case 3:
                return new swe(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", b3e.c, "zzh", "zzi", "zzj", "zzk", v1e.class});
            case 4:
                return zzl;
            case 5:
                dwe dweVar2 = zzm;
                if (dweVar2 == null) {
                    synchronized (h1e.class) {
                        dwe dweVar3 = zzm;
                        dweVar = dweVar3;
                        if (dweVar3 == null) {
                            ?? obj = new Object();
                            zzm = obj;
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

    public final void j(long j) {
        this.zzc |= 16;
        this.zzi = j;
    }

    public final void k(List list) {
        int i;
        kpe kpeVar = this.zzk;
        if (!kpeVar.zza()) {
            int size = kpeVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            this.zzk = kpeVar.zza(i);
        }
        qde.a(list, this.zzk);
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
