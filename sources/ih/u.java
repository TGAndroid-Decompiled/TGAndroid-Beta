package ih;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.id;
public abstract class u {
    public static int[] a() {
        return new int[]{10000, 3600, 400, 20, -10787210, -8681059, -14341066, 2000, 1800, 280, 10, -2013375, -1482439, -7666429, 500, 900, 200, 7, -1214690, -1214690, -6606592, 250, 600, 150, 4, -1926647, -1926647, -6668800, 100, 300, 110, 3, -12539616, -12539616, -15244800, 50, 120, 80, 2, -12147733, -12147733, -16756594, 10, 60, 60, 1, -6988581, -6988581, -11991141, 0, 30, 30, 0, -6988581, -6988581, -11991141};
    }

    public static int b(int i9, int i10, int i11) {
        int[] iArr = MessagesController.getInstance(i9).starsGroupcallMessageLimits;
        for (int i12 = 0; i12 < iArr.length / 7; i12++) {
            int i13 = i12 * 7;
            if (i10 >= iArr[i13]) {
                return iArr[i13 + 1 + i11];
            }
        }
        return 0;
    }

    public static int[] c(org.telegram.tgnet.TLRPC.TL_jsonArray r13) {
        throw new UnsupportedOperationException("Method not decompiled: ih.u.c(org.telegram.tgnet.TLRPC$TL_jsonArray):int[]");
    }

    public static int[] d(String str) {
        if (str != null && str.length() != 0) {
            try {
                return DesugarArrays.stream(str.split(",")).mapToInt(new org.telegram.messenger.b4(1)).toArray();
            } catch (Exception e10) {
                FileLog.e(e10);
                return a();
            }
        }
        return a();
    }

    public static boolean e(int[] iArr, int[] iArr2) {
        if (iArr2 != null && iArr.length == iArr2.length) {
            for (int i9 = 0; i9 < iArr.length; i9++) {
                if (iArr[i9] == iArr2[i9]) {
                }
            }
            return true;
        }
        return false;
    }

    public static String f(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new id(0)).collect(Collectors.joining(","));
    }
}
