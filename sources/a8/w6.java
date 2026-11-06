package a8;

import android.content.Context;
import android.content.res.TypedArray;
public abstract class w6 {
    public static int a(Context context, int i7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i7});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
