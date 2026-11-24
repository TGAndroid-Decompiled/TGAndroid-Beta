package defpackage;

import android.util.Pair;
import j$.util.Objects;
import java.util.Locale;
import java.util.regex.Pattern;
public abstract class wj2 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");
    public static final byte[] d = {-75, 0, -112, 0, 1};

    public static String a(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        char c2;
        String str = b[i];
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        if (z) {
            c2 = 'H';
        } else {
            c2 = 'L';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c2), Integer.valueOf(i4)};
        String str2 = g8c.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static Pair b(fm4 fm4Var) {
        boolean z;
        vj2 d2 = d(fm4Var);
        if (d2 != null && (z = d2.c)) {
            gre.p(z);
            Integer valueOf = Integer.valueOf(d2.a);
            gre.p(z);
            return new Pair(valueOf, Integer.valueOf(d2.b));
        }
        return null;
    }

    public static defpackage.vj2 c(java.lang.String r12, java.lang.String[] r13, defpackage.hl2 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj2.c(java.lang.String, java.lang.String[], hl2):vj2");
    }

    public static defpackage.vj2 d(defpackage.fm4 r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj2.d(fm4):vj2");
    }

    public static boolean e(fm4 fm4Var) {
        if (Objects.equals(fm4Var.t, "application/x-itut-t35")) {
            for (byte[] bArr : fm4Var.w) {
                int length = bArr.length;
                byte[] bArr2 = d;
                if (length >= bArr2.length) {
                    for (int i = 0; i < bArr2.length; i++) {
                        if (bArr[i] == bArr2[i]) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
