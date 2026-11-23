package di;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.ui.Components.kr;
public final class g1 extends qh.c implements te.b {
    public static final int f8842w = 0;
    public final te.c f8843f;
    public final ai.d0 h;
    public final qh.b[] f8844n;
    public final org.telegram.ui.ActionBar.i6 f8845r;
    public int f8846s;

    public g1(Context context, org.telegram.ui.ActionBar.i6 i6Var, ai.d0 d0Var) {
        super(context);
        this.f8843f = new te.c(0, this, kr.h, 1600L);
        this.h = d0Var;
        this.f8845r = i6Var;
        int i7 = org.telegram.ui.ActionBar.n6.Nl;
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.09411765f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.n6.r1(0.1254902f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        this.f56293e.setColor(r12);
        this.f8844n = new qh.b[]{qh.b.c(context, i6Var, qh.a.H, 2131749452), qh.b.c(context, i6Var, qh.a.f56272w, 2131749469), qh.b.c(context, i6Var, qh.a.K, 2131749450)};
        int i10 = 0;
        while (true) {
            qh.b[] bVarArr = this.f8844n;
            if (i10 < bVarArr.length) {
                this.f56290a.addView(bVarArr[i10], c8.na.l(1.0f, 0, -1));
                this.f8844n[i10].setOnClickListener(new ci.q(this, i10, 2));
                i10++;
            } else {
                bVarArr[0].f(true, false);
                return;
            }
        }
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        b();
        invalidate();
    }

    public final void a(int i7) {
        int i10 = this.f8846s;
        if (i10 != i7) {
            qh.b[] bVarArr = this.f8844n;
            bVarArr[i10].f(false, true);
            bVarArr[i7].f(true, true);
            this.f8846s = i7;
            this.f8843f.a(i7);
            this.h.a(Integer.valueOf(i7));
        }
    }

    public final void b() {
        float f10 = this.f8843f.f57785f;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
        Rect rect = this.f56292c;
        rect.set(org.telegram.messenger.g0.W1(f10 / 3.0f, org.telegram.messenger.g0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.W1((f10 + 1.0f) / 3.0f, org.telegram.messenger.g0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)), measuredHeight);
        int L = org.telegram.messenger.g0.L(this.f56291b * 7.0f);
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
    public final void G(float f10, int i7) {
    }
}
