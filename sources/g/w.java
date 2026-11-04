package g;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
public final class w {
    public static final Class[] f11769b = {Context.class, AttributeSet.class};
    public static final int[] f11770c = {16843375};
    public static final int[] d = {16844160};
    public static final int[] f11771e = {16844156};
    public static final int[] f11772f = {16844148};
    public static final String[] f11773g = {"android.widget.", "android.view.", "android.webkit."};
    public static final a0.l h = new a0.l(0);
    public final Object[] f11774a = new Object[2];

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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f11769b);
            lVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f11774a);
    }
}
