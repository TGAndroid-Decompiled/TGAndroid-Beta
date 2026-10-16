package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener f14465a;
    public final r f14466b;

    public q(r rVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14466b = rVar;
        this.f14465a = onMenuItemClickListener;
    }

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f14465a.onMenuItemClick(this.f14466b.f(menuItem));
    }
}
