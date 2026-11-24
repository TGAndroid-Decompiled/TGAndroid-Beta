package defpackage;

import org.telegram.messenger.support.SparseLongArray;
import org.telegram.ui.ActionBar.d;
public final class f31 extends b31 implements jm7 {
    public final c31 d;
    public SparseLongArray e;
    public final d f;
    public final int h;
    public u31 n;

    public f31(int i, d dVar) {
        super(dVar.getContext(), dVar.getResourceProvider());
        this.f = dVar;
        this.h = i;
        this.b.setLayoutParams(qoe.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.a.setLayoutParams(qoe.h(56.0f, 48.0f, 8388659));
        c31 c31Var = new c31(this, dVar, getContext(), dVar.getCurrentAccount(), dVar.getResourceProvider());
        this.d = c31Var;
        c31Var.setPadding(gm.L(4.0f), gm.L(24.0f), gm.L(4.0f), gm.L(0.0f));
        this.d.setDelegate(new e31(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-gm.L(80.0f));
        this.d.setHint(jb6.M0(2131745609, null));
        addView(this.d, qoe.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.m(null, null, true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m3) {
            this.e = (SparseLongArray) objArr[0];
        }
    }

    public final void f() {
        if (this.d.getReactionsWindow() != null) {
            this.d.b();
            if (this.d.getReactionsWindow().a != null) {
                this.d.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public int getMeasuredBackgroundHeight() {
        return gm.L(30.0f) + this.b.getMeasuredHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(z8c.t0).b(this, nm7.m3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(z8c.t0).n(this, nm7.m3);
    }

    public void setBulletin(u31 u31Var) {
        this.n = u31Var;
    }
}
