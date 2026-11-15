package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
public final class d0 extends k implements SubMenu {
    public final m A;
    public final k f18789z;

    public d0(Context context, k kVar, m mVar) {
        super(context);
        this.f18789z = kVar;
        this.A = mVar;
    }

    @Override
    public final boolean d(m mVar) {
        return this.f18789z.d(mVar);
    }

    @Override
    public final boolean e(k kVar, MenuItem menuItem) {
        if (!super.e(kVar, menuItem) && !this.f18789z.e(kVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(m mVar) {
        return this.f18789z.f(mVar);
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
            i7 = mVar.f18837a;
        } else {
            i7 = 0;
        }
        if (i7 == 0) {
            return null;
        }
        return i5.c.i(i7, "android:menu:actionviewstates:");
    }

    @Override
    public final k k() {
        return this.f18789z.k();
    }

    @Override
    public final boolean m() {
        return this.f18789z.m();
    }

    @Override
    public final boolean n() {
        return this.f18789z.n();
    }

    @Override
    public final boolean o() {
        return this.f18789z.o();
    }

    @Override
    public final void setGroupDividerEnabled(boolean z10) {
        this.f18789z.setGroupDividerEnabled(z10);
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
        this.f18789z.setQwertyMode(z10);
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
