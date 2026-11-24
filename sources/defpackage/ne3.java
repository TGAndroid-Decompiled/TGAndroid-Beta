package defpackage;

import java.nio.ByteBuffer;
import sun.misc.Unsafe;
public abstract class ne3 {
    public static final du2 a = new du2("CLOSED", (byte) 2);

    public static void a(de deVar, de deVar2) {
        boolean h0;
        int[] iArr = {0};
        do {
            h0 = deVar.h0(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int n0 = deVar.n0(iArr, 2);
            if (n0 != 0) {
                if (n0 != 1) {
                    if (n0 == 2) {
                        ir[] irVarArr = new ir[2];
                        oe3.d(deVar, iArr, irVarArr);
                        c(deVar, iArr, deVar2, irVarArr[0], irVarArr[1]);
                    } else {
                        throw new Exception(String.format("[%s] Bad compression type '11' at the bit index '%d'.", ne3.class.getSimpleName(), Integer.valueOf(iArr[0])));
                    }
                } else {
                    c(deVar, iArr, deVar2, bk4.e, wj4.e);
                }
            } else {
                int i = ((iArr[0] + 7) & (-8)) / 8;
                int f0 = (deVar.f0(i) & 255) + ((deVar.f0(i + 1) & 255) << 8);
                int i2 = i + 4;
                deVar2.getClass();
                byte[] array = ((ByteBuffer) deVar.c).array();
                int capacity = ((ByteBuffer) deVar2.c).capacity();
                int i3 = deVar2.b + f0;
                if (capacity < i3) {
                    deVar2.c0(i3 + 1024);
                }
                ((ByteBuffer) deVar2.c).put(array, i2, f0);
                deVar2.b += f0;
                iArr[0] = (i2 + f0) << 3;
            }
            if (deVar.b <= iArr[0] / 8) {
                h0 = true;
                continue;
            }
        } while (!h0);
    }

    public static final Object b(qx9 qx9Var, long j, fs4 fs4Var) {
        while (true) {
            qx9 qx9Var2 = qx9Var;
            while (true) {
                if (qx9Var2.d >= j && !qx9Var2.d()) {
                    return qx9Var2;
                }
                Object objectVolatile = fy.a.getObjectVolatile(qx9Var2, fs2.a);
                du2 du2Var = a;
                if (objectVolatile == du2Var) {
                    return du2Var;
                }
                qx9Var = (qx9) ((fs2) objectVolatile);
                if (qx9Var == null) {
                    qx9 qx9Var3 = (qx9) fs4Var.invoke(Long.valueOf(qx9Var2.d + 1), qx9Var2);
                    while (true) {
                        Unsafe unsafe = fy.a;
                        long j2 = fs2.a;
                        if (unsafe.compareAndSwapObject(qx9Var2, j2, (Object) null, qx9Var3)) {
                            if (qx9Var2.d()) {
                                qx9Var2.e();
                            }
                            qx9Var2 = qx9Var3;
                        } else if (unsafe.getObjectVolatile(qx9Var2, j2) != null) {
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void c(de deVar, int[] iArr, de deVar2, ir irVar, ir irVar2) {
        while (true) {
            int m = irVar.m(deVar, iArr);
            if (m == 256) {
                return;
            }
            if (m >= 0 && m <= 255) {
                deVar2.l0(m);
            } else {
                int e = oe3.e(deVar, iArr, m);
                int c = oe3.c(deVar, iArr, irVar2);
                int i = deVar2.b;
                byte[] bArr = new byte[e];
                int i2 = i - c;
                int i3 = 0;
                int i4 = i2;
                while (i3 < e) {
                    if (i <= i4) {
                        i4 = i2;
                    }
                    bArr[i3] = deVar2.f0(i4);
                    i3++;
                    i4++;
                }
                deVar2.m0(bArr);
            }
        }
    }
}
