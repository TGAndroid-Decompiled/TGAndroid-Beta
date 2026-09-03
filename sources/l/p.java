package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f11198a;
    public final r f11199b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f11199b = rVar;
        this.f11198a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f11198a.onMenuItemActionCollapse(this.f11199b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f11198a.onMenuItemActionExpand(this.f11199b.f(menuItem));
    }
}
