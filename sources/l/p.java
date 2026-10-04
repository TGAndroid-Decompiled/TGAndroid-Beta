package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15221a;
    public final r f15222b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15222b = rVar;
        this.f15221a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15221a.onMenuItemActionCollapse(this.f15222b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15221a.onMenuItemActionExpand(this.f15222b.f(menuItem));
    }
}
