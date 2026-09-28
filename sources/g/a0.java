package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.j {
    public final Context f9185c;
    public final l.l d;
    public n4.y e;
    public WeakReference f9186f;
    public final b0 h;

    public a0(b0 b0Var, Context context, n4.y yVar) {
        this.h = b0Var;
        this.f9185c = context;
        this.e = yVar;
        l.l lVar = new l.l(context);
        lVar.f13966l = 1;
        this.d = lVar;
        lVar.e = this;
    }

    @Override
    public final void a() {
        b0 b0Var = this.h;
        if (b0Var.f9196i != this) {
            return;
        }
        if (b0Var.f9203p) {
            b0Var.f9197j = this;
            b0Var.f9198k = this.e;
        } else {
            this.e.T(this);
        }
        this.e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f9194f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        b0Var.f9193c.setHideOnContentScrollEnabled(b0Var.f9207t);
        b0Var.f9196i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f9186f;
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
        return new k.h(this.f9185c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f9194f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f9194f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f9196i != this) {
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
        return this.h.f9194f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f9194f.setCustomView(view);
        this.f9186f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f9191a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f9194f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.h.f9191a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.h.f9194f.setTitle(charSequence);
    }

    @Override
    public final void n(boolean z10) {
        this.f13096b = z10;
        this.h.f9194f.setTitleOptional(z10);
    }

    @Override
    public final void r(l.l lVar) {
        if (this.e != null) {
            g();
            m.h hVar = this.h.f9194f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final boolean t(l.l lVar, MenuItem menuItem) {
        n4.y yVar = this.e;
        if (yVar != null) {
            return ((oi.f) yVar.f15222b).G(this, menuItem);
        }
        return false;
    }
}
