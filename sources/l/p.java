package l;

import android.view.MenuItem;
public final class p implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener f19323a;
    public final r f19324b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f19324b = rVar;
        this.f19323a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f19323a.onMenuItemActionCollapse(this.f19324b.f(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f19323a.onMenuItemActionExpand(this.f19324b.f(menuItem));
    }
}
