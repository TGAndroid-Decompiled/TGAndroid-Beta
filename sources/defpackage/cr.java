package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
public final class cr {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {16843375};
    public static final int[] d = {16844160};
    public static final int[] e = {16844156};
    public static final int[] f = {16844148};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final aia h = new aia(0);
    public final Object[] a = new Object[2];

    public final View a(Context context, String str, String str2) {
        String concat;
        aia aiaVar = h;
        Constructor constructor = (Constructor) aiaVar.get(str);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            aiaVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
