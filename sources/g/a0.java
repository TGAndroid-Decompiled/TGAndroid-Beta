package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
public final class a0 extends k.a implements l.i {
    public final Context f13262c;
    public final l.k d;
    public q4.q f13263e;
    public WeakReference f13264f;
    public final b0 h;

    public a0(b0 b0Var, Context context, q4.q qVar) {
        this.h = b0Var;
        this.f13262c = context;
        this.f13263e = qVar;
        l.k kVar = new l.k(context);
        kVar.f17683l = 1;
        this.d = kVar;
        kVar.f17677e = this;
    }

    @Override
    public final boolean F0(l.k kVar, MenuItem menuItem) {
        q4.q qVar = this.f13263e;
        if (qVar != null) {
            return ((ui.e) qVar.f53815b).N(this, menuItem);
        }
        return false;
    }

    @Override
    public final void b() {
        b0 b0Var = this.h;
        if (b0Var.f13284i != this) {
            return;
        }
        if (b0Var.f13291p) {
            b0Var.f13285j = this;
            b0Var.f13286k = this.f13263e;
        } else {
            this.f13263e.c(this);
        }
        this.f13263e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f13282f;
        if (actionBarContextView.f1925w == null) {
            actionBarContextView.e();
        }
        b0Var.f13280c.setHideOnContentScrollEnabled(b0Var.f13295t);
        b0Var.f13284i = null;
    }

    @Override
    public final View c() {
        WeakReference weakReference = this.f13264f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final l.k d() {
        return this.d;
    }

    @Override
    public final k.h e() {
        return new k.h(this.f13262c);
    }

    @Override
    public final CharSequence f() {
        return this.h.f13282f.getSubtitle();
    }

    @Override
    public final CharSequence g() {
        return this.h.f13282f.getTitle();
    }

    @Override
    public final void h() {
        if (this.h.f13284i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.f13263e.d(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override
    public final boolean i() {
        return this.h.f13282f.I;
    }

    @Override
    public final void j0(l.k kVar) {
        if (this.f13263e != null) {
            h();
            m.i iVar = this.h.f13282f.d;
            if (iVar != null) {
                iVar.l();
            }
        }
    }

    @Override
    public final void l(View view) {
        this.h.f13282f.setCustomView(view);
        this.f13264f = new WeakReference(view);
    }

    @Override
    public final void m(int i7) {
        n(this.h.f13278a.getResources().getString(i7));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.h.f13282f.setSubtitle(charSequence);
    }

    @Override
    public final void o(int i7) {
        p(this.h.f13278a.getResources().getString(i7));
    }

    @Override
    public final void p(CharSequence charSequence) {
        this.h.f13282f.setTitle(charSequence);
    }

    @Override
    public final void q(boolean z9) {
        this.f17105a = z9;
        this.h.f13282f.setTitleOptional(z9);
    }
}
