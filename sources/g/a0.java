package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.j {
    public final Context f7136c;
    public final l.l d;
    public n4.q e;
    public WeakReference f7137f;
    public final b0 h;

    public a0(b0 b0Var, Context context, n4.q qVar) {
        this.h = b0Var;
        this.f7136c = context;
        this.e = qVar;
        l.l lVar = new l.l(context);
        lVar.f11506l = 1;
        this.d = lVar;
        lVar.e = this;
    }

    @Override
    public final void b() {
        b0 b0Var = this.h;
        if (b0Var.f7155i != this) {
            return;
        }
        if (b0Var.f7162p) {
            b0Var.f7156j = this;
            b0Var.f7157k = this.e;
        } else {
            this.e.B(this);
        }
        this.e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f7153f;
        if (actionBarContextView.f1027w == null) {
            actionBarContextView.e();
        }
        b0Var.f7152c.setHideOnContentScrollEnabled(b0Var.f7166t);
        b0Var.f7155i = null;
    }

    @Override
    public final View c() {
        WeakReference weakReference = this.f7137f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.l d() {
        return this.d;
    }

    @Override
    public final k.h e() {
        return new k.h(this.f7136c);
    }

    @Override
    public final CharSequence f() {
        return this.h.f7153f.getSubtitle();
    }

    @Override
    public final CharSequence g() {
        return this.h.f7153f.getTitle();
    }

    @Override
    public final void h() {
        if (this.h.f7155i != this) {
            return;
        }
        l.l lVar = this.d;
        lVar.w();
        try {
            this.e.C(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override
    public final boolean i() {
        return this.h.f7153f.I;
    }

    @Override
    public final void l(View view) {
        this.h.f7153f.setCustomView(view);
        this.f7137f = new WeakReference(view);
    }

    @Override
    public final void m(int i10) {
        n(this.h.f7150a.getResources().getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.h.f7153f.setSubtitle(charSequence);
    }

    @Override
    public final void o(int i10) {
        q(this.h.f7150a.getResources().getString(i10));
    }

    @Override
    public final void p(l.l lVar) {
        if (this.e != null) {
            h();
            m.h hVar = this.h.f7153f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final void q(CharSequence charSequence) {
        this.h.f7153f.setTitle(charSequence);
    }

    @Override
    public final void r(boolean z10) {
        this.f10473a = z10;
        this.h.f7153f.setTitleOptional(z10);
    }

    @Override
    public final boolean u(l.l lVar, MenuItem menuItem) {
        n4.q qVar = this.e;
        if (qVar != null) {
            return ((xa.n) qVar.f13527a).R(this, menuItem);
        }
        return false;
    }
}
