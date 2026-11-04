package g2;

import java.util.Locale;
import java.util.regex.Pattern;
public abstract class h {
    public static final byte[] f11846a = {0, 0, 0, 1};
    public static final String[] f11847b = {"", "A", "B", "C"};
    public static final Pattern f11848c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i3, int i10, int i11, int i12, boolean z10, int[] iArr) {
        char c2;
        String str = f11847b[i3];
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(i11);
        if (z10) {
            c2 = 'H';
        } else {
            c2 = 'L';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c2), Integer.valueOf(i12)};
        String str2 = n0.f11873a;
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

    public static android.util.Pair b(d2.v r33) {
        throw new UnsupportedOperationException("Method not decompiled: g2.h.b(d2.v):android.util.Pair");
    }

    public static android.util.Pair c(java.lang.String r11, java.lang.String[] r12, d2.n r13) {
        throw new UnsupportedOperationException("Method not decompiled: g2.h.c(java.lang.String, java.lang.String[], d2.n):android.util.Pair");
    }
}
