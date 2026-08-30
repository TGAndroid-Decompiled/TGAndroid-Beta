package nh;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.qd;
public abstract class t {
    public static int[] a() {
        return new int[]{10000, 3600, 400, 20, -10787210, -8681059, -14341066, 2000, 1800, 280, 10, -2013375, -1482439, -7666429, 500, 900, 200, 7, -1214690, -1214690, -6606592, 250, 600, 150, 4, -1926647, -1926647, -6668800, 100, 300, 110, 3, -12539616, -12539616, -15244800, 50, 120, 80, 2, -12147733, -12147733, -16756594, 10, 60, 60, 1, -6988581, -6988581, -11991141, 0, 30, 30, 0, -6988581, -6988581, -11991141};
    }

    public static int b(int i10, int i11, int i12) {
        int[] iArr = MessagesController.getInstance(i10).starsGroupcallMessageLimits;
        for (int i13 = 0; i13 < iArr.length / 7; i13++) {
            int i14 = i13 * 7;
            if (i11 >= iArr[i14]) {
                return iArr[i14 + 1 + i12];
            }
        }
        return 0;
    }

    public static int[] c(org.telegram.tgnet.TLRPC.TL_jsonArray r13) {
        throw new UnsupportedOperationException("Method not decompiled: nh.t.c(org.telegram.tgnet.TLRPC$TL_jsonArray):int[]");
    }

    public static int[] d(String str) {
        if (str != null && str.length() != 0) {
            try {
                return DesugarArrays.stream(str.split(",")).mapToInt(new org.telegram.messenger.e4(1)).toArray();
            } catch (Exception e) {
                FileLog.e(e);
                return a();
            }
        }
        return a();
    }

    public static boolean e(int[] iArr, int[] iArr2) {
        if (iArr2 != null && iArr.length == iArr2.length) {
            for (int i10 = 0; i10 < iArr.length; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            return true;
        }
        return false;
    }

    public static String f(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new qd(0)).collect(Collectors.joining(","));
    }
}
