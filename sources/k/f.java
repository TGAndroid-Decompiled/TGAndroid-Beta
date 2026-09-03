package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f9492c = {MenuItem.class};
    public Object f9493a;
    public Method f9494b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f9493a;
        Method method = this.f9494b;
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
