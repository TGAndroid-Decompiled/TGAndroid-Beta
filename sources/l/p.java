package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15285a;
    public final r f15286b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15286b = rVar;
        this.f15285a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15285a.onMenuItemActionCollapse(this.f15286b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15285a.onMenuItemActionExpand(this.f15286b.f(menuItem));
    }
}
