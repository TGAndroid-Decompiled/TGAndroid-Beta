package g;

import ab.c0;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.i {
    public final Context f12610c;
    public final l.k d;
    public q4.q f12611e;
    public WeakReference f12612f;
    public final b0 h;

    public a0(b0 b0Var, Context context, q4.q qVar) {
        this.h = b0Var;
        this.f12610c = context;
        this.f12611e = qVar;
        l.k kVar = new l.k(context);
        kVar.f18822l = 1;
        this.d = kVar;
        kVar.f18816e = this;
    }

    @Override
    public final void b() {
        b0 b0Var = this.h;
        if (b0Var.f12632i != this) {
            return;
        }
        if (b0Var.f12639p) {
            b0Var.f12633j = this;
            b0Var.f12634k = this.f12611e;
        } else {
            this.f12611e.c(this);
        }
        this.f12611e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f12630f;
        if (actionBarContextView.f1875w == null) {
            actionBarContextView.e();
        }
        b0Var.f12628c.setHideOnContentScrollEnabled(b0Var.f12643t);
        b0Var.f12632i = null;
    }

    @Override
    public final View c() {
        WeakReference weakReference = this.f12612f;
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
        return new k.h(this.f12610c);
    }

    @Override
    public final CharSequence f() {
        return this.h.f12630f.getSubtitle();
    }

    @Override
    public final CharSequence g() {
        return this.h.f12630f.getTitle();
    }

    @Override
    public final void h() {
        if (this.h.f12632i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f12611e.d(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final void i(l.k kVar) {
        if (this.f12611e != null) {
            h();
            m.h hVar = this.h.f12630f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final boolean j() {
        return this.h.f12630f.J;
    }

    @Override
    public final void m(View view) {
        this.h.f12630f.setCustomView(view);
        this.f12612f = new WeakReference(view);
    }

    @Override
    public final void n(int i7) {
        p(this.h.f12626a.getResources().getString(i7));
    }

    @Override
    public final boolean o(l.k kVar, MenuItem menuItem) {
        q4.q qVar = this.f12611e;
        if (qVar != null) {
            return ((c0) qVar.f55252b).D(this, menuItem);
        }
        return false;
    }

    @Override
    public final void p(CharSequence charSequence) {
        this.h.f12630f.setSubtitle(charSequence);
    }

    @Override
    public final void q(int i7) {
        r(this.h.f12626a.getResources().getString(i7));
    }

    @Override
    public final void r(CharSequence charSequence) {
        this.h.f12630f.setTitle(charSequence);
    }

    @Override
    public final void s(boolean z10) {
        this.f17663a = z10;
        this.h.f12630f.setTitleOptional(z10);
    }
}
