package g7;

import android.graphics.Path;
import java.util.ArrayList;

public abstract class w7 {
    public static boolean a(i0.e[] eVarArr, i0.e[] eVarArr2) {
        if (eVarArr == null || eVarArr2 == null || eVarArr.length != eVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            i0.e eVar = eVarArr[i10];
            char c10 = eVar.f10493a;
            i0.e eVar2 = eVarArr2[i10];
            if (c10 != eVar2.f10493a || eVar.f10494b.length != eVar2.f10494b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i10, length);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static i0.e[] c(String str) {
        int i10;
        String strTrim;
        float[] fArrB;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i12 < str.length()) {
            while (i12 < str.length()) {
                char cCharAt = str.charAt(i12);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i13, i12).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i11) != 'z' || strTrim.charAt(i11) == 'Z') {
                                fArrB = new float[i11];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i14 = 1;
                                    int i15 = 0;
                                    while (i14 < length) {
                                        boolean z10 = false;
                                        boolean z11 = false;
                                        boolean z12 = false;
                                        boolean z13 = false;
                                        for (int i16 = i14; i16 < strTrim.length(); i16++) {
                                            char cCharAt2 = strTrim.charAt(i16);
                                            if (cCharAt2 == ' ') {
                                                z10 = false;
                                                z12 = true;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        z10 = false;
                                                        z12 = true;
                                                        break;
                                                    case '-':
                                                        if (i16 == i14 || z10) {
                                                            z10 = false;
                                                        } else {
                                                            z10 = false;
                                                            z12 = true;
                                                            z13 = true;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (z11) {
                                                            z10 = false;
                                                            z12 = true;
                                                            z13 = true;
                                                        } else {
                                                            z10 = false;
                                                            z11 = true;
                                                        }
                                                        break;
                                                    default:
                                                        z10 = false;
                                                        break;
                                                }
                                            } else {
                                                z10 = true;
                                            }
                                            if (z12) {
                                                if (i14 < i16) {
                                                    fArr[i15] = Float.parseFloat(strTrim.substring(i14, i16));
                                                    i15++;
                                                }
                                                if (z13) {
                                                    i14 = i16;
                                                } else {
                                                    i14 = i16 + 1;
                                                }
                                            }
                                        }
                                        if (i14 < i16) {
                                            fArr[i15] = Float.parseFloat(strTrim.substring(i14, i16));
                                            i15++;
                                        }
                                        if (z13) {
                                            i14 = i16;
                                        } else {
                                            i14 = i16 + 1;
                                        }
                                    }
                                    fArrB = b(fArr, i15);
                                    i11 = 0;
                                } catch (NumberFormatException e9) {
                                    throw new RuntimeException(a9.p.m("error in parsing \"", strTrim, "\""), e9);
                                }
                            }
                            arrayList.add(new i0.e(strTrim.charAt(i11), fArrB));
                        }
                        i13 = i12;
                        i12++;
                        i11 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i12++;
            }
            strTrim = str.substring(i13, i12).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i11) != 'z') {
                    fArrB = new float[i11];
                } else {
                    fArrB = new float[i11];
                }
                arrayList.add(new i0.e(strTrim.charAt(i11), fArrB));
            }
            i13 = i12;
            i12++;
            i11 = 0;
        }
        if (i12 - i13 != 1 || i13 >= str.length()) {
            i10 = 0;
        } else {
            i10 = 0;
            arrayList.add(new i0.e(str.charAt(i13), new float[0]));
        }
        return (i0.e[]) arrayList.toArray(new i0.e[i10]);
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            i0.e.b(c(str), path);
            return path;
        } catch (RuntimeException e9) {
            throw new RuntimeException("Error in parsing ".concat(str), e9);
        }
    }

    public static i0.e[] e(i0.e[] eVarArr) {
        i0.e[] eVarArr2 = new i0.e[eVarArr.length];
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10] = new i0.e(eVarArr[i10]);
        }
        return eVarArr2;
    }
}
