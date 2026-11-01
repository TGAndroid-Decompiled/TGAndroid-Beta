package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f11546a;
    public final s f11547b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f11547b = sVar;
        this.f11546a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f11546a.onMenuItemActionCollapse(this.f11547b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f11546a.onMenuItemActionExpand(this.f11547b.f(menuItem));
    }
}
