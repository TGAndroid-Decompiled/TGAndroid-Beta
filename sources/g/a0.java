package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.i {
    public final Context f9186c;
    public final l.k d;
    public n4.y e;
    public WeakReference f9187f;
    public final b0 h;

    public a0(b0 b0Var, Context context, n4.y yVar) {
        this.h = b0Var;
        this.f9186c = context;
        this.e = yVar;
        l.k kVar = new l.k(context);
        kVar.f13730l = 1;
        this.d = kVar;
        kVar.e = this;
    }

    @Override
    public final boolean A(l.k kVar, MenuItem menuItem) {
        n4.y yVar = this.e;
        if (yVar != null) {
            return ((ni.f) yVar.f14969b).G(this, menuItem);
        }
        return false;
    }

    @Override
    public final void a() {
        b0 b0Var = this.h;
        if (b0Var.f9197i != this) {
            return;
        }
        if (b0Var.f9204p) {
            b0Var.f9198j = this;
            b0Var.f9199k = this.e;
        } else {
            this.e.T(this);
        }
        this.e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f9195f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        b0Var.f9194c.setHideOnContentScrollEnabled(b0Var.f9208t);
        b0Var.f9197i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f9187f;
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
        return new k.h(this.f9186c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f9195f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f9195f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f9197i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.e.U(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f9195f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f9195f.setCustomView(view);
        this.f9187f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f9192a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f9195f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.h.f9192a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.h.f9195f.setTitle(charSequence);
    }

    @Override
    public final void n(boolean z10) {
        this.f13096b = z10;
        this.h.f9195f.setTitleOptional(z10);
    }

    @Override
    public final void t(l.k kVar) {
        if (this.e != null) {
            g();
            m.h hVar = this.h.f9195f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }
}
