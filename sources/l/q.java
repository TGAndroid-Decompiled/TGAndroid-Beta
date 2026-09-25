package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f14006a;
    public final s f14007b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14007b = sVar;
        this.f14006a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f14006a.onMenuItemActionCollapse(this.f14007b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f14006a.onMenuItemActionExpand(this.f14007b.f(menuItem));
    }
}
