package j7;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
public abstract class z {
    public static int a(Context context) {
        boolean z4;
        int i10;
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z4 = true;
        } else {
            z4 = false;
        }
        TypedValue typedValue = new TypedValue();
        Resources resources = context.getResources();
        if (z4) {
            i10 = 2131165335;
        } else {
            i10 = 2131165334;
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else if (i11 == 6) {
            int i12 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i12, i12);
        } else {
            return -2;
        }
        return (int) fraction;
    }
}
