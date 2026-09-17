package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f14393c = {MenuItem.class};
    public Object f14394a;
    public Method f14395b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f14394a;
        Method method = this.f14395b;
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
