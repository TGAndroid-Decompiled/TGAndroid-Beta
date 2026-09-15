package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f13113c = {MenuItem.class};
    public Object f13114a;
    public Method f13115b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f13114a;
        Method method = this.f13115b;
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
