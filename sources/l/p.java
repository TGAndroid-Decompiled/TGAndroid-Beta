package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15034a;
    public final r f15035b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15035b = rVar;
        this.f15034a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15034a.onMenuItemActionCollapse(this.f15035b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15034a.onMenuItemActionExpand(this.f15035b.f(menuItem));
    }
}
