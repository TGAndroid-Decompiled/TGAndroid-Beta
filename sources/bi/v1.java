package bi;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.ui.Components.xq;
public final class v1 extends qh.c implements te.b {
    public static final int f4860w = 0;
    public final te.c f4861f;
    public final ai.i h;
    public final qh.b[] f4862n;
    public final org.telegram.ui.ActionBar.f6 f4863r;
    public int f4864s;

    public v1(Context context, org.telegram.ui.ActionBar.f6 f6Var, ai.i iVar) {
        super(context);
        this.f4861f = new te.c(0, this, xq.h, 1600L);
        this.h = iVar;
        this.f4863r = f6Var;
        int i7 = org.telegram.ui.ActionBar.k6.Kl;
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.09411765f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        org.telegram.ui.ActionBar.k6.r1(0.1254902f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.f54152e.setColor(r12);
        this.f4862n = new qh.b[]{qh.b.c(context, f6Var, qh.a.G, 2131749626), qh.b.c(context, f6Var, qh.a.f54131w, 2131749643), qh.b.c(context, f6Var, qh.a.J, 2131749624)};
        int i10 = 0;
        while (true) {
            qh.b[] bVarArr = this.f4862n;
            if (i10 < bVarArr.length) {
                this.f54149a.addView(bVarArr[i10], c8.ha.l(1.0f, 0, -1));
                this.f4862n[i10].setOnClickListener(new ai.v(this, i10, 2));
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
        int i10 = this.f4864s;
        if (i10 != i7) {
            qh.b[] bVarArr = this.f4862n;
            bVarArr[i10].f(false, true);
            bVarArr[i7].f(true, true);
            this.f4864s = i7;
            this.f4861f.a(i7);
            this.h.a(Integer.valueOf(i7));
        }
    }

    public final void b() {
        float f10 = this.f4861f.f55493f;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
        Rect rect = this.f54151c;
        rect.set(org.telegram.messenger.g0.W1(f10 / 3.0f, org.telegram.messenger.g0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.W1((f10 + 1.0f) / 3.0f, org.telegram.messenger.g0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)), measuredHeight);
        int L = org.telegram.messenger.g0.L(this.f54150b * 7.0f);
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
