package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class z extends k.a implements l.i {
    public final Context f10206c;
    public final l.k d;
    public n4.x f10207e;
    public WeakReference f10208f;
    public final a0 h;

    public z(a0 a0Var, Context context, n4.x xVar) {
        this.h = a0Var;
        this.f10206c = context;
        this.f10207e = xVar;
        l.k kVar = new l.k(context);
        kVar.f15244l = 1;
        this.d = kVar;
        kVar.f15238e = this;
    }

    @Override
    public final boolean A(l.k kVar, MenuItem menuItem) {
        n4.x xVar = this.f10207e;
        if (xVar != null) {
            return ((oi.f) xVar.f16612b).G(this, menuItem);
        }
        return false;
    }

    @Override
    public final void a() {
        a0 a0Var = this.h;
        if (a0Var.f10083i != this) {
            return;
        }
        if (a0Var.f10090p) {
            a0Var.f10084j = this;
            a0Var.f10085k = this.f10207e;
        } else {
            this.f10207e.X(this);
        }
        this.f10207e = null;
        a0Var.a(false);
        ActionBarContextView actionBarContextView = a0Var.f10081f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        a0Var.f10079c.setHideOnContentScrollEnabled(a0Var.f10094t);
        a0Var.f10083i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f10208f;
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
        return new k.h(this.f10206c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f10081f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f10081f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f10083i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f10207e.Y(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f10081f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f10081f.setCustomView(view);
        this.f10208f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f10077a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f10081f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.h.f10077a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.h.f10081f.setTitle(charSequence);
    }

    @Override
    public final void n(l.k kVar) {
        if (this.f10207e != null) {
            g();
            m.h hVar = this.h.f10081f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final void o(boolean z10) {
        this.f14275b = z10;
        this.h.f10081f.setTitleOptional(z10);
    }
}
