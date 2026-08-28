package f7;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
public abstract class c0 {
    public static int a(Context context) {
        boolean z10;
        int i9;
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z10 = true;
        } else {
            z10 = false;
        }
        TypedValue typedValue = new TypedValue();
        Resources resources = context.getResources();
        if (z10) {
            i9 = 2131165335;
        } else {
            i9 = 2131165334;
        }
        resources.getValue(i9, typedValue, true);
        int i10 = typedValue.type;
        if (i10 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else if (i10 == 6) {
            int i11 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i11, i11);
        } else {
            return -2;
        }
        return (int) fraction;
    }
}
