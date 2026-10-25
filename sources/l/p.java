package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f16767a;
    public final r f16768b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f16768b = rVar;
        this.f16767a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f16767a.onMenuItemActionCollapse(this.f16768b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f16767a.onMenuItemActionExpand(this.f16768b.f(menuItem));
    }
}
