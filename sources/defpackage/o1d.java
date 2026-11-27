package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class o1d extends g9 implements d27 {
    public final Context c;
    public final f27 d;
    public lh2 e;
    public WeakReference f;
    public final p1d h;

    public o1d(p1d p1dVar, Context context, lh2 lh2Var) {
        this.h = p1dVar;
        this.c = context;
        this.e = lh2Var;
        f27 f27Var = new f27(context);
        f27Var.l = true;
        this.d = f27Var;
        f27Var.e = this;
    }

    @Override
    public final boolean B(f27 f27Var, MenuItem menuItem) {
        lh2 lh2Var = this.e;
        if (lh2Var != null) {
            return ((u8a) lh2Var.b).B(this, menuItem);
        }
        return false;
    }

    @Override
    public final void Q1(f27 f27Var) {
        if (this.e != null) {
            h();
            c9 c9Var = this.h.f.d;
            if (c9Var != null) {
                c9Var.l();
            }
        }
    }

    @Override
    public final void b() {
        p1d p1dVar = this.h;
        if (p1dVar.i != this) {
            return;
        }
        if (p1dVar.p) {
            p1dVar.j = this;
            p1dVar.k = this.e;
        } else {
            this.e.F(this);
        }
        this.e = null;
        p1dVar.a(false);
        ActionBarContextView actionBarContextView = p1dVar.f;
        if (actionBarContextView.w == null) {
            actionBarContextView.e();
        }
        p1dVar.c.setHideOnContentScrollEnabled(p1dVar.t);
        p1dVar.i = null;
    }

    @Override
    public final View c() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final f27 d() {
        return this.d;
    }

    @Override
    public final tfb e() {
        return new tfb(this.c);
    }

    @Override
    public final CharSequence f() {
        return this.h.f.getSubtitle();
    }

    @Override
    public final CharSequence g() {
        return this.h.f.getTitle();
    }

    @Override
    public final void h() {
        if (this.h.i != this) {
            return;
        }
        f27 f27Var = this.d;
        f27Var.w();
        try {
            this.e.M(this, f27Var);
        } finally {
            f27Var.v();
        }
    }

    @Override
    public final boolean i() {
        return this.h.f.J;
    }

    @Override
    public final void l(View view) {
        this.h.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override
    public final void m(int i) {
        n(this.h.a.getResources().getString(i));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.h.f.setSubtitle(charSequence);
    }

    @Override
    public final void o(int i) {
        p(this.h.a.getResources().getString(i));
    }

    @Override
    public final void p(CharSequence charSequence) {
        this.h.f.setTitle(charSequence);
    }

    @Override
    public final void q(boolean z) {
        this.a = z;
        this.h.f.setTitleOptional(z);
    }
}
