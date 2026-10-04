package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n4.y;
public final class d extends a implements l.i {
    public Context f14242c;
    public ActionBarContextView d;
    public y f14243e;
    public WeakReference f14244f;
    public boolean h;
    public l.k f14245n;

    @Override
    public final boolean M(l.k kVar, MenuItem menuItem) {
        return ((qi.f) this.f14243e.f16639b).G(this, menuItem);
    }

    @Override
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f14243e.V(this);
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f14244f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k c() {
        return this.f14245n;
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
        this.f14243e.W(this, this.f14245n);
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
        this.f14244f = weakReference;
    }

    @Override
    public final void j(int i10) {
        k(this.f14242c.getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.f14242c.getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void n(boolean z10) {
        this.f14238b = z10;
        this.d.setTitleOptional(z10);
    }

    @Override
    public final void y(l.k kVar) {
        g();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
        }
    }
}
