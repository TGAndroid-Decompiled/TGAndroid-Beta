package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f13794a;
    public final r f13795b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13795b = rVar;
        this.f13794a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f13794a.onMenuItemActionCollapse(this.f13795b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f13794a.onMenuItemActionExpand(this.f13795b.f(menuItem));
    }
}
