package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.i {
    public final Context f11644c;
    public final l.k d;
    public tf.b f11645e;
    public WeakReference f11646f;
    public final b0 h;

    public a0(b0 b0Var, Context context, tf.b bVar) {
        this.h = b0Var;
        this.f11644c = context;
        this.f11645e = bVar;
        l.k kVar = new l.k(context);
        kVar.f17426l = 1;
        this.d = kVar;
        kVar.f17420e = this;
    }

    @Override
    public final boolean U0(l.k kVar, MenuItem menuItem) {
        tf.b bVar = this.f11645e;
        if (bVar != null) {
            return ((ui.f) bVar.f55094a).A(this, menuItem);
        }
        return false;
    }

    @Override
    public final void b(l.k kVar) {
        if (this.f11645e != null) {
            i();
            m.h hVar = this.h.f11664f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final void c() {
        b0 b0Var = this.h;
        if (b0Var.f11666i != this) {
            return;
        }
        if (b0Var.f11673p) {
            b0Var.f11667j = this;
            b0Var.f11668k = this.f11645e;
        } else {
            this.f11645e.v(this);
        }
        this.f11645e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f11664f;
        if (actionBarContextView.f1347w == null) {
            actionBarContextView.e();
        }
        b0Var.f11662c.setHideOnContentScrollEnabled(b0Var.f11677t);
        b0Var.f11666i = null;
    }

    @Override
    public final View d() {
        WeakReference weakReference = this.f11646f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k e() {
        return this.d;
    }

    @Override
    public final k.h f() {
        return new k.h(this.f11644c);
    }

    @Override
    public final CharSequence g() {
        return this.h.f11664f.getSubtitle();
    }

    @Override
    public final CharSequence h() {
        return this.h.f11664f.getTitle();
    }

    @Override
    public final void i() {
        if (this.h.f11666i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f11645e.w(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean j() {
        return this.h.f11664f.J;
    }

    @Override
    public final void m(View view) {
        this.h.f11664f.setCustomView(view);
        this.f11646f = new WeakReference(view);
    }

    @Override
    public final void n(int i3) {
        o(this.h.f11660a.getResources().getString(i3));
    }

    @Override
    public final void o(CharSequence charSequence) {
        this.h.f11664f.setSubtitle(charSequence);
    }

    @Override
    public final void p(int i3) {
        q(this.h.f11660a.getResources().getString(i3));
    }

    @Override
    public final void q(CharSequence charSequence) {
        this.h.f11664f.setTitle(charSequence);
    }

    @Override
    public final void r(boolean z10) {
        this.f16384a = z10;
        this.h.f11664f.setTitleOptional(z10);
    }
}
