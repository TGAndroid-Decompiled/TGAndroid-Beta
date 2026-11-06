package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f17113c = {MenuItem.class};
    public Object f17114a;
    public Method f17115b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f17114a;
        Method method = this.f17115b;
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
