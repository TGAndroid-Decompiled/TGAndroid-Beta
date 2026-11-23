package g;

import ab.c0;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.i {
    public final Context f12919c;
    public final l.k d;
    public q4.q f12920e;
    public WeakReference f12921f;
    public final b0 h;

    public a0(b0 b0Var, Context context, q4.q qVar) {
        this.h = b0Var;
        this.f12919c = context;
        this.f12920e = qVar;
        l.k kVar = new l.k(context);
        kVar.f19183l = 1;
        this.d = kVar;
        kVar.f19177e = this;
    }

    @Override
    public final void b(l.k kVar) {
        if (this.f12920e != null) {
            j();
            m.h hVar = this.h.f12939f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final void c() {
        b0 b0Var = this.h;
        if (b0Var.f12941i != this) {
            return;
        }
        if (b0Var.f12948p) {
            b0Var.f12942j = this;
            b0Var.f12943k = this.f12920e;
        } else {
            this.f12920e.c(this);
        }
        this.f12920e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f12939f;
        if (actionBarContextView.f1837w == null) {
            actionBarContextView.e();
        }
        b0Var.f12937c.setHideOnContentScrollEnabled(b0Var.f12952t);
        b0Var.f12941i = null;
    }

    @Override
    public final View d() {
        WeakReference weakReference = this.f12921f;
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
        return new k.h(this.f12919c);
    }

    @Override
    public final CharSequence g() {
        return this.h.f12939f.getSubtitle();
    }

    @Override
    public final boolean h(l.k kVar, MenuItem menuItem) {
        q4.q qVar = this.f12920e;
        if (qVar != null) {
            return ((c0) qVar.f55836b).G(this, menuItem);
        }
        return false;
    }

    @Override
    public final CharSequence i() {
        return this.h.f12939f.getTitle();
    }

    @Override
    public final void j() {
        if (this.h.f12941i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f12920e.d(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean k() {
        return this.h.f12939f.J;
    }

    @Override
    public final void n(View view) {
        this.h.f12939f.setCustomView(view);
        this.f12921f = new WeakReference(view);
    }

    @Override
    public final void o(int i7) {
        p(this.h.f12935a.getResources().getString(i7));
    }

    @Override
    public final void p(CharSequence charSequence) {
        this.h.f12939f.setSubtitle(charSequence);
    }

    @Override
    public final void q(int i7) {
        r(this.h.f12935a.getResources().getString(i7));
    }

    @Override
    public final void r(CharSequence charSequence) {
        this.h.f12939f.setTitle(charSequence);
    }

    @Override
    public final void s(boolean z10) {
        this.f18052a = z10;
        this.h.f12939f.setTitleOptional(z10);
    }
}
