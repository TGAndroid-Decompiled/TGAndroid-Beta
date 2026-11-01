package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n4.q;
import xa.n;
public final class d extends a implements l.j {
    public Context f10478c;
    public ActionBarContextView d;
    public q e;
    public WeakReference f10479f;
    public boolean h;
    public l.l f10480n;

    @Override
    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.B(this);
    }

    @Override
    public final View c() {
        WeakReference weakReference = this.f10479f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.l d() {
        return this.f10480n;
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
        this.e.C(this, this.f10480n);
    }

    @Override
    public final boolean i() {
        return this.d.I;
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
        this.f10479f = weakReference;
    }

    @Override
    public final void m(int i10) {
        n(this.f10478c.getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void o(int i10) {
        q(this.f10478c.getString(i10));
    }

    @Override
    public final void p(l.l lVar) {
        h();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override
    public final void q(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void r(boolean z10) {
        this.f10473a = z10;
        this.d.setTitleOptional(z10);
    }

    @Override
    public final boolean u(l.l lVar, MenuItem menuItem) {
        return ((n) this.e.f13527a).R(this, menuItem);
    }
}
