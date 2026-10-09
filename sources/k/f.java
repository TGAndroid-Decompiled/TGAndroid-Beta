package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f14285c = {MenuItem.class};
    public Object f14286a;
    public Method f14287b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f14286a;
        Method method = this.f14287b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }
}
