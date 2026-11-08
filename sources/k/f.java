package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f17116c = {MenuItem.class};
    public Object f17117a;
    public Method f17118b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f17117a;
        Method method = this.f17118b;
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
