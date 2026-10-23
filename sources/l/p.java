package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f15864a;
    public final r f15865b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15865b = rVar;
        this.f15864a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f15864a.onMenuItemActionCollapse(this.f15865b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f15864a.onMenuItemActionExpand(this.f15865b.f(menuItem));
    }
}
