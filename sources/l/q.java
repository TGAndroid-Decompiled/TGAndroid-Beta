package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f14008a;
    public final s f14009b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14009b = sVar;
        this.f14008a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f14008a.onMenuItemActionCollapse(this.f14009b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f14008a.onMenuItemActionExpand(this.f14009b.f(menuItem));
    }
}
