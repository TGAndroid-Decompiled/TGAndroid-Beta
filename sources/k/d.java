package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n4.x;
public final class d extends a implements l.i {
    public Context f14279c;
    public ActionBarContextView d;
    public x f14280e;
    public WeakReference f14281f;
    public boolean h;
    public l.k f14282n;

    @Override
    public final boolean A(l.k kVar, MenuItem menuItem) {
        return ((oi.f) this.f14280e.f16616b).G(this, menuItem);
    }

    @Override
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f14280e.X(this);
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f14281f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k c() {
        return this.f14282n;
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
        this.f14280e.Y(this, this.f14282n);
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
        this.f14281f = weakReference;
    }

    @Override
    public final void j(int i10) {
        k(this.f14279c.getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.f14279c.getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void n(l.k kVar) {
        g();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override
    public final void o(boolean z10) {
        this.f14275b = z10;
        this.d.setTitleOptional(z10);
    }
}
