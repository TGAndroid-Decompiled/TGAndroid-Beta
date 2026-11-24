package defpackage;

import android.view.MenuItem;
public final class f27 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final g27 b;

    public f27(g27 g27Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = g27Var;
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
