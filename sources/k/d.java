package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n4.s;
public final class d extends a implements l.i {
    public Context f14571c;
    public ActionBarContextView d;
    public s e;
    public WeakReference f14572f;
    public boolean h;
    public l.k f14573n;

    @Override
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.w(this);
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f14572f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k c() {
        return this.f14573n;
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
        this.e.x(this, this.f14573n);
    }

    @Override
    public final boolean h() {
        return this.d.I;
    }

    @Override
    public final void i(l.k kVar) {
        g();
        m.i iVar = this.d.d;
        if (iVar != null) {
            iVar.l();
        }
    }

    @Override
    public final void j(View view) {
        WeakReference weakReference;
        this.d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f14572f = weakReference;
    }

    @Override
    public final void k(int i10) {
        l(this.f14571c.getString(i10));
    }

    @Override
    public final void l(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void m(int i10) {
        n(this.f14571c.getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void o(boolean z10) {
        this.f14567b = z10;
        this.d.setTitleOptional(z10);
    }

    @Override
    public final boolean p(l.k kVar, MenuItem menuItem) {
        return ((qi.e) this.e.f17188b).A(this, menuItem);
    }
}
