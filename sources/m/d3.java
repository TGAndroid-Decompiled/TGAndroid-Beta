package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import h7.s7;
public abstract class d3 {
    public static final ThreadLocal f16516a = new ThreadLocal();
    public static final int[] f16517b = {-16842910};
    public static final int[] f16518c = {16842908};
    public static final int[] d = {16842919};
    public static final int[] f16519e = {16842912};
    public static final int[] f16520f = new int[0];
    public static final int[] f16521g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f.a.f6238j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList d10 = d(context, i10);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f16517b, d10.getDefaultColor());
        }
        ThreadLocal threadLocal = f16516a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f9 = typedValue.getFloat();
        int c3 = c(context, i10);
        return i0.a.k(c3, Math.round(Color.alpha(c3) * f9));
    }

    public static int c(Context context, int i10) {
        int[] iArr = f16521g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i10) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f16521g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = s7.a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
