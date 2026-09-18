package g;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
public final class w {
    public static final Class[] f9319b = {Context.class, AttributeSet.class};
    public static final int[] f9320c = {16843375};
    public static final int[] d = {16844160};
    public static final int[] e = {16844156};
    public static final int[] f9321f = {16844148};
    public static final String[] f9322g = {"android.widget.", "android.view.", "android.webkit."};
    public static final a0.m h = new a0.m(0);
    public final Object[] f9323a = new Object[2];

    public final View a(Context context, String str, String str2) {
        String concat;
        a0.m mVar = h;
        Constructor constructor = (Constructor) mVar.get(str);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f9319b);
            mVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f9323a);
    }
}
