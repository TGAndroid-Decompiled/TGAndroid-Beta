package ai;

import a8.sa;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.inputmethod.BaseInputConnection;
import android.widget.EditText;
import android.widget.TextView;
public final class b2 {
    public final TextView f1130a;
    public int f1131b;
    public int f1132c;
    public int d;
    public int f1133e;
    public boolean f1135g;
    public w h;
    public x1 f1136i;
    public a2 f1137j;
    public LinearGradient f1138k;
    public float f1140m;
    public float f1134f = 0.5f;
    public final Matrix f1139l = new Matrix();
    public final sa f1141n = new sa(this, 3);

    public b2(TextView textView) {
        this.f1130a = textView;
    }

    public static float b(float f10) {
        if (f10 < 0.5f) {
            return com.google.android.gms.internal.vision.e2.D(f10, 4.0f, f10, f10);
        }
        return 1.0f - (((float) Math.pow((f10 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
    }

    public final void a() {
        Editable editableText = this.f1130a.getEditableText();
        if (editableText == null) {
            return;
        }
        for (y1 y1Var : (y1[]) editableText.getSpans(0, editableText.length(), y1.class)) {
            editableText.removeSpan(y1Var);
        }
        for (z1 z1Var : (z1[]) editableText.getSpans(0, editableText.length(), z1.class)) {
            editableText.removeSpan(z1Var);
        }
        for (x1 x1Var : (x1[]) editableText.getSpans(0, editableText.length(), x1.class)) {
            editableText.removeSpan(x1Var);
        }
        this.f1136i = null;
    }

    public final void c(int i7, int i10, boolean z10) {
        int i11;
        int i12;
        float f10;
        this.f1131b = i7;
        this.f1132c = i10;
        if (z10) {
            i11 = -10777345;
        } else {
            i11 = -15374904;
        }
        this.d = q0.e(i11);
        if (z10) {
            i12 = -6128385;
        } else {
            i12 = -15823740;
        }
        this.f1133e = q0.e(i12);
        if (z10) {
            f10 = 0.6f;
        } else {
            f10 = 0.75f;
        }
        this.f1134f = f10;
        this.f1138k = null;
    }

    public final void d(Editable editable, int i7) {
        x1[] x1VarArr;
        int length = editable.length();
        int max = Math.max(0, Math.min(i7, length));
        long uptimeMillis = SystemClock.uptimeMillis();
        x1 x1Var = this.f1136i;
        if (x1Var != null) {
            int spanStart = editable.getSpanStart(x1Var);
            if (spanStart >= 0 && spanStart < max) {
                ?? characterStyle = new CharacterStyle();
                characterStyle.f1593a = uptimeMillis;
                editable.setSpan(characterStyle, spanStart, max, 33);
            }
            editable.removeSpan(this.f1136i);
            this.f1136i = null;
        }
        for (x1 x1Var2 : (x1[]) editable.getSpans(0, length, x1.class)) {
            int spanStart2 = editable.getSpanStart(x1Var2);
            int spanEnd = editable.getSpanEnd(x1Var2);
            editable.removeSpan(x1Var2);
            if (spanEnd > spanStart2) {
                editable.setSpan(x1Var2, spanStart2, spanEnd, 33);
            }
        }
        if (max < length) {
            ?? characterStyle2 = new CharacterStyle();
            this.f1136i = characterStyle2;
            editable.setSpan(characterStyle2, max, length, 33);
        }
        g();
    }

    public final void e(int i7, int i10, String str) {
        String[] split;
        boolean z10;
        int i11;
        boolean z11;
        long j3;
        long j10;
        int i12;
        TextView textView = this.f1130a;
        Editable editableText = textView.getEditableText();
        if (editableText == null) {
            return;
        }
        boolean z12 = false;
        int max = Math.max(0, Math.min(i7, editableText.length()));
        String charSequence = editableText.subSequence(max, editableText.length()).toString();
        if (charSequence.equals(str)) {
            if (i10 < 0) {
                i12 = editableText.length();
            } else {
                i12 = max + i10;
            }
            d(editableText, i12);
            return;
        }
        int min = Math.min(charSequence.length(), str.length());
        int i13 = 0;
        while (i13 < min && charSequence.charAt(i13) == str.charAt(i13)) {
            i13++;
        }
        String substring = str.substring(i13);
        int i14 = 0;
        for (String str2 : charSequence.substring(i13).trim().split("\\s+")) {
            int length = str2.length();
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    break;
                } else if (Character.isLetterOrDigit(str2.charAt(i15))) {
                    i14++;
                    break;
                } else {
                    i15++;
                }
            }
        }
        BaseInputConnection.removeComposingSpans(editableText);
        int i16 = i13 + max;
        if (i16 == editableText.length()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            editableText.append((CharSequence) substring);
        } else {
            editableText.replace(i16, editableText.length(), substring);
        }
        int length2 = substring.length() + i16;
        if (z10) {
            i14 = 0;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i17 = 0;
        int i18 = 0;
        while (i16 < length2) {
            while (i16 < length2 && Character.isWhitespace(editableText.charAt(i16))) {
                i16++;
            }
            if (i16 >= length2) {
                break;
            }
            int i19 = i16;
            while (i19 < length2 && !Character.isWhitespace(editableText.charAt(i19))) {
                i19++;
            }
            if (i17 < i14) {
                z11 = true;
            } else {
                z11 = z12;
            }
            int i20 = i16;
            while (true) {
                if (i20 >= i19) {
                    break;
                } else if (Character.isLetterOrDigit(editableText.charAt(i20))) {
                    i17++;
                    break;
                } else {
                    i20++;
                }
            }
            int i21 = i17;
            if (z11) {
                j3 = 0;
            } else {
                j3 = (i18 * 22) + uptimeMillis;
            }
            int i22 = i16;
            while (true) {
                if (i22 > 0) {
                    j10 = 0;
                    if (Character.isWhitespace(editableText.charAt(i22 - 1))) {
                        break;
                    }
                    i22--;
                } else {
                    j10 = 0;
                    break;
                }
            }
            int i23 = length2;
            int i24 = i19;
            while (i24 < editableText.length() && !Character.isWhitespace(editableText.charAt(i24))) {
                i24++;
            }
            Object[] objArr = (y1[]) editableText.getSpans(i22, i24, y1.class);
            int i25 = max;
            int length3 = objArr.length;
            int i26 = 0;
            while (i26 < length3) {
                int i27 = i26;
                Object obj = objArr[i27];
                int i28 = length3;
                if (editableText.getSpanStart(obj) < i24 && editableText.getSpanEnd(obj) > i22) {
                    editableText.removeSpan(obj);
                }
                i26 = i27 + 1;
                length3 = i28;
            }
            if (j3 > j10) {
                z1 z1Var = new z1(j3, this.f1131b);
                z1Var.f1610c = i19 - i16;
                editableText.setSpan(z1Var, i16, i19, 33);
            }
            int i29 = i16;
            editableText.setSpan(new y1(Math.max(uptimeMillis, j3), this.f1131b, this.f1132c), i22, i24, 33);
            if (!z11) {
                i18 += i19 - i29;
            }
            i17 = i21;
            i16 = i19;
            length2 = i23;
            max = i25;
            z12 = false;
        }
        int i30 = max;
        if (i10 < 0) {
            i11 = editableText.length();
        } else {
            i11 = i30 + i10;
        }
        d(editableText, i11);
        if (textView instanceof EditText) {
            ((EditText) textView).setSelection(editableText.length());
        }
        g();
    }

    public final void f(boolean z10) {
        Editable editableText = this.f1130a.getEditableText();
        if (editableText != null) {
            if (z10) {
                if (this.f1138k == null) {
                    float L = org.telegram.messenger.g0.L(150.0f);
                    int f10 = i0.a.f(this.f1134f, this.f1132c, this.d);
                    int f11 = i0.a.f(this.f1134f, this.f1132c, this.f1133e);
                    this.f1138k = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{this.f1132c, f10, i0.a.f(0.5f, f10, f11), f11, this.f1132c}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.MIRROR);
                }
                if (this.f1137j == null) {
                    this.f1137j = new a2(this, 0);
                }
                this.f1140m = 1.0f;
                editableText.setSpan(this.f1137j, 0, editableText.length(), 18);
                g();
                return;
            }
            a2 a2Var = this.f1137j;
            if (a2Var != null) {
                this.f1140m = 0.0f;
                editableText.removeSpan(a2Var);
            }
        }
    }

    public final void g() {
        if (this.f1135g) {
            return;
        }
        this.f1135g = true;
        this.f1130a.postOnAnimation(this.f1141n);
    }
}
