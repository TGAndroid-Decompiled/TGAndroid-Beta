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
    public final TextView f17128a;
    public f3 f17129b;
    public f3 f17130c;
    public f3 d;
    public f3 f17131e;
    public f3 f17132f;
    public f3 f17133g;
    public f3 h;
    public final h1 f17134i;
    public int f17135j = 0;
    public int f17136k = -1;
    public Typeface f17137l;
    public boolean f17138m;

    public x0(TextView textView) {
        this.f17128a = textView;
        this.f17134i = new h1(textView);
    }

    public static f3 c(Context context, r rVar, int i9) {
        ColorStateList i10;
        synchronized (rVar) {
            i10 = rVar.f17064a.i(context, i9);
        }
        if (i10 != null) {
            ?? obj = new Object();
            obj.f16945b = true;
            obj.f16946c = i10;
            return obj;
        }
        return null;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i9;
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
                i9 = i13;
            } else {
                i9 = i12;
            }
            if (i12 <= i13) {
                i12 = i13;
            }
            int length = text.length();
            if (i9 >= 0 && i12 <= length) {
                int i14 = editorInfo.inputType & 4095;
                if (i14 != 129 && i14 != 225 && i14 != 18) {
                    if (length <= 2048) {
                        t0.b.c(editorInfo, text, i9, i12);
                        return;
                    }
                    int i15 = i12 - i9;
                    if (i15 > 1024) {
                        i10 = 0;
                    } else {
                        i10 = i15;
                    }
                    int i16 = 2048 - i10;
                    int min = Math.min(text.length() - i12, i16 - Math.min(i9, (int) (i16 * 0.8d)));
                    int min2 = Math.min(i9, i16 - min);
                    int i17 = i9 - min2;
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

    public final void a(Drawable drawable, f3 f3Var) {
        if (drawable != null && f3Var != null) {
            r.d(drawable, f3Var, this.f17128a.getDrawableState());
        }
    }

    public final void b() {
        f3 f3Var = this.f17129b;
        TextView textView = this.f17128a;
        if (f3Var != null || this.f17130c != null || this.d != null || this.f17131e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f17129b);
            a(compoundDrawables[1], this.f17130c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f17131e);
        }
        if (this.f17132f == null && this.f17133g == null) {
            return;
        }
        Drawable[] a2 = s0.a(textView);
        a(a2[0], this.f17132f);
        a(a2[2], this.f17133g);
    }

    public final ColorStateList d() {
        f3 f3Var = this.h;
        if (f3Var != null) {
            return (ColorStateList) f3Var.f16946c;
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

    public final void g(Context context, int i9) {
        String string;
        ColorStateList v;
        ColorStateList v4;
        ColorStateList v10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i9, f.a.f5288w);
        j4.c cVar = new j4.c(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f17128a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            if (obtainStyledAttributes.hasValue(3) && (v10 = cVar.v(3)) != null) {
                textView.setTextColor(v10);
            }
            if (obtainStyledAttributes.hasValue(5) && (v4 = cVar.v(5)) != null) {
                textView.setLinkTextColor(v4);
            }
            if (obtainStyledAttributes.hasValue(4) && (v = cVar.v(4)) != null) {
                textView.setHintTextColor(v);
            }
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, cVar);
        if (i10 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            v0.d(textView, string);
        }
        cVar.G();
        Typeface typeface = this.f17137l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f17135j);
        }
    }

    public final void i(int i9, int i10, int i11, int i12) {
        h1 h1Var = this.f17134i;
        if (h1Var.j()) {
            DisplayMetrics displayMetrics = h1Var.f16958j.getResources().getDisplayMetrics();
            h1Var.k(TypedValue.applyDimension(i12, i9, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i9) {
        h1 h1Var = this.f17134i;
        if (h1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i9 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = h1Var.f16958j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArr2[i10] = Math.round(TypedValue.applyDimension(i9, iArr[i10], displayMetrics));
                    }
                }
                h1Var.f16955f = h1.b(iArr2);
                if (!h1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                h1Var.f16956g = false;
            }
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void k(int i9) {
        h1 h1Var = this.f17134i;
        if (h1Var.j()) {
            if (i9 != 0) {
                if (i9 == 1) {
                    DisplayMetrics displayMetrics = h1Var.f16958j.getResources().getDisplayMetrics();
                    h1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (h1Var.h()) {
                        h1Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(j3.r0.l(i9, "Unknown auto-size text type: "));
            }
            h1Var.f16951a = 0;
            h1Var.d = -1.0f;
            h1Var.f16954e = -1.0f;
            h1Var.f16953c = -1.0f;
            h1Var.f16955f = new int[0];
            h1Var.f16952b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z10;
        if (this.h == null) {
            this.h = new Object();
        }
        f3 f3Var = this.h;
        f3Var.f16946c = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f3Var.f16945b = z10;
        this.f17129b = f3Var;
        this.f17130c = f3Var;
        this.d = f3Var;
        this.f17131e = f3Var;
        this.f17132f = f3Var;
        this.f17133g = f3Var;
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
        f3Var.f16944a = z10;
        this.f17129b = f3Var;
        this.f17130c = f3Var;
        this.d = f3Var;
        this.f17131e = f3Var;
        this.f17132f = f3Var;
        this.f17133g = f3Var;
    }

    public final void n(Context context, j4.c cVar) {
        String string;
        boolean z10;
        boolean z11;
        int i9 = this.f17135j;
        TypedArray typedArray = (TypedArray) cVar.f13432c;
        this.f17135j = typedArray.getInt(2, i9);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.f17136k = i11;
            if (i11 != -1) {
                this.f17135j &= 2;
            }
        }
        int i12 = 10;
        boolean z12 = true;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f17138m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            this.f17137l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f17137l = Typeface.SERIF;
                    return;
                }
                this.f17137l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f17137l = null;
        if (typedArray.hasValue(12)) {
            i12 = 12;
        }
        int i14 = this.f17136k;
        int i15 = this.f17135j;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference(this.f17128a);
            ?? obj = new Object();
            obj.d = this;
            obj.f4338a = i14;
            obj.f4339b = i15;
            obj.f4340c = weakReference;
            try {
                Typeface y10 = cVar.y(i12, this.f17135j, obj);
                if (y10 != null) {
                    if (i10 >= 28 && this.f17136k != -1) {
                        Typeface create = Typeface.create(y10, 0);
                        int i16 = this.f17136k;
                        if ((this.f17135j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f17137l = w0.a(create, i16, z11);
                    } else {
                        this.f17137l = y10;
                    }
                }
                if (this.f17137l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f17138m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f17137l == null && (string = typedArray.getString(i12)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f17136k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i17 = this.f17136k;
                if ((this.f17135j & 2) == 0) {
                    z12 = false;
                }
                this.f17137l = w0.a(create2, i17, z12);
                return;
            }
            this.f17137l = Typeface.create(string, this.f17135j);
        }
    }
}
