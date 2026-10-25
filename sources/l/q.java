package l;

import android.view.MenuItem;
public final class q implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener f16769a;
    public final r f16770b;

    public q(r rVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f16770b = rVar;
        this.f16769a = onMenuItemClickListener;
    }

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f16769a.onMenuItemClick(this.f16770b.f(menuItem));
    }
}
