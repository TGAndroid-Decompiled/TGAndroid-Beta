package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f17467a;
    public final r f17468b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f17468b = rVar;
        this.f17467a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f17467a.onMenuItemActionCollapse(this.f17468b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f17467a.onMenuItemActionExpand(this.f17468b.f(menuItem));
    }
}
