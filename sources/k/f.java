package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f14530c = {MenuItem.class};
    public Object f14531a;
    public Method f14532b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f14531a;
        Method method = this.f14532b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
