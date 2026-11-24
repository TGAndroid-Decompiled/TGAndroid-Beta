package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public final class q2f extends vef {
    private static final zef zzb = new Object();
    private static final q2f zzd;
    private int zze;
    private i3f zzf;
    private e8f zzg;
    private dff zzh = rgf.d;
    private yef zzi = wef.d;

    static {
        q2f q2fVar = new q2f();
        zzd = q2fVar;
        vef.e(q2f.class, q2fVar);
    }

    public static n2f l() {
        return (n2f) zzd.j();
    }

    public static void m(q2f q2fVar, i3f i3fVar) {
        q2fVar.zzf = i3fVar;
        q2fVar.zze |= 1;
    }

    public static void n(q2f q2fVar, ArrayList arrayList) {
        int i;
        yef yefVar = q2fVar.zzi;
        if (!((ldf) yefVar).a) {
            int size = yefVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            wef wefVar = (wef) yefVar;
            if (i >= wefVar.c) {
                q2fVar.zzi = new wef(Arrays.copyOf(wefVar.b, i), wefVar.c, true);
            } else {
                sc8.e();
                return;
            }
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            ((wef) q2fVar.zzi).zzh(((k1f) obj).a);
        }
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
                        return zzd;
                    }
                    return new uef(zzd);
                }
                return new q2f();
            }
            return new sgf(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", y7f.class, "zzi", ize.E});
        }
        return (byte) 1;
    }
}
