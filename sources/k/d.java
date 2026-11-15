package k;

import ab.c0;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import q4.q;
public final class d extends a implements l.i {
    public Context f17668c;
    public ActionBarContextView d;
    public q f17669e;
    public WeakReference f17670f;
    public boolean h;
    public l.k f17671n;

    @Override
    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f17669e.c(this);
    }

    @Override
    public final View c() {
        WeakReference weakReference = this.f17670f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k d() {
        return this.f17671n;
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
        this.f17669e.d(this, this.f17671n);
    }

    @Override
    public final void i(l.k kVar) {
        h();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override
    public final boolean j() {
        return this.d.J;
    }

    @Override
    public final void m(View view) {
        WeakReference weakReference;
        this.d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f17670f = weakReference;
    }

    @Override
    public final void n(int i7) {
        p(this.f17668c.getString(i7));
    }

    @Override
    public final boolean o(l.k kVar, MenuItem menuItem) {
        return ((c0) this.f17669e.f55252b).D(this, menuItem);
    }

    @Override
    public final void p(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void q(int i7) {
        r(this.f17668c.getString(i7));
    }

    @Override
    public final void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void s(boolean z10) {
        this.f17663a = z10;
        this.d.setTitleOptional(z10);
    }
}
