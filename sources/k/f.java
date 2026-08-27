package k;

import android.view.MenuItem;
import java.lang.reflect.Method;

public final class f implements MenuItem.OnMenuItemClickListener {

    public static final Class[] f14217c = {MenuItem.class};

    public Object f14218a;

    public Method f14219b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f14218a;
        Method method = this.f14219b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e9) {
            throw new RuntimeException(e9);
        }
    }
}
