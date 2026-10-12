package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n4.s;
public final class d extends a implements l.i {
    public Context f13723c;
    public ActionBarContextView d;
    public s e;
    public WeakReference f13724f;
    public boolean h;
    public l.k f13725n;

    @Override
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.r(this);
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f13724f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k c() {
        return this.f13725n;
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
        this.e.s(this, this.f13725n);
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
        this.f13724f = weakReference;
    }

    @Override
    public final void j(int i10) {
        k(this.f13723c.getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.f13723c.getString(i10));
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
        this.f13719b = z10;
        this.d.setTitleOptional(z10);
    }

    @Override
    public final boolean p(l.k kVar, MenuItem menuItem) {
        return ((qi.e) this.e.f16031b).y(this, menuItem);
    }
}
