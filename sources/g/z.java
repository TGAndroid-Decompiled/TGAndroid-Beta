package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class z extends k.a implements l.j {
    public final Context f6803c;
    public final l.l d;
    public f7.b f6804e;
    public WeakReference f6805f;
    public final a0 h;

    public z(a0 a0Var, Context context, f7.b bVar) {
        this.h = a0Var;
        this.f6803c = context;
        this.f6804e = bVar;
        l.l lVar = new l.l(context);
        lVar.f11404l = 1;
        this.d = lVar;
        lVar.f11398e = this;
    }

    @Override
    public final void a() {
        a0 a0Var = this.h;
        if (a0Var.f6683i != this) {
            return;
        }
        if (a0Var.f6690p) {
            a0Var.f6684j = this;
            a0Var.f6685k = this.f6804e;
        } else {
            this.f6804e.t(this);
        }
        this.f6804e = null;
        a0Var.a(false);
        ActionBarContextView actionBarContextView = a0Var.f6681f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        a0Var.f6679c.setHideOnContentScrollEnabled(a0Var.f6694t);
        a0Var.f6683i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f6805f;
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
        return new k.h(this.f6803c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f6681f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f6681f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f6683i != this) {
            return;
        }
        l.l lVar = this.d;
        lVar.w();
        try {
            this.f6804e.u(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f6681f.F;
    }

    @Override
    public final void i(View view) {
        this.h.f6681f.setCustomView(view);
        this.f6805f = new WeakReference(view);
    }

    @Override
    public final void j(l.l lVar) {
        if (this.f6804e != null) {
            g();
            m.h hVar = this.h.f6681f.d;
            if (hVar != null) {
                hVar.l();
            }
        }
    }

    @Override
    public final void k(int i10) {
        l(this.h.f6677a.getResources().getString(i10));
    }

    @Override
    public final void l(CharSequence charSequence) {
        this.h.f6681f.setSubtitle(charSequence);
    }

    @Override
    public final void m(int i10) {
        n(this.h.f6677a.getResources().getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.h.f6681f.setTitle(charSequence);
    }

    @Override
    public final void o(boolean z4) {
        this.f10197b = z4;
        this.h.f6681f.setTitleOptional(z4);
    }

    @Override
    public final boolean s(l.l lVar, MenuItem menuItem) {
        f7.b bVar = this.f6804e;
        if (bVar != null) {
            return ((sf.e) bVar.f6120b).A(this, menuItem);
        }
        return false;
    }
}
