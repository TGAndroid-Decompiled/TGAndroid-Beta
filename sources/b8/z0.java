package b8;

import android.content.Context;
import android.content.res.TypedArray;
public abstract class z0 {
    public static int a(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i3});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
