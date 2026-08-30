package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f11088a;
    public final r f11089b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f11089b = rVar;
        this.f11088a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f11088a.onMenuItemActionCollapse(this.f11089b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f11088a.onMenuItemActionExpand(this.f11089b.f(menuItem));
    }
}
