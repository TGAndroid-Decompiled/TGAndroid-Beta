package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f9511c = {MenuItem.class};
    public Object f9512a;
    public Method f9513b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f9512a;
        Method method = this.f9513b;
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
