package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class b0 extends k.a implements l.j {
    public final Context f8333c;
    public final l.l d;
    public of.b e;
    public WeakReference f8334f;
    public final c0 h;

    public b0(c0 c0Var, Context context, of.b bVar) {
        this.h = c0Var;
        this.f8333c = context;
        this.e = bVar;
        l.l lVar = new l.l(context);
        lVar.f12636l = 1;
        this.d = lVar;
        lVar.e = this;
    }

    @Override
    public final boolean B(l.l lVar, MenuItem menuItem) {
        of.b bVar = this.e;
        if (bVar != null) {
            return ((com.google.firebase.messaging.s) bVar.f14294b).g(this, menuItem);
        }
        return false;
    }

    @Override
    public final void a() {
        c0 c0Var = this.h;
        if (c0Var.f8352i != this) {
            return;
        }
        if (c0Var.f8359p) {
            c0Var.f8353j = this;
            c0Var.f8354k = this.e;
        } else {
            this.e.j0(this);
        }
        this.e = null;
        c0Var.a(false);
        ActionBarContextView actionBarContextView = c0Var.f8350f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        c0Var.f8349c.setHideOnContentScrollEnabled(c0Var.f8363t);
        c0Var.f8352i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f8334f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.l c() {
        return this.d;
    }

    @Override
    public final k.h d() {
        return new k.h(this.f8333c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f8350f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f8350f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f8352i != this) {
            return;
        }
        l.l lVar = this.d;
        lVar.w();
        try {
            this.e.k0(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f8350f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f8350f.setCustomView(view);
        this.f8334f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f8347a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f8350f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.h.f8347a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.h.f8350f.setTitle(charSequence);
    }

    @Override
    public final void n(boolean z10) {
        this.f11950b = z10;
        this.h.f8350f.setTitleOptional(z10);
    }

    @Override
    public final void o(l.l lVar) {
        if (this.e != null) {
            g();
            m.h hVar = this.h.f8350f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }
}
