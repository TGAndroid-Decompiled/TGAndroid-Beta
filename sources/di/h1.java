package di;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.ui.Components.er;
public final class h1 extends qh.c implements te.b {
    public static final int f8680w = 0;
    public final te.c f8681f;
    public final ai.g0 h;
    public final qh.b[] f8682n;
    public final org.telegram.ui.ActionBar.e6 f8683r;
    public int f8684s;

    public h1(Context context, org.telegram.ui.ActionBar.e6 e6Var, ai.g0 g0Var) {
        super(context);
        this.f8681f = new te.c(0, this, er.h, 1600L);
        this.h = g0Var;
        this.f8683r = e6Var;
        int i7 = org.telegram.ui.ActionBar.j6.Nl;
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.09411765f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        org.telegram.ui.ActionBar.j6.r1(0.1254902f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        this.f55596e.setColor(r12);
        this.f8682n = new qh.b[]{qh.b.c(context, e6Var, qh.a.H, 2131749625), qh.b.c(context, e6Var, qh.a.f55575w, 2131749642), qh.b.c(context, e6Var, qh.a.K, 2131749623)};
        int i10 = 0;
        while (true) {
            qh.b[] bVarArr = this.f8682n;
            if (i10 < bVarArr.length) {
                this.f55593a.addView(bVarArr[i10], c8.ja.l(1.0f, 0, -1));
                this.f8682n[i10].setOnClickListener(new ci.q(this, i10, 2));
                i10++;
            } else {
                bVarArr[0].f(true, false);
                return;
            }
        }
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        b();
        invalidate();
    }

    public final void a(int i7) {
        int i10 = this.f8684s;
        if (i10 != i7) {
            qh.b[] bVarArr = this.f8682n;
            bVarArr[i10].f(false, true);
            bVarArr[i7].f(true, true);
            this.f8684s = i7;
            this.f8681f.a(i7);
            this.h.a(Integer.valueOf(i7));
        }
    }

    public final void b() {
        float f10 = this.f8681f.f57091f;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
        Rect rect = this.f55595c;
        rect.set(org.telegram.messenger.g0.W1(f10 / 3.0f, org.telegram.messenger.g0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.W1((f10 + 1.0f) / 3.0f, org.telegram.messenger.g0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)), measuredHeight);
        int L = org.telegram.messenger.g0.L(this.f55594b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i7 = -L;
        rect2.inset(i7, i7);
        Math.abs(f10 - 1.0f);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        b();
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
