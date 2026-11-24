package defpackage;

import android.view.MenuItem;
public final class f07 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final g07 b;

    public f07(g07 g07Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = g07Var;
        this.a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.f(menuItem));
    }
}
