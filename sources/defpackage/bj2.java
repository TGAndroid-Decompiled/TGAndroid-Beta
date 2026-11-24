package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;
public final class bj2 implements vyc {
    static {
        Pattern.compile("[0-9]+");
    }

    public static int a(int i, CharSequence charSequence) {
        char charAt;
        int length = charSequence.length();
        if (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 == 241) {
                return 4;
            }
            if (charAt2 >= '0' && charAt2 <= '9') {
                int i2 = i + 1;
                if (i2 < length && (charAt = charSequence.charAt(i2)) >= '0' && charAt <= '9') {
                    return 3;
                }
                return 2;
            }
        }
        return 1;
    }

    public static boolean[] b(int i, ArrayList arrayList) {
        int[] iArr;
        int i2 = i % 103;
        if (i2 >= 0) {
            int[][] iArr2 = y53.a;
            arrayList.add(iArr2[i2]);
            arrayList.add(iArr2[106]);
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                for (int i5 : (int[]) obj) {
                    i3 += i5;
                }
            }
            boolean[] zArr = new boolean[i3];
            int size2 = arrayList.size();
            int i6 = 0;
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList.get(i7);
                i7++;
                boolean z = true;
                int i8 = 0;
                int i9 = i6;
                for (int i10 : (int[]) obj2) {
                    int i11 = 0;
                    while (i11 < i10) {
                        zArr[i9] = z;
                        i11++;
                        i9++;
                    }
                    i8 += i10;
                    z = !z;
                }
                i6 += i8;
            }
            return zArr;
        }
        w26.j("Unable to compute a valid input checksum");
        return null;
    }

    @Override
    public final defpackage.qj0 n(java.lang.String r28, defpackage.ze0 r29, java.util.EnumMap r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj2.n(java.lang.String, ze0, java.util.EnumMap):qj0");
    }
}
