package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.j {
    public final Context f10136c;
    public final l.l d;
    public n4.y f10137e;
    public WeakReference f10138f;
    public final b0 h;

    public a0(b0 b0Var, Context context, n4.y yVar) {
        this.h = b0Var;
        this.f10136c = context;
        this.f10137e = yVar;
        l.l lVar = new l.l(context);
        lVar.f15119l = 1;
        this.d = lVar;
        lVar.f15113e = this;
    }

    @Override
    public final void a() {
        b0 b0Var = this.h;
        if (b0Var.f10149i != this) {
            return;
        }
        if (b0Var.f10156p) {
            b0Var.f10150j = this;
            b0Var.f10151k = this.f10137e;
        } else {
            this.f10137e.I(this);
        }
        this.f10137e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f10147f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        b0Var.f10145c.setHideOnContentScrollEnabled(b0Var.f10160t);
        b0Var.f10149i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f10138f;
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
        return new k.h(this.f10136c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f10147f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f10147f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f10149i != this) {
            return;
        }
        l.l lVar = this.d;
        lVar.w();
        try {
            this.f10137e.J(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f10147f.I;
    }

    @Override
    public final void i(View view) {
        this.h.f10147f.setCustomView(view);
        this.f10138f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.h.f10143a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.h.f10147f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.h.f10143a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.h.f10147f.setTitle(charSequence);
    }

    @Override
    public final void n(l.l lVar) {
        if (this.f10137e != null) {
            g();
            m.h hVar = this.h.f10147f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final void o(boolean z10) {
        this.f14383b = z10;
        this.h.f10147f.setTitleOptional(z10);
    }

    @Override
    public final boolean s(l.l lVar, MenuItem menuItem) {
        n4.y yVar = this.f10137e;
        if (yVar != null) {
            return ((fg.f) yVar.f16496b).H(this, menuItem);
        }
        return false;
    }
}
