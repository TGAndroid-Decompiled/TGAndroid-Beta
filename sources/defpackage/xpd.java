package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
public final class xpd extends c2e {
    private static final xpd zzb;
    private a3e zzd = pae.e;

    static {
        xpd xpdVar = new xpd();
        zzb = xpdVar;
        c2e.k(xpd.class, xpdVar);
    }

    public static qpd n() {
        return (qpd) zzb.f();
    }

    public static void o(xpd xpdVar, ArrayList arrayList) {
        a3e a3eVar = xpdVar.zzd;
        if (!((bsd) a3eVar).a) {
            a3eVar = a3eVar.zzd(a3eVar.size() << 1);
            xpdVar.zzd = a3eVar;
        }
        Charset charset = h3e.a;
        int size = arrayList.size();
        if (a3eVar instanceof ArrayList) {
            ((ArrayList) a3eVar).ensureCapacity(a3eVar.size() + size);
        } else if (a3eVar instanceof pae) {
            pae paeVar = (pae) a3eVar;
            int i = paeVar.c + size;
            int length = paeVar.b.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    paeVar.b = Arrays.copyOf(paeVar.b, length);
                } else {
                    paeVar.b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size2 = a3eVar.size();
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String n = tb4.n(a3eVar.size() - size2, "Element at index ", " is null.");
                int size4 = a3eVar.size();
                while (true) {
                    size4--;
                    if (size4 >= size2) {
                        a3eVar.remove(size4);
                    } else {
                        fvc.f(n);
                        return;
                    }
                }
            } else {
                a3eVar.add(obj);
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
                    return new e0e(zzb);
                }
                return new xpd();
            }
            return new vae(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", jpd.class});
        }
        return (byte) 1;
    }
}
