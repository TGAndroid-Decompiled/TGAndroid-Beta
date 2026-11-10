package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import q4.q;
public final class d extends a implements l.i {
    public Context f17110c;
    public ActionBarContextView d;
    public q f17111e;
    public WeakReference f17112f;
    public boolean h;
    public l.k f17113n;

    @Override
    public final boolean F0(l.k kVar, MenuItem menuItem) {
        return ((ui.e) this.f17111e.f53815b).N(this, menuItem);
    }

    @Override
    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f17111e.c(this);
    }

    @Override
    public final View c() {
        WeakReference weakReference = this.f17112f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k d() {
        return this.f17113n;
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
        this.f17111e.d(this, this.f17113n);
    }

    @Override
    public final boolean i() {
        return this.d.I;
    }

    @Override
    public final void j0(l.k kVar) {
        h();
        m.i iVar = this.d.d;
        if (iVar != null) {
            iVar.l();
        }
    }

    @Override
    public final void l(View view) {
        WeakReference weakReference;
        this.d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f17112f = weakReference;
    }

    @Override
    public final void m(int i7) {
        n(this.f17110c.getString(i7));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void o(int i7) {
        p(this.f17110c.getString(i7));
    }

    @Override
    public final void p(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void q(boolean z9) {
        this.f17105a = z9;
        this.d.setTitleOptional(z9);
    }
}
