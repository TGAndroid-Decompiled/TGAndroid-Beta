package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class ywc extends f9 implements wz6 {
    public final Context c;
    public final yz6 d;
    public tg2 e;
    public WeakReference f;
    public final zwc h;

    public ywc(zwc zwcVar, Context context, tg2 tg2Var) {
        this.h = zwcVar;
        this.c = context;
        this.e = tg2Var;
        yz6 yz6Var = new yz6(context);
        yz6Var.l = true;
        this.d = yz6Var;
        yz6Var.e = this;
    }

    @Override
    public final boolean B(yz6 yz6Var, MenuItem menuItem) {
        tg2 tg2Var = this.e;
        if (tg2Var != null) {
            return ((wtc) tg2Var.b).w(this, menuItem);
        }
        return false;
    }

    @Override
    public final void b() {
        zwc zwcVar = this.h;
        if (zwcVar.i != this) {
            return;
        }
        if (zwcVar.p) {
            zwcVar.j = this;
            zwcVar.k = this.e;
        } else {
            this.e.S(this);
        }
        this.e = null;
        zwcVar.a(false);
        ActionBarContextView actionBarContextView = zwcVar.f;
        if (actionBarContextView.w == null) {
            actionBarContextView.e();
        }
        zwcVar.c.setHideOnContentScrollEnabled(zwcVar.t);
        zwcVar.i = null;
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
    public final yz6 d() {
        return this.d;
    }

    @Override
    public final xbb e() {
        return new xbb(this.c);
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
        yz6 yz6Var = this.d;
        yz6Var.w();
        try {
            this.e.W(this, yz6Var);
        } finally {
            yz6Var.v();
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
    public final void o1(yz6 yz6Var) {
        if (this.e != null) {
            h();
            b9 b9Var = this.h.f.d;
            if (b9Var != null) {
                b9Var.l();
            }
        }
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
