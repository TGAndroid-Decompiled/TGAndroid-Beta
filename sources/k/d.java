package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class d extends a implements l.j {
    public Context f10201c;
    public ActionBarContextView d;
    public f7.b f10202e;
    public WeakReference f10203f;
    public boolean h;
    public l.l f10204n;

    @Override
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f10202e.t(this);
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f10203f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.l c() {
        return this.f10204n;
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
        this.f10202e.u(this, this.f10204n);
    }

    @Override
    public final boolean h() {
        return this.d.F;
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
        this.f10203f = weakReference;
    }

    @Override
    public final void j(l.l lVar) {
        g();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override
    public final void k(int i10) {
        l(this.f10201c.getString(i10));
    }

    @Override
    public final void l(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void m(int i10) {
        n(this.f10201c.getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void o(boolean z4) {
        this.f10197b = z4;
        this.d.setTitleOptional(z4);
    }

    @Override
    public final boolean s(l.l lVar, MenuItem menuItem) {
        return ((sf.f) this.f10202e.f6120b).A(this, menuItem);
    }
}
