package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f17721a;
    public final r f17722b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f17722b = rVar;
        this.f17721a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f17721a.onMenuItemActionCollapse(this.f17722b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f17721a.onMenuItemActionExpand(this.f17722b.f(menuItem));
    }
}
