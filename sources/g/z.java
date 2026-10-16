package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class z extends k.a implements l.i {
    public final Context f9834c;
    public final l.k d;
    public n4.s e;
    public WeakReference f9835f;
    public final a0 h;

    public z(a0 a0Var, Context context, n4.s sVar) {
        this.h = a0Var;
        this.f9834c = context;
        this.e = sVar;
        l.k kVar = new l.k(context);
        kVar.f14423l = 1;
        this.d = kVar;
        kVar.e = this;
    }

    @Override
    public final void a() {
        a0 a0Var = this.h;
        if (a0Var.f9719i != this) {
            return;
        }
        if (a0Var.f9726p) {
            a0Var.f9720j = this;
            a0Var.f9721k = this.e;
        } else {
            this.e.t(this);
        }
        this.e = null;
        a0Var.a(false);
        ActionBarContextView actionBarContextView = a0Var.f9717f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        a0Var.f9716c.setHideOnContentScrollEnabled(a0Var.f9730t);
        a0Var.f9719i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f9835f;
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
        return new k.h(this.f9834c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f9717f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f9717f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f9719i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.e.v(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f9717f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f9717f.setCustomView(view);
        this.f9835f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f9714a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f9717f.setSubtitle(charSequence);
    }

    @Override
    public final void l(l.k kVar) {
        if (this.e != null) {
            g();
            m.i iVar = this.h.f9717f.d;
            if (iVar != null) {
                iVar.l();
            }
        }
    }

    @Override
    public final void m(int i10) {
        n(this.h.f9714a.getResources().getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.h.f9717f.setTitle(charSequence);
    }

    @Override
    public final boolean o(l.k kVar, MenuItem menuItem) {
        n4.s sVar = this.e;
        if (sVar != null) {
            return ((pi.e) sVar.f15745b).y(this, menuItem);
        }
        return false;
    }

    @Override
    public final void p(boolean z10) {
        this.f13722b = z10;
        this.h.f9717f.setTitleOptional(z10);
    }
}
