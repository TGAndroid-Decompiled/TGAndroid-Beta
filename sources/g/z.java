package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class z extends k.a implements l.i {
    public final Context f10204c;
    public final l.k d;
    public n4.y f10205e;
    public WeakReference f10206f;
    public final a0 h;

    public z(a0 a0Var, Context context, n4.y yVar) {
        this.h = a0Var;
        this.f10204c = context;
        this.f10205e = yVar;
        l.k kVar = new l.k(context);
        kVar.f14992l = 1;
        this.d = kVar;
        kVar.f14986e = this;
    }

    @Override
    public final boolean H(l.k kVar, MenuItem menuItem) {
        n4.y yVar = this.f10205e;
        if (yVar != null) {
            return ((oi.f) yVar.f16362b).G(this, menuItem);
        }
        return false;
    }

    @Override
    public final void a() {
        a0 a0Var = this.h;
        if (a0Var.f10081i != this) {
            return;
        }
        if (a0Var.f10088p) {
            a0Var.f10082j = this;
            a0Var.f10083k = this.f10205e;
        } else {
            this.f10205e.O(this);
        }
        this.f10205e = null;
        a0Var.a(false);
        ActionBarContextView actionBarContextView = a0Var.f10079f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        a0Var.f10077c.setHideOnContentScrollEnabled(a0Var.f10092t);
        a0Var.f10081i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f10206f;
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
        return new k.h(this.f10204c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f10079f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f10079f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f10081i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f10205e.P(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f10079f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f10079f.setCustomView(view);
        this.f10206f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f10075a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f10079f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.h.f10075a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.h.f10079f.setTitle(charSequence);
    }

    @Override
    public final void n(boolean z10) {
        this.f14272b = z10;
        this.h.f10079f.setTitleOptional(z10);
    }

    @Override
    public final void u(l.k kVar) {
        if (this.f10205e != null) {
            g();
            m.h hVar = this.h.f10079f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }
}
