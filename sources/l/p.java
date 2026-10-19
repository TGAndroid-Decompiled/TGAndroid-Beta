package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15803a;
    public final r f15804b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15804b = rVar;
        this.f15803a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15803a.onMenuItemActionCollapse(this.f15804b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15803a.onMenuItemActionExpand(this.f15804b.f(menuItem));
    }
}
