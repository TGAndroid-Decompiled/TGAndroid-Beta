package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import f7.t7;
public abstract class d3 {
    public static final ThreadLocal f16917a = new ThreadLocal();
    public static final int[] f16918b = {-16842910};
    public static final int[] f16919c = {16842908};
    public static final int[] d = {16842919};
    public static final int[] f16920e = {16842912};
    public static final int[] f16921f = new int[0];
    public static final int[] f16922g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f.a.f5276j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i9) {
        ColorStateList d9 = d(context, i9);
        if (d9 != null && d9.isStateful()) {
            return d9.getColorForState(f16918b, d9.getDefaultColor());
        }
        ThreadLocal threadLocal = f16917a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f10 = typedValue.getFloat();
        int c10 = c(context, i9);
        return i0.a.k(c10, Math.round(Color.alpha(c10) * f10));
    }

    public static int c(Context context, int i9) {
        int[] iArr = f16922g;
        iArr[0] = i9;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i9) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f16922g;
        iArr[0] = i9;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = t7.a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
