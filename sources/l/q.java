package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f13980a;
    public final s f13981b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13981b = sVar;
        this.f13980a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f13980a.onMenuItemActionCollapse(this.f13981b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f13980a.onMenuItemActionExpand(this.f13981b.f(menuItem));
    }
}
