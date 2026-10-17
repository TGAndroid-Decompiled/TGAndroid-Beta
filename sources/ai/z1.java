package ai;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bs;
public final class z1 extends ph.c implements ne.d {
    public static final int f2511s = 0;
    public final ne.e f2512f;
    public final r0 h;
    public final ph.b[] f2513n;
    public int f2514r;

    public z1(Context context, org.telegram.ui.ActionBar.d6 d6Var, r0 r0Var) {
        super(context);
        this.f2512f = new ne.e(0, this, bs.h, 1600L);
        this.h = r0Var;
        int i10 = org.telegram.ui.ActionBar.h6.Wk;
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.09411765f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        org.telegram.ui.ActionBar.h6.m1(0.1254902f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        this.e.setColor(m12);
        this.f2513n = new ph.b[]{ph.b.b(context, d6Var, ph.a.G, R.string.GiftPreviewModels), ph.b.b(context, d6Var, ph.a.v, R.string.GiftPreviewBackdrops), ph.b.b(context, d6Var, ph.a.J, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            ph.b[] bVarArr = this.f2513n;
            if (i11 < bVarArr.length) {
                this.f44337a.addView(bVarArr[i11], w7.z5.l(1.0f, 0, -1));
                this.f2513n[i11].setOnClickListener(new n1(this, i11, 1));
                i11++;
            } else {
                bVarArr[0].e(true, false);
                return;
            }
        }
    }

    public final void a(int i10) {
        int i11 = this.f2514r;
        if (i11 != i10) {
            ph.b[] bVarArr = this.f2513n;
            bVarArr[i11].e(false, true);
            bVarArr[i10].e(true, true);
            this.f2514r = i10;
            this.f2512f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f7 = this.f2512f.e;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.f44339c;
        rect.set(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f7 / 3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f7 + 1.0f) / 3.0f), measuredHeight);
        int dp = AndroidUtilities.dp(this.f44338b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
        Math.abs(f7 - 1.0f);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        b();
        invalidate();
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
