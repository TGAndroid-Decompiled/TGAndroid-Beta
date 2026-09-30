package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.j {
    public final Context f9197c;
    public final l.l d;
    public n4.y e;
    public WeakReference f9198f;
    public final b0 h;

    public a0(b0 b0Var, Context context, n4.y yVar) {
        this.h = b0Var;
        this.f9197c = context;
        this.e = yVar;
        l.l lVar = new l.l(context);
        lVar.f13982l = 1;
        this.d = lVar;
        lVar.e = this;
    }

    @Override
    public final void a() {
        b0 b0Var = this.h;
        if (b0Var.f9208i != this) {
            return;
        }
        if (b0Var.f9215p) {
            b0Var.f9209j = this;
            b0Var.f9210k = this.e;
        } else {
            this.e.T(this);
        }
        this.e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f9206f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        b0Var.f9205c.setHideOnContentScrollEnabled(b0Var.f9219t);
        b0Var.f9208i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f9198f;
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
        return new k.h(this.f9197c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f9206f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f9206f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f9208i != this) {
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
        return this.h.f9206f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f9206f.setCustomView(view);
        this.f9198f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f9203a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f9206f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.h.f9203a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.h.f9206f.setTitle(charSequence);
    }

    @Override
    public final void n(boolean z10) {
        this.f13111b = z10;
        this.h.f9206f.setTitleOptional(z10);
    }

    @Override
    public final void r(l.l lVar) {
        if (this.e != null) {
            g();
            m.h hVar = this.h.f9206f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final boolean t(l.l lVar, MenuItem menuItem) {
        n4.y yVar = this.e;
        if (yVar != null) {
            return ((oi.f) yVar.f15238b).G(this, menuItem);
        }
        return false;
    }
}
