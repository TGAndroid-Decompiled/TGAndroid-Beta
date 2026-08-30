package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
public final class x0 {
    public final TextView f13671a;
    public f3 f13672b;
    public f3 f13673c;
    public f3 d;
    public f3 e;
    public f3 f13674f;
    public f3 f13675g;
    public f3 h;
    public final h1 f13676i;
    public int f13677j = 0;
    public int f13678k = -1;
    public Typeface f13679l;
    public boolean f13680m;

    public x0(TextView textView) {
        this.f13671a = textView;
        this.f13676i = new h1(textView);
    }

    public static f3 c(Context context, q qVar, int i10) {
        ColorStateList i11;
        synchronized (qVar) {
            i11 = qVar.f13604a.i(context, i10);
        }
        if (i11 != null) {
            ?? obj = new Object();
            obj.f13504b = true;
            obj.f13505c = i11;
            return obj;
        }
        return null;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i10;
        int i11;
        CharSequence subSequence;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i12 >= 30) {
                t0.a.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i12 >= 30) {
                t0.a.a(editorInfo, text);
                return;
            }
            int i13 = editorInfo.initialSelStart;
            int i14 = editorInfo.initialSelEnd;
            if (i13 > i14) {
                i10 = i14;
            } else {
                i10 = i13;
            }
            if (i13 <= i14) {
                i13 = i14;
            }
            int length = text.length();
            if (i10 >= 0 && i13 <= length) {
                int i15 = editorInfo.inputType & 4095;
                if (i15 != 129 && i15 != 225 && i15 != 18) {
                    if (length <= 2048) {
                        t0.b.c(editorInfo, text, i10, i13);
                        return;
                    }
                    int i16 = i13 - i10;
                    if (i16 > 1024) {
                        i11 = 0;
                    } else {
                        i11 = i16;
                    }
                    int i17 = 2048 - i11;
                    int min = Math.min(text.length() - i13, i17 - Math.min(i10, (int) (i17 * 0.8d)));
                    int min2 = Math.min(i10, i17 - min);
                    int i18 = i10 - min2;
                    if (Character.isLowSurrogate(text.charAt(i18))) {
                        i18++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i13 + min) - 1))) {
                        min--;
                    }
                    int i19 = min2 + i11;
                    int i20 = i19 + min;
                    if (i11 != i16) {
                        subSequence = TextUtils.concat(text.subSequence(i18, i18 + min2), text.subSequence(i13, min + i13));
                    } else {
                        subSequence = text.subSequence(i18, i20 + i18);
                    }
                    t0.b.c(editorInfo, subSequence, min2, i19);
                    return;
                }
                t0.b.c(editorInfo, null, 0, 0);
                return;
            }
            t0.b.c(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, f3 f3Var) {
        if (drawable != null && f3Var != null) {
            q.d(drawable, f3Var, this.f13671a.getDrawableState());
        }
    }

    public final void b() {
        f3 f3Var = this.f13672b;
        TextView textView = this.f13671a;
        if (f3Var != null || this.f13673c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f13672b);
            a(compoundDrawables[1], this.f13673c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f13674f == null && this.f13675g == null) {
            return;
        }
        Drawable[] a2 = s0.a(textView);
        a(a2[0], this.f13674f);
        a(a2[2], this.f13675g);
    }

    public final ColorStateList d() {
        f3 f3Var = this.h;
        if (f3Var != null) {
            return (ColorStateList) f3Var.f13505c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        f3 f3Var = this.h;
        if (f3Var != null) {
            return (PorterDuff.Mode) f3Var.d;
        }
        return null;
    }

    public final void f(android.util.AttributeSet r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: m.x0.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i10) {
        String string;
        ColorStateList r10;
        ColorStateList r11;
        ColorStateList r12;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, f.a.f5637w);
        l7.w0 w0Var = new l7.w0(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f13671a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (obtainStyledAttributes.hasValue(3) && (r12 = w0Var.r(3)) != null) {
                textView.setTextColor(r12);
            }
            if (obtainStyledAttributes.hasValue(5) && (r11 = w0Var.r(5)) != null) {
                textView.setLinkTextColor(r11);
            }
            if (obtainStyledAttributes.hasValue(4) && (r10 = w0Var.r(4)) != null) {
                textView.setHintTextColor(r10);
            }
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, w0Var);
        if (i11 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            v0.d(textView, string);
        }
        w0Var.A();
        Typeface typeface = this.f13679l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f13677j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        h1 h1Var = this.f13676i;
        if (h1Var.j()) {
            DisplayMetrics displayMetrics = h1Var.f13524j.getResources().getDisplayMetrics();
            h1Var.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        h1 h1Var = this.f13676i;
        if (h1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = h1Var.f13524j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                h1Var.f13521f = h1.b(iArr2);
                if (!h1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                h1Var.f13522g = false;
            }
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void k(int i10) {
        h1 h1Var = this.f13676i;
        if (h1Var.j()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = h1Var.f13524j.getResources().getDisplayMetrics();
                    h1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (h1Var.h()) {
                        h1Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(kh.a2.j(i10, "Unknown auto-size text type: "));
            }
            h1Var.f13518a = 0;
            h1Var.d = -1.0f;
            h1Var.e = -1.0f;
            h1Var.f13520c = -1.0f;
            h1Var.f13521f = new int[0];
            h1Var.f13519b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z4;
        if (this.h == null) {
            this.h = new Object();
        }
        f3 f3Var = this.h;
        f3Var.f13505c = colorStateList;
        if (colorStateList != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        f3Var.f13504b = z4;
        this.f13672b = f3Var;
        this.f13673c = f3Var;
        this.d = f3Var;
        this.e = f3Var;
        this.f13674f = f3Var;
        this.f13675g = f3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z4;
        if (this.h == null) {
            this.h = new Object();
        }
        f3 f3Var = this.h;
        f3Var.d = mode;
        if (mode != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        f3Var.f13503a = z4;
        this.f13672b = f3Var;
        this.f13673c = f3Var;
        this.d = f3Var;
        this.e = f3Var;
        this.f13674f = f3Var;
        this.f13675g = f3Var;
    }

    public final void n(Context context, l7.w0 w0Var) {
        String string;
        boolean z4;
        boolean z10;
        int i10 = this.f13677j;
        TypedArray typedArray = (TypedArray) w0Var.f11677c;
        this.f13677j = typedArray.getInt(2, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(11, -1);
            this.f13678k = i12;
            if (i12 != -1) {
                this.f13677j &= 2;
            }
        }
        int i13 = 10;
        boolean z11 = true;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f13680m = false;
                int i14 = typedArray.getInt(1, 1);
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            this.f13679l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f13679l = Typeface.SERIF;
                    return;
                }
                this.f13679l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f13679l = null;
        if (typedArray.hasValue(12)) {
            i13 = 12;
        }
        int i15 = this.f13678k;
        int i16 = this.f13677j;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference(this.f13671a);
            ?? obj = new Object();
            obj.d = this;
            obj.f6930a = i15;
            obj.f6931b = i16;
            obj.f6932c = weakReference;
            try {
                Typeface v = w0Var.v(i13, this.f13677j, obj);
                if (v != null) {
                    if (i11 >= 28 && this.f13678k != -1) {
                        Typeface create = Typeface.create(v, 0);
                        int i17 = this.f13678k;
                        if ((this.f13677j & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f13679l = w0.a(create, i17, z10);
                    } else {
                        this.f13679l = v;
                    }
                }
                if (this.f13679l == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f13680m = z4;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f13679l == null && (string = typedArray.getString(i13)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f13678k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i18 = this.f13678k;
                if ((this.f13677j & 2) == 0) {
                    z11 = false;
                }
                this.f13679l = w0.a(create2, i18, z11);
                return;
            }
            this.f13679l = Typeface.create(string, this.f13677j);
        }
    }
}
