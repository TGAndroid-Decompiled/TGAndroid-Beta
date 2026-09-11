package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15160a;
    public final s f15161b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15161b = sVar;
        this.f15160a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15160a.onMenuItemActionCollapse(this.f15161b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15160a.onMenuItemActionExpand(this.f15161b.f(menuItem));
    }
}
