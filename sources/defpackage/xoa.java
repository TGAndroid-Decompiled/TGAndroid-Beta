package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class xoa extends f9 implements w17 {
    public Context c;
    public ActionBarContextView d;
    public lx6 e;
    public WeakReference f;
    public boolean h;
    public y17 n;

    @Override
    public final boolean B(y17 y17Var, MenuItem menuItem) {
        return ((e7a) this.e.b).B(this, menuItem);
    }

    @Override
    public final void T1(y17 y17Var) {
        h();
        b9 b9Var = this.d.d;
        if (b9Var != null) {
            b9Var.l();
        }
    }

    @Override
    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.B(this);
    }

    @Override
    public final View c() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final y17 d() {
        return this.n;
    }

    @Override
    public final zdb e() {
        return new zdb(this.d.getContext());
    }

    @Override
    public final CharSequence f() {
        return this.d.getSubtitle();
    }

    @Override
    public final CharSequence g() {
        return this.d.getTitle();
    }

    @Override
    public final void h() {
        this.e.J(this, this.n);
    }

    @Override
    public final boolean i() {
        return this.d.J;
    }

    @Override
    public final void l(View view) {
        WeakReference weakReference;
        this.d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f = weakReference;
    }

    @Override
    public final void m(int i) {
        n(this.c.getString(i));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public final void o(int i) {
        p(this.c.getString(i));
    }

    @Override
    public final void p(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public final void q(boolean z) {
        this.a = z;
        this.d.setTitleOptional(z);
    }
}
