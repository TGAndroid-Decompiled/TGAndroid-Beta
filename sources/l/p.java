package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f13770a;
    public final r f13771b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13771b = rVar;
        this.f13770a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f13770a.onMenuItemActionCollapse(this.f13771b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f13770a.onMenuItemActionExpand(this.f13771b.f(menuItem));
    }
}
