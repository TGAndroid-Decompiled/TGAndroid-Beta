package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class z extends k.a implements l.i {
    public final Context f12205c;
    public final l.k d;
    public n4.s e;
    public WeakReference f12206f;
    public final a0 h;

    public z(a0 a0Var, Context context, n4.s sVar) {
        this.h = a0Var;
        this.f12205c = context;
        this.e = sVar;
        l.k kVar = new l.k(context);
        kVar.f16726l = 1;
        this.d = kVar;
        kVar.e = this;
    }

    @Override
    public final boolean F(l.k kVar, MenuItem menuItem) {
        n4.s sVar = this.e;
        if (sVar != null) {
            return ((ti.e) sVar.f18695b).o(this, menuItem);
        }
        return false;
    }

    @Override
    public final void a() {
        a0 a0Var = this.h;
        if (a0Var.f12090i != this) {
            return;
        }
        if (a0Var.f12097p) {
            a0Var.f12091j = this;
            a0Var.f12092k = this.e;
        } else {
            this.e.A(this);
        }
        this.e = null;
        a0Var.a(false);
        ActionBarContextView actionBarContextView = a0Var.f12088f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        a0Var.f12087c.setHideOnContentScrollEnabled(a0Var.f12101t);
        a0Var.f12090i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f12206f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k c() {
        return this.d;
    }

    @Override
    public final k.h d() {
        return new k.h(this.f12205c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f12088f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f12088f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f12090i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.e.C(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f12088f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f12088f.setCustomView(view);
        this.f12206f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f12085a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f12088f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.h.f12085a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.h.f12088f.setTitle(charSequence);
    }

    @Override
    public final void n(boolean z10) {
        this.f16000b = z10;
        this.h.f12088f.setTitleOptional(z10);
    }

    @Override
    public final void r(l.k kVar) {
        if (this.e != null) {
            g();
            m.h hVar = this.h.f12088f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }
}
