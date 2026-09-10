package e2;

import java.util.Locale;
import java.util.regex.Pattern;
public abstract class e {
    public static final byte[] f7197a = {0, 0, 0, 1};
    public static final String[] f7198b = {"", "A", "B", "C"};
    public static final Pattern f7199c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        char c10;
        String str = f7198b[i10];
        Integer valueOf = Integer.valueOf(i11);
        Integer valueOf2 = Integer.valueOf(i12);
        if (z10) {
            c10 = 'H';
        } else {
            c10 = 'L';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c10), Integer.valueOf(i13)};
        String str2 = d0.f7188a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static android.util.Pair b(b2.s r33) {
        throw new UnsupportedOperationException("Method not decompiled: e2.e.b(b2.s):android.util.Pair");
    }

    public static android.util.Pair c(java.lang.String r11, java.lang.String[] r12, b2.j r13) {
        throw new UnsupportedOperationException("Method not decompiled: e2.e.c(java.lang.String, java.lang.String[], b2.j):android.util.Pair");
    }
}
