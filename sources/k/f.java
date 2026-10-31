package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f10482c = {MenuItem.class};
    public Object f10483a;
    public Method f10484b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f10483a;
        Method method = this.f10484b;
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
