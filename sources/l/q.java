package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener f19260a;
    public final r f19261b;

    public q(r rVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f19261b = rVar;
        this.f19260a = onMenuItemClickListener;
    }

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f19260a.onMenuItemClick(this.f19261b.f(menuItem));
    }
}
