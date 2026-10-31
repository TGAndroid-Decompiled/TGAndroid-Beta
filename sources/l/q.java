package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f11545a;
    public final s f11546b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f11546b = sVar;
        this.f11545a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f11545a.onMenuItemActionCollapse(this.f11546b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f11545a.onMenuItemActionExpand(this.f11546b.f(menuItem));
    }
}
