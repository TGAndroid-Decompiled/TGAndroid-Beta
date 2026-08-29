package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.firebase.messaging.s;
import java.lang.ref.WeakReference;
public final class d extends a implements l.i {
    public Context f13199c;
    public ActionBarContextView d;
    public ze.b f13200e;
    public WeakReference f13201f;
    public boolean h;
    public l.k f13202n;

    @Override
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f13200e.O(this);
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f13201f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k c() {
        return this.f13202n;
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
        this.f13200e.P(this, this.f13202n);
    }

    @Override
    public final boolean h() {
        return this.d.E;
    }

    @Override
    public final void i(l.k kVar) {
        g();
        m.i iVar = this.d.d;
        if (iVar != null) {
            iVar.l();
        }
    }

    @Override
    public final void j(View view) {
        WeakReference weakReference;
        this.d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f13201f = weakReference;
    }

    @Override
    public final void k(int i10) {
        l(this.f13199c.getString(i10));
    }

    @Override
    public final void l(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void m(int i10) {
        n(this.f13199c.getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void o(boolean z10) {
        this.f13195b = z10;
        this.d.setTitleOptional(z10);
    }

    @Override
    public final boolean q(l.k kVar, MenuItem menuItem) {
        return ((s) this.f13200e.f50824a).F(this, menuItem);
    }
}
