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
public final class ho3 {
    public final TextView a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean g;
    public um3 h;
    public do3 i;
    public go3 j;
    public LinearGradient k;
    public float m;
    public float f = 0.5f;
    public final Matrix l = new Matrix();
    public final p1 n = new p1(this, (byte) 23);

    public ho3(TextView textView) {
        this.a = textView;
    }

    public static float b(float f) {
        if (f < 0.5f) {
            return xnb.C(f, 4.0f, f, f);
        }
        return 1.0f - (((float) Math.pow((f * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
    }

    public final void a() {
        Editable editableText = this.a.getEditableText();
        if (editableText == null) {
            return;
        }
        for (eo3 eo3Var : (eo3[]) editableText.getSpans(0, editableText.length(), eo3.class)) {
            editableText.removeSpan(eo3Var);
        }
        for (fo3 fo3Var : (fo3[]) editableText.getSpans(0, editableText.length(), fo3.class)) {
            editableText.removeSpan(fo3Var);
        }
        for (do3 do3Var : (do3[]) editableText.getSpans(0, editableText.length(), do3.class)) {
            editableText.removeSpan(do3Var);
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
        this.d = gn3.e(i3);
        if (z) {
            i4 = -6128385;
        } else {
            i4 = -15823740;
        }
        this.e = gn3.e(i4);
        if (z) {
            f = 0.6f;
        } else {
            f = 0.75f;
        }
        this.f = f;
        this.k = null;
    }

    public final void d(Editable editable, int i) {
        do3[] do3VarArr;
        int length = editable.length();
        int max = Math.max(0, Math.min(i, length));
        long uptimeMillis = SystemClock.uptimeMillis();
        do3 do3Var = this.i;
        if (do3Var != null) {
            int spanStart = editable.getSpanStart(do3Var);
            if (spanStart >= 0 && spanStart < max) {
                ?? characterStyle = new CharacterStyle();
                characterStyle.a = uptimeMillis;
                editable.setSpan(characterStyle, spanStart, max, 33);
            }
            editable.removeSpan(this.i);
            this.i = null;
        }
        for (do3 do3Var2 : (do3[]) editable.getSpans(0, length, do3.class)) {
            int spanStart2 = editable.getSpanStart(do3Var2);
            int spanEnd = editable.getSpanEnd(do3Var2);
            editable.removeSpan(do3Var2);
            if (spanEnd > spanStart2) {
                editable.setSpan(do3Var2, spanStart2, spanEnd, 33);
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
                    Object[] objArr = (eo3[]) editableText.getSpans(i14, i16, eo3.class);
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
                        fo3 fo3Var = new fo3(j, this.b);
                        fo3Var.c = i11 - i8;
                        editableText.setSpan(fo3Var, i8, i11, 33);
                    }
                    int i21 = i8;
                    editableText.setSpan(new eo3(Math.max(uptimeMillis, j), this.b, this.c), i14, i16, 33);
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
                    float L = hl.L(150.0f);
                    int f = vm2.f(this.f, this.c, this.d);
                    int f2 = vm2.f(this.f, this.c, this.e);
                    this.k = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{this.c, f, vm2.f(0.5f, f, f2), f2, this.c}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.MIRROR);
                }
                go3 go3Var = this.j;
                if (go3Var == null) {
                    go3Var = new go3(this, (byte) 0);
                    this.j = go3Var;
                }
                this.m = 1.0f;
                editableText.setSpan(go3Var, 0, editableText.length(), 18);
                g();
                return;
            }
            go3 go3Var2 = this.j;
            if (go3Var2 != null) {
                this.m = 0.0f;
                editableText.removeSpan(go3Var2);
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
