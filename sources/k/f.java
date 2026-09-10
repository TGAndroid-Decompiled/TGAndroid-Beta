package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f11959c = {MenuItem.class};
    public Object f11960a;
    public Method f11961b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f11960a;
        Method method = this.f11961b;
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
