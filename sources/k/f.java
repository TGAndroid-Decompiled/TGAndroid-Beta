package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f18063c = {MenuItem.class};
    public Object f18064a;
    public Method f18065b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f18064a;
        Method method = this.f18065b;
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
