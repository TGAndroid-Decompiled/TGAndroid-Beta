package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f13205c = {MenuItem.class};
    public Object f13206a;
    public Method f13207b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f13206a;
        Method method = this.f13207b;
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
