package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import j3.r0;
public final class d0 extends k implements SubMenu {
    public final m A;
    public final k f16530z;

    public d0(Context context, k kVar, m mVar) {
        super(context);
        this.f16530z = kVar;
        this.A = mVar;
    }

    @Override
    public final boolean d(m mVar) {
        return this.f16530z.d(mVar);
    }

    @Override
    public final boolean e(k kVar, MenuItem menuItem) {
        if (!super.e(kVar, menuItem) && !this.f16530z.e(kVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(m mVar) {
        return this.f16530z.f(mVar);
    }

    @Override
    public final MenuItem getItem() {
        return this.A;
    }

    @Override
    public final String j() {
        int i9;
        m mVar = this.A;
        if (mVar != null) {
            i9 = mVar.f16578a;
        } else {
            i9 = 0;
        }
        if (i9 == 0) {
            return null;
        }
        return r0.l(i9, "android:menu:actionviewstates:");
    }

    @Override
    public final k k() {
        return this.f16530z.k();
    }

    @Override
    public final boolean m() {
        return this.f16530z.m();
    }

    @Override
    public final boolean n() {
        return this.f16530z.n();
    }

    @Override
    public final boolean o() {
        return this.f16530z.o();
    }

    @Override
    public final void setGroupDividerEnabled(boolean z10) {
        this.f16530z.setGroupDividerEnabled(z10);
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
        this.f16530z.setQwertyMode(z10);
    }

    @Override
    public final SubMenu setHeaderIcon(int i9) {
        u(0, null, i9, null, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderTitle(int i9) {
        u(i9, null, 0, null, null);
        return this;
    }

    @Override
    public final SubMenu setIcon(int i9) {
        this.A.setIcon(i9);
        return this;
    }
}
