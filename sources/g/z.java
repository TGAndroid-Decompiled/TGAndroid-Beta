package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class z extends k.a implements l.i {
    public final Context f10742c;
    public final l.k d;
    public n4.s e;
    public WeakReference f10743f;
    public final a0 h;

    public z(a0 a0Var, Context context, n4.s sVar) {
        this.h = a0Var;
        this.f10742c = context;
        this.e = sVar;
        l.k kVar = new l.k(context);
        kVar.f15762l = 1;
        this.d = kVar;
        kVar.e = this;
    }

    @Override
    public final void a() {
        a0 a0Var = this.h;
        if (a0Var.f10627i != this) {
            return;
        }
        if (a0Var.f10634p) {
            a0Var.f10628j = this;
            a0Var.f10629k = this.e;
        } else {
            this.e.B(this);
        }
        this.e = null;
        a0Var.a(false);
        ActionBarContextView actionBarContextView = a0Var.f10625f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        a0Var.f10624c.setHideOnContentScrollEnabled(a0Var.f10638t);
        a0Var.f10627i = null;
    }

    @Override
    public final void b(l.k kVar) {
        if (this.e != null) {
            h();
            m.i iVar = this.h.f10625f.d;
            if (iVar != null) {
                iVar.l();
            }
        }
    }

    @Override
    public final View c() {
        WeakReference weakReference = this.f10743f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k d() {
        return this.d;
    }

    @Override
    public final k.h e() {
        return new k.h(this.f10742c);
    }

    @Override
    public final CharSequence f() {
        return this.h.f10625f.getSubtitle();
    }

    @Override
    public final CharSequence g() {
        return this.h.f10625f.getTitle();
    }

    @Override
    public final void h() {
        if (this.h.f10627i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.e.D(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean i() {
        return this.h.f10625f.I;
    }

    @Override
    public final void j(View view) {
        this.h.f10625f.setCustomView(view);
        this.f10743f = new WeakReference(view);
    }

    @Override
    public final void k(int i10) {
        l(this.h.f10622a.getResources().getString(i10));
    }

    @Override
    public final void l(CharSequence charSequence) {
        this.h.f10625f.setSubtitle(charSequence);
    }

    @Override
    public final void m(int i10) {
        n(this.h.f10622a.getResources().getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.h.f10625f.setTitle(charSequence);
    }

    @Override
    public final void o(boolean z10) {
        this.f14523b = z10;
        this.h.f10625f.setTitleOptional(z10);
    }

    @Override
    public final boolean p(l.k kVar, MenuItem menuItem) {
        n4.s sVar = this.e;
        if (sVar != null) {
            return ((qi.e) sVar.f17128b).A(this, menuItem);
        }
        return false;
    }
}
