package f7;

import android.content.Context;
import android.content.res.TypedArray;
public abstract class z {
    public static int a(Context context, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i9});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
