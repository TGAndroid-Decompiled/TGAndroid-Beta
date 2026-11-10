package h2;

import java.util.Locale;
import java.util.regex.Pattern;
public abstract class g {
    public static final byte[] f14087a = {0, 0, 0, 1};
    public static final String[] f14088b = {"", "A", "B", "C"};
    public static final Pattern f14089c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i7, int i10, int i11, int i12, boolean z9, int[] iArr) {
        char c10;
        String str = f14088b[i7];
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(i11);
        if (z9) {
            c10 = 'H';
        } else {
            c10 = 'L';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c10), Integer.valueOf(i12)};
        String str2 = m0.f14114a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i13 = 0; i13 < length; i13++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i13])));
        }
        return sb2.toString();
    }

    public static android.util.Pair b(e2.u r33) {
        throw new UnsupportedOperationException("Method not decompiled: h2.g.b(e2.u):android.util.Pair");
    }

    public static android.util.Pair c(java.lang.String r11, java.lang.String[] r12, e2.m r13) {
        throw new UnsupportedOperationException("Method not decompiled: h2.g.c(java.lang.String, java.lang.String[], e2.m):android.util.Pair");
    }
}
