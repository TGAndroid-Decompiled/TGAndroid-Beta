package lc;

import e2.j0;
import java.nio.ByteBuffer;
public abstract class c {
    public static void a(c5.x xVar, c5.x xVar2) {
        boolean l4;
        int[] iArr = {0};
        do {
            l4 = xVar.l(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int p5 = xVar.p(iArr, 2);
            if (p5 != 0) {
                if (p5 != 1) {
                    if (p5 == 2) {
                        j0[] j0VarArr = new j0[2];
                        d.e(xVar, iArr, j0VarArr);
                        b(xVar, iArr, xVar2, j0VarArr[0], j0VarArr[1]);
                    } else {
                        throw new Exception(String.format("[%s] Bad compression type '11' at the bit index '%d'.", c.class.getSimpleName(), Integer.valueOf(iArr[0])));
                    }
                } else {
                    b(xVar, iArr, xVar2, g.e, f.e);
                }
            } else {
                int i10 = ((iArr[0] + 7) & (-8)) / 8;
                int j10 = ((xVar.j(i10 + 1) & 255) * 256) + (xVar.j(i10) & 255);
                int i11 = i10 + 4;
                xVar2.getClass();
                byte[] array = ((ByteBuffer) xVar.f3828c).array();
                int capacity = ((ByteBuffer) xVar2.f3828c).capacity();
                int i12 = xVar2.f3827b + j10;
                if (capacity < i12) {
                    xVar2.i(i12 + 1024);
                }
                ((ByteBuffer) xVar2.f3828c).put(array, i11, j10);
                xVar2.f3827b += j10;
                iArr[0] = (i11 + j10) * 8;
            }
            if (xVar.f3827b <= iArr[0] / 8) {
                l4 = true;
                continue;
            }
        } while (!l4);
    }

    public static void b(c5.x xVar, int[] iArr, c5.x xVar2, j0 j0Var, j0 j0Var2) {
        while (true) {
            int m10 = j0Var.m(xVar, iArr);
            if (m10 == 256) {
                return;
            }
            if (m10 >= 0 && m10 <= 255) {
                xVar2.n(m10);
            } else {
                int f7 = d.f(xVar, iArr, m10);
                int d = d.d(xVar, iArr, j0Var2);
                int i10 = xVar2.f3827b;
                byte[] bArr = new byte[f7];
                int i11 = i10 - d;
                int i12 = 0;
                int i13 = i11;
                while (i12 < f7) {
                    if (i10 <= i13) {
                        i13 = i11;
                    }
                    bArr[i12] = xVar2.j(i13);
                    i12++;
                    i13++;
                }
                xVar2.o(bArr);
            }
        }
    }
}
