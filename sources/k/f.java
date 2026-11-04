package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f16395c = {MenuItem.class};
    public Object f16396a;
    public Method f16397b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f16396a;
        Method method = this.f16397b;
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
