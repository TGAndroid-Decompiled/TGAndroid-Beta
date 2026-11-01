package cc;

import ac.g;
import c5.x;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import wb.h;
public abstract class b {
    public static final int[] f4103a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset f4104b = StandardCharsets.ISO_8859_1;

    public static void a(java.lang.String r8, ac.f r9, wb.a r10, java.nio.charset.Charset r11) {
        throw new UnsupportedOperationException("Method not decompiled: cc.b.a(java.lang.String, ac.f, wb.a, java.nio.charset.Charset):void");
    }

    public static cc.f b(java.lang.String r31, ac.d r32, java.util.HashMap r33) {
        throw new UnsupportedOperationException("Method not decompiled: cc.b.b(java.lang.String, ac.d, java.util.HashMap):cc.f");
    }

    public static boolean c(String str) {
        byte[] bytes = str.getBytes(h.f52812b);
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

    public static boolean d(int i10, ac.h hVar, ac.d dVar) {
        int i11 = hVar.d;
        x xVar = hVar.f390c[dVar.ordinal()];
        int i12 = xVar.f3827b;
        int i13 = 0;
        for (g gVar : (g[]) xVar.f3828c) {
            i13 += gVar.f385a;
        }
        if (i11 - (i13 * i12) < (i10 + 7) / 8) {
            return false;
        }
        return true;
    }
}
