package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
public abstract class a3 {
    public static final ThreadLocal f19059a = new ThreadLocal();
    public static final int[] f19060b = {-16842910};
    public static final int[] f19061c = {16842908};
    public static final int[] d = {16842919};
    public static final int[] f19062e = {16842912};
    public static final int[] f19063f = new int[0];
    public static final int[] f19064g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f.a.f10862j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i7) {
        ColorStateList d2 = d(context, i7);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(f19060b, d2.getDefaultColor());
        }
        ThreadLocal threadLocal = f19059a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f10 = typedValue.getFloat();
        int c10 = c(context, i7);
        return i0.a.o(c10, Math.round(Color.alpha(c10) * f10));
    }

    public static int c(Context context, int i7) {
        int[] iArr = f19064g;
        iArr[0] = i7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i7) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f19064g;
        iArr[0] = i7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = b5.a.a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
