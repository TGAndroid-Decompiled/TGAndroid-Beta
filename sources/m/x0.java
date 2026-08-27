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
import g7.o7;
import h7.p7;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class x0 {

    public final TextView f17503a;

    public f3 f17504b;

    public f3 f17505c;
    public f3 d;

    public f3 f17506e;

    public f3 f17507f;

    public f3 f17508g;
    public f3 h;

    public final h1 f17509i;

    public int f17510j = 0;

    public int f17511k = -1;

    public Typeface f17512l;

    public boolean f17513m;

    public x0(TextView textView) {
        this.f17503a = textView;
        this.f17509i = new h1(textView);
    }

    public static f3 c(Context context, r rVar, int i10) {
        ColorStateList colorStateListI;
        synchronized (rVar) {
            colorStateListI = rVar.f17439a.i(context, i10);
        }
        if (colorStateListI == null) {
            return null;
        }
        f3 f3Var = new f3();
        f3Var.f17320b = true;
        f3Var.f17321c = colorStateListI;
        return f3Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i10 >= 30) {
            t0.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i10 >= 30) {
            t0.a.a(editorInfo, text);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 : i11;
        if (i11 <= i12) {
            i11 = i12;
        }
        int length = text.length();
        if (i13 < 0 || i11 > length) {
            t0.b.c(editorInfo, null, 0, 0);
            return;
        }
        int i14 = editorInfo.inputType & 4095;
        if (i14 == 129 || i14 == 225 || i14 == 18) {
            t0.b.c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            t0.b.c(editorInfo, text, i13, i11);
            return;
        }
        int i15 = i11 - i13;
        int i16 = i15 > 1024 ? 0 : i15;
        int i17 = 2048 - i16;
        int iMin = Math.min(text.length() - i11, i17 - Math.min(i13, (int) (((double) i17) * 0.8d)));
        int iMin2 = Math.min(i13, i17 - iMin);
        int i18 = i13 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i18))) {
            i18++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i11 + iMin) - 1))) {
            iMin--;
        }
        int i19 = iMin2 + i16;
        t0.b.c(editorInfo, i16 != i15 ? TextUtils.concat(text.subSequence(i18, i18 + iMin2), text.subSequence(i11, iMin + i11)) : text.subSequence(i18, i19 + iMin + i18), iMin2, i19);
    }

    public final void a(Drawable drawable, f3 f3Var) {
        if (drawable == null || f3Var == null) {
            return;
        }
        r.d(drawable, f3Var, this.f17503a.getDrawableState());
    }

    public final void b() {
        f3 f3Var = this.f17504b;
        TextView textView = this.f17503a;
        if (f3Var != null || this.f17505c != null || this.d != null || this.f17506e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f17504b);
            a(compoundDrawables[1], this.f17505c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f17506e);
        }
        if (this.f17507f == null && this.f17508g == null) {
            return;
        }
        Drawable[] drawableArrA = s0.a(textView);
        a(drawableArrA[0], this.f17507f);
        a(drawableArrA[2], this.f17508g);
    }

    public final ColorStateList d() {
        f3 f3Var = this.h;
        if (f3Var != null) {
            return (ColorStateList) f3Var.f17321c;
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

    public final void f(AttributeSet attributeSet, int i10) {
        String string;
        boolean z10;
        boolean z11;
        ColorStateList colorStateListX;
        ColorStateList colorStateListX2;
        ColorStateList colorStateListX3;
        String string2;
        r rVar;
        int i11;
        ColorStateList colorStateList;
        int resourceId;
        int i12;
        int resourceId2;
        int i13;
        TextView textView = this.f17503a;
        Context context = textView.getContext();
        r rVarA = r.a();
        int[] iArr = f.a.h;
        j9.a aVarG = j9.a.G(context, attributeSet, iArr, i10);
        r0.j0.j(textView, textView.getContext(), iArr, attributeSet, (TypedArray) aVarG.f12864c, i10);
        TypedArray typedArray = (TypedArray) aVarG.f12864c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f17504b = c(context, rVarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f17505c = c(context, rVarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, rVarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f17506e = c(context, rVarA, typedArray.getResourceId(2, 0));
        }
        int i14 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f17507f = c(context, rVarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f17508g = c(context, rVarA, typedArray.getResourceId(6, 0));
        }
        aVarG.I();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.f5593w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            j9.a aVar = new j9.a(context, typedArrayObtainStyledAttributes);
            if (z12 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z10 = false;
                z11 = false;
            } else {
                z11 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z10 = true;
            }
            n(context, aVar);
            if (i14 < 23) {
                colorStateListX = typedArrayObtainStyledAttributes.hasValue(3) ? aVar.x(3) : null;
                colorStateListX2 = typedArrayObtainStyledAttributes.hasValue(4) ? aVar.x(4) : null;
                if (typedArrayObtainStyledAttributes.hasValue(5)) {
                    colorStateListX3 = aVar.x(5);
                    i13 = 15;
                } else {
                    i13 = 15;
                }
                if (typedArrayObtainStyledAttributes.hasValue(i13)) {
                    string2 = typedArrayObtainStyledAttributes.getString(i13);
                } else {
                    string2 = null;
                }
                if (i14 >= 26 || !typedArrayObtainStyledAttributes.hasValue(13)) {
                    string = null;
                } else {
                    string = typedArrayObtainStyledAttributes.getString(13);
                }
                aVar.I();
            } else {
                i13 = 15;
                colorStateListX = null;
                colorStateListX2 = null;
            }
            colorStateListX3 = null;
            if (typedArrayObtainStyledAttributes.hasValue(i13)) {
                string2 = typedArrayObtainStyledAttributes.getString(i13);
            } else {
                string2 = null;
            }
            if (i14 >= 26) {
                string = null;
            } else {
                string = null;
            }
            aVar.I();
        } else {
            string = null;
            z10 = false;
            z11 = false;
            colorStateListX = null;
            colorStateListX2 = null;
            colorStateListX3 = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        j9.a aVar2 = new j9.a(context, typedArrayObtainStyledAttributes2);
        if (!z12 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z11 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z10 = true;
        }
        boolean z13 = z11;
        if (i14 < 23) {
            if (typedArrayObtainStyledAttributes2.hasValue(3)) {
                colorStateListX = aVar2.x(3);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                colorStateListX2 = aVar2.x(4);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(5)) {
                colorStateListX3 = aVar2.x(5);
            }
        }
        ColorStateList colorStateList2 = colorStateListX;
        ColorStateList colorStateList3 = colorStateListX2;
        ColorStateList colorStateList4 = colorStateListX3;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String str = string2;
        if (i14 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i14 < 28 || !typedArrayObtainStyledAttributes2.hasValue(0)) {
            rVar = rVarA;
        } else {
            rVar = rVarA;
            if (typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
                textView.setTextSize(0, 0.0f);
            }
        }
        n(context, aVar2);
        aVar2.I();
        if (colorStateList2 != null) {
            textView.setTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            textView.setHintTextColor(colorStateList3);
        }
        if (colorStateList4 != null) {
            textView.setLinkTextColor(colorStateList4);
        }
        if (!z12 && z10) {
            textView.setAllCaps(z13);
        }
        Typeface typeface = this.f17512l;
        if (typeface != null) {
            if (this.f17511k == -1) {
                textView.setTypeface(typeface, this.f17510j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            v0.d(textView, string);
        }
        if (str == null) {
            i11 = 0;
        } else if (i14 >= 24) {
            u0.b(textView, u0.a(str));
            i11 = 0;
        } else {
            i11 = 0;
            s0.c(textView, t0.a(str.split(",")[0]));
        }
        h1 h1Var = this.f17509i;
        Context context2 = h1Var.f17333j;
        int[] iArr3 = f.a.f5580i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i10, i11);
        TextView textView2 = h1Var.f17332i;
        r0.j0.j(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i10);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            h1Var.f17326a = typedArrayObtainStyledAttributes3.getInt(5, i11);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i15 = 0; i15 < length; i15++) {
                    iArr4[i15] = typedArrayObtainTypedArray.getDimensionPixelSize(i15, -1);
                }
                h1Var.f17330f = h1.b(iArr4);
                h1Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!h1Var.j()) {
            h1Var.f17326a = 0;
        } else if (h1Var.f17326a == 1) {
            if (!h1Var.f17331g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i12 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i12 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i12, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                h1Var.k(dimension2, dimension3, dimension);
            }
            h1Var.h();
        }
        if (w3.f17499b && h1Var.f17326a != 0) {
            int[] iArr5 = h1Var.f17330f;
            if (iArr5.length > 0) {
                if (v0.a(textView) != -1.0f) {
                    v0.b(textView, Math.round(h1Var.d), Math.round(h1Var.f17329e), Math.round(h1Var.f17328c), 0);
                } else {
                    v0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        r rVar2 = rVar;
        Drawable drawableB = resourceId4 != -1 ? rVar2.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? rVar2.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? rVar2.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? rVar2.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? rVar2.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? rVar2.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] drawableArrA = s0.a(textView);
            if (drawableB5 == null) {
                drawableB5 = drawableArrA[0];
            }
            if (drawableB2 == null) {
                drawableB2 = drawableArrA[1];
            }
            if (drawableB6 == null) {
                drawableB6 = drawableArrA[2];
            }
            if (drawableB4 == null) {
                drawableB4 = drawableArrA[3];
            }
            s0.b(textView, drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] drawableArrA2 = s0.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableB4 == null) {
                    drawableB4 = drawableArrA2[3];
                }
                s0.b(textView, drawable, drawableB2, drawable2, drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = o7.a(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                e0.b.s(textView, colorStateList);
            } else if (textView instanceof u0.k) {
                ((u0.k) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeB = m1.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                e0.b.t(textView, modeB);
            } else if (textView instanceof u0.k) {
                ((u0.k) textView).setSupportCompoundDrawablesTintMode(modeB);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            p7.b(dimensionPixelSize, textView);
        }
        if (dimensionPixelSize2 != -1) {
            p7.c(dimensionPixelSize2, textView);
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (dimensionPixelSize3 != fontMetricsInt) {
                textView.setLineSpacing(dimensionPixelSize3 - fontMetricsInt, 1.0f);
            }
        }
    }

    public final void g(Context context, int i10) {
        String string;
        ColorStateList colorStateListX;
        ColorStateList colorStateListX2;
        ColorStateList colorStateListX3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, f.a.f5593w);
        j9.a aVar = new j9.a(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f17503a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (typedArrayObtainStyledAttributes.hasValue(3) && (colorStateListX3 = aVar.x(3)) != null) {
                textView.setTextColor(colorStateListX3);
            }
            if (typedArrayObtainStyledAttributes.hasValue(5) && (colorStateListX2 = aVar.x(5)) != null) {
                textView.setLinkTextColor(colorStateListX2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(4) && (colorStateListX = aVar.x(4)) != null) {
                textView.setHintTextColor(colorStateListX);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, aVar);
        if (i11 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            v0.d(textView, string);
        }
        aVar.I();
        Typeface typeface = this.f17512l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f17510j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        h1 h1Var = this.f17509i;
        if (h1Var.j()) {
            DisplayMetrics displayMetrics = h1Var.f17333j.getResources().getDisplayMetrics();
            h1Var.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        h1 h1Var = this.f17509i;
        if (h1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = h1Var.f17333j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                h1Var.f17330f = h1.b(iArrCopyOf);
                if (!h1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                h1Var.f17331g = false;
            }
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void k(int i10) {
        h1 h1Var = this.f17509i;
        if (h1Var.j()) {
            if (i10 == 0) {
                h1Var.f17326a = 0;
                h1Var.d = -1.0f;
                h1Var.f17329e = -1.0f;
                h1Var.f17328c = -1.0f;
                h1Var.f17330f = new int[0];
                h1Var.f17327b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(i0.a.k(i10, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = h1Var.f17333j.getResources().getDisplayMetrics();
            h1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new f3();
        }
        f3 f3Var = this.h;
        f3Var.f17321c = colorStateList;
        f3Var.f17320b = colorStateList != null;
        this.f17504b = f3Var;
        this.f17505c = f3Var;
        this.d = f3Var;
        this.f17506e = f3Var;
        this.f17507f = f3Var;
        this.f17508g = f3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new f3();
        }
        f3 f3Var = this.h;
        f3Var.d = mode;
        f3Var.f17319a = mode != null;
        this.f17504b = f3Var;
        this.f17505c = f3Var;
        this.d = f3Var;
        this.f17506e = f3Var;
        this.f17507f = f3Var;
        this.f17508g = f3Var;
    }

    public final void n(Context context, j9.a aVar) {
        String string;
        int i10 = this.f17510j;
        TypedArray typedArray = (TypedArray) aVar.f12864c;
        this.f17510j = typedArray.getInt(2, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(11, -1);
            this.f17511k = i12;
            if (i12 != -1) {
                this.f17510j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f17513m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 == 1) {
                    this.f17512l = Typeface.SANS_SERIF;
                    return;
                } else if (i13 == 2) {
                    this.f17512l = Typeface.SERIF;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f17512l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f17512l = null;
        int i14 = typedArray.hasValue(12) ? 12 : 10;
        int i15 = this.f17511k;
        int i16 = this.f17510j;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference(this.f17503a);
            d5.e0 e0Var = new d5.e0();
            e0Var.d = this;
            e0Var.f4788a = i15;
            e0Var.f4789b = i16;
            e0Var.f4790c = weakReference;
            try {
                Typeface typefaceA = aVar.A(i14, this.f17510j, e0Var);
                if (typefaceA != null) {
                    if (i11 < 28 || this.f17511k == -1) {
                        this.f17512l = typefaceA;
                    } else {
                        this.f17512l = w0.a(Typeface.create(typefaceA, 0), this.f17511k, (this.f17510j & 2) != 0);
                    }
                }
                this.f17513m = this.f17512l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f17512l != null || (string = typedArray.getString(i14)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f17511k == -1) {
            this.f17512l = Typeface.create(string, this.f17510j);
        } else {
            this.f17512l = w0.a(Typeface.create(string, 0), this.f17511k, (this.f17510j & 2) != 0);
        }
    }
}
