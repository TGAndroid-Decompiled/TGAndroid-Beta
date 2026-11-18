package m;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;
public abstract class n1 {
    public static final Method f20136a;
    public static final Method f20137b;
    public static final Method f20138c;
    public static final boolean d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f20136a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f20137b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f20138c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            d = true;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }
}
