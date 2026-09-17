package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n4.y;
public final class d extends a implements l.j {
    public Context f14413c;
    public ActionBarContextView d;
    public y f14414e;
    public WeakReference f14415f;
    public boolean h;
    public l.l f14416n;

    @Override
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f14414e.I(this);
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f14415f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.l c() {
        return this.f14416n;
    }

    @Override
    public final h d() {
        return new h(this.d.getContext());
    }

    @Override
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override
    public final void g() {
        this.f14414e.J(this, this.f14416n);
    }

    @Override
    public final boolean h() {
        return this.d.I;
    }

    @Override
    public final void i(View view) {
        WeakReference weakReference;
        this.d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f14415f = weakReference;
    }

    @Override
    public final void j(int i10) {
        k(this.f14413c.getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.f14413c.getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void n(l.l lVar) {
        g();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override
    public final void o(boolean z10) {
        this.f14409b = z10;
        this.d.setTitleOptional(z10);
    }

    @Override
    public final boolean s(l.l lVar, MenuItem menuItem) {
        return ((fg.f) this.f14414e.f16523b).H(this, menuItem);
    }
}
