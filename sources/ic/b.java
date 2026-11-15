package ic;

import cc.j;
import e2.r0;
import f5.v;
import gc.f;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
public abstract class b {
    public static final int[] f15895a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset f15896b = StandardCharsets.ISO_8859_1;

    public static void a(java.lang.String r8, gc.e r9, cc.a r10, java.nio.charset.Charset r11) {
        throw new UnsupportedOperationException("Method not decompiled: ic.b.a(java.lang.String, gc.e, cc.a, java.nio.charset.Charset):void");
    }

    public static a4.k b(java.lang.String r31, gc.c r32, java.util.HashMap r33) {
        throw new UnsupportedOperationException("Method not decompiled: ic.b.b(java.lang.String, gc.c, java.util.HashMap):a4.k");
    }

    public static boolean c(String str) {
        byte[] bytes = str.getBytes(j.f4903b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7 += 2) {
            int i10 = bytes[i7] & 255;
            if ((i10 < 129 || i10 > 159) && (i10 < 224 || i10 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(int i7, f fVar, gc.c cVar) {
        int i10 = fVar.d;
        v vVar = fVar.f13158c[cVar.ordinal()];
        int i11 = vVar.f11018b;
        int i12 = 0;
        for (r0 r0Var : (r0[]) vVar.f11019c) {
            i12 += r0Var.f10369a;
        }
        if (i10 - (i12 * i11) < (i7 + 7) / 8) {
            return false;
        }
        return true;
    }
}
