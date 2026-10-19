package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class z extends k.a implements l.i {
    public final Context f10741c;
    public final l.k d;
    public n4.s e;
    public WeakReference f10742f;
    public final a0 h;

    public z(a0 a0Var, Context context, n4.s sVar) {
        this.h = a0Var;
        this.f10741c = context;
        this.e = sVar;
        l.k kVar = new l.k(context);
        kVar.f15763l = 1;
        this.d = kVar;
        kVar.e = this;
    }

    @Override
    public final void a() {
        a0 a0Var = this.h;
        if (a0Var.f10626i != this) {
            return;
        }
        if (a0Var.f10633p) {
            a0Var.f10627j = this;
            a0Var.f10628k = this.e;
        } else {
            this.e.w(this);
        }
        this.e = null;
        a0Var.a(false);
        ActionBarContextView actionBarContextView = a0Var.f10624f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        a0Var.f10623c.setHideOnContentScrollEnabled(a0Var.f10637t);
        a0Var.f10626i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f10742f;
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
        return new k.h(this.f10741c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f10624f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f10624f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f10626i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.e.z(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f10624f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f10624f.setCustomView(view);
        this.f10742f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f10621a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f10624f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.h.f10621a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.h.f10624f.setTitle(charSequence);
    }

    @Override
    public final void n(l.k kVar) {
        if (this.e != null) {
            g();
            m.i iVar = this.h.f10624f.d;
            if (iVar != null) {
                iVar.l();
            }
        }
    }

    @Override
    public final void o(boolean z10) {
        this.f14523b = z10;
        this.h.f10624f.setTitleOptional(z10);
    }

    @Override
    public final boolean q(l.k kVar, MenuItem menuItem) {
        n4.s sVar = this.e;
        if (sVar != null) {
            return ((qi.e) sVar.f17127b).A(this, menuItem);
        }
        return false;
    }
}
