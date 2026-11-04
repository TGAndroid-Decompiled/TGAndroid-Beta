package ci;

import android.content.Context;
import android.graphics.Rect;
import b8.mf;
import org.telegram.ui.Components.xq;
public final class o1 extends rh.c implements qe.b {
    public static final int f5667w = 0;
    public final qe.c f5668f;
    public final ai.v2 h;
    public final rh.b[] f5669n;
    public final org.telegram.ui.ActionBar.e6 f5670r;
    public int f5671s;

    public o1(Context context, org.telegram.ui.ActionBar.e6 e6Var, ai.v2 v2Var) {
        super(context);
        this.f5668f = new qe.c(0, this, xq.h, 1600L);
        this.h = v2Var;
        this.f5670r = e6Var;
        int i3 = org.telegram.ui.ActionBar.k6.Kl;
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.09411765f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        org.telegram.ui.ActionBar.k6.r1(0.1254902f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        this.f54542e.setColor(r12);
        this.f5669n = new rh.b[]{rh.b.c(context, e6Var, rh.a.H, 2131749633), rh.b.c(context, e6Var, rh.a.f54521w, 2131749650), rh.b.c(context, e6Var, rh.a.K, 2131749631)};
        int i10 = 0;
        while (true) {
            rh.b[] bVarArr = this.f5669n;
            if (i10 < bVarArr.length) {
                this.f54539a.addView(bVarArr[i10], mf.l(1.0f, 0, -1));
                this.f5669n[i10].setOnClickListener(new bi.q(this, i10, 2));
                i10++;
            } else {
                bVarArr[0].f(true, false);
                return;
            }
        }
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        b();
        invalidate();
    }

    public final void a(int i3) {
        int i10 = this.f5671s;
        if (i10 != i3) {
            rh.b[] bVarArr = this.f5669n;
            bVarArr[i10].f(false, true);
            bVarArr[i3].f(true, true);
            this.f5671s = i3;
            this.f5668f.a(i3);
            this.h.a(Integer.valueOf(i3));
        }
    }

    public final void b() {
        float f10 = this.f5668f.f53846f;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
        Rect rect = this.f54541c;
        rect.set(org.telegram.messenger.g0.W1(f10 / 3.0f, org.telegram.messenger.g0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.W1((f10 + 1.0f) / 3.0f, org.telegram.messenger.g0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)), measuredHeight);
        int L = org.telegram.messenger.g0.L(this.f54540b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i3 = -L;
        rect2.inset(i3, i3);
        Math.abs(f10 - 1.0f);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        b();
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
