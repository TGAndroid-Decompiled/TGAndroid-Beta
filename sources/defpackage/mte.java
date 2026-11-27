package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
public abstract class mte {
    public static int a(Context context) {
        boolean z;
        int i;
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z = true;
        } else {
            z = false;
        }
        TypedValue typedValue = new TypedValue();
        Resources resources = context.getResources();
        if (z) {
            i = 2131165335;
        } else {
            i = 2131165334;
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else if (i2 == 6) {
            int i3 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i3, i3);
        } else {
            return -2;
        }
        return (int) fraction;
    }
}
