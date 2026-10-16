package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f13731c = {MenuItem.class};
    public Object f13732a;
    public Method f13733b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f13732a;
        Method method = this.f13733b;
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
