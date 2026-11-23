package di;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.ui.Components.nr;
public final class g1 extends qh.c implements te.b {
    public static final int f8843w = 0;
    public final te.c f8844f;
    public final ai.c0 h;
    public final qh.b[] f8845n;
    public final org.telegram.ui.ActionBar.h6 f8846r;
    public int f8847s;

    public g1(Context context, org.telegram.ui.ActionBar.h6 h6Var, ai.c0 c0Var) {
        super(context);
        this.f8844f = new te.c(0, this, nr.h, 1600L);
        this.h = c0Var;
        this.f8846r = h6Var;
        int i7 = org.telegram.ui.ActionBar.m6.Nl;
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.09411765f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.m6.r1(0.1254902f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.f56180e.setColor(r12);
        this.f8845n = new qh.b[]{qh.b.c(context, h6Var, qh.a.H, 2131749452), qh.b.c(context, h6Var, qh.a.f56159w, 2131749469), qh.b.c(context, h6Var, qh.a.K, 2131749450)};
        int i10 = 0;
        while (true) {
            qh.b[] bVarArr = this.f8845n;
            if (i10 < bVarArr.length) {
                this.f56177a.addView(bVarArr[i10], c8.na.l(1.0f, 0, -1));
                this.f8845n[i10].setOnClickListener(new ci.q(this, i10, 2));
                i10++;
            } else {
                bVarArr[0].f(true, false);
                return;
            }
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        b();
        invalidate();
    }

    public final void a(int i7) {
        int i10 = this.f8847s;
        if (i10 != i7) {
            qh.b[] bVarArr = this.f8845n;
            bVarArr[i10].f(false, true);
            bVarArr[i7].f(true, true);
            this.f8847s = i7;
            this.f8844f.a(i7);
            this.h.a(Integer.valueOf(i7));
        }
    }

    public final void b() {
        float f10 = this.f8844f.f57671f;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
        Rect rect = this.f56179c;
        rect.set(org.telegram.messenger.g0.W1(f10 / 3.0f, org.telegram.messenger.g0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.W1((f10 + 1.0f) / 3.0f, org.telegram.messenger.g0.L(8.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)), measuredHeight);
        int L = org.telegram.messenger.g0.L(this.f56178b * 7.0f);
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
    public final void D(float f10, int i7) {
    }
}
