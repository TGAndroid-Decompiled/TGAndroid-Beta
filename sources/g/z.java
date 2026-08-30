package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class z extends k.a implements l.i {
    public final Context f6330c;
    public final l.k d;
    public f7.b e;
    public WeakReference f6331f;
    public final a0 h;

    public z(a0 a0Var, Context context, f7.b bVar) {
        this.h = a0Var;
        this.f6330c = context;
        this.e = bVar;
        l.k kVar = new l.k(context);
        kVar.f11048l = 1;
        this.d = kVar;
        kVar.e = this;
    }

    @Override
    public final void a() {
        a0 a0Var = this.h;
        if (a0Var.f6218i != this) {
            return;
        }
        if (a0Var.f6225p) {
            a0Var.f6219j = this;
            a0Var.f6220k = this.e;
        } else {
            this.e.u(this);
        }
        this.e = null;
        a0Var.a(false);
        ActionBarContextView actionBarContextView = a0Var.f6216f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        a0Var.f6215c.setHideOnContentScrollEnabled(a0Var.f6229t);
        a0Var.f6218i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f6331f;
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
        return new k.h(this.f6330c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f6216f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f6216f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f6218i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.e.v(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f6216f.F;
    }

    @Override
    public final void i(l.k kVar) {
        if (this.e != null) {
            g();
            m.h hVar = this.h.f6216f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final void j(View view) {
        this.h.f6216f.setCustomView(view);
        this.f6331f = new WeakReference(view);
    }

    @Override
    public final void k(int i10) {
        l(this.h.f6213a.getResources().getString(i10));
    }

    @Override
    public final void l(CharSequence charSequence) {
        this.h.f6216f.setSubtitle(charSequence);
    }

    @Override
    public final void m(int i10) {
        n(this.h.f6213a.getResources().getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.h.f6216f.setTitle(charSequence);
    }

    @Override
    public final void o(boolean z4) {
        this.f9502b = z4;
        this.h.f6216f.setTitleOptional(z4);
    }

    @Override
    public final boolean p(l.k kVar, MenuItem menuItem) {
        f7.b bVar = this.e;
        if (bVar != null) {
            return ((com.google.firebase.messaging.r) bVar.f6012b).K(this, menuItem);
        }
        return false;
    }
}
