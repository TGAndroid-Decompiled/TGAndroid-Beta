package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.ArrayList;
public abstract class cxe {
    public static int[] a(int i, int i2, int i3, ArrayList arrayList) {
        int i4;
        int[] iArr = null;
        for (int i5 = 1; i5 <= 4; i5++) {
            iArr = c(i, i5, i3, arrayList);
            int i6 = 0;
            for (int i7 : iArr) {
                i6 += i7;
            }
            if (i6 <= i2) {
                break;
            }
        }
        if (iArr == null) {
            return new int[Math.max(0, i)];
        }
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        int i10 = i2 - i8;
        if (i10 > 0) {
            int[] c = c(i, 1, i3, arrayList);
            int i11 = 0;
            for (int i12 = 0; i12 < i; i12++) {
                i11 += Math.max(0, c[i12] - iArr[i12]);
            }
            if (i11 > 0) {
                float min = Math.min(1.0f, i10 / i11);
                for (int i13 = 0; i13 < i; i13++) {
                    iArr[i13] = iArr[i13] + ((int) Math.floor(Math.max(0, c[i13] - i4) * min));
                }
            }
        }
        return iArr;
    }

    public static ogb b(CharSequence charSequence, TextPaint textPaint, int i, int i2, int i3, int i4, int i5) {
        float f;
        float measureText;
        float measureText2;
        ?? obj = new Object();
        obj.a = i;
        int i6 = 1;
        obj.b = Math.max(1, i2);
        obj.c = i3;
        int i7 = 0;
        obj.e = Math.max(0, Math.min(i4, i5));
        if (charSequence != null && charSequence.length() != 0 && textPaint != null) {
            int length = charSequence.length();
            for (int i8 = 0; i8 < length; i8++) {
                if (charSequence.charAt(i8) == '\n') {
                    i6++;
                }
            }
            obj.f = new float[i6];
            int length2 = charSequence.length();
            int i9 = 0;
            int i10 = 0;
            while (true) {
                f = 0.0f;
                if (i7 > length2) {
                    break;
                }
                if (i7 == length2 || charSequence.charAt(i7) == '\n') {
                    float[] fArr = obj.f;
                    int i11 = i10 + 1;
                    if (i7 > i9) {
                        try {
                            measureText2 = Layout.getDesiredWidth(charSequence, i9, i7, textPaint);
                        } catch (Exception unused) {
                            measureText2 = textPaint.measureText(charSequence, i9, i7);
                        }
                        f = measureText2;
                    }
                    fArr[i10] = f;
                    i9 = i7 + 1;
                    i10 = i11;
                }
                i7++;
            }
            String charSequence2 = charSequence.toString();
            BreakIterator lineInstance = BreakIterator.getLineInstance();
            lineInstance.setText(charSequence2);
            int first = lineInstance.first();
            while (true) {
                int i12 = first;
                first = lineInstance.next();
                if (first != -1) {
                    int i13 = first;
                    while (true) {
                        if (i13 <= i12) {
                            break;
                        } else if (!Character.isWhitespace(charSequence2.charAt(i13 - 1))) {
                            try {
                                measureText = Layout.getDesiredWidth(charSequence, i12, i13, textPaint);
                            } catch (Exception unused2) {
                                measureText = textPaint.measureText(charSequence, i12, i13);
                            }
                            f = Math.max(f, measureText);
                            break;
                        } else {
                            i13--;
                        }
                    }
                } else {
                    obj.d = Math.min(obj.e, (int) Math.ceil(f));
                    return obj;
                }
            }
        } else {
            obj.d = obj.e;
            obj.g = true;
            return obj;
        }
    }

    public static int[] c(int i, int i2, int i3, ArrayList arrayList) {
        int i4;
        int i5;
        int max = Math.max(0, i);
        int[] iArr = new int[max];
        for (int i6 = 0; i6 < max; i6++) {
            iArr[i6] = i3;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ogb ogbVar = (ogb) arrayList.get(i7);
            if (ogbVar.b == 1 && (i5 = ogbVar.a) >= 0 && i5 < i) {
                iArr[i5] = Math.max(iArr[i5], ogbVar.b(i2));
            }
        }
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ogb ogbVar2 = (ogb) arrayList.get(i8);
            int i9 = ogbVar2.b;
            if (i9 > 1 && (i4 = ogbVar2.a) >= 0 && i4 < i) {
                int min = Math.min(i, i4 + i9);
                int i10 = 0;
                for (int i11 = ogbVar2.a; i11 < min; i11++) {
                    i10 += iArr[i11];
                }
                int b = ogbVar2.b(i2) - i10;
                for (int i12 = ogbVar2.a; i12 < min && b > 0; i12++) {
                    int i13 = min - i12;
                    int i14 = ((b + i13) - 1) / i13;
                    iArr[i12] = iArr[i12] + i14;
                    b -= i14;
                }
            }
        }
        return iArr;
    }
}
