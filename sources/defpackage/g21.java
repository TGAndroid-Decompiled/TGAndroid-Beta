package defpackage;

import org.telegram.messenger.support.SparseLongArray;
import org.telegram.ui.ActionBar.e;
public final class g21 extends c21 implements fn7 {
    public final d21 d;
    public SparseLongArray e;
    public final e f;
    public final int h;
    public v21 n;

    public g21(int i, e eVar) {
        super(eVar.getContext(), eVar.getResourceProvider());
        this.f = eVar;
        this.h = i;
        this.b.setLayoutParams(tre.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.a.setLayoutParams(tre.h(56.0f, 48.0f, 8388659));
        d21 d21Var = new d21(this, eVar, getContext(), eVar.getCurrentAccount(), eVar.getResourceProvider());
        this.d = d21Var;
        d21Var.setPadding(hl.L(4.0f), hl.L(24.0f), hl.L(4.0f), hl.L(0.0f));
        this.d.setDelegate(new f21(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-hl.L(80.0f));
        this.d.setHint(ob6.M0(2131745603, null));
        addView(this.d, tre.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.m(null, null, true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.m3) {
            this.e = (SparseLongArray) objArr[0];
        }
    }

    @Override
    public int getMeasuredBackgroundHeight() {
        return hl.L(30.0f) + this.b.getMeasuredHeight();
    }

    public final void j() {
        if (this.d.getReactionsWindow() != null) {
            this.d.b();
            if (this.d.getReactionsWindow().a != null) {
                this.d.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(yac.t0).b(this, jn7.m3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(yac.t0).n(this, jn7.m3);
    }

    public void setBulletin(v21 v21Var) {
        this.n = v21Var;
    }
}
