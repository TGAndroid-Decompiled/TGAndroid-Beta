package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f17718a;
    public final r f17719b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f17719b = rVar;
        this.f17718a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f17718a.onMenuItemActionCollapse(this.f17719b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f17718a.onMenuItemActionExpand(this.f17719b.f(menuItem));
    }
}
