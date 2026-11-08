package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
public final class d0 extends k implements SubMenu {
    public final m A;
    public final k f17647z;

    public d0(Context context, k kVar, m mVar) {
        super(context);
        this.f17647z = kVar;
        this.A = mVar;
    }

    @Override
    public final boolean d(m mVar) {
        return this.f17647z.d(mVar);
    }

    @Override
    public final boolean e(k kVar, MenuItem menuItem) {
        if (!super.e(kVar, menuItem) && !this.f17647z.e(kVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(m mVar) {
        return this.f17647z.f(mVar);
    }

    @Override
    public final MenuItem getItem() {
        return this.A;
    }

    @Override
    public final String j() {
        int i7;
        m mVar = this.A;
        if (mVar != null) {
            i7 = mVar.f17695a;
        } else {
            i7 = 0;
        }
        if (i7 == 0) {
            return null;
        }
        return jg.g.j(i7, "android:menu:actionviewstates:");
    }

    @Override
    public final k k() {
        return this.f17647z.k();
    }

    @Override
    public final boolean m() {
        return this.f17647z.m();
    }

    @Override
    public final boolean n() {
        return this.f17647z.n();
    }

    @Override
    public final boolean o() {
        return this.f17647z.o();
    }

    @Override
    public final void setGroupDividerEnabled(boolean z9) {
        this.f17647z.setGroupDividerEnabled(z9);
    }

    @Override
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override
    public final void setQwertyMode(boolean z9) {
        this.f17647z.setQwertyMode(z9);
    }

    @Override
    public final SubMenu setHeaderIcon(int i7) {
        u(0, null, i7, null, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderTitle(int i7) {
        u(i7, null, 0, null, null);
        return this;
    }

    @Override
    public final SubMenu setIcon(int i7) {
        this.A.setIcon(i7);
        return this;
    }
}
