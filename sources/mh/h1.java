package mh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;
public final class h1 extends ch.c implements xd.b {
    public static final int f14153s = 0;
    public final xd.c f14154f;
    public final dg.h0 h;
    public final ch.b[] f14155n;
    public int f14156r;

    public h1(Context context, org.telegram.ui.ActionBar.g6 g6Var, dg.h0 h0Var) {
        super(context);
        this.f14154f = new xd.c(0, this, pr.h, 1600L);
        this.h = h0Var;
        int i10 = org.telegram.ui.ActionBar.k6.Wk;
        int l1 = org.telegram.ui.ActionBar.k6.l1(0.09411765f, org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        org.telegram.ui.ActionBar.k6.l1(0.1254902f, org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        this.f2533e.setColor(l1);
        this.f14155n = new ch.b[]{ch.b.b(context, g6Var, ch.a.D, R.string.GiftPreviewModels), ch.b.b(context, g6Var, ch.a.v, R.string.GiftPreviewBackdrops), ch.b.b(context, g6Var, ch.a.G, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            ch.b[] bVarArr = this.f14155n;
            if (i11 < bVarArr.length) {
                this.f2530a.addView(bVarArr[i11], k7.c6.l(1.0f, 0, -1));
                this.f14155n[i11].setOnClickListener(new x0(this, i11, 1));
                i11++;
            } else {
                bVarArr[0].e(true, false);
                return;
            }
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        b();
        invalidate();
    }

    public final void a(int i10) {
        int i11 = this.f14156r;
        if (i11 != i10) {
            ch.b[] bVarArr = this.f14155n;
            bVarArr[i11].e(false, true);
            bVarArr[i10].e(true, true);
            this.f14156r = i10;
            this.f14154f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f10 = this.f14154f.f50546e;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.f2532c;
        rect.set(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f10 / 3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f10 + 1.0f) / 3.0f), measuredHeight);
        int dp = AndroidUtilities.dp(this.f2531b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
        Math.abs(f10 - 1.0f);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
