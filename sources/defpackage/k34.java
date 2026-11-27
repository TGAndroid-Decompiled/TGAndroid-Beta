package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
public abstract class k34 {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset b = StandardCharsets.ISO_8859_1;

    public static void a(java.lang.String r8, defpackage.pg7 r9, defpackage.qj0 r10, java.nio.charset.Charset r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k34.a(java.lang.String, pg7, qj0, java.nio.charset.Charset):void");
    }

    public static defpackage.d2c b(java.lang.String r27, defpackage.r44 r28, java.util.AbstractMap r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k34.b(java.lang.String, r44, java.util.AbstractMap):d2c");
    }

    public static boolean c(String str) {
        byte[] bytes = str.getBytes(bdb.b);
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

    public static boolean d(int i, xdc xdcVar, r44 r44Var) {
        int i2 = xdcVar.d;
        ekd ekdVar = xdcVar.c[r44Var.ordinal()];
        byte b2 = ekdVar.a;
        int i3 = 0;
        for (wdc wdcVar : (wdc[]) ekdVar.b) {
            i3 += wdcVar.a;
        }
        if (i2 - (i3 * b2) < (i + 7) / 8) {
            return false;
        }
        return true;
    }
}
