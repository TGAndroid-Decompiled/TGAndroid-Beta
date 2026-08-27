package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.firebase.messaging.t;
import java.lang.ref.WeakReference;

public final class d extends a implements l.j {

    public Context f14211c;
    public ActionBarContextView d;

    public xe.b f14212e;

    public WeakReference f14213f;
    public boolean h;

    public l.l f14214n;

    @Override
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f14212e.J(this);
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f14213f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.l c() {
        return this.f14214n;
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
        this.f14212e.K(this, this.f14214n);
    }

    @Override
    public final boolean h() {
        return this.d.E;
    }

    @Override
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f14213f = view != null ? new WeakReference(view) : null;
    }

    @Override
    public final void j(int i10) {
        l(this.f14211c.getString(i10));
    }

    @Override
    public final void k(l.l lVar) {
        g();
        m.i iVar = this.d.d;
        if (iVar != null) {
            iVar.l();
        }
    }

    @Override
    public final void l(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void m(int i10) {
        n(this.f14211c.getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void o(boolean z10) {
        this.f14207b = z10;
        this.d.setTitleOptional(z10);
    }

    @Override
    public final boolean t(l.l lVar, MenuItem menuItem) {
        return ((t) this.f14212e.f49392b).F(this, menuItem);
    }
}
