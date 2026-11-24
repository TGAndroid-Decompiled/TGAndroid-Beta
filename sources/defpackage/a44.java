package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
public abstract class a44 {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset b = StandardCharsets.ISO_8859_1;

    public static void a(java.lang.String r8, defpackage.ig7 r9, defpackage.pk0 r10, java.nio.charset.Charset r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a44.a(java.lang.String, ig7, pk0, java.nio.charset.Charset):void");
    }

    public static defpackage.e0c b(java.lang.String r27, defpackage.g54 r28, java.util.AbstractMap r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a44.b(java.lang.String, g54, java.util.AbstractMap):e0c");
    }

    public static boolean c(String str) {
        byte[] bytes = str.getBytes(fbb.b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < length; i += 2) {
            int i2 = bytes[i] & 255;
            if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(int i, ybc ybcVar, g54 g54Var) {
        int i2 = ybcVar.d;
        ohd ohdVar = ybcVar.c[g54Var.ordinal()];
        byte b2 = ohdVar.a;
        int i3 = 0;
        for (xbc xbcVar : (xbc[]) ohdVar.b) {
            i3 += xbcVar.a;
        }
        if (i2 - (i3 * b2) < (i + 7) / 8) {
            return false;
        }
        return true;
    }
}
