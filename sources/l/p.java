package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f19224a;
    public final r f19225b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f19225b = rVar;
        this.f19224a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f19224a.onMenuItemActionCollapse(this.f19225b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f19224a.onMenuItemActionExpand(this.f19225b.f(menuItem));
    }
}
