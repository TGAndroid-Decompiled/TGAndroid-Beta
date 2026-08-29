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
    public final TextView f16725a;
    public f3 f16726b;
    public f3 f16727c;
    public f3 d;
    public f3 f16728e;
    public f3 f16729f;
    public f3 f16730g;
    public f3 h;
    public final h1 f16731i;
    public int f16732j = 0;
    public int f16733k = -1;
    public Typeface f16734l;
    public boolean f16735m;

    public x0(TextView textView) {
        this.f16725a = textView;
        this.f16731i = new h1(textView);
    }

    public static f3 c(Context context, r rVar, int i10) {
        ColorStateList i11;
        synchronized (rVar) {
            i11 = rVar.f16663a.i(context, i10);
        }
        if (i11 != null) {
            ?? obj = new Object();
            obj.f16544b = true;
            obj.f16545c = i11;
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
            r.d(drawable, f3Var, this.f16725a.getDrawableState());
        }
    }

    public final void b() {
        f3 f3Var = this.f16726b;
        TextView textView = this.f16725a;
        if (f3Var != null || this.f16727c != null || this.d != null || this.f16728e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f16726b);
            a(compoundDrawables[1], this.f16727c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f16728e);
        }
        if (this.f16729f == null && this.f16730g == null) {
            return;
        }
        Drawable[] a2 = s0.a(textView);
        a(a2[0], this.f16729f);
        a(a2[2], this.f16730g);
    }

    public final ColorStateList d() {
        f3 f3Var = this.h;
        if (f3Var != null) {
            return (ColorStateList) f3Var.f16545c;
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
        ColorStateList p10;
        ColorStateList p11;
        ColorStateList p12;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, f.a.f6250w);
        l3.g0 g0Var = new l3.g0(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f16725a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (obtainStyledAttributes.hasValue(3) && (p12 = g0Var.p(3)) != null) {
                textView.setTextColor(p12);
            }
            if (obtainStyledAttributes.hasValue(5) && (p11 = g0Var.p(5)) != null) {
                textView.setLinkTextColor(p11);
            }
            if (obtainStyledAttributes.hasValue(4) && (p10 = g0Var.p(4)) != null) {
                textView.setHintTextColor(p10);
            }
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, g0Var);
        if (i11 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            v0.d(textView, string);
        }
        g0Var.B();
        Typeface typeface = this.f16734l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f16732j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        h1 h1Var = this.f16731i;
        if (h1Var.j()) {
            DisplayMetrics displayMetrics = h1Var.f16557j.getResources().getDisplayMetrics();
            h1Var.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        h1 h1Var = this.f16731i;
        if (h1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = h1Var.f16557j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                h1Var.f16554f = h1.b(iArr2);
                if (!h1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                h1Var.f16555g = false;
            }
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void k(int i10) {
        h1 h1Var = this.f16731i;
        if (h1Var.j()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = h1Var.f16557j.getResources().getDisplayMetrics();
                    h1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (h1Var.h()) {
                        h1Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(j7.l1.k(i10, "Unknown auto-size text type: "));
            }
            h1Var.f16550a = 0;
            h1Var.d = -1.0f;
            h1Var.f16553e = -1.0f;
            h1Var.f16552c = -1.0f;
            h1Var.f16554f = new int[0];
            h1Var.f16551b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z10;
        if (this.h == null) {
            this.h = new Object();
        }
        f3 f3Var = this.h;
        f3Var.f16545c = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f3Var.f16544b = z10;
        this.f16726b = f3Var;
        this.f16727c = f3Var;
        this.d = f3Var;
        this.f16728e = f3Var;
        this.f16729f = f3Var;
        this.f16730g = f3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z10;
        if (this.h == null) {
            this.h = new Object();
        }
        f3 f3Var = this.h;
        f3Var.d = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f3Var.f16543a = z10;
        this.f16726b = f3Var;
        this.f16727c = f3Var;
        this.d = f3Var;
        this.f16728e = f3Var;
        this.f16729f = f3Var;
        this.f16730g = f3Var;
    }

    public final void n(Context context, l3.g0 g0Var) {
        String string;
        boolean z10;
        boolean z11;
        int i10 = this.f16732j;
        TypedArray typedArray = (TypedArray) g0Var.f14097c;
        this.f16732j = typedArray.getInt(2, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(11, -1);
            this.f16733k = i12;
            if (i12 != -1) {
                this.f16732j &= 2;
            }
        }
        int i13 = 10;
        boolean z12 = true;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f16735m = false;
                int i14 = typedArray.getInt(1, 1);
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            this.f16734l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f16734l = Typeface.SERIF;
                    return;
                }
                this.f16734l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f16734l = null;
        if (typedArray.hasValue(12)) {
            i13 = 12;
        }
        int i15 = this.f16733k;
        int i16 = this.f16732j;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference(this.f16725a);
            ?? obj = new Object();
            obj.d = this;
            obj.f6572a = i15;
            obj.f6573b = i16;
            obj.f6574c = weakReference;
            try {
                Typeface s10 = g0Var.s(i13, this.f16732j, obj);
                if (s10 != null) {
                    if (i11 >= 28 && this.f16733k != -1) {
                        Typeface create = Typeface.create(s10, 0);
                        int i17 = this.f16733k;
                        if ((this.f16732j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f16734l = w0.a(create, i17, z11);
                    } else {
                        this.f16734l = s10;
                    }
                }
                if (this.f16734l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f16735m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f16734l == null && (string = typedArray.getString(i13)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f16733k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i18 = this.f16733k;
                if ((this.f16732j & 2) == 0) {
                    z12 = false;
                }
                this.f16734l = w0.a(create2, i18, z12);
                return;
            }
            this.f16734l = Typeface.create(string, this.f16732j);
        }
    }
}
