package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class d extends a implements l.i {
    public Context f9487c;
    public ActionBarContextView d;
    public f7.b e;
    public WeakReference f9488f;
    public boolean h;
    public l.k f9489n;

    @Override
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.u(this);
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f9488f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k c() {
        return this.f9489n;
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
        this.e.v(this, this.f9489n);
    }

    @Override
    public final boolean h() {
        return this.d.F;
    }

    @Override
    public final void i(l.k kVar) {
        g();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
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
        this.f9488f = weakReference;
    }

    @Override
    public final void k(int i10) {
        l(this.f9487c.getString(i10));
    }

    @Override
    public final void l(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void m(int i10) {
        n(this.f9487c.getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void o(boolean z4) {
        this.f9483b = z4;
        this.d.setTitleOptional(z4);
    }

    @Override
    public final boolean q(l.k kVar, MenuItem menuItem) {
        return ((rf.f) this.e.f6001b).A(this, menuItem);
    }
}
