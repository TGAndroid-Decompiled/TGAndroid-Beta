package g;

import ab.c0;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.i {
    public final Context f12953c;
    public final l.k d;
    public q4.q f12954e;
    public WeakReference f12955f;
    public final b0 h;

    public a0(b0 b0Var, Context context, q4.q qVar) {
        this.h = b0Var;
        this.f12953c = context;
        this.f12954e = qVar;
        l.k kVar = new l.k(context);
        kVar.f19214l = 1;
        this.d = kVar;
        kVar.f19208e = this;
    }

    @Override
    public final void b(l.k kVar) {
        if (this.f12954e != null) {
            j();
            m.h hVar = this.h.f12973f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final void c() {
        b0 b0Var = this.h;
        if (b0Var.f12975i != this) {
            return;
        }
        if (b0Var.f12982p) {
            b0Var.f12976j = this;
            b0Var.f12977k = this.f12954e;
        } else {
            this.f12954e.c(this);
        }
        this.f12954e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f12973f;
        if (actionBarContextView.f1879w == null) {
            actionBarContextView.e();
        }
        b0Var.f12971c.setHideOnContentScrollEnabled(b0Var.f12986t);
        b0Var.f12975i = null;
    }

    @Override
    public final View d() {
        WeakReference weakReference = this.f12955f;
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
        return new k.h(this.f12953c);
    }

    @Override
    public final CharSequence g() {
        return this.h.f12973f.getSubtitle();
    }

    @Override
    public final boolean h(l.k kVar, MenuItem menuItem) {
        q4.q qVar = this.f12954e;
        if (qVar != null) {
            return ((c0) qVar.f55867b).G(this, menuItem);
        }
        return false;
    }

    @Override
    public final CharSequence i() {
        return this.h.f12973f.getTitle();
    }

    @Override
    public final void j() {
        if (this.h.f12975i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f12954e.d(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean k() {
        return this.h.f12973f.J;
    }

    @Override
    public final void n(View view) {
        this.h.f12973f.setCustomView(view);
        this.f12955f = new WeakReference(view);
    }

    @Override
    public final void o(int i7) {
        p(this.h.f12969a.getResources().getString(i7));
    }

    @Override
    public final void p(CharSequence charSequence) {
        this.h.f12973f.setSubtitle(charSequence);
    }

    @Override
    public final void q(int i7) {
        r(this.h.f12969a.getResources().getString(i7));
    }

    @Override
    public final void r(CharSequence charSequence) {
        this.h.f12973f.setTitle(charSequence);
    }

    @Override
    public final void s(boolean z10) {
        this.f18086a = z10;
        this.h.f12973f.setTitleOptional(z10);
    }
}
