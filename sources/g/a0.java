package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.i {
    public final Context f10000c;
    public final l.k d;
    public n4.y f10001e;
    public WeakReference f10002f;
    public final b0 h;

    public a0(b0 b0Var, Context context, n4.y yVar) {
        this.h = b0Var;
        this.f10000c = context;
        this.f10001e = yVar;
        l.k kVar = new l.k(context);
        kVar.f15180l = 1;
        this.d = kVar;
        kVar.f15174e = this;
    }

    @Override
    public final boolean M(l.k kVar, MenuItem menuItem) {
        n4.y yVar = this.f10001e;
        if (yVar != null) {
            return ((qi.f) yVar.f16644b).G(this, menuItem);
        }
        return false;
    }

    @Override
    public final void a() {
        b0 b0Var = this.h;
        if (b0Var.f10013i != this) {
            return;
        }
        if (b0Var.f10020p) {
            b0Var.f10014j = this;
            b0Var.f10015k = this.f10001e;
        } else {
            this.f10001e.V(this);
        }
        this.f10001e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f10011f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        b0Var.f10009c.setHideOnContentScrollEnabled(b0Var.f10024t);
        b0Var.f10013i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f10002f;
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
        return new k.h(this.f10000c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f10011f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f10011f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f10013i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f10001e.W(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f10011f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f10011f.setCustomView(view);
        this.f10002f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f10007a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f10011f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.h.f10007a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.h.f10011f.setTitle(charSequence);
    }

    @Override
    public final void n(boolean z10) {
        this.f14239b = z10;
        this.h.f10011f.setTitleOptional(z10);
    }

    @Override
    public final void y(l.k kVar) {
        if (this.f10001e != null) {
            g();
            m.h hVar = this.h.f10011f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }
}
