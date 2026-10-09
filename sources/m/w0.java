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
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import v7.s7;
public final class w0 {
    public final TextView f15842a;
    public c3 f15843b;
    public c3 f15844c;
    public c3 d;
    public c3 f15845e;
    public c3 f15846f;
    public c3 f15847g;
    public c3 h;
    public final g1 f15848i;
    public int f15849j = 0;
    public int f15850k = -1;
    public Typeface f15851l;
    public boolean f15852m;

    public w0(TextView textView) {
        this.f15842a = textView;
        this.f15848i = new g1(textView);
    }

    public static c3 c(Context context, q qVar, int i10) {
        ColorStateList i11;
        synchronized (qVar) {
            i11 = qVar.f15791a.i(context, i10);
        }
        if (i11 != null) {
            ?? obj = new Object();
            obj.f15641b = true;
            obj.f15642c = i11;
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

    public final void a(Drawable drawable, c3 c3Var) {
        if (drawable != null && c3Var != null) {
            q.d(drawable, c3Var, this.f15842a.getDrawableState());
        }
    }

    public final void b() {
        c3 c3Var = this.f15843b;
        TextView textView = this.f15842a;
        if (c3Var != null || this.f15844c != null || this.d != null || this.f15845e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f15843b);
            a(compoundDrawables[1], this.f15844c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f15845e);
        }
        if (this.f15846f == null && this.f15847g == null) {
            return;
        }
        Drawable[] a2 = r0.a(textView);
        a(a2[0], this.f15846f);
        a(a2[2], this.f15847g);
    }

    public final ColorStateList d() {
        c3 c3Var = this.h;
        if (c3Var != null) {
            return (ColorStateList) c3Var.f15642c;
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

    public final void f(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        float f7;
        float f10;
        float f11;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int fontMetricsInt;
        ColorStateList colorStateList;
        int resourceId;
        int i11;
        int resourceId2;
        TextView textView = this.f15842a;
        Context context = textView.getContext();
        q a2 = q.a();
        int[] iArr = f.a.h;
        la.h R = la.h.R(context, attributeSet, iArr, i10);
        r0.i0.i(textView, textView.getContext(), iArr, attributeSet, (TypedArray) R.f15463c, i10);
        TypedArray typedArray = (TypedArray) R.f15463c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f15843b = c(context, a2, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f15844c = c(context, a2, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a2, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f15845e = c(context, a2, typedArray.getResourceId(2, 0));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f15846f = c(context, a2, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f15847g = c(context, a2, typedArray.getResourceId(6, 0));
        }
        R.S();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.f9545w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            la.h hVar = new la.h(context, obtainStyledAttributes);
            if (!z12 && obtainStyledAttributes.hasValue(14)) {
                z11 = obtainStyledAttributes.getBoolean(14, false);
                z10 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            n(context, hVar);
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
            } else {
                str2 = null;
            }
            if (i12 >= 26 && obtainStyledAttributes.hasValue(13)) {
                str = obtainStyledAttributes.getString(13);
            } else {
                str = null;
            }
            hVar.S();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        la.h hVar2 = new la.h(context, obtainStyledAttributes2);
        if (!z12 && obtainStyledAttributes2.hasValue(14)) {
            z11 = obtainStyledAttributes2.getBoolean(14, false);
            z10 = true;
        }
        boolean z13 = z11;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        String str3 = str2;
        if (i12 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i12 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, hVar2);
        hVar2.S();
        if (!z12 && z10) {
            textView.setAllCaps(z13);
        }
        Typeface typeface = this.f15851l;
        if (typeface != null) {
            if (this.f15850k == -1) {
                textView.setTypeface(typeface, this.f15849j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            u0.d(textView, str);
        }
        if (str3 != null) {
            if (i12 >= 24) {
                t0.b(textView, t0.a(str3));
            } else {
                r0.c(textView, s0.a(str3.split(",")[0]));
            }
        }
        g1 g1Var = this.f15848i;
        Context context2 = g1Var.f15678j;
        int[] iArr3 = f.a.f9532i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = g1Var.f15677i;
        r0.i0.i(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i10);
        if (obtainStyledAttributes3.hasValue(5)) {
            g1Var.f15671a = obtainStyledAttributes3.getInt(5, 0);
        }
        if (obtainStyledAttributes3.hasValue(4)) {
            f7 = obtainStyledAttributes3.getDimension(4, -1.0f);
        } else {
            f7 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(2)) {
            f10 = obtainStyledAttributes3.getDimension(2, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(1)) {
            f11 = obtainStyledAttributes3.getDimension(1, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    iArr4[i13] = obtainTypedArray.getDimensionPixelSize(i13, -1);
                }
                g1Var.f15675f = g1.b(iArr4);
                g1Var.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (g1Var.j()) {
            if (g1Var.f15671a == 1) {
                if (!g1Var.f15676g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f10 == -1.0f) {
                        i11 = 2;
                        f10 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i11 = 2;
                    }
                    if (f11 == -1.0f) {
                        f11 = TypedValue.applyDimension(i11, 112.0f, displayMetrics);
                    }
                    float f12 = f11;
                    if (f7 == -1.0f) {
                        f7 = 1.0f;
                    }
                    g1Var.k(f10, f12, f7);
                }
                g1Var.h();
            }
        } else {
            g1Var.f15671a = 0;
        }
        if (t3.f15825b && g1Var.f15671a != 0) {
            int[] iArr5 = g1Var.f15675f;
            if (iArr5.length > 0) {
                if (u0.a(textView) != -1.0f) {
                    u0.b(textView, Math.round(g1Var.d), Math.round(g1Var.f15674e), Math.round(g1Var.f15673c), 0);
                } else {
                    u0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        if (resourceId4 != -1) {
            drawable = a2.b(context, resourceId4);
        } else {
            drawable = null;
        }
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        if (resourceId5 != -1) {
            drawable2 = a2.b(context, resourceId5);
        } else {
            drawable2 = null;
        }
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        if (resourceId6 != -1) {
            drawable3 = a2.b(context, resourceId6);
        } else {
            drawable3 = null;
        }
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        if (resourceId7 != -1) {
            drawable4 = a2.b(context, resourceId7);
        } else {
            drawable4 = null;
        }
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        if (resourceId8 != -1) {
            drawable5 = a2.b(context, resourceId8);
        } else {
            drawable5 = null;
        }
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        if (resourceId9 != -1) {
            drawable6 = a2.b(context, resourceId9);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a10 = r0.a(textView);
                Drawable drawable7 = a10[0];
                if (drawable7 == null && a10[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = a10[1];
                    }
                    Drawable drawable8 = a10[2];
                    if (drawable4 == null) {
                        drawable4 = a10[3];
                    }
                    r0.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a11 = r0.a(textView);
            if (drawable5 == null) {
                drawable5 = a11[0];
            }
            if (drawable2 == null) {
                drawable2 = a11[1];
            }
            if (drawable6 == null) {
                drawable6 = a11[2];
            }
            if (drawable4 == null) {
                drawable4 = a11[3];
            }
            r0.b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = s7.a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else if (textView instanceof u0.k) {
                ((u0.k) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode b10 = l1.b(obtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintMode(b10);
            } else if (textView instanceof u0.k) {
                ((u0.k) textView).setSupportCompoundDrawablesTintMode(b10);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            w7.s7.b(dimensionPixelSize, textView);
        }
        if (dimensionPixelSize2 != -1) {
            w7.s7.c(dimensionPixelSize2, textView);
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 >= 0) {
                if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                    textView.setLineSpacing(dimensionPixelSize3 - fontMetricsInt, 1.0f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public final void g(Context context, int i10) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, f.a.f9545w);
        la.h hVar = new la.h(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f15842a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, hVar);
        if (i11 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            u0.d(textView, string);
        }
        hVar.S();
        Typeface typeface = this.f15851l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f15849j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        g1 g1Var = this.f15848i;
        if (g1Var.j()) {
            DisplayMetrics displayMetrics = g1Var.f15678j.getResources().getDisplayMetrics();
            g1Var.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        g1 g1Var = this.f15848i;
        if (g1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = g1Var.f15678j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                g1Var.f15675f = g1.b(iArr2);
                if (!g1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                g1Var.f15676g = false;
            }
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void k(int i10) {
        g1 g1Var = this.f15848i;
        if (g1Var.j()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = g1Var.f15678j.getResources().getDisplayMetrics();
                    g1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (g1Var.h()) {
                        g1Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(hg.c.h(i10, "Unknown auto-size text type: "));
            }
            g1Var.f15671a = 0;
            g1Var.d = -1.0f;
            g1Var.f15674e = -1.0f;
            g1Var.f15673c = -1.0f;
            g1Var.f15675f = new int[0];
            g1Var.f15672b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z10;
        if (this.h == null) {
            this.h = new Object();
        }
        c3 c3Var = this.h;
        c3Var.f15642c = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        c3Var.f15641b = z10;
        this.f15843b = c3Var;
        this.f15844c = c3Var;
        this.d = c3Var;
        this.f15845e = c3Var;
        this.f15846f = c3Var;
        this.f15847g = c3Var;
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
        c3Var.f15640a = z10;
        this.f15843b = c3Var;
        this.f15844c = c3Var;
        this.d = c3Var;
        this.f15845e = c3Var;
        this.f15846f = c3Var;
        this.f15847g = c3Var;
    }

    public final void n(Context context, la.h hVar) {
        String string;
        boolean z10;
        boolean z11;
        int i10 = this.f15849j;
        TypedArray typedArray = (TypedArray) hVar.f15463c;
        this.f15849j = typedArray.getInt(2, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(11, -1);
            this.f15850k = i12;
            if (i12 != -1) {
                this.f15849j &= 2;
            }
        }
        int i13 = 10;
        boolean z12 = true;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f15852m = false;
                int i14 = typedArray.getInt(1, 1);
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            this.f15851l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f15851l = Typeface.SERIF;
                    return;
                }
                this.f15851l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f15851l = null;
        if (typedArray.hasValue(12)) {
            i13 = 12;
        }
        int i15 = this.f15850k;
        int i16 = this.f15849j;
        if (!context.isRestricted()) {
            try {
                Typeface I = hVar.I(i13, this.f15849j, new e2.a0(this, i15, i16, new WeakReference(this.f15842a)));
                if (I != null) {
                    if (i11 >= 28 && this.f15850k != -1) {
                        Typeface create = Typeface.create(I, 0);
                        int i17 = this.f15850k;
                        if ((this.f15849j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f15851l = v0.a(create, i17, z11);
                    } else {
                        this.f15851l = I;
                    }
                }
                if (this.f15851l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f15852m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f15851l == null && (string = typedArray.getString(i13)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f15850k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i18 = this.f15850k;
                if ((this.f15849j & 2) == 0) {
                    z12 = false;
                }
                this.f15851l = v0.a(create2, i18, z12);
                return;
            }
            this.f15851l = Typeface.create(string, this.f15849j);
        }
    }
}
