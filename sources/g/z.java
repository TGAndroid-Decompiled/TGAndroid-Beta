package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class z extends k.a implements l.i {
    public final Context f10758c;
    public final l.k d;
    public n4.s e;
    public WeakReference f10759f;
    public final a0 h;

    public z(a0 a0Var, Context context, n4.s sVar) {
        this.h = a0Var;
        this.f10758c = context;
        this.e = sVar;
        l.k kVar = new l.k(context);
        kVar.f15824l = 1;
        this.d = kVar;
        kVar.e = this;
    }

    @Override
    public final void a() {
        a0 a0Var = this.h;
        if (a0Var.f10643i != this) {
            return;
        }
        if (a0Var.f10650p) {
            a0Var.f10644j = this;
            a0Var.f10645k = this.e;
        } else {
            this.e.w(this);
        }
        this.e = null;
        a0Var.a(false);
        ActionBarContextView actionBarContextView = a0Var.f10641f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        a0Var.f10640c.setHideOnContentScrollEnabled(a0Var.f10654t);
        a0Var.f10643i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f10759f;
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
        return new k.h(this.f10758c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f10641f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f10641f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f10643i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.e.x(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f10641f.I;
    }

    @Override
    public final void i(l.k kVar) {
        if (this.e != null) {
            g();
            m.i iVar = this.h.f10641f.d;
            if (iVar != null) {
                iVar.l();
            }
        }
    }

    @Override
    public final void j(View view) {
        this.h.f10641f.setCustomView(view);
        this.f10759f = new WeakReference(view);
    }

    @Override
    public final void k(int i10) {
        l(this.h.f10638a.getResources().getString(i10));
    }

    @Override
    public final void l(CharSequence charSequence) {
        this.h.f10641f.setSubtitle(charSequence);
    }

    @Override
    public final void m(int i10) {
        n(this.h.f10638a.getResources().getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.h.f10641f.setTitle(charSequence);
    }

    @Override
    public final void o(boolean z10) {
        this.f14567b = z10;
        this.h.f10641f.setTitleOptional(z10);
    }

    @Override
    public final boolean p(l.k kVar, MenuItem menuItem) {
        n4.s sVar = this.e;
        if (sVar != null) {
            return ((qi.e) sVar.f17188b).A(this, menuItem);
        }
        return false;
    }
}
