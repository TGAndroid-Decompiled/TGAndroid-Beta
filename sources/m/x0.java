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
import c8.mc;
import java.lang.ref.WeakReference;
import java.util.Arrays;
public final class x0 {
    public final TextView f19287a;
    public c3 f19288b;
    public c3 f19289c;
    public c3 d;
    public c3 f19290e;
    public c3 f19291f;
    public c3 f19292g;
    public c3 h;
    public final h1 f19293i;
    public int f19294j = 0;
    public int f19295k = -1;
    public Typeface f19296l;
    public boolean f19297m;

    public x0(TextView textView) {
        this.f19287a = textView;
        this.f19293i = new h1(textView);
    }

    public static c3 c(Context context, r rVar, int i7) {
        ColorStateList i10;
        synchronized (rVar) {
            i10 = rVar.f19241a.i(context, i7);
        }
        if (i10 != null) {
            ?? obj = new Object();
            obj.f19081b = true;
            obj.f19082c = i10;
            return obj;
        }
        return null;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i7;
        int i10;
        CharSequence subSequence;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i11 >= 30) {
                t0.a.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i11 >= 30) {
                t0.a.a(editorInfo, text);
                return;
            }
            int i12 = editorInfo.initialSelStart;
            int i13 = editorInfo.initialSelEnd;
            if (i12 > i13) {
                i7 = i13;
            } else {
                i7 = i12;
            }
            if (i12 <= i13) {
                i12 = i13;
            }
            int length = text.length();
            if (i7 >= 0 && i12 <= length) {
                int i14 = editorInfo.inputType & 4095;
                if (i14 != 129 && i14 != 225 && i14 != 18) {
                    if (length <= 2048) {
                        t0.b.c(editorInfo, text, i7, i12);
                        return;
                    }
                    int i15 = i12 - i7;
                    if (i15 > 1024) {
                        i10 = 0;
                    } else {
                        i10 = i15;
                    }
                    int i16 = 2048 - i10;
                    int min = Math.min(text.length() - i12, i16 - Math.min(i7, (int) (i16 * 0.8d)));
                    int min2 = Math.min(i7, i16 - min);
                    int i17 = i7 - min2;
                    if (Character.isLowSurrogate(text.charAt(i17))) {
                        i17++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i12 + min) - 1))) {
                        min--;
                    }
                    int i18 = min2 + i10;
                    int i19 = i18 + min;
                    if (i10 != i15) {
                        subSequence = TextUtils.concat(text.subSequence(i17, i17 + min2), text.subSequence(i12, min + i12));
                    } else {
                        subSequence = text.subSequence(i17, i19 + i17);
                    }
                    t0.b.c(editorInfo, subSequence, min2, i18);
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
            r.d(drawable, c3Var, this.f19287a.getDrawableState());
        }
    }

    public final void b() {
        c3 c3Var = this.f19288b;
        TextView textView = this.f19287a;
        if (c3Var != null || this.f19289c != null || this.d != null || this.f19290e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f19288b);
            a(compoundDrawables[1], this.f19289c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f19290e);
        }
        if (this.f19291f == null && this.f19292g == null) {
            return;
        }
        Drawable[] a10 = s0.a(textView);
        a(a10[0], this.f19291f);
        a(a10[2], this.f19292g);
    }

    public final ColorStateList d() {
        c3 c3Var = this.h;
        if (c3Var != null) {
            return (ColorStateList) c3Var.f19082c;
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

    public final void f(AttributeSet attributeSet, int i7) {
        boolean z9;
        boolean z10;
        String str;
        String str2;
        float f10;
        float f11;
        float f12;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int fontMetricsInt;
        ColorStateList colorStateList;
        int resourceId;
        int i10;
        int resourceId2;
        TextView textView = this.f19287a;
        Context context = textView.getContext();
        r a10 = r.a();
        int[] iArr = f.a.h;
        h6.m x10 = h6.m.x(context, attributeSet, iArr, i7);
        r0.i0.i(textView, textView.getContext(), iArr, attributeSet, (TypedArray) x10.f14267c, i7);
        TypedArray typedArray = (TypedArray) x10.f14267c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f19288b = c(context, a10, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f19289c = c(context, a10, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a10, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f19290e = c(context, a10, typedArray.getResourceId(2, 0));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f19291f = c(context, a10, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f19292g = c(context, a10, typedArray.getResourceId(6, 0));
        }
        x10.C();
        boolean z11 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.f10879w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            h6.m mVar = new h6.m(context, obtainStyledAttributes);
            if (!z11 && obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, false);
                z9 = true;
            } else {
                z9 = false;
                z10 = false;
            }
            n(context, mVar);
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
            } else {
                str2 = null;
            }
            if (i11 >= 26 && obtainStyledAttributes.hasValue(13)) {
                str = obtainStyledAttributes.getString(13);
            } else {
                str = null;
            }
            mVar.C();
        } else {
            z9 = false;
            z10 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        h6.m mVar2 = new h6.m(context, obtainStyledAttributes2);
        if (!z11 && obtainStyledAttributes2.hasValue(14)) {
            z10 = obtainStyledAttributes2.getBoolean(14, false);
            z9 = true;
        }
        boolean z12 = z10;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        String str3 = str2;
        if (i11 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i11 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, mVar2);
        mVar2.C();
        if (!z11 && z9) {
            textView.setAllCaps(z12);
        }
        Typeface typeface = this.f19296l;
        if (typeface != null) {
            if (this.f19295k == -1) {
                textView.setTypeface(typeface, this.f19294j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            v0.d(textView, str);
        }
        if (str3 != null) {
            if (i11 >= 24) {
                u0.b(textView, u0.a(str3));
            } else {
                s0.c(textView, t0.a(str3.split(",")[0]));
            }
        }
        h1 h1Var = this.f19293i;
        Context context2 = h1Var.f19122j;
        int[] iArr3 = f.a.f10866i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i7, 0);
        TextView textView2 = h1Var.f19121i;
        r0.i0.i(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i7);
        if (obtainStyledAttributes3.hasValue(5)) {
            h1Var.f19115a = obtainStyledAttributes3.getInt(5, 0);
        }
        if (obtainStyledAttributes3.hasValue(4)) {
            f10 = obtainStyledAttributes3.getDimension(4, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(2)) {
            f11 = obtainStyledAttributes3.getDimension(2, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(1)) {
            f12 = obtainStyledAttributes3.getDimension(1, -1.0f);
        } else {
            f12 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i12 = 0; i12 < length; i12++) {
                    iArr4[i12] = obtainTypedArray.getDimensionPixelSize(i12, -1);
                }
                h1Var.f19119f = h1.b(iArr4);
                h1Var.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (h1Var.j()) {
            if (h1Var.f19115a == 1) {
                if (!h1Var.f19120g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f11 == -1.0f) {
                        i10 = 2;
                        f11 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i10 = 2;
                    }
                    if (f12 == -1.0f) {
                        f12 = TypedValue.applyDimension(i10, 112.0f, displayMetrics);
                    }
                    float f13 = f12;
                    if (f10 == -1.0f) {
                        f10 = 1.0f;
                    }
                    h1Var.k(f11, f13, f10);
                }
                h1Var.h();
            }
        } else {
            h1Var.f19115a = 0;
        }
        if (t3.f19265b && h1Var.f19115a != 0) {
            int[] iArr5 = h1Var.f19119f;
            if (iArr5.length > 0) {
                if (v0.a(textView) != -1.0f) {
                    v0.b(textView, Math.round(h1Var.d), Math.round(h1Var.f19118e), Math.round(h1Var.f19117c), 0);
                } else {
                    v0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        if (resourceId4 != -1) {
            drawable = a10.b(context, resourceId4);
        } else {
            drawable = null;
        }
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        if (resourceId5 != -1) {
            drawable2 = a10.b(context, resourceId5);
        } else {
            drawable2 = null;
        }
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        if (resourceId6 != -1) {
            drawable3 = a10.b(context, resourceId6);
        } else {
            drawable3 = null;
        }
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        if (resourceId7 != -1) {
            drawable4 = a10.b(context, resourceId7);
        } else {
            drawable4 = null;
        }
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        if (resourceId8 != -1) {
            drawable5 = a10.b(context, resourceId8);
        } else {
            drawable5 = null;
        }
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        if (resourceId9 != -1) {
            drawable6 = a10.b(context, resourceId9);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a11 = s0.a(textView);
                Drawable drawable7 = a11[0];
                if (drawable7 == null && a11[2] == null) {
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
                        drawable2 = a11[1];
                    }
                    Drawable drawable8 = a11[2];
                    if (drawable4 == null) {
                        drawable4 = a11[3];
                    }
                    s0.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a12 = s0.a(textView);
            if (drawable5 == null) {
                drawable5 = a12[0];
            }
            if (drawable2 == null) {
                drawable2 = a12[1];
            }
            if (drawable6 == null) {
                drawable6 = a12[2];
            }
            if (drawable4 == null) {
                drawable4 = a12[3];
            }
            s0.b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = b5.a.a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else if (textView instanceof u0.k) {
                ((u0.k) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode b10 = m1.b(obtainStyledAttributes4.getInt(12, -1), null);
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
            mc.b(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            mc.c(textView, dimensionPixelSize2);
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

    public final void g(Context context, int i7) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, f.a.f10879w);
        h6.m mVar = new h6.m(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f19287a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, mVar);
        if (i10 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            v0.d(textView, string);
        }
        mVar.C();
        Typeface typeface = this.f19296l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f19294j);
        }
    }

    public final void i(int i7, int i10, int i11, int i12) {
        h1 h1Var = this.f19293i;
        if (h1Var.j()) {
            DisplayMetrics displayMetrics = h1Var.f19122j.getResources().getDisplayMetrics();
            h1Var.k(TypedValue.applyDimension(i12, i7, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i7) {
        h1 h1Var = this.f19293i;
        if (h1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i7 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = h1Var.f19122j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArr2[i10] = Math.round(TypedValue.applyDimension(i7, iArr[i10], displayMetrics));
                    }
                }
                h1Var.f19119f = h1.b(iArr2);
                if (!h1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                h1Var.f19120g = false;
            }
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void k(int i7) {
        h1 h1Var = this.f19293i;
        if (h1Var.j()) {
            if (i7 != 0) {
                if (i7 == 1) {
                    DisplayMetrics displayMetrics = h1Var.f19122j.getResources().getDisplayMetrics();
                    h1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (h1Var.h()) {
                        h1Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(jg.g.j(i7, "Unknown auto-size text type: "));
            }
            h1Var.f19115a = 0;
            h1Var.d = -1.0f;
            h1Var.f19118e = -1.0f;
            h1Var.f19117c = -1.0f;
            h1Var.f19119f = new int[0];
            h1Var.f19116b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z9;
        if (this.h == null) {
            this.h = new Object();
        }
        c3 c3Var = this.h;
        c3Var.f19082c = colorStateList;
        if (colorStateList != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        c3Var.f19081b = z9;
        this.f19288b = c3Var;
        this.f19289c = c3Var;
        this.d = c3Var;
        this.f19290e = c3Var;
        this.f19291f = c3Var;
        this.f19292g = c3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z9;
        if (this.h == null) {
            this.h = new Object();
        }
        c3 c3Var = this.h;
        c3Var.d = mode;
        if (mode != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        c3Var.f19080a = z9;
        this.f19288b = c3Var;
        this.f19289c = c3Var;
        this.d = c3Var;
        this.f19290e = c3Var;
        this.f19291f = c3Var;
        this.f19292g = c3Var;
    }

    public final void n(Context context, h6.m mVar) {
        String string;
        boolean z9;
        boolean z10;
        int i7 = this.f19294j;
        TypedArray typedArray = (TypedArray) mVar.f14267c;
        this.f19294j = typedArray.getInt(2, i7);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.f19295k = i11;
            if (i11 != -1) {
                this.f19294j &= 2;
            }
        }
        int i12 = 10;
        boolean z11 = true;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f19297m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            this.f19296l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f19296l = Typeface.SERIF;
                    return;
                }
                this.f19296l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f19296l = null;
        if (typedArray.hasValue(12)) {
            i12 = 12;
        }
        int i14 = this.f19295k;
        int i15 = this.f19294j;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference(this.f19287a);
            ?? obj = new Object();
            obj.d = this;
            obj.f14099a = i14;
            obj.f14100b = i15;
            obj.f14101c = weakReference;
            try {
                Typeface r10 = mVar.r(i12, this.f19294j, obj);
                if (r10 != null) {
                    if (i10 >= 28 && this.f19295k != -1) {
                        Typeface create = Typeface.create(r10, 0);
                        int i16 = this.f19295k;
                        if ((this.f19294j & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f19296l = w0.a(create, i16, z10);
                    } else {
                        this.f19296l = r10;
                    }
                }
                if (this.f19296l == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f19297m = z9;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f19296l == null && (string = typedArray.getString(i12)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f19295k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i17 = this.f19295k;
                if ((this.f19294j & 2) == 0) {
                    z11 = false;
                }
                this.f19296l = w0.a(create2, i17, z11);
                return;
            }
            this.f19296l = Typeface.create(string, this.f19294j);
        }
    }
}
