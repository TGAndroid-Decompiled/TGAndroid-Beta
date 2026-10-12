package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f13728c = {MenuItem.class};
    public Object f13729a;
    public Method f13730b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f13729a;
        Method method = this.f13730b;
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
