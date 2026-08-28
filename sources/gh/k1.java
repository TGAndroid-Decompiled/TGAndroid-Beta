package gh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr;
public final class k1 extends wg.c implements td.b {
    public static final int f8382s = 0;
    public final td.c f8383f;
    public final bg.i h;
    public final wg.b[] f8384n;
    public int f8385r;

    public k1(Context context, org.telegram.ui.ActionBar.b6 b6Var, bg.i iVar) {
        super(context);
        this.f8383f = new td.c(0, this, gr.h, 1600L);
        this.h = iVar;
        int i9 = org.telegram.ui.ActionBar.f6.Wk;
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.09411765f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        org.telegram.ui.ActionBar.f6.l1(0.1254902f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        this.f48842e.setColor(l1);
        this.f8384n = new wg.b[]{wg.b.b(context, b6Var, wg.a.C, R.string.GiftPreviewModels), wg.b.b(context, b6Var, wg.a.v, R.string.GiftPreviewBackdrops), wg.b.b(context, b6Var, wg.a.F, R.string.GiftPreviewSymbols)};
        int i10 = 0;
        while (true) {
            wg.b[] bVarArr = this.f8384n;
            if (i10 < bVarArr.length) {
                this.f48839a.addView(bVarArr[i10], g7.e6.l(1.0f, 0, -1));
                this.f8384n[i10].setOnClickListener(new z0(this, i10, 1));
                i10++;
            } else {
                bVarArr[0].e(true, false);
                return;
            }
        }
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        b();
        invalidate();
    }

    public final void a(int i9) {
        int i10 = this.f8385r;
        if (i10 != i9) {
            wg.b[] bVarArr = this.f8384n;
            bVarArr[i10].e(false, true);
            bVarArr[i9].e(true, true);
            this.f8385r = i9;
            this.f8383f.a(i9);
            this.h.run(Integer.valueOf(i9));
        }
    }

    public final void b() {
        float f10 = this.f8383f.f47780e;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.f48841c;
        rect.set(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f10 / 3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f10 + 1.0f) / 3.0f), measuredHeight);
        int dp = AndroidUtilities.dp(this.f48840b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i9 = -dp;
        rect2.inset(i9, i9);
        Math.abs(f10 - 1.0f);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        b();
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
