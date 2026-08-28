package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.firebase.messaging.t;
import java.lang.ref.WeakReference;
public final class d extends a implements l.i {
    public Context f14394c;
    public ActionBarContextView d;
    public we.b f14395e;
    public WeakReference f14396f;
    public boolean h;
    public l.k f14397n;

    @Override
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f14395e.H(this);
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f14396f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k c() {
        return this.f14397n;
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
        this.f14395e.I(this, this.f14397n);
    }

    @Override
    public final boolean h() {
        return this.d.E;
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
        this.f14396f = weakReference;
    }

    @Override
    public final void j(int i9) {
        k(this.f14394c.getString(i9));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void l(l.k kVar) {
        g();
        m.i iVar = this.d.d;
        if (iVar != null) {
            iVar.l();
        }
    }

    @Override
    public final void m(int i9) {
        n(this.f14394c.getString(i9));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void o(boolean z10) {
        this.f14390b = z10;
        this.d.setTitleOptional(z10);
    }

    @Override
    public final boolean r(l.k kVar, MenuItem menuItem) {
        return ((t) this.f14395e.f48793b).F(this, menuItem);
    }
}
