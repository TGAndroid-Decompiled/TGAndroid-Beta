package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;
public final class xdb implements MenuItem.OnMenuItemClickListener {
    public static final Class[] d = {MenuItem.class};
    public final byte a = 0;
    public Object b;
    public Object c;

    public xdb(g27 g27Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.c = g27Var;
        this.b = onMenuItemClickListener;
    }

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.a) {
            case 0:
                Object obj = this.b;
                Method method = (Method) this.c;
                boolean z = false;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        z = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj, menuItem);
                        z = true;
                    }
                } catch (Exception e) {
                    rjb.m(e);
                }
                return z;
            default:
                return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((g27) this.c).f(menuItem));
        }
    }

    public xdb() {
    }
}
