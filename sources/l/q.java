package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f13994a;
    public final s f13995b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13995b = sVar;
        this.f13994a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f13994a.onMenuItemActionCollapse(this.f13995b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f13994a.onMenuItemActionExpand(this.f13995b.f(menuItem));
    }
}
