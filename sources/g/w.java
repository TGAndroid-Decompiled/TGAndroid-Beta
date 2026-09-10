package g;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
public final class w {
    public static final Class[] f8447b = {Context.class, AttributeSet.class};
    public static final int[] f8448c = {16843375};
    public static final int[] d = {16844160};
    public static final int[] e = {16844156};
    public static final int[] f8449f = {16844148};
    public static final String[] f8450g = {"android.widget.", "android.view.", "android.webkit."};
    public static final a0.l h = new a0.l(0);
    public final Object[] f8451a = new Object[2];

    public final View a(Context context, String str, String str2) {
        String concat;
        a0.l lVar = h;
        Constructor constructor = (Constructor) lVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f8447b);
            lVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f8451a);
    }
}
