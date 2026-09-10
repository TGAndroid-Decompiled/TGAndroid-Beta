package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f12676a;
    public final s f12677b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f12677b = sVar;
        this.f12676a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f12676a.onMenuItemActionCollapse(this.f12677b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f12676a.onMenuItemActionExpand(this.f12677b.f(menuItem));
    }
}
