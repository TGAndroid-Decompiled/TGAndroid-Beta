package defpackage;

import android.view.MenuItem;
public final class m27 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final n27 b;

    public m27(n27 n27Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = n27Var;
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
