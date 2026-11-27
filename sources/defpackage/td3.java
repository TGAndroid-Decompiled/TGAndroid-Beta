package defpackage;

import java.nio.ByteBuffer;
import sun.misc.Unsafe;
public abstract class td3 {
    public static final ow5 a = new ow5("CLOSED", (byte) 1);

    public static void a(ed edVar, ed edVar2) {
        boolean i0;
        int[] iArr = {0};
        do {
            i0 = edVar.i0(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int o0 = edVar.o0(iArr, 2);
            if (o0 != 0) {
                if (o0 != 1) {
                    if (o0 == 2) {
                        jq[] jqVarArr = new jq[2];
                        ud3.d(edVar, iArr, jqVarArr);
                        c(edVar, iArr, edVar2, jqVarArr[0], jqVarArr[1]);
                    } else {
                        throw new Exception(String.format("[%s] Bad compression type '11' at the bit index '%d'.", td3.class.getSimpleName(), Integer.valueOf(iArr[0])));
                    }
                } else {
                    c(edVar, iArr, edVar2, bk4.e, wj4.e);
                }
            } else {
                int i = ((iArr[0] + 7) & (-8)) / 8;
                int g0 = (edVar.g0(i) & 255) + ((edVar.g0(i + 1) & 255) << 8);
                int i2 = i + 4;
                edVar2.getClass();
                byte[] array = ((ByteBuffer) edVar.c).array();
                int capacity = ((ByteBuffer) edVar2.c).capacity();
                int i3 = edVar2.b + g0;
                if (capacity < i3) {
                    edVar2.d0(i3 + 1024);
                }
                ((ByteBuffer) edVar2.c).put(array, i2, g0);
                edVar2.b += g0;
                iArr[0] = (i2 + g0) << 3;
            }
            if (edVar.b <= iArr[0] / 8) {
                i0 = true;
                continue;
            }
        } while (!i0);
    }

    public static final Object b(hz9 hz9Var, long j, is4 is4Var) {
        while (true) {
            hz9 hz9Var2 = hz9Var;
            while (true) {
                if (hz9Var2.d >= j && !hz9Var2.d()) {
                    return hz9Var2;
                }
                Object objectVolatile = fx.a.getObjectVolatile(hz9Var2, nr2.a);
                ow5 ow5Var = a;
                if (objectVolatile == ow5Var) {
                    return ow5Var;
                }
                hz9Var = (hz9) ((nr2) objectVolatile);
                if (hz9Var == null) {
                    hz9 hz9Var3 = (hz9) is4Var.invoke(Long.valueOf(hz9Var2.d + 1), hz9Var2);
                    while (true) {
                        Unsafe unsafe = fx.a;
                        long j2 = nr2.a;
                        if (unsafe.compareAndSwapObject(hz9Var2, j2, (Object) null, hz9Var3)) {
                            if (hz9Var2.d()) {
                                hz9Var2.e();
                            }
                            hz9Var2 = hz9Var3;
                        } else if (unsafe.getObjectVolatile(hz9Var2, j2) != null) {
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void c(ed edVar, int[] iArr, ed edVar2, jq jqVar, jq jqVar2) {
        while (true) {
            int m = jqVar.m(edVar, iArr);
            if (m == 256) {
                return;
            }
            if (m >= 0 && m <= 255) {
                edVar2.m0(m);
            } else {
                int e = ud3.e(edVar, iArr, m);
                int c = ud3.c(edVar, iArr, jqVar2);
                int i = edVar2.b;
                byte[] bArr = new byte[e];
                int i2 = i - c;
                int i3 = 0;
                int i4 = i2;
                while (i3 < e) {
                    if (i <= i4) {
                        i4 = i2;
                    }
                    bArr[i3] = edVar2.g0(i4);
                    i3++;
                    i4++;
                }
                edVar2.n0(bArr);
            }
        }
    }
}
