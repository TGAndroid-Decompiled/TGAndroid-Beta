package bi;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.ui.Components.xq;
public final class v1 extends qh.c implements te.b {
    public static final int f4858w = 0;
    public final te.c f4859f;
    public final ai.i h;
    public final qh.b[] f4860n;
    public final org.telegram.ui.ActionBar.g6 f4861r;
    public int f4862s;

    public v1(Context context, org.telegram.ui.ActionBar.g6 g6Var, ai.i iVar) {
        super(context);
        this.f4859f = new te.c(0, this, xq.h, 1600L);
        this.h = iVar;
        this.f4861r = g6Var;
        int i7 = org.telegram.ui.ActionBar.l6.Kl;
        int r12 = org.telegram.ui.ActionBar.l6.r1(0.09411765f, org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        org.telegram.ui.ActionBar.l6.r1(0.1254902f, org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        this.f54164e.setColor(r12);
        this.f4860n = new qh.b[]{qh.b.c(context, g6Var, qh.a.G, 2131749625), qh.b.c(context, g6Var, qh.a.f54143w, 2131749642), qh.b.c(context, g6Var, qh.a.J, 2131749623)};
        int i10 = 0;
        while (true) {
            qh.b[] bVarArr = this.f4860n;
            if (i10 < bVarArr.length) {
                this.f54161a.addView(bVarArr[i10], c8.ha.l(1.0f, 0, -1));
                this.f4860n[i10].setOnClickListener(new ai.v(this, i10, 2));
                i10++;
            } else {
                bVarArr[0].f(true, false);
                return;
            }
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        b();
        invalidate();
    }

    public final void a(int i7) {
        int i10 = this.f4862s;
        if (i10 != i7) {
            qh.b[] bVarArr = this.f4860n;
            bVarArr[i10].f(false, true);
            bVarArr[i7].f(true, true);
            this.f4862s = i7;
            this.f4859f.a(i7);
            this.h.a(Integer.valueOf(i7));
        }
    }

    public final void b() {
        float f10 = this.f4859f.f55505f;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
        Rect rect = this.f54163c;
        rect.set(org.telegram.messenger.g0.W1(f10 / 3.0f, org.telegram.messenger.g0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.W1((f10 + 1.0f) / 3.0f, org.telegram.messenger.g0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)), measuredHeight);
        int L = org.telegram.messenger.g0.L(this.f54162b * 7.0f);
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
    public final void F(float f10, int i7) {
    }
}
