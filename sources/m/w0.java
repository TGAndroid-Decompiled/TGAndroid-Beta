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
public final class w0 {
    public final TextView f14331a;
    public c3 f14332b;
    public c3 f14333c;
    public c3 d;
    public c3 e;
    public c3 f14334f;
    public c3 f14335g;
    public c3 h;
    public final g1 f14336i;
    public int f14337j = 0;
    public int f14338k = -1;
    public Typeface f14339l;
    public boolean f14340m;

    public w0(TextView textView) {
        this.f14331a = textView;
        this.f14336i = new g1(textView);
    }

    public static c3 c(Context context, q qVar, int i10) {
        ColorStateList i11;
        synchronized (qVar) {
            i11 = qVar.f14284a.i(context, i10);
        }
        if (i11 != null) {
            ?? obj = new Object();
            obj.f14144b = true;
            obj.f14145c = i11;
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
                t0.b.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i12 >= 30) {
                t0.b.a(editorInfo, text);
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
                        t0.c.c(editorInfo, text, i10, i13);
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
                    t0.c.c(editorInfo, subSequence, min2, i19);
                    return;
                }
                t0.c.c(editorInfo, null, 0, 0);
                return;
            }
            t0.c.c(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, c3 c3Var) {
        if (drawable != null && c3Var != null) {
            q.d(drawable, c3Var, this.f14331a.getDrawableState());
        }
    }

    public final void b() {
        c3 c3Var = this.f14332b;
        TextView textView = this.f14331a;
        if (c3Var != null || this.f14333c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f14332b);
            a(compoundDrawables[1], this.f14333c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f14334f == null && this.f14335g == null) {
            return;
        }
        Drawable[] a2 = r0.a(textView);
        a(a2[0], this.f14334f);
        a(a2[2], this.f14335g);
    }

    public final ColorStateList d() {
        c3 c3Var = this.h;
        if (c3Var != null) {
            return (ColorStateList) c3Var.f14145c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        c3 c3Var = this.h;
        if (c3Var != null) {
            return (PorterDuff.Mode) c3Var.d;
        }
        return null;
    }

    public final void f(android.util.AttributeSet r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: m.w0.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i10) {
        String string;
        ColorStateList C;
        ColorStateList C2;
        ColorStateList C3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, f.a.f8779w);
        e3 e3Var = new e3(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f14331a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (obtainStyledAttributes.hasValue(3) && (C3 = e3Var.C(3)) != null) {
                textView.setTextColor(C3);
            }
            if (obtainStyledAttributes.hasValue(5) && (C2 = e3Var.C(5)) != null) {
                textView.setLinkTextColor(C2);
            }
            if (obtainStyledAttributes.hasValue(4) && (C = e3Var.C(4)) != null) {
                textView.setHintTextColor(C);
            }
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, e3Var);
        if (i11 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            u0.d(textView, string);
        }
        e3Var.Q();
        Typeface typeface = this.f14339l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f14337j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        g1 g1Var = this.f14336i;
        if (g1Var.j()) {
            DisplayMetrics displayMetrics = g1Var.f14179j.getResources().getDisplayMetrics();
            g1Var.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        g1 g1Var = this.f14336i;
        if (g1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = g1Var.f14179j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                g1Var.f14176f = g1.b(iArr2);
                if (!g1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                g1Var.f14177g = false;
            }
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void k(int i10) {
        g1 g1Var = this.f14336i;
        if (g1Var.j()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = g1Var.f14179j.getResources().getDisplayMetrics();
                    g1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (g1Var.h()) {
                        g1Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(hg.k0.i(i10, "Unknown auto-size text type: "));
            }
            g1Var.f14173a = 0;
            g1Var.d = -1.0f;
            g1Var.e = -1.0f;
            g1Var.f14175c = -1.0f;
            g1Var.f14176f = new int[0];
            g1Var.f14174b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z10;
        if (this.h == null) {
            this.h = new Object();
        }
        c3 c3Var = this.h;
        c3Var.f14145c = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        c3Var.f14144b = z10;
        this.f14332b = c3Var;
        this.f14333c = c3Var;
        this.d = c3Var;
        this.e = c3Var;
        this.f14334f = c3Var;
        this.f14335g = c3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z10;
        if (this.h == null) {
            this.h = new Object();
        }
        c3 c3Var = this.h;
        c3Var.d = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        c3Var.f14143a = z10;
        this.f14332b = c3Var;
        this.f14333c = c3Var;
        this.d = c3Var;
        this.e = c3Var;
        this.f14334f = c3Var;
        this.f14335g = c3Var;
    }

    public final void n(Context context, e3 e3Var) {
        String string;
        boolean z10;
        boolean z11;
        int i10 = this.f14337j;
        TypedArray typedArray = (TypedArray) e3Var.f14166c;
        this.f14337j = typedArray.getInt(2, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(11, -1);
            this.f14338k = i12;
            if (i12 != -1) {
                this.f14337j &= 2;
            }
        }
        int i13 = 10;
        boolean z12 = true;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f14340m = false;
                int i14 = typedArray.getInt(1, 1);
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            this.f14339l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f14339l = Typeface.SERIF;
                    return;
                }
                this.f14339l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f14339l = null;
        if (typedArray.hasValue(12)) {
            i13 = 12;
        }
        int i15 = this.f14338k;
        int i16 = this.f14337j;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference(this.f14331a);
            ?? obj = new Object();
            obj.d = this;
            obj.f7869a = i15;
            obj.f7870b = i16;
            obj.f7871c = weakReference;
            try {
                Typeface G = e3Var.G(i13, this.f14337j, obj);
                if (G != null) {
                    if (i11 >= 28 && this.f14338k != -1) {
                        Typeface create = Typeface.create(G, 0);
                        int i17 = this.f14338k;
                        if ((this.f14337j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f14339l = v0.a(create, i17, z11);
                    } else {
                        this.f14339l = G;
                    }
                }
                if (this.f14339l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f14340m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f14339l == null && (string = typedArray.getString(i13)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f14338k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i18 = this.f14338k;
                if ((this.f14337j & 2) == 0) {
                    z12 = false;
                }
                this.f14339l = v0.a(create2, i18, z12);
                return;
            }
            this.f14339l = Typeface.create(string, this.f14337j);
        }
    }
}
