package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f13782a;
    public final r f13783b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13783b = rVar;
        this.f13782a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f13782a.onMenuItemActionCollapse(this.f13783b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f13782a.onMenuItemActionExpand(this.f13783b.f(menuItem));
    }
}
