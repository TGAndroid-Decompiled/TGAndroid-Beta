package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class d extends a implements l.i {
    public Context f16389c;
    public ActionBarContextView d;
    public tf.b f16390e;
    public WeakReference f16391f;
    public boolean h;
    public l.k f16392n;

    @Override
    public final boolean U0(l.k kVar, MenuItem menuItem) {
        return ((ui.f) this.f16390e.f55094a).A(this, menuItem);
    }

    @Override
    public final void b(l.k kVar) {
        i();
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
        this.f16390e.v(this);
    }

    @Override
    public final View d() {
        WeakReference weakReference = this.f16391f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k e() {
        return this.f16392n;
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
    public final CharSequence h() {
        return this.d.getTitle();
    }

    @Override
    public final void i() {
        this.f16390e.w(this, this.f16392n);
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
        this.f16391f = weakReference;
    }

    @Override
    public final void n(int i3) {
        o(this.f16389c.getString(i3));
    }

    @Override
    public final void o(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void p(int i3) {
        q(this.f16389c.getString(i3));
    }

    @Override
    public final void q(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void r(boolean z10) {
        this.f16384a = z10;
        this.d.setTitleOptional(z10);
    }
}
