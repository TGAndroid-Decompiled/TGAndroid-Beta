package a8;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
public abstract class a7 {
    public static int a(Context context) {
        boolean z9;
        int i7;
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z9 = true;
        } else {
            z9 = false;
        }
        TypedValue typedValue = new TypedValue();
        Resources resources = context.getResources();
        if (z9) {
            i7 = 2131165335;
        } else {
            i7 = 2131165334;
        }
        resources.getValue(i7, typedValue, true);
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
