package k;

import ab.c0;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import q4.q;
public final class d extends a implements l.i {
    public Context f18060c;
    public ActionBarContextView d;
    public q f18061e;
    public WeakReference f18062f;
    public boolean h;
    public l.k f18063n;

    @Override
    public final void b(l.k kVar) {
        j();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override
    public final void c() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f18061e.c(this);
    }

    @Override
    public final View d() {
        WeakReference weakReference = this.f18062f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k e() {
        return this.f18063n;
    }

    @Override
    public final h f() {
        return new h(this.d.getContext());
    }

    @Override
    public final CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override
    public final boolean h(l.k kVar, MenuItem menuItem) {
        return ((c0) this.f18061e.f55826b).G(this, menuItem);
    }

    @Override
    public final CharSequence i() {
        return this.d.getTitle();
    }

    @Override
    public final void j() {
        this.f18061e.d(this, this.f18063n);
    }

    @Override
    public final boolean k() {
        return this.d.J;
    }

    @Override
    public final void n(View view) {
        WeakReference weakReference;
        this.d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f18062f = weakReference;
    }

    @Override
    public final void o(int i7) {
        p(this.f18060c.getString(i7));
    }

    @Override
    public final void p(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void q(int i7) {
        r(this.f18060c.getString(i7));
    }

    @Override
    public final void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void s(boolean z10) {
        this.f18055a = z10;
        this.d.setTitleOptional(z10);
    }
}
