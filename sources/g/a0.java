package g;

import ab.c0;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.i {
    public final Context f12918c;
    public final l.k d;
    public q4.q f12919e;
    public WeakReference f12920f;
    public final b0 h;

    public a0(b0 b0Var, Context context, q4.q qVar) {
        this.h = b0Var;
        this.f12918c = context;
        this.f12919e = qVar;
        l.k kVar = new l.k(context);
        kVar.f19282l = 1;
        this.d = kVar;
        kVar.f19276e = this;
    }

    @Override
    public final void b() {
        b0 b0Var = this.h;
        if (b0Var.f12940i != this) {
            return;
        }
        if (b0Var.f12947p) {
            b0Var.f12941j = this;
            b0Var.f12942k = this.f12919e;
        } else {
            this.f12919e.c(this);
        }
        this.f12919e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f12938f;
        if (actionBarContextView.f1838w == null) {
            actionBarContextView.e();
        }
        b0Var.f12936c.setHideOnContentScrollEnabled(b0Var.f12951t);
        b0Var.f12940i = null;
    }

    @Override
    public final View c() {
        WeakReference weakReference = this.f12920f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k d() {
        return this.d;
    }

    @Override
    public final k.h e() {
        return new k.h(this.f12918c);
    }

    @Override
    public final CharSequence f() {
        return this.h.f12938f.getSubtitle();
    }

    @Override
    public final CharSequence g() {
        return this.h.f12938f.getTitle();
    }

    @Override
    public final void h() {
        if (this.h.f12940i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f12919e.d(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final void i(l.k kVar) {
        if (this.f12919e != null) {
            h();
            m.h hVar = this.h.f12938f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final boolean j() {
        return this.h.f12938f.J;
    }

    @Override
    public final void m(View view) {
        this.h.f12938f.setCustomView(view);
        this.f12920f = new WeakReference(view);
    }

    @Override
    public final void n(int i7) {
        o(this.h.f12934a.getResources().getString(i7));
    }

    @Override
    public final void o(CharSequence charSequence) {
        this.h.f12938f.setSubtitle(charSequence);
    }

    @Override
    public final boolean p(l.k kVar, MenuItem menuItem) {
        q4.q qVar = this.f12919e;
        if (qVar != null) {
            return ((c0) qVar.f55949b).G(this, menuItem);
        }
        return false;
    }

    @Override
    public final void q(int i7) {
        r(this.h.f12934a.getResources().getString(i7));
    }

    @Override
    public final void r(CharSequence charSequence) {
        this.h.f12938f.setTitle(charSequence);
    }

    @Override
    public final void s(boolean z10) {
        this.f18154a = z10;
        this.h.f12938f.setTitleOptional(z10);
    }
}
