package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n4.s;
public final class d extends a implements l.i {
    public Context f14520c;
    public ActionBarContextView d;
    public s e;
    public WeakReference f14521f;
    public boolean h;
    public l.k f14522n;

    @Override
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.B(this);
    }

    @Override
    public final void b(l.k kVar) {
        h();
        m.i iVar = this.d.d;
        if (iVar != null) {
            iVar.l();
        }
    }

    @Override
    public final View c() {
        WeakReference weakReference = this.f14521f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k d() {
        return this.f14522n;
    }

    @Override
    public final h e() {
        return new h(this.d.getContext());
    }

    @Override
    public final CharSequence f() {
        return this.d.getSubtitle();
    }

    @Override
    public final CharSequence g() {
        return this.d.getTitle();
    }

    @Override
    public final void h() {
        this.e.D(this, this.f14522n);
    }

    @Override
    public final boolean i() {
        return this.d.I;
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
        this.f14521f = weakReference;
    }

    @Override
    public final void k(int i10) {
        l(this.f14520c.getString(i10));
    }

    @Override
    public final void l(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void m(int i10) {
        n(this.f14520c.getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void o(boolean z10) {
        this.f14516b = z10;
        this.d.setTitleOptional(z10);
    }

    @Override
    public final boolean p(l.k kVar, MenuItem menuItem) {
        return ((qi.e) this.e.f17121b).A(this, menuItem);
    }
}
