package c8;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.ArrayList;
import org.telegram.ui.Components.xw0;
public abstract class na {
    public static int[] a(int i7, int i10, int i11, ArrayList arrayList) {
        int i12;
        int[] iArr = null;
        for (int i13 = 1; i13 <= 4; i13++) {
            iArr = c(i7, i13, i11, arrayList);
            int i14 = 0;
            for (int i15 : iArr) {
                i14 += i15;
            }
            if (i14 <= i10) {
                break;
            }
        }
        if (iArr == null) {
            return new int[Math.max(0, i7)];
        }
        int i16 = 0;
        for (int i17 : iArr) {
            i16 += i17;
        }
        int i18 = i10 - i16;
        if (i18 > 0) {
            int[] c10 = c(i7, 1, i11, arrayList);
            int i19 = 0;
            for (int i20 = 0; i20 < i7; i20++) {
                i19 += Math.max(0, c10[i20] - iArr[i20]);
            }
            if (i19 > 0) {
                float min = Math.min(1.0f, i18 / i19);
                for (int i21 = 0; i21 < i7; i21++) {
                    iArr[i21] = iArr[i21] + ((int) Math.floor(Math.max(0, c10[i21] - i12) * min));
                }
            }
        }
        return iArr;
    }

    public static xw0 b(CharSequence charSequence, TextPaint textPaint, int i7, int i10, int i11, int i12, int i13) {
        float f10;
        float measureText;
        float measureText2;
        ?? obj = new Object();
        obj.f40468a = i7;
        int i14 = 1;
        obj.f40469b = Math.max(1, i10);
        obj.f40470c = i11;
        int i15 = 0;
        obj.f40471e = Math.max(0, Math.min(i12, i13));
        if (charSequence != null && charSequence.length() != 0 && textPaint != null) {
            int length = charSequence.length();
            for (int i16 = 0; i16 < length; i16++) {
                if (charSequence.charAt(i16) == '\n') {
                    i14++;
                }
            }
            obj.f40472f = new float[i14];
            int length2 = charSequence.length();
            int i17 = 0;
            int i18 = 0;
            while (true) {
                f10 = 0.0f;
                if (i15 > length2) {
                    break;
                }
                if (i15 == length2 || charSequence.charAt(i15) == '\n') {
                    float[] fArr = obj.f40472f;
                    int i19 = i18 + 1;
                    if (i15 > i17) {
                        try {
                            measureText2 = Layout.getDesiredWidth(charSequence, i17, i15, textPaint);
                        } catch (Exception unused) {
                            measureText2 = textPaint.measureText(charSequence, i17, i15);
                        }
                        f10 = measureText2;
                    }
                    fArr[i18] = f10;
                    i17 = i15 + 1;
                    i18 = i19;
                }
                i15++;
            }
            String charSequence2 = charSequence.toString();
            BreakIterator lineInstance = BreakIterator.getLineInstance();
            lineInstance.setText(charSequence2);
            int first = lineInstance.first();
            while (true) {
                int i20 = first;
                first = lineInstance.next();
                if (first != -1) {
                    int i21 = first;
                    while (i21 > i20 && Character.isWhitespace(charSequence2.charAt(i21 - 1))) {
                        i21--;
                    }
                    if (i21 > i20) {
                        try {
                            measureText = Layout.getDesiredWidth(charSequence, i20, i21, textPaint);
                        } catch (Exception unused2) {
                            measureText = textPaint.measureText(charSequence, i20, i21);
                        }
                        f10 = Math.max(f10, measureText);
                    }
                } else {
                    obj.d = Math.min(obj.f40471e, (int) Math.ceil(f10));
                    return obj;
                }
            }
        } else {
            obj.d = obj.f40471e;
            obj.f40473g = true;
            return obj;
        }
    }

    public static int[] c(int i7, int i10, int i11, ArrayList arrayList) {
        int i12;
        int i13;
        int max = Math.max(0, i7);
        int[] iArr = new int[max];
        for (int i14 = 0; i14 < max; i14++) {
            iArr[i14] = i11;
        }
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            xw0 xw0Var = (xw0) arrayList.get(i15);
            if (xw0Var.f40469b == 1 && (i13 = xw0Var.f40468a) >= 0 && i13 < i7) {
                iArr[i13] = Math.max(iArr[i13], xw0Var.b(i10));
            }
        }
        int size2 = arrayList.size();
        for (int i16 = 0; i16 < size2; i16++) {
            xw0 xw0Var2 = (xw0) arrayList.get(i16);
            int i17 = xw0Var2.f40469b;
            if (i17 > 1 && (i12 = xw0Var2.f40468a) >= 0 && i12 < i7) {
                int min = Math.min(i7, i12 + i17);
                int i18 = 0;
                for (int i19 = xw0Var2.f40468a; i19 < min; i19++) {
                    i18 += iArr[i19];
                }
                int b10 = xw0Var2.b(i10) - i18;
                for (int i20 = xw0Var2.f40468a; i20 < min && b10 > 0; i20++) {
                    int i21 = min - i20;
                    int i22 = ((b10 + i21) - 1) / i21;
                    iArr[i20] = iArr[i20] + i22;
                    b10 -= i22;
                }
            }
        }
        return iArr;
    }
}
