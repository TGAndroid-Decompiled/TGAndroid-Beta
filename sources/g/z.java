package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class z extends k.a implements l.i {
    public final Context f10205c;
    public final l.k d;
    public n4.x f10206e;
    public WeakReference f10207f;
    public final a0 h;

    public z(a0 a0Var, Context context, n4.x xVar) {
        this.h = a0Var;
        this.f10205c = context;
        this.f10206e = xVar;
        l.k kVar = new l.k(context);
        kVar.f15283l = 1;
        this.d = kVar;
        kVar.f15277e = this;
    }

    @Override
    public final boolean A(l.k kVar, MenuItem menuItem) {
        n4.x xVar = this.f10206e;
        if (xVar != null) {
            return ((pi.f) xVar.f16694b).G(this, menuItem);
        }
        return false;
    }

    @Override
    public final void a() {
        a0 a0Var = this.h;
        if (a0Var.f10082i != this) {
            return;
        }
        if (a0Var.f10089p) {
            a0Var.f10083j = this;
            a0Var.f10084k = this.f10206e;
        } else {
            this.f10206e.Q(this);
        }
        this.f10206e = null;
        a0Var.a(false);
        ActionBarContextView actionBarContextView = a0Var.f10080f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        a0Var.f10078c.setHideOnContentScrollEnabled(a0Var.f10093t);
        a0Var.f10082i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f10207f;
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
        return new k.h(this.f10205c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f10080f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f10080f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f10082i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f10206e.R(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f10080f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f10080f.setCustomView(view);
        this.f10207f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f10076a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f10080f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.h.f10076a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.h.f10080f.setTitle(charSequence);
    }

    @Override
    public final void n(l.k kVar) {
        if (this.f10206e != null) {
            g();
            m.h hVar = this.h.f10080f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final void o(boolean z10) {
        this.f14274b = z10;
        this.h.f10080f.setTitleOptional(z10);
    }
}
