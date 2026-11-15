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
public final class w0 {
    public final TextView f19862a;
    public b3 f19863b;
    public b3 f19864c;
    public b3 d;
    public b3 f19865e;
    public b3 f19866f;
    public b3 f19867g;
    public b3 h;
    public final g1 f19868i;
    public int f19869j = 0;
    public int f19870k = -1;
    public Typeface f19871l;
    public boolean f19872m;

    public w0(TextView textView) {
        this.f19862a = textView;
        this.f19868i = new g1(textView);
    }

    public static b3 c(Context context, q qVar, int i7) {
        ColorStateList i10;
        synchronized (qVar) {
            i10 = qVar.f19817a.i(context, i7);
        }
        if (i10 != null) {
            ?? obj = new Object();
            obj.f19658b = true;
            obj.f19659c = i10;
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

    public final void a(Drawable drawable, b3 b3Var) {
        if (drawable != null && b3Var != null) {
            q.d(drawable, b3Var, this.f19862a.getDrawableState());
        }
    }

    public final void b() {
        b3 b3Var = this.f19863b;
        TextView textView = this.f19862a;
        if (b3Var != null || this.f19864c != null || this.d != null || this.f19865e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f19863b);
            a(compoundDrawables[1], this.f19864c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f19865e);
        }
        if (this.f19866f == null && this.f19867g == null) {
            return;
        }
        Drawable[] a10 = r0.a(textView);
        a(a10[0], this.f19866f);
        a(a10[2], this.f19867g);
    }

    public final ColorStateList d() {
        b3 b3Var = this.h;
        if (b3Var != null) {
            return (ColorStateList) b3Var.f19659c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        b3 b3Var = this.h;
        if (b3Var != null) {
            return (PorterDuff.Mode) b3Var.d;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i7) {
        boolean z10;
        boolean z11;
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
        TextView textView = this.f19862a;
        Context context = textView.getContext();
        q a10 = q.a();
        int[] iArr = f.a.h;
        h6.m z12 = h6.m.z(context, attributeSet, iArr, i7);
        r0.i0.i(textView, textView.getContext(), iArr, attributeSet, (TypedArray) z12.f13625c, i7);
        TypedArray typedArray = (TypedArray) z12.f13625c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f19863b = c(context, a10, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f19864c = c(context, a10, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a10, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f19865e = c(context, a10, typedArray.getResourceId(2, 0));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f19866f = c(context, a10, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f19867g = c(context, a10, typedArray.getResourceId(6, 0));
        }
        z12.D();
        boolean z13 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.f10690w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            h6.m mVar = new h6.m(context, obtainStyledAttributes);
            if (!z13 && obtainStyledAttributes.hasValue(14)) {
                z11 = obtainStyledAttributes.getBoolean(14, false);
                z10 = true;
            } else {
                z10 = false;
                z11 = false;
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
            mVar.D();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        h6.m mVar2 = new h6.m(context, obtainStyledAttributes2);
        if (!z13 && obtainStyledAttributes2.hasValue(14)) {
            z11 = obtainStyledAttributes2.getBoolean(14, false);
            z10 = true;
        }
        boolean z14 = z11;
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
        mVar2.D();
        if (!z13 && z10) {
            textView.setAllCaps(z14);
        }
        Typeface typeface = this.f19871l;
        if (typeface != null) {
            if (this.f19870k == -1) {
                textView.setTypeface(typeface, this.f19869j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            u0.d(textView, str);
        }
        if (str3 != null) {
            if (i11 >= 24) {
                t0.b(textView, t0.a(str3));
            } else {
                r0.c(textView, s0.a(str3.split(",")[0]));
            }
        }
        g1 g1Var = this.f19868i;
        Context context2 = g1Var.f19700j;
        int[] iArr3 = f.a.f10677i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i7, 0);
        TextView textView2 = g1Var.f19699i;
        r0.i0.i(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i7);
        if (obtainStyledAttributes3.hasValue(5)) {
            g1Var.f19693a = obtainStyledAttributes3.getInt(5, 0);
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
                g1Var.f19697f = g1.b(iArr4);
                g1Var.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (g1Var.j()) {
            if (g1Var.f19693a == 1) {
                if (!g1Var.f19698g) {
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
                    g1Var.k(f11, f13, f10);
                }
                g1Var.h();
            }
        } else {
            g1Var.f19693a = 0;
        }
        if (r3.f19835b && g1Var.f19693a != 0) {
            int[] iArr5 = g1Var.f19697f;
            if (iArr5.length > 0) {
                if (u0.a(textView) != -1.0f) {
                    u0.b(textView, Math.round(g1Var.d), Math.round(g1Var.f19696e), Math.round(g1Var.f19695c), 0);
                } else {
                    u0.c(textView, iArr5, 0);
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
                Drawable[] a11 = r0.a(textView);
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
                    r0.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a12 = r0.a(textView);
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
            r0.b(textView, drawable5, drawable2, drawable6, drawable4);
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, f.a.f10690w);
        h6.m mVar = new h6.m(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f19862a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, mVar);
        if (i10 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            u0.d(textView, string);
        }
        mVar.D();
        Typeface typeface = this.f19871l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f19869j);
        }
    }

    public final void i(int i7, int i10, int i11, int i12) {
        g1 g1Var = this.f19868i;
        if (g1Var.j()) {
            DisplayMetrics displayMetrics = g1Var.f19700j.getResources().getDisplayMetrics();
            g1Var.k(TypedValue.applyDimension(i12, i7, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i7) {
        g1 g1Var = this.f19868i;
        if (g1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i7 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = g1Var.f19700j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArr2[i10] = Math.round(TypedValue.applyDimension(i7, iArr[i10], displayMetrics));
                    }
                }
                g1Var.f19697f = g1.b(iArr2);
                if (!g1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                g1Var.f19698g = false;
            }
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void k(int i7) {
        g1 g1Var = this.f19868i;
        if (g1Var.j()) {
            if (i7 != 0) {
                if (i7 == 1) {
                    DisplayMetrics displayMetrics = g1Var.f19700j.getResources().getDisplayMetrics();
                    g1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (g1Var.h()) {
                        g1Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(i5.c.i(i7, "Unknown auto-size text type: "));
            }
            g1Var.f19693a = 0;
            g1Var.d = -1.0f;
            g1Var.f19696e = -1.0f;
            g1Var.f19695c = -1.0f;
            g1Var.f19697f = new int[0];
            g1Var.f19694b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z10;
        if (this.h == null) {
            this.h = new Object();
        }
        b3 b3Var = this.h;
        b3Var.f19659c = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b3Var.f19658b = z10;
        this.f19863b = b3Var;
        this.f19864c = b3Var;
        this.d = b3Var;
        this.f19865e = b3Var;
        this.f19866f = b3Var;
        this.f19867g = b3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z10;
        if (this.h == null) {
            this.h = new Object();
        }
        b3 b3Var = this.h;
        b3Var.d = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b3Var.f19657a = z10;
        this.f19863b = b3Var;
        this.f19864c = b3Var;
        this.d = b3Var;
        this.f19865e = b3Var;
        this.f19866f = b3Var;
        this.f19867g = b3Var;
    }

    public final void n(Context context, h6.m mVar) {
        String string;
        boolean z10;
        boolean z11;
        int i7 = this.f19869j;
        TypedArray typedArray = (TypedArray) mVar.f13625c;
        this.f19869j = typedArray.getInt(2, i7);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.f19870k = i11;
            if (i11 != -1) {
                this.f19869j &= 2;
            }
        }
        int i12 = 10;
        boolean z12 = true;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f19872m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            this.f19871l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f19871l = Typeface.SERIF;
                    return;
                }
                this.f19871l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f19871l = null;
        if (typedArray.hasValue(12)) {
            i12 = 12;
        }
        int i14 = this.f19870k;
        int i15 = this.f19869j;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference(this.f19862a);
            ?? obj = new Object();
            obj.d = this;
            obj.f13457a = i14;
            obj.f13458b = i15;
            obj.f13459c = weakReference;
            try {
                Typeface t6 = mVar.t(i12, this.f19869j, obj);
                if (t6 != null) {
                    if (i10 >= 28 && this.f19870k != -1) {
                        Typeface create = Typeface.create(t6, 0);
                        int i16 = this.f19870k;
                        if ((this.f19869j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f19871l = v0.a(create, i16, z11);
                    } else {
                        this.f19871l = t6;
                    }
                }
                if (this.f19871l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f19872m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f19871l == null && (string = typedArray.getString(i12)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f19870k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i17 = this.f19870k;
                if ((this.f19869j & 2) == 0) {
                    z12 = false;
                }
                this.f19871l = v0.a(create2, i17, z12);
                return;
            }
            this.f19871l = Typeface.create(string, this.f19869j);
        }
    }
}
