package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f14283c = {MenuItem.class};
    public Object f14284a;
    public Method f14285b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f14284a;
        Method method = this.f14285b;
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
