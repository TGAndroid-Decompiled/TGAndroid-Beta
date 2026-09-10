package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.firebase.messaging.s;
import java.lang.ref.WeakReference;
public final class d extends a implements l.j {
    public Context f11954c;
    public ActionBarContextView d;
    public of.b e;
    public WeakReference f11955f;
    public boolean h;
    public l.l f11956n;

    @Override
    public final boolean B(l.l lVar, MenuItem menuItem) {
        return ((s) this.e.f14294b).g(this, menuItem);
    }

    @Override
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.j0(this);
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f11955f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.l c() {
        return this.f11956n;
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
        this.e.k0(this, this.f11956n);
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
        this.f11955f = weakReference;
    }

    @Override
    public final void j(int i10) {
        k(this.f11954c.getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.f11954c.getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void n(boolean z10) {
        this.f11950b = z10;
        this.d.setTitleOptional(z10);
    }

    @Override
    public final void o(l.l lVar) {
        g();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
        }
    }
}
