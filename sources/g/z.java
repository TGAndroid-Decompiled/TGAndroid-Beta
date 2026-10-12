package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class z extends k.a implements l.i {
    public final Context f9831c;
    public final l.k d;
    public n4.s e;
    public WeakReference f9832f;
    public final a0 h;

    public z(a0 a0Var, Context context, n4.s sVar) {
        this.h = a0Var;
        this.f9831c = context;
        this.e = sVar;
        l.k kVar = new l.k(context);
        kVar.f14421l = 1;
        this.d = kVar;
        kVar.e = this;
    }

    @Override
    public final void a() {
        a0 a0Var = this.h;
        if (a0Var.f9716i != this) {
            return;
        }
        if (a0Var.f9723p) {
            a0Var.f9717j = this;
            a0Var.f9718k = this.e;
        } else {
            this.e.r(this);
        }
        this.e = null;
        a0Var.a(false);
        ActionBarContextView actionBarContextView = a0Var.f9714f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        a0Var.f9713c.setHideOnContentScrollEnabled(a0Var.f9727t);
        a0Var.f9716i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f9832f;
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
        return new k.h(this.f9831c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f9714f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f9714f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f9716i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.e.s(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f9714f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f9714f.setCustomView(view);
        this.f9832f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f9711a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f9714f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.h.f9711a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.h.f9714f.setTitle(charSequence);
    }

    @Override
    public final void n(l.k kVar) {
        if (this.e != null) {
            g();
            m.h hVar = this.h.f9714f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final void o(boolean z10) {
        this.f13719b = z10;
        this.h.f9714f.setTitleOptional(z10);
    }

    @Override
    public final boolean p(l.k kVar, MenuItem menuItem) {
        n4.s sVar = this.e;
        if (sVar != null) {
            return ((qi.e) sVar.f16031b).y(this, menuItem);
        }
        return false;
    }
}
