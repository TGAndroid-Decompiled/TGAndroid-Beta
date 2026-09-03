package lh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mr;
public final class i1 extends bh.c implements xd.b {
    public static final int f12559s = 0;
    public final xd.c f12560f;
    public final cg.h0 h;
    public final bh.b[] f12561n;
    public int f12562r;

    public i1(Context context, org.telegram.ui.ActionBar.f6 f6Var, cg.h0 h0Var) {
        super(context);
        this.f12560f = new xd.c(0, this, mr.h, 1600L);
        this.h = h0Var;
        int i10 = org.telegram.ui.ActionBar.j6.Wk;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.09411765f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        org.telegram.ui.ActionBar.j6.l1(0.1254902f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.e.setColor(l1);
        this.f12561n = new bh.b[]{bh.b.b(context, f6Var, bh.a.D, R.string.GiftPreviewModels), bh.b.b(context, f6Var, bh.a.v, R.string.GiftPreviewBackdrops), bh.b.b(context, f6Var, bh.a.G, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            bh.b[] bVarArr = this.f12561n;
            if (i11 < bVarArr.length) {
                this.f1853a.addView(bVarArr[i11], k7.b6.l(1.0f, 0, -1));
                this.f12561n[i11].setOnClickListener(new y0(this, i11, 1));
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
        int i11 = this.f12562r;
        if (i11 != i10) {
            bh.b[] bVarArr = this.f12561n;
            bVarArr[i11].e(false, true);
            bVarArr[i10].e(true, true);
            this.f12562r = i10;
            this.f12560f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f10 = this.f12560f.e;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.f1855c;
        rect.set(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f10 / 3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f10 + 1.0f) / 3.0f), measuredHeight);
        int dp = AndroidUtilities.dp(this.f1854b * 7.0f);
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
