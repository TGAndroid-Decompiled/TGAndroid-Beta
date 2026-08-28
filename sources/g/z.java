package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class z extends k.a implements l.i {
    public final Context f7049c;
    public final l.k d;
    public we.b f7050e;
    public WeakReference f7051f;
    public final a0 h;

    public z(a0 a0Var, Context context, we.b bVar) {
        this.h = a0Var;
        this.f7049c = context;
        this.f7050e = bVar;
        l.k kVar = new l.k(context);
        kVar.f16563l = 1;
        this.d = kVar;
        kVar.f16557e = this;
    }

    @Override
    public final void a() {
        a0 a0Var = this.h;
        if (a0Var.f6930i != this) {
            return;
        }
        if (a0Var.f6937p) {
            a0Var.f6931j = this;
            a0Var.f6932k = this.f7050e;
        } else {
            this.f7050e.H(this);
        }
        this.f7050e = null;
        a0Var.a(false);
        ActionBarContextView actionBarContextView = a0Var.f6928f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        a0Var.f6926c.setHideOnContentScrollEnabled(a0Var.f6941t);
        a0Var.f6930i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f7051f;
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
        return new k.h(this.f7049c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f6928f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f6928f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f6930i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f7050e.I(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f6928f.E;
    }

    @Override
    public final void i(View view) {
        this.h.f6928f.setCustomView(view);
        this.f7051f = new WeakReference(view);
    }

    @Override
    public final void j(int i9) {
        k(this.h.f6924a.getResources().getString(i9));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f6928f.setSubtitle(charSequence);
    }

    @Override
    public final void l(l.k kVar) {
        if (this.f7050e != null) {
            g();
            m.i iVar = this.h.f6928f.d;
            if (iVar != null) {
                iVar.l();
            }
        }
    }

    @Override
    public final void m(int i9) {
        n(this.h.f6924a.getResources().getString(i9));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.h.f6928f.setTitle(charSequence);
    }

    @Override
    public final void o(boolean z10) {
        this.f14390b = z10;
        this.h.f6928f.setTitleOptional(z10);
    }

    @Override
    public final boolean r(l.k kVar, MenuItem menuItem) {
        we.b bVar = this.f7050e;
        if (bVar != null) {
            return ((com.google.firebase.messaging.t) bVar.f48793b).F(this, menuItem);
        }
        return false;
    }
}
