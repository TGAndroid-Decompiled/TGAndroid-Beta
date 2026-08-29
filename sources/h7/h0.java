package h7;

import android.content.Context;
import android.content.res.TypedArray;
public abstract class h0 {
    public static int a(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
