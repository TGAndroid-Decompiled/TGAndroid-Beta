package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f11445a;
    public final s f11446b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f11446b = sVar;
        this.f11445a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f11445a.onMenuItemActionCollapse(this.f11446b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f11445a.onMenuItemActionExpand(this.f11446b.f(menuItem));
    }
}
