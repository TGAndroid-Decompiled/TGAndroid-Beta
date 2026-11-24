package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.inputmethod.BaseInputConnection;
import android.widget.EditText;
import android.widget.TextView;
public final class qn3 {
    public final TextView a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean g;
    public bm3 h;
    public mn3 i;
    public pn3 j;
    public LinearGradient k;
    public float m;
    public float f = 0.5f;
    public final Matrix l = new Matrix();
    public final o1 n = new o1(this, (byte) 23);

    public qn3(TextView textView) {
        this.a = textView;
    }

    public static float b(float f) {
        if (f < 0.5f) {
            return yjb.C(f, 4.0f, f, f);
        }
        return 1.0f - (((float) Math.pow((f * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
    }

    public final void a() {
        Editable editableText = this.a.getEditableText();
        if (editableText == null) {
            return;
        }
        for (nn3 nn3Var : (nn3[]) editableText.getSpans(0, editableText.length(), nn3.class)) {
            editableText.removeSpan(nn3Var);
        }
        for (on3 on3Var : (on3[]) editableText.getSpans(0, editableText.length(), on3.class)) {
            editableText.removeSpan(on3Var);
        }
        for (mn3 mn3Var : (mn3[]) editableText.getSpans(0, editableText.length(), mn3.class)) {
            editableText.removeSpan(mn3Var);
        }
        this.i = null;
    }

    public final void c(int i, int i2, boolean z) {
        int i3;
        int i4;
        float f;
        this.b = i;
        this.c = i2;
        if (z) {
            i3 = -10777345;
        } else {
            i3 = -15374904;
        }
        this.d = om3.e(i3);
        if (z) {
            i4 = -6128385;
        } else {
            i4 = -15823740;
        }
        this.e = om3.e(i4);
        if (z) {
            f = 0.6f;
        } else {
            f = 0.75f;
        }
        this.f = f;
        this.k = null;
    }

    public final void d(Editable editable, int i) {
        mn3[] mn3VarArr;
        int length = editable.length();
        int max = Math.max(0, Math.min(i, length));
        long uptimeMillis = SystemClock.uptimeMillis();
        mn3 mn3Var = this.i;
        if (mn3Var != null) {
            int spanStart = editable.getSpanStart(mn3Var);
            if (spanStart >= 0 && spanStart < max) {
                ?? characterStyle = new CharacterStyle();
                characterStyle.a = uptimeMillis;
                editable.setSpan(characterStyle, spanStart, max, 33);
            }
            editable.removeSpan(this.i);
            this.i = null;
        }
        for (mn3 mn3Var2 : (mn3[]) editable.getSpans(0, length, mn3.class)) {
            int spanStart2 = editable.getSpanStart(mn3Var2);
            int spanEnd = editable.getSpanEnd(mn3Var2);
            editable.removeSpan(mn3Var2);
            if (spanEnd > spanStart2) {
                editable.setSpan(mn3Var2, spanStart2, spanEnd, 33);
            }
        }
        if (max < length) {
            ?? characterStyle2 = new CharacterStyle();
            this.i = characterStyle2;
            editable.setSpan(characterStyle2, max, length, 33);
        }
        g();
    }

    public final void e(int i, int i2, String str) {
        String[] split;
        boolean z;
        int i3;
        boolean z2;
        long j;
        long j2;
        int i4;
        TextView textView = this.a;
        Editable editableText = textView.getEditableText();
        if (editableText == null) {
            return;
        }
        boolean z3 = false;
        int max = Math.max(0, Math.min(i, editableText.length()));
        String charSequence = editableText.subSequence(max, editableText.length()).toString();
        if (charSequence.equals(str)) {
            if (i2 < 0) {
                i4 = editableText.length();
            } else {
                i4 = max + i2;
            }
            d(editableText, i4);
            return;
        }
        int min = Math.min(charSequence.length(), str.length());
        int i5 = 0;
        while (i5 < min && charSequence.charAt(i5) == str.charAt(i5)) {
            i5++;
        }
        String substring = str.substring(i5);
        int i6 = 0;
        for (String str2 : charSequence.substring(i5).trim().split("\\s+")) {
            int length = str2.length();
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                } else if (Character.isLetterOrDigit(str2.charAt(i7))) {
                    i6++;
                    break;
                } else {
                    i7++;
                }
            }
        }
        BaseInputConnection.removeComposingSpans(editableText);
        int i8 = i5 + max;
        if (i8 == editableText.length()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            editableText.append((CharSequence) substring);
        } else {
            editableText.replace(i8, editableText.length(), substring);
        }
        int length2 = substring.length() + i8;
        if (z) {
            i6 = 0;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i9 = 0;
        int i10 = 0;
        loop3: while (i8 < length2) {
            while (i8 < length2) {
                if (Character.isWhitespace(editableText.charAt(i8))) {
                    i8++;
                } else {
                    int i11 = i8;
                    while (i11 < length2 && !Character.isWhitespace(editableText.charAt(i11))) {
                        i11++;
                    }
                    if (i9 < i6) {
                        z2 = true;
                    } else {
                        z2 = z3;
                    }
                    int i12 = i8;
                    while (true) {
                        if (i12 >= i11) {
                            break;
                        } else if (Character.isLetterOrDigit(editableText.charAt(i12))) {
                            i9++;
                            break;
                        } else {
                            i12++;
                        }
                    }
                    int i13 = i9;
                    if (z2) {
                        j = 0;
                    } else {
                        j = (i10 * 22) + uptimeMillis;
                    }
                    int i14 = i8;
                    while (true) {
                        if (i14 > 0) {
                            j2 = 0;
                            if (Character.isWhitespace(editableText.charAt(i14 - 1))) {
                                break;
                            }
                            i14--;
                        } else {
                            j2 = 0;
                            break;
                        }
                    }
                    int i15 = length2;
                    int i16 = i11;
                    while (i16 < editableText.length() && !Character.isWhitespace(editableText.charAt(i16))) {
                        i16++;
                    }
                    Object[] objArr = (nn3[]) editableText.getSpans(i14, i16, nn3.class);
                    int i17 = max;
                    int length3 = objArr.length;
                    int i18 = 0;
                    while (i18 < length3) {
                        int i19 = i18;
                        Object obj = objArr[i19];
                        int i20 = length3;
                        if (editableText.getSpanStart(obj) < i16 && editableText.getSpanEnd(obj) > i14) {
                            editableText.removeSpan(obj);
                        }
                        i18 = i19 + 1;
                        length3 = i20;
                    }
                    if (j > j2) {
                        on3 on3Var = new on3(j, this.b);
                        on3Var.c = i11 - i8;
                        editableText.setSpan(on3Var, i8, i11, 33);
                    }
                    int i21 = i8;
                    editableText.setSpan(new nn3(Math.max(uptimeMillis, j), this.b, this.c), i14, i16, 33);
                    if (!z2) {
                        i10 += i11 - i21;
                    }
                    i9 = i13;
                    i8 = i11;
                    length2 = i15;
                    max = i17;
                    z3 = false;
                }
            }
            break loop3;
        }
        int i22 = max;
        if (i2 < 0) {
            i3 = editableText.length();
        } else {
            i3 = i22 + i2;
        }
        d(editableText, i3);
        if (textView instanceof EditText) {
            ((EditText) textView).setSelection(editableText.length());
        }
        g();
    }

    public final void f(boolean z) {
        Editable editableText = this.a.getEditableText();
        if (editableText != null) {
            if (z) {
                if (this.k == null) {
                    float L = gl.L(150.0f);
                    int f = bm2.f(this.f, this.c, this.d);
                    int f2 = bm2.f(this.f, this.c, this.e);
                    this.k = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{this.c, f, bm2.f(0.5f, f, f2), f2, this.c}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.MIRROR);
                }
                pn3 pn3Var = this.j;
                if (pn3Var == null) {
                    pn3Var = new pn3(this, (byte) 0);
                    this.j = pn3Var;
                }
                this.m = 1.0f;
                editableText.setSpan(pn3Var, 0, editableText.length(), 18);
                g();
                return;
            }
            pn3 pn3Var2 = this.j;
            if (pn3Var2 != null) {
                this.m = 0.0f;
                editableText.removeSpan(pn3Var2);
            }
        }
    }

    public final void g() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.a.postOnAnimation(this.n);
    }
}
