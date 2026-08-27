package l;

import android.view.MenuItem;

public final class r implements MenuItem.OnMenuItemClickListener {

    public final MenuItem.OnMenuItemClickListener f15362a;

    public final s f15363b;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15363b = sVar;
        this.f15362a = onMenuItemClickListener;
    }

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f15362a.onMenuItemClick(this.f15363b.f(menuItem));
    }
}
