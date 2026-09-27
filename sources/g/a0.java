package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.j {
    public final Context f9190c;
    public final l.l d;
    public n4.y e;
    public WeakReference f9191f;
    public final b0 h;

    public a0(b0 b0Var, Context context, n4.y yVar) {
        this.h = b0Var;
        this.f9190c = context;
        this.e = yVar;
        l.l lVar = new l.l(context);
        lVar.f13968l = 1;
        this.d = lVar;
        lVar.e = this;
    }

    @Override
    public final void a() {
        b0 b0Var = this.h;
        if (b0Var.f9201i != this) {
            return;
        }
        if (b0Var.f9208p) {
            b0Var.f9202j = this;
            b0Var.f9203k = this.e;
        } else {
            this.e.T(this);
        }
        this.e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f9199f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        b0Var.f9198c.setHideOnContentScrollEnabled(b0Var.f9212t);
        b0Var.f9201i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f9191f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.l c() {
        return this.d;
    }

    @Override
    public final k.h d() {
        return new k.h(this.f9190c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f9199f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f9199f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f9201i != this) {
            return;
        }
        l.l lVar = this.d;
        lVar.w();
        try {
            this.e.V(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f9199f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f9199f.setCustomView(view);
        this.f9191f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f9196a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f9199f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.h.f9196a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.h.f9199f.setTitle(charSequence);
    }

    @Override
    public final void n(boolean z10) {
        this.f13099b = z10;
        this.h.f9199f.setTitleOptional(z10);
    }

    @Override
    public final void p(l.l lVar) {
        if (this.e != null) {
            g();
            m.h hVar = this.h.f9199f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final boolean s(l.l lVar, MenuItem menuItem) {
        n4.y yVar = this.e;
        if (yVar != null) {
            return ((pi.f) yVar.f15257b).G(this, menuItem);
        }
        return false;
    }
}
