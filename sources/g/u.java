package g;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
public final class u {
    public static final Class[] f6946b = {Context.class, AttributeSet.class};
    public static final int[] f6947c = {16843375};
    public static final int[] d = {16844160};
    public static final int[] f6948e = {16844156};
    public static final int[] f6949f = {16844148};
    public static final String[] f6950g = {"android.widget.", "android.view.", "android.webkit."};
    public static final a0.k h = new a0.k(0);
    public final Object[] f6951a = new Object[2];

    public final View a(Context context, String str, String str2) {
        String concat;
        a0.k kVar = h;
        Constructor constructor = (Constructor) kVar.get(str);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f6946b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f6951a);
    }
}
