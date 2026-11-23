package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f18165c = {MenuItem.class};
    public Object f18166a;
    public Method f18167b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f18166a;
        Method method = this.f18167b;
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
