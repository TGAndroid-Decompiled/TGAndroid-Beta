package kc;

import b2.u0;
import c5.c0;
import ec.h;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
public abstract class c {
    public static final int[] f15059a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset f15060b = StandardCharsets.ISO_8859_1;

    public static void a(java.lang.String r8, ic.e r9, ec.a r10, java.nio.charset.Charset r11) {
        throw new UnsupportedOperationException("Method not decompiled: kc.c.a(java.lang.String, ic.e, ec.a, java.nio.charset.Charset):void");
    }

    public static e0.f0 b(java.lang.String r31, ic.c r32, java.util.Map r33) {
        throw new UnsupportedOperationException("Method not decompiled: kc.c.b(java.lang.String, ic.c, java.util.Map):e0.f0");
    }

    public static boolean c(String str) {
        byte[] bytes = str.getBytes(h.f8608b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10 += 2) {
            int i11 = bytes[i10] & 255;
            if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(int i10, ic.f fVar, ic.c cVar) {
        int i11 = fVar.d;
        c0 c0Var = fVar.f12796c[cVar.ordinal()];
        int i12 = c0Var.f4728b;
        int i13 = 0;
        for (u0 u0Var : (u0[]) c0Var.f4729c) {
            i13 += u0Var.f4060a;
        }
        if (i11 - (i13 * i12) < (i10 + 7) / 8) {
            return false;
        }
        return true;
    }
}
