package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f19255a;
    public final r f19256b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f19256b = rVar;
        this.f19255a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f19255a.onMenuItemActionCollapse(this.f19256b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f19255a.onMenuItemActionExpand(this.f19256b.f(menuItem));
    }
}
