package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f17674c = {MenuItem.class};
    public Object f17675a;
    public Method f17676b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f17675a;
        Method method = this.f17676b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
