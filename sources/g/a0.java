package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public final class a0 extends k.a implements l.j {

    public final Context f6198c;
    public final l.l d;

    public xe.b f6199e;

    public WeakReference f6200f;
    public final b0 h;

    public a0(b0 b0Var, Context context, xe.b bVar) {
        this.h = b0Var;
        this.f6198c = context;
        this.f6199e = bVar;
        l.l lVar = new l.l(context);
        lVar.f15319l = 1;
        this.d = lVar;
        lVar.f15313e = this;
    }

    @Override
    public final void a() {
        b0 b0Var = this.h;
        if (b0Var.f6211i != this) {
            return;
        }
        if (b0Var.f6218p) {
            b0Var.f6212j = this;
            b0Var.f6213k = this.f6199e;
        } else {
            this.f6199e.J(this);
        }
        this.f6199e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f6209f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        b0Var.f6207c.setHideOnContentScrollEnabled(b0Var.f6222t);
        b0Var.f6211i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.f6200f;
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
        return new k.h(this.f6198c);
    }

    @Override
    public final CharSequence e() {
        return this.h.f6209f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.h.f6209f.getTitle();
    }

    @Override
    public final void g() {
        if (this.h.f6211i != this) {
            return;
        }
        l.l lVar = this.d;
        lVar.w();
        try {
            this.f6199e.K(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.h.f6209f.E;
    }

    @Override
    public final void i(View view) {
        this.h.f6209f.setCustomView(view);
        this.f6200f = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        l(this.h.f6205a.getResources().getString(i10));
    }

    @Override
    public final void k(l.l lVar) {
        if (this.f6199e == null) {
            return;
        }
        g();
        m.i iVar = this.h.f6209f.d;
        if (iVar != null) {
            iVar.l();
        }
    }

    @Override
    public final void l(CharSequence charSequence) {
        this.h.f6209f.setSubtitle(charSequence);
    }

    @Override
    public final void m(int i10) {
        n(this.h.f6205a.getResources().getString(i10));
    }

    @Override
    public final void n(CharSequence charSequence) {
        this.h.f6209f.setTitle(charSequence);
    }

    @Override
    public final void o(boolean z10) {
        this.f14207b = z10;
        this.h.f6209f.setTitleOptional(z10);
    }

    @Override
    public final boolean t(l.l lVar, MenuItem menuItem) {
        xe.b bVar = this.f6199e;
        if (bVar != null) {
            return ((com.google.firebase.messaging.t) bVar.f49392b).F(this, menuItem);
        }
        return false;
    }
}
