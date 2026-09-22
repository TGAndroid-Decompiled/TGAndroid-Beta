package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
public final class d0 extends k implements SubMenu {
    public final m A;
    public final k f13713z;

    public d0(Context context, k kVar, m mVar) {
        super(context);
        this.f13713z = kVar;
        this.A = mVar;
    }

    @Override
    public final boolean d(m mVar) {
        return this.f13713z.d(mVar);
    }

    @Override
    public final boolean e(k kVar, MenuItem menuItem) {
        if (!super.e(kVar, menuItem) && !this.f13713z.e(kVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(m mVar) {
        return this.f13713z.f(mVar);
    }

    @Override
    public final MenuItem getItem() {
        return this.A;
    }

    @Override
    public final String j() {
        int i10;
        m mVar = this.A;
        if (mVar != null) {
            i10 = mVar.f13757a;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            return null;
        }
        return hg.c.i(i10, "android:menu:actionviewstates:");
    }

    @Override
    public final k k() {
        return this.f13713z.k();
    }

    @Override
    public final boolean m() {
        return this.f13713z.m();
    }

    @Override
    public final boolean n() {
        return this.f13713z.n();
    }

    @Override
    public final boolean o() {
        return this.f13713z.o();
    }

    @Override
    public final void setGroupDividerEnabled(boolean z10) {
        this.f13713z.setGroupDividerEnabled(z10);
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
    public final void setQwertyMode(boolean z10) {
        this.f13713z.setQwertyMode(z10);
    }

    @Override
    public final SubMenu setHeaderIcon(int i10) {
        u(0, null, i10, null, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderTitle(int i10) {
        u(i10, null, 0, null, null);
        return this;
    }

    @Override
    public final SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }
}
