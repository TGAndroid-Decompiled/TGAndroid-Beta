package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f14007a;
    public final s f14008b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14008b = sVar;
        this.f14007a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f14007a.onMenuItemActionCollapse(this.f14008b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f14007a.onMenuItemActionExpand(this.f14008b.f(menuItem));
    }
}
