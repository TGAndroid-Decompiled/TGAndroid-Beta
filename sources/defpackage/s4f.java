package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public final class s4f extends wgf {
    private static final ahf zzb = new Object();
    private static final s4f zzd;
    private int zze;
    private k5f zzf;
    private gaf zzg;
    private ehf zzh = sif.d;
    private zgf zzi = xgf.d;

    static {
        s4f s4fVar = new s4f();
        zzd = s4fVar;
        wgf.e(s4f.class, s4fVar);
    }

    public static p4f l() {
        return (p4f) zzd.j();
    }

    public static void m(s4f s4fVar, k5f k5fVar) {
        s4fVar.zzf = k5fVar;
        s4fVar.zze |= 1;
    }

    public static void n(s4f s4fVar, ArrayList arrayList) {
        int i;
        zgf zgfVar = s4fVar.zzi;
        if (!((mff) zgfVar).a) {
            int size = zgfVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            xgf xgfVar = (xgf) zgfVar;
            if (i >= xgfVar.c) {
                s4fVar.zzi = new xgf(Arrays.copyOf(xgfVar.b, i), xgfVar.c, true);
            } else {
                i98.g();
                return;
            }
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            ((xgf) s4fVar.zzi).zzh(((m3f) obj).a);
        }
    }

    @Override
    public final Object h(int i, wgf wgfVar) {
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
                    return new vgf(zzd);
                }
                return new s4f();
            }
            return new tif(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", aaf.class, "zzi", k1f.E});
        }
        return (byte) 1;
    }
}
