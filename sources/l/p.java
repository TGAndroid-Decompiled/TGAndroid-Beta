package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15033a;
    public final r f15034b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15034b = rVar;
        this.f15033a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15033a.onMenuItemActionCollapse(this.f15034b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15033a.onMenuItemActionExpand(this.f15034b.f(menuItem));
    }
}
