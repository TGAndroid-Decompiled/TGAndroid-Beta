package l;

import android.view.MenuItem;

public final class q implements MenuItem.OnActionExpandListener {

    public final MenuItem.OnActionExpandListener f15360a;

    public final s f15361b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15361b = sVar;
        this.f15360a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15360a.onMenuItemActionCollapse(this.f15361b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15360a.onMenuItemActionExpand(this.f15361b.f(menuItem));
    }
}
