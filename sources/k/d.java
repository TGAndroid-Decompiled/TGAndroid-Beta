package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n4.s;
public final class d extends a implements l.i {
    public Context f16004c;
    public ActionBarContextView d;
    public s e;
    public WeakReference f16005f;
    public boolean h;
    public l.k f16006n;

    @Override
    public final boolean F(l.k kVar, MenuItem menuItem) {
        return ((ti.e) this.e.f18695b).o(this, menuItem);
    }

    @Override
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.A(this);
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f16005f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k c() {
        return this.f16006n;
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
        this.e.C(this, this.f16006n);
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
        this.f16005f = weakReference;
    }

    @Override
    public final void j(int i10) {
        k(this.f16004c.getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.f16004c.getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void n(boolean z10) {
        this.f16000b = z10;
        this.d.setTitleOptional(z10);
    }

    @Override
    public final void r(l.k kVar) {
        g();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
        }
    }
}
