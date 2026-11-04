package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import b8.oc;
public abstract class z2 {
    public static final ThreadLocal f18801a = new ThreadLocal();
    public static final int[] f18802b = {-16842910};
    public static final int[] f18803c = {16842908};
    public static final int[] d = {16842919};
    public static final int[] f18804e = {16842912};
    public static final int[] f18805f = new int[0];
    public static final int[] f18806g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f.a.f11314j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i3) {
        ColorStateList d10 = d(context, i3);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f18802b, d10.getDefaultColor());
        }
        ThreadLocal threadLocal = f18801a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f10 = typedValue.getFloat();
        int c2 = c(context, i3);
        return i0.a.o(c2, Math.round(Color.alpha(c2) * f10));
    }

    public static int c(Context context, int i3) {
        int[] iArr = f18806g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i3) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f18806g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = oc.a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
