package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class z extends k.a implements l.i {
    public final Context f6959c;
    public final l.k d;
    public ze.b f6960e;
    public WeakReference f6961f;
    public final a0 h;

    public z(a0 a0Var, Context context, ze.b bVar) {
        this.h = a0Var;
        this.f6959c = context;
        this.f6960e = bVar;
        l.k kVar = new l.k(context);
        kVar.f13991l = 1;
        this.d = kVar;
        kVar.f13985e = this;
    }

    @Override
    public final void a() {
        a0 a0Var = this.h;
        if (a0Var.f6840i != this) {
            return;
        }
        if (a0Var.f6847p) {
            a0Var.f6841j = this;
            a0Var.f6842k = this.f6960e;
        } else {
            this.f6960e.O(this);
        }
        this.f6960e = null;
        a0Var.a(false);
        ActionBarContextView actionBarContextView = a0Var.f6838f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        a0Var.f6836c.setHideOnContentScrollEnabled(a0Var.f6851t);
        a0Var.f6840i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f6961f;
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
        return new k.h(this.f6959c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f6838f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f6838f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f6840i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f6960e.P(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f6838f.E;
    }

    @Override
    public final void i(l.k kVar) {
        if (this.f6960e != null) {
            g();
            m.i iVar = this.h.f6838f.d;
            if (iVar != null) {
                iVar.l();
            }
        }
    }

    @Override
    public final void j(View view) {
        this.h.f6838f.setCustomView(view);
        this.f6961f = new WeakReference(view);
    }

    @Override
    public final void k(int i10) {
        l(this.h.f6834a.getResources().getString(i10));
    }

    @Override
    public final void l(CharSequence charSequence) {
        this.h.f6838f.setSubtitle(charSequence);
    }

    @Override
    public final void m(int i10) {
        n(this.h.f6834a.getResources().getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.h.f6838f.setTitle(charSequence);
    }

    @Override
    public final void o(boolean z10) {
        this.f13195b = z10;
        this.h.f6838f.setTitleOptional(z10);
    }

    @Override
    public final boolean q(l.k kVar, MenuItem menuItem) {
        ze.b bVar = this.f6960e;
        if (bVar != null) {
            return ((com.google.firebase.messaging.s) bVar.f50824a).F(this, menuItem);
        }
        return false;
    }
}
