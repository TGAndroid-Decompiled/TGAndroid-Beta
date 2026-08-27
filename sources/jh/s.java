package jh;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.md;
import org.telegram.tgnet.TLRPC;

public abstract class s {
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

    public static int[] c(TLRPC.TL_jsonArray tL_jsonArray) {
        int[] iArr = new int[tL_jsonArray.value.size() * 7];
        for (int i10 = 0; i10 < tL_jsonArray.value.size(); i10++) {
            TLRPC.JSONValue jSONValue = tL_jsonArray.value.get(i10);
            if (jSONValue instanceof TLRPC.TL_jsonObject) {
                ArrayList<TLRPC.TL_jsonObjectValue> arrayList = ((TLRPC.TL_jsonObject) jSONValue).value;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.TL_jsonObjectValue tL_jsonObjectValue = arrayList.get(i11);
                    i11++;
                    TLRPC.TL_jsonObjectValue tL_jsonObjectValue2 = tL_jsonObjectValue;
                    TLRPC.JSONValue jSONValue2 = tL_jsonObjectValue2.value;
                    int i12 = 2;
                    int i13 = -1;
                    if (jSONValue2 instanceof TLRPC.TL_jsonNumber) {
                        int i14 = (int) ((TLRPC.TL_jsonNumber) jSONValue2).value;
                        String str = tL_jsonObjectValue2.key;
                        str.getClass();
                        switch (str) {
                            case "text_length_max":
                                break;
                            case "pin_period":
                                i12 = 1;
                                break;
                            case "stars":
                                i12 = 0;
                                break;
                            case "emoji_max":
                                i12 = 3;
                                break;
                            default:
                                i12 = -1;
                                break;
                        }
                        if (i12 >= 0) {
                            iArr[(i10 * 7) + i12] = i14;
                        }
                    } else if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                        String str2 = ((TLRPC.TL_jsonString) jSONValue2).value;
                        String str3 = tL_jsonObjectValue2.key;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -1354842834:
                                if (str3.equals("color1")) {
                                    i12 = 0;
                                } else {
                                    i12 = -1;
                                }
                                break;
                            case -1354842833:
                                if (str3.equals("color2")) {
                                    i12 = 1;
                                } else {
                                    i12 = -1;
                                }
                                break;
                            case -628825439:
                                if (!str3.equals("color_bg")) {
                                    i12 = -1;
                                }
                                break;
                            default:
                                i12 = -1;
                                break;
                        }
                        switch (i12) {
                            case 0:
                                i13 = 4;
                                break;
                            case 1:
                                i13 = 5;
                                break;
                            case 2:
                                i13 = 6;
                                break;
                        }
                        if (i13 >= 0) {
                            try {
                                iArr[(i10 * 7) + i13] = (int) Long.parseLong("FF" + str2, 16);
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                        }
                    }
                }
            }
        }
        return iArr;
    }

    public static int[] d(String str) {
        if (str == null || str.length() == 0) {
            return a();
        }
        try {
            return DesugarArrays.stream(str.split(",")).mapToInt(new org.telegram.messenger.d4(1)).toArray();
        } catch (Exception e9) {
            FileLog.e(e9);
            return a();
        }
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
        return (String) DesugarArrays.stream(iArr).mapToObj(new md(0)).collect(Collectors.joining(","));
    }
}
