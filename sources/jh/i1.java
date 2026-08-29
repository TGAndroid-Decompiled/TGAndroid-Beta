package jh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jr;
public final class i1 extends zg.c implements vd.b {
    public static final int f12232s = 0;
    public final vd.c f12233f;
    public final ag.i0 h;
    public final zg.b[] f12234n;
    public int f12235r;

    public i1(Context context, org.telegram.ui.ActionBar.c6 c6Var, ag.i0 i0Var) {
        super(context);
        this.f12233f = new vd.c(0, this, jr.h, 1600L);
        this.h = i0Var;
        int i10 = org.telegram.ui.ActionBar.g6.Wk;
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.09411765f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        org.telegram.ui.ActionBar.g6.l1(0.1254902f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.f50873e.setColor(l1);
        this.f12234n = new zg.b[]{zg.b.b(context, c6Var, zg.a.C, R.string.GiftPreviewModels), zg.b.b(context, c6Var, zg.a.v, R.string.GiftPreviewBackdrops), zg.b.b(context, c6Var, zg.a.F, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            zg.b[] bVarArr = this.f12234n;
            if (i11 < bVarArr.length) {
                this.f50870a.addView(bVarArr[i11], i7.f6.l(1.0f, 0, -1));
                this.f12234n[i11].setOnClickListener(new y0(this, i11, 1));
                i11++;
            } else {
                bVarArr[0].e(true, false);
                return;
            }
        }
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        b();
        invalidate();
    }

    public final void a(int i10) {
        int i11 = this.f12235r;
        if (i11 != i10) {
            zg.b[] bVarArr = this.f12234n;
            bVarArr[i11].e(false, true);
            bVarArr[i10].e(true, true);
            this.f12235r = i10;
            this.f12233f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f9 = this.f12233f.f49510e;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.f50872c;
        rect.set(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f9 / 3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f9 + 1.0f) / 3.0f), measuredHeight);
        int dp = AndroidUtilities.dp(this.f50871b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
        Math.abs(f9 - 1.0f);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
