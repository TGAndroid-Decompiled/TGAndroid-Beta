package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f14463a;
    public final r f14464b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14464b = rVar;
        this.f14463a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f14463a.onMenuItemActionCollapse(this.f14464b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f14463a.onMenuItemActionExpand(this.f14464b.f(menuItem));
    }
}
