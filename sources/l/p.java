package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f17724a;
    public final r f17725b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f17725b = rVar;
        this.f17724a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f17724a.onMenuItemActionCollapse(this.f17725b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f17724a.onMenuItemActionExpand(this.f17725b.f(menuItem));
    }
}
