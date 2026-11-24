package defpackage;

import java.nio.ByteBuffer;
import sun.misc.Unsafe;
public abstract class bd3 {
    public static final lo5 a = new lo5("CLOSED");

    public static void a(dd ddVar, dd ddVar2) {
        boolean g0;
        int[] iArr = {0};
        do {
            g0 = ddVar.g0(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int m0 = ddVar.m0(iArr, 2);
            if (m0 != 0) {
                if (m0 != 1) {
                    if (m0 == 2) {
                        iq[] iqVarArr = new iq[2];
                        cd3.d(ddVar, iArr, iqVarArr);
                        c(ddVar, iArr, ddVar2, iqVarArr[0], iqVarArr[1]);
                    } else {
                        throw new Exception(String.format("[%s] Bad compression type '11' at the bit index '%d'.", bd3.class.getSimpleName(), Integer.valueOf(iArr[0])));
                    }
                } else {
                    c(ddVar, iArr, ddVar2, xh4.e, sh4.e);
                }
            } else {
                int i = ((iArr[0] + 7) & (-8)) / 8;
                int e0 = (ddVar.e0(i) & 255) + ((ddVar.e0(i + 1) & 255) << 8);
                int i2 = i + 4;
                ddVar2.getClass();
                byte[] array = ((ByteBuffer) ddVar.c).array();
                int capacity = ((ByteBuffer) ddVar2.c).capacity();
                int i3 = ddVar2.b + e0;
                if (capacity < i3) {
                    ddVar2.b0(i3 + 1024);
                }
                ((ByteBuffer) ddVar2.c).put(array, i2, e0);
                ddVar2.b += e0;
                iArr[0] = (i2 + e0) << 3;
            }
            if (ddVar.b <= iArr[0] / 8) {
                g0 = true;
                continue;
            }
        } while (!g0);
    }

    public static final Object b(nv9 nv9Var, long j, eq4 eq4Var) {
        while (true) {
            nv9 nv9Var2 = nv9Var;
            while (true) {
                if (nv9Var2.d >= j && !nv9Var2.d()) {
                    return nv9Var2;
                }
                Object objectVolatile = ex.a.getObjectVolatile(nv9Var2, uq2.a);
                lo5 lo5Var = a;
                if (objectVolatile == lo5Var) {
                    return lo5Var;
                }
                nv9Var = (nv9) ((uq2) objectVolatile);
                if (nv9Var == null) {
                    nv9 nv9Var3 = (nv9) eq4Var.invoke(Long.valueOf(nv9Var2.d + 1), nv9Var2);
                    while (true) {
                        Unsafe unsafe = ex.a;
                        long j2 = uq2.a;
                        if (unsafe.compareAndSwapObject(nv9Var2, j2, (Object) null, nv9Var3)) {
                            if (nv9Var2.d()) {
                                nv9Var2.e();
                            }
                            nv9Var2 = nv9Var3;
                        } else if (unsafe.getObjectVolatile(nv9Var2, j2) != null) {
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void c(dd ddVar, int[] iArr, dd ddVar2, iq iqVar, iq iqVar2) {
        while (true) {
            int m = iqVar.m(ddVar, iArr);
            if (m == 256) {
                return;
            }
            if (m >= 0 && m <= 255) {
                ddVar2.k0(m);
            } else {
                int e = cd3.e(ddVar, iArr, m);
                int c = cd3.c(ddVar, iArr, iqVar2);
                int i = ddVar2.b;
                byte[] bArr = new byte[e];
                int i2 = i - c;
                int i3 = 0;
                int i4 = i2;
                while (i3 < e) {
                    if (i <= i4) {
                        i4 = i2;
                    }
                    bArr[i3] = ddVar2.e0(i4);
                    i3++;
                    i4++;
                }
                ddVar2.l0(bArr);
            }
        }
    }
}
