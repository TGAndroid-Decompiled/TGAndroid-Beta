package defpackage;

import org.telegram.messenger.support.SparseLongArray;
import org.telegram.ui.ActionBar.d;
public final class x11 extends t11 implements gk7 {
    public final u11 d;
    public SparseLongArray e;
    public final d f;
    public final int h;
    public m21 n;

    public x11(int i, d dVar) {
        super(dVar.getContext(), dVar.getResourceProvider());
        this.f = dVar;
        this.h = i;
        this.b.setLayoutParams(nme.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.a.setLayoutParams(nme.h(56.0f, 48.0f, 8388659));
        u11 u11Var = new u11(this, dVar, getContext(), dVar.getCurrentAccount(), dVar.getResourceProvider());
        this.d = u11Var;
        u11Var.setPadding(gl.L(4.0f), gl.L(24.0f), gl.L(4.0f), gl.L(0.0f));
        this.d.setDelegate(new w11(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-gl.L(80.0f));
        this.d.setHint(k96.M0(2131745683, null));
        addView(this.d, nme.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.m(null, null, true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.l3) {
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
        return gl.L(30.0f) + this.b.getMeasuredHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(y6c.t0).b(this, kk7.l3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(y6c.t0).n(this, kk7.l3);
    }

    public void setBulletin(m21 m21Var) {
        this.n = m21Var;
    }
}
