package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class tqa extends g9 implements d27 {
    public Context c;
    public ActionBarContextView d;
    public lh2 e;
    public WeakReference f;
    public boolean h;
    public f27 n;

    @Override
    public final boolean B(f27 f27Var, MenuItem menuItem) {
        return ((u8a) this.e.b).B(this, menuItem);
    }

    @Override
    public final void Q1(f27 f27Var) {
        h();
        c9 c9Var = this.d.d;
        if (c9Var != null) {
            c9Var.l();
        }
    }

    @Override
    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.F(this);
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
    public final f27 d() {
        return this.n;
    }

    @Override
    public final tfb e() {
        return new tfb(this.d.getContext());
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
        this.e.M(this, this.n);
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
