package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f19227a;
    public final r f19228b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f19228b = rVar;
        this.f19227a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f19227a.onMenuItemActionCollapse(this.f19228b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f19227a.onMenuItemActionExpand(this.f19228b.f(menuItem));
    }
}
