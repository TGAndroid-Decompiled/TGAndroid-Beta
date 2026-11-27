package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
public final class nud extends s6e {
    private static final nud zzb;
    private q7e zzd = ffe.e;

    static {
        nud nudVar = new nud();
        zzb = nudVar;
        s6e.k(nud.class, nudVar);
    }

    public static gud n() {
        return (gud) zzb.f();
    }

    public static void o(nud nudVar, ArrayList arrayList) {
        q7e q7eVar = nudVar.zzd;
        if (!((rwd) q7eVar).a) {
            q7eVar = q7eVar.zzd(q7eVar.size() << 1);
            nudVar.zzd = q7eVar;
        }
        Charset charset = x7e.a;
        int size = arrayList.size();
        if (q7eVar instanceof ArrayList) {
            ((ArrayList) q7eVar).ensureCapacity(q7eVar.size() + size);
        } else if (q7eVar instanceof ffe) {
            ffe ffeVar = (ffe) q7eVar;
            int i = ffeVar.c + size;
            int length = ffeVar.b.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    ffeVar.b = Arrays.copyOf(ffeVar.b, length);
                } else {
                    ffeVar.b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size2 = q7eVar.size();
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String n = qd4.n(q7eVar.size() - size2, "Element at index ", " is null.");
                int size4 = q7eVar.size();
                while (true) {
                    size4--;
                    if (size4 >= size2) {
                        q7eVar.remove(size4);
                    } else {
                        p3d.h(n);
                        return;
                    }
                }
            } else {
                q7eVar.add(obj);
            }
        }
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
                return new nud();
            }
            return new lfe(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", ztd.class});
        }
        return (byte) 1;
    }
}
