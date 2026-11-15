package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f18863a;
    public final r f18864b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f18864b = rVar;
        this.f18863a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f18863a.onMenuItemActionCollapse(this.f18864b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f18863a.onMenuItemActionExpand(this.f18864b.f(menuItem));
    }
}
