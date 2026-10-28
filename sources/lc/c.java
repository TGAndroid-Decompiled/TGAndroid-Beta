package lc;

import b2.v0;
import d5.z;
import fc.h;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
public abstract class c {
    public static final int[] f16971a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset f16972b = StandardCharsets.ISO_8859_1;

    public static void a(java.lang.String r8, jc.e r9, fc.a r10, java.nio.charset.Charset r11) {
        throw new UnsupportedOperationException("Method not decompiled: lc.c.a(java.lang.String, jc.e, fc.a, java.nio.charset.Charset):void");
    }

    public static e0.e0 b(java.lang.String r31, jc.c r32, java.util.Map r33) {
        throw new UnsupportedOperationException("Method not decompiled: lc.c.b(java.lang.String, jc.c, java.util.Map):e0.e0");
    }

    public static boolean c(String str) {
        byte[] bytes = str.getBytes(h.f10423b);
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

    public static boolean d(int i10, jc.f fVar, jc.c cVar) {
        int i11 = fVar.d;
        z zVar = fVar.f15568c[cVar.ordinal()];
        int i12 = zVar.f8026b;
        int i13 = 0;
        for (v0 v0Var : (v0[]) zVar.f8027c) {
            i13 += v0Var.f3511a;
        }
        if (i11 - (i13 * i12) < (i10 + 7) / 8) {
            return false;
        }
        return true;
    }
}
