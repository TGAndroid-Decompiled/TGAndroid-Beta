package defpackage;

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
public final class qq {
    public final TextView a;
    public c34 b;
    public c34 c;
    public c34 d;
    public c34 e;
    public c34 f;
    public c34 g;
    public c34 h;
    public final ar i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public qq(TextView textView) {
        this.a = textView;
        this.i = new ar(textView);
    }

    public static c34 c(Context context, gp gpVar, int i) {
        ColorStateList i2;
        synchronized (gpVar) {
            i2 = gpVar.a.i(context, i);
        }
        if (i2 != null) {
            ?? obj = new Object();
            obj.b = true;
            obj.c = i2;
            return obj;
        }
        return null;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i;
        CharSequence subSequence;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i2 >= 30) {
                mka.u(editorInfo, text);
                return;
            }
            text.getClass();
            if (i2 >= 30) {
                mka.u(editorInfo, text);
                return;
            }
            int i3 = editorInfo.initialSelStart;
            int i4 = editorInfo.initialSelEnd;
            if (i3 <= i4) {
                i4 = i3;
                i3 = i4;
            }
            int length = text.length();
            if (i4 >= 0 && i3 <= length) {
                int i5 = editorInfo.inputType & 4095;
                if (i5 != 129 && i5 != 225 && i5 != 18) {
                    if (length <= 2048) {
                        tu3.c(editorInfo, text, i4, i3);
                        return;
                    }
                    int i6 = i3 - i4;
                    if (i6 > 1024) {
                        i = 0;
                    } else {
                        i = i6;
                    }
                    int i7 = 2048 - i;
                    int min = Math.min(text.length() - i3, i7 - Math.min(i4, (int) (i7 * 0.8d)));
                    int min2 = Math.min(i4, i7 - min);
                    int i8 = i4 - min2;
                    if (Character.isLowSurrogate(text.charAt(i8))) {
                        i8++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i3 + min) - 1))) {
                        min--;
                    }
                    int i9 = min2 + i;
                    int i10 = i9 + min;
                    if (i != i6) {
                        subSequence = TextUtils.concat(text.subSequence(i8, i8 + min2), text.subSequence(i3, min + i3));
                    } else {
                        subSequence = text.subSequence(i8, i10 + i8);
                    }
                    tu3.c(editorInfo, subSequence, min2, i9);
                    return;
                }
                tu3.c(editorInfo, null, 0, 0);
                return;
            }
            tu3.c(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, c34 c34Var) {
        if (drawable != null && c34Var != null) {
            int[] drawableState = this.a.getDrawableState();
            PorterDuff.Mode mode = gp.b;
            vd9.n(drawable, c34Var, drawableState);
        }
    }

    public final void b() {
        c34 c34Var = this.b;
        TextView textView = this.a;
        if (c34Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] a = lq.a(textView);
        a(a[0], this.f);
        a(a[2], this.g);
    }

    public final ColorStateList d() {
        c34 c34Var = this.h;
        if (c34Var != null) {
            return (ColorStateList) c34Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        c34 c34Var = this.h;
        if (c34Var != null) {
            return (PorterDuff.Mode) c34Var.d;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        float f;
        float f2;
        float f3;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int fontMetricsInt;
        ColorStateList colorStateList;
        int resourceId;
        int i2;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        gp a = gp.a();
        int[] iArr = w19.h;
        ko9 v = ko9.v(context, attributeSet, iArr, i);
        ihc.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) v.c, i);
        TypedArray typedArray = (TypedArray) v.c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a, typedArray.getResourceId(6, 0));
        }
        v.y();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = w19.w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            ko9 ko9Var = new ko9(context, obtainStyledAttributes);
            if (!z3 && obtainStyledAttributes.hasValue(14)) {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            n(context, ko9Var);
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
            } else {
                str2 = null;
            }
            if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(13)) {
                str = obtainStyledAttributes.getString(13);
            } else {
                str = null;
            }
            ko9Var.y();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ko9 ko9Var2 = new ko9(context, obtainStyledAttributes2);
        if (!z3 && obtainStyledAttributes2.hasValue(14)) {
            z2 = obtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        String str3 = str2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i3 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, ko9Var2);
        ko9Var2.y();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            oq.d(textView, str);
        }
        if (str3 != null) {
            if (i3 >= 24) {
                nq.b(textView, nq.a(str3));
            } else {
                lq.c(textView, mq.a(str3.split(",")[0]));
            }
        }
        ar arVar = this.i;
        Context context2 = arVar.j;
        int[] iArr3 = w19.i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = arVar.i;
        ihc.k(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            arVar.a = obtainStyledAttributes3.getInt(5, 0);
        }
        if (obtainStyledAttributes3.hasValue(4)) {
            f = obtainStyledAttributes3.getDimension(4, -1.0f);
        } else {
            f = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(2)) {
            f2 = obtainStyledAttributes3.getDimension(2, -1.0f);
        } else {
            f2 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(1)) {
            f3 = obtainStyledAttributes3.getDimension(1, -1.0f);
        } else {
            f3 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr4[i4] = obtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                arVar.f = ar.b(iArr4);
                arVar.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (arVar.j()) {
            if (arVar.a == 1) {
                if (!arVar.g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f2 == -1.0f) {
                        i2 = 2;
                        f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i2 = 2;
                    }
                    if (f3 == -1.0f) {
                        f3 = TypedValue.applyDimension(i2, 112.0f, displayMetrics);
                    }
                    if (f == -1.0f) {
                        f = 1.0f;
                    }
                    arVar.k(f2, f3, f);
                }
                arVar.h();
            }
        } else {
            arVar.a = 0;
        }
        if (fjc.b && arVar.a != 0) {
            int[] iArr5 = arVar.f;
            if (iArr5.length > 0) {
                if (oq.a(textView) != -1.0f) {
                    oq.b(textView, Math.round(arVar.d), Math.round(arVar.e), Math.round(arVar.c), 0);
                } else {
                    oq.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        if (resourceId4 != -1) {
            drawable = a.b(context, resourceId4);
        } else {
            drawable = null;
        }
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        if (resourceId5 != -1) {
            drawable2 = a.b(context, resourceId5);
        } else {
            drawable2 = null;
        }
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        if (resourceId6 != -1) {
            drawable3 = a.b(context, resourceId6);
        } else {
            drawable3 = null;
        }
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        if (resourceId7 != -1) {
            drawable4 = a.b(context, resourceId7);
        } else {
            drawable4 = null;
        }
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        if (resourceId8 != -1) {
            drawable5 = a.b(context, resourceId8);
        } else {
            drawable5 = null;
        }
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        if (resourceId9 != -1) {
            drawable6 = a.b(context, resourceId9);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a2 = lq.a(textView);
                Drawable drawable7 = a2[0];
                if (drawable7 == null && a2[2] == null) {
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
                        drawable2 = a2[1];
                    }
                    Drawable drawable8 = a2[2];
                    if (drawable4 == null) {
                        drawable4 = a2[3];
                    }
                    lq.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a3 = lq.a(textView);
            if (drawable5 == null) {
                drawable5 = a3[0];
            }
            if (drawable2 == null) {
                drawable2 = a3[1];
            }
            if (drawable6 == null) {
                drawable6 = a3[2];
            }
            if (drawable4 == null) {
                drawable4 = a3[3];
            }
            lq.b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = sr.e(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else if (textView instanceof zsb) {
                ((zsb) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode b = cr3.b(obtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintMode(b);
            } else if (textView instanceof zsb) {
                ((zsb) textView).setSupportCompoundDrawablesTintMode(b);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            c0f.b(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            c0f.c(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 >= 0) {
                if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                    textView.setLineSpacing(dimensionPixelSize3 - fontMetricsInt, 1.0f);
                    return;
                }
                return;
            }
            iy8.d();
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, w19.w);
        ko9 ko9Var = new ko9(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, ko9Var);
        if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            oq.d(textView, string);
        }
        ko9Var.y();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        ar arVar = this.i;
        if (arVar.j()) {
            DisplayMetrics displayMetrics = arVar.j.getResources().getDisplayMetrics();
            arVar.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (arVar.h()) {
                arVar.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        ar arVar = this.i;
        if (arVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = arVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                arVar.f = ar.b(iArr2);
                if (!arVar.i()) {
                    c22.b(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                arVar.g = false;
            }
            if (arVar.h()) {
                arVar.a();
            }
        }
    }

    public final void k(int i) {
        ar arVar = this.i;
        if (arVar.j()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = arVar.j.getResources().getDisplayMetrics();
                    arVar.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (arVar.h()) {
                        arVar.a();
                        return;
                    }
                    return;
                }
                lq5.j(uh9.k(i, "Unknown auto-size text type: "));
                return;
            }
            arVar.a = 0;
            arVar.d = -1.0f;
            arVar.e = -1.0f;
            arVar.c = -1.0f;
            arVar.f = new int[0];
            arVar.b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z;
        c34 c34Var = this.h;
        c34 c34Var2 = c34Var;
        if (c34Var == null) {
            ?? obj = new Object();
            this.h = obj;
            c34Var2 = obj;
        }
        c34 c34Var3 = c34Var2;
        c34Var2.c = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        c34Var2.b = z;
        this.b = c34Var3;
        this.c = c34Var3;
        this.d = c34Var3;
        this.e = c34Var3;
        this.f = c34Var3;
        this.g = c34Var3;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z;
        c34 c34Var = this.h;
        c34 c34Var2 = c34Var;
        if (c34Var == null) {
            ?? obj = new Object();
            this.h = obj;
            c34Var2 = obj;
        }
        c34 c34Var3 = c34Var2;
        c34Var2.d = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        c34Var2.a = z;
        this.b = c34Var3;
        this.c = c34Var3;
        this.d = c34Var3;
        this.e = c34Var3;
        this.f = c34Var3;
        this.g = c34Var3;
    }

    public final void n(Context context, ko9 ko9Var) {
        String string;
        boolean z;
        boolean z2;
        int i = this.j;
        TypedArray typedArray = (TypedArray) ko9Var.c;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        int i4 = 10;
        boolean z3 = true;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            this.l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.l = Typeface.SERIF;
                    return;
                }
                this.l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.l = null;
        if (typedArray.hasValue(12)) {
            i4 = 12;
        }
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference(this.a);
            ?? obj = new Object();
            obj.d = this;
            obj.a = i6;
            obj.b = i7;
            obj.c = weakReference;
            try {
                Typeface r = ko9Var.r(i4, this.j, obj);
                if (r != null) {
                    if (i2 >= 28 && this.k != -1) {
                        Typeface create = Typeface.create(r, 0);
                        int i8 = this.k;
                        if ((this.j & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.l = pq.a(create, i8, z2);
                    } else {
                        this.l = r;
                    }
                }
                if (this.l == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.m = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l == null && (string = typedArray.getString(i4)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i9 = this.k;
                if ((this.j & 2) == 0) {
                    z3 = false;
                }
                this.l = pq.a(create2, i9, z3);
                return;
            }
            this.l = Typeface.create(string, this.j);
        }
    }
}
