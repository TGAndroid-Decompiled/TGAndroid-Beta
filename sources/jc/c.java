package jc;

import b2.q0;
import c5.b0;
import dc.h;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
public abstract class c {
    public static final int[] f13600a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset f13601b = StandardCharsets.ISO_8859_1;

    public static void a(java.lang.String r8, hc.e r9, dc.a r10, java.nio.charset.Charset r11) {
        throw new UnsupportedOperationException("Method not decompiled: jc.c.a(java.lang.String, hc.e, dc.a, java.nio.charset.Charset):void");
    }

    public static boolean b(String str) {
        byte[] bytes = str.getBytes(h.f6718b);
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

    public static boolean c(int i10, hc.f fVar, hc.c cVar) {
        int i11 = fVar.d;
        b0 b0Var = fVar.f10946c[cVar.ordinal()];
        int i12 = b0Var.f4346b;
        int i13 = 0;
        for (q0 q0Var : (q0[]) b0Var.f4347c) {
            i13 += q0Var.f2260a;
        }
        if (i11 - (i13 * i12) < (i10 + 7) / 8) {
            return false;
        }
        return true;
    }
}
