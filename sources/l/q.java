package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15186a;
    public final s f15187b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15187b = sVar;
        this.f15186a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15186a.onMenuItemActionCollapse(this.f15187b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15186a.onMenuItemActionExpand(this.f15187b.f(menuItem));
    }
}
