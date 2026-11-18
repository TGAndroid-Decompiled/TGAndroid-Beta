package g;

import ab.c0;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.i {
    public final Context f12924c;
    public final l.k d;
    public q4.q f12925e;
    public WeakReference f12926f;
    public final b0 h;

    public a0(b0 b0Var, Context context, q4.q qVar) {
        this.h = b0Var;
        this.f12924c = context;
        this.f12925e = qVar;
        l.k kVar = new l.k(context);
        kVar.f19186l = 1;
        this.d = kVar;
        kVar.f19180e = this;
    }

    @Override
    public final void b(l.k kVar) {
        if (this.f12925e != null) {
            j();
            m.h hVar = this.h.f12944f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final void c() {
        b0 b0Var = this.h;
        if (b0Var.f12946i != this) {
            return;
        }
        if (b0Var.f12953p) {
            b0Var.f12947j = this;
            b0Var.f12948k = this.f12925e;
        } else {
            this.f12925e.c(this);
        }
        this.f12925e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f12944f;
        if (actionBarContextView.f1867w == null) {
            actionBarContextView.e();
        }
        b0Var.f12942c.setHideOnContentScrollEnabled(b0Var.f12957t);
        b0Var.f12946i = null;
    }

    @Override
    public final View d() {
        WeakReference weakReference = this.f12926f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k e() {
        return this.d;
    }

    @Override
    public final k.h f() {
        return new k.h(this.f12924c);
    }

    @Override
    public final CharSequence g() {
        return this.h.f12944f.getSubtitle();
    }

    @Override
    public final boolean h(l.k kVar, MenuItem menuItem) {
        q4.q qVar = this.f12925e;
        if (qVar != null) {
            return ((c0) qVar.f55826b).G(this, menuItem);
        }
        return false;
    }

    @Override
    public final CharSequence i() {
        return this.h.f12944f.getTitle();
    }

    @Override
    public final void j() {
        if (this.h.f12946i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f12925e.d(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean k() {
        return this.h.f12944f.J;
    }

    @Override
    public final void n(View view) {
        this.h.f12944f.setCustomView(view);
        this.f12926f = new WeakReference(view);
    }

    @Override
    public final void o(int i7) {
        p(this.h.f12940a.getResources().getString(i7));
    }

    @Override
    public final void p(CharSequence charSequence) {
        this.h.f12944f.setSubtitle(charSequence);
    }

    @Override
    public final void q(int i7) {
        r(this.h.f12940a.getResources().getString(i7));
    }

    @Override
    public final void r(CharSequence charSequence) {
        this.h.f12944f.setTitle(charSequence);
    }

    @Override
    public final void s(boolean z10) {
        this.f18055a = z10;
        this.h.f12944f.setTitleOptional(z10);
    }
}
