package k;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] f16009c = {MenuItem.class};
    public Object f16010a;
    public Method f16011b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f16010a;
        Method method = this.f16011b;
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
