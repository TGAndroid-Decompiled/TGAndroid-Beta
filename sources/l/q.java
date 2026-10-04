package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener f15223a;
    public final r f15224b;

    public q(r rVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15224b = rVar;
        this.f15223a = onMenuItemClickListener;
    }

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f15223a.onMenuItemClick(this.f15224b.f(menuItem));
    }
}
