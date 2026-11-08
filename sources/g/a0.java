package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.i {
    public final Context f13260c;
    public final l.k d;
    public q4.q f13261e;
    public WeakReference f13262f;
    public final b0 h;

    public a0(b0 b0Var, Context context, q4.q qVar) {
        this.h = b0Var;
        this.f13260c = context;
        this.f13261e = qVar;
        l.k kVar = new l.k(context);
        kVar.f17680l = 1;
        this.d = kVar;
        kVar.f17674e = this;
    }

    @Override
    public final boolean F0(l.k kVar, MenuItem menuItem) {
        q4.q qVar = this.f13261e;
        if (qVar != null) {
            return ((ui.e) qVar.f53804b).N(this, menuItem);
        }
        return false;
    }

    @Override
    public final void b() {
        b0 b0Var = this.h;
        if (b0Var.f13282i != this) {
            return;
        }
        if (b0Var.f13289p) {
            b0Var.f13283j = this;
            b0Var.f13284k = this.f13261e;
        } else {
            this.f13261e.c(this);
        }
        this.f13261e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f13280f;
        if (actionBarContextView.f1925w == null) {
            actionBarContextView.e();
        }
        b0Var.f13278c.setHideOnContentScrollEnabled(b0Var.f13293t);
        b0Var.f13282i = null;
    }

    @Override
    public final View c() {
        WeakReference weakReference = this.f13262f;
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
        return new k.h(this.f13260c);
    }

    @Override
    public final CharSequence f() {
        return this.h.f13280f.getSubtitle();
    }

    @Override
    public final CharSequence g() {
        return this.h.f13280f.getTitle();
    }

    @Override
    public final void h() {
        if (this.h.f13282i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f13261e.d(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean i() {
        return this.h.f13280f.I;
    }

    @Override
    public final void j0(l.k kVar) {
        if (this.f13261e != null) {
            h();
            m.i iVar = this.h.f13280f.d;
            if (iVar != null) {
                iVar.l();
            }
        }
    }

    @Override
    public final void l(View view) {
        this.h.f13280f.setCustomView(view);
        this.f13262f = new WeakReference(view);
    }

    @Override
    public final void m(int i7) {
        n(this.h.f13276a.getResources().getString(i7));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.h.f13280f.setSubtitle(charSequence);
    }

    @Override
    public final void o(int i7) {
        p(this.h.f13276a.getResources().getString(i7));
    }

    @Override
    public final void p(CharSequence charSequence) {
        this.h.f13280f.setTitle(charSequence);
    }

    @Override
    public final void q(boolean z9) {
        this.f17105a = z9;
        this.h.f13280f.setTitleOptional(z9);
    }
}
