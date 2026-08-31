package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f10207c = {MenuItem.class};
    public Object f10208a;
    public Method f10209b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f10208a;
        Method method = this.f10209b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e6) {
            throw new RuntimeException(e6);
        }
    }
}
