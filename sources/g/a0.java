package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.i {
    public final Context f9999c;
    public final l.k d;
    public n4.y f10000e;
    public WeakReference f10001f;
    public final b0 h;

    public a0(b0 b0Var, Context context, n4.y yVar) {
        this.h = b0Var;
        this.f9999c = context;
        this.f10000e = yVar;
        l.k kVar = new l.k(context);
        kVar.f15179l = 1;
        this.d = kVar;
        kVar.f15173e = this;
    }

    @Override
    public final boolean M(l.k kVar, MenuItem menuItem) {
        n4.y yVar = this.f10000e;
        if (yVar != null) {
            return ((qi.f) yVar.f16640b).G(this, menuItem);
        }
        return false;
    }

    @Override
    public final void a() {
        b0 b0Var = this.h;
        if (b0Var.f10012i != this) {
            return;
        }
        if (b0Var.f10019p) {
            b0Var.f10013j = this;
            b0Var.f10014k = this.f10000e;
        } else {
            this.f10000e.V(this);
        }
        this.f10000e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f10010f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        b0Var.f10008c.setHideOnContentScrollEnabled(b0Var.f10023t);
        b0Var.f10012i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f10001f;
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
        return new k.h(this.f9999c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f10010f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f10010f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f10012i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f10000e.W(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f10010f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f10010f.setCustomView(view);
        this.f10001f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f10006a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f10010f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.h.f10006a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.h.f10010f.setTitle(charSequence);
    }

    @Override
    public final void n(boolean z10) {
        this.f14238b = z10;
        this.h.f10010f.setTitleOptional(z10);
    }

    @Override
    public final void y(l.k kVar) {
        if (this.f10000e != null) {
            g();
            m.h hVar = this.h.f10010f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }
}
