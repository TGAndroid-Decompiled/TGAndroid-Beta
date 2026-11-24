package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
public final class asd extends f4e {
    private static final asd zzb;
    private d5e zzd = qce.e;

    static {
        asd asdVar = new asd();
        zzb = asdVar;
        f4e.k(asd.class, asdVar);
    }

    public static trd n() {
        return (trd) zzb.f();
    }

    public static void o(asd asdVar, ArrayList arrayList) {
        d5e d5eVar = asdVar.zzd;
        if (!((eud) d5eVar).a) {
            d5eVar = d5eVar.zzd(d5eVar.size() << 1);
            asdVar.zzd = d5eVar;
        }
        Charset charset = k5e.a;
        int size = arrayList.size();
        if (d5eVar instanceof ArrayList) {
            ((ArrayList) d5eVar).ensureCapacity(d5eVar.size() + size);
        } else if (d5eVar instanceof qce) {
            qce qceVar = (qce) d5eVar;
            int i = qceVar.c + size;
            int length = qceVar.b.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    qceVar.b = Arrays.copyOf(qceVar.b, length);
                } else {
                    qceVar.b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size2 = d5eVar.size();
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String o = td4.o(d5eVar.size() - size2, "Element at index ", " is null.");
                int size4 = d5eVar.size();
                while (true) {
                    size4--;
                    if (size4 >= size2) {
                        d5eVar.remove(size4);
                    } else {
                        gxc.d(o);
                        return;
                    }
                }
            } else {
                d5eVar.add(obj);
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
                    return new h2e(zzb);
                }
                return new asd();
            }
            return new wce(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", mrd.class});
        }
        return (byte) 1;
    }
}
