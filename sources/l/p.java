package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15802a;
    public final r f15803b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15803b = rVar;
        this.f15802a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15802a.onMenuItemActionCollapse(this.f15803b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15802a.onMenuItemActionExpand(this.f15803b.f(menuItem));
    }
}
