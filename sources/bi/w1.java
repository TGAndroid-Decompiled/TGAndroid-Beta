package bi;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
public final class w1 extends qh.c implements oe.d {
    public static final int v = 0;
    public final oe.e f5590f;
    public final ai.i h;
    public final qh.b[] f5591n;
    public final org.telegram.ui.ActionBar.u6 f5592r;
    public int f5593s;

    public w1(Context context, org.telegram.ui.ActionBar.u6 u6Var, ai.i iVar) {
        super(context);
        this.f5590f = new oe.e(0, this, ds.h, 1600L);
        this.h = iVar;
        this.f5592r = u6Var;
        int i10 = org.telegram.ui.ActionBar.y6.Wk;
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.09411765f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        org.telegram.ui.ActionBar.y6.o1(0.1254902f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.e.setColor(o12);
        this.f5591n = new qh.b[]{qh.b.c(context, u6Var, qh.a.G, R.string.GiftPreviewModels), qh.b.c(context, u6Var, qh.a.v, R.string.GiftPreviewBackdrops), qh.b.c(context, u6Var, qh.a.J, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = this.f5591n;
            if (i11 < bVarArr.length) {
                this.f47099a.addView(bVarArr[i11], kb1.p(1.0f, 0, -1));
                this.f5591n[i11].setOnClickListener(new ai.w(this, i11, 2));
                i11++;
            } else {
                bVarArr[0].f(true, false);
                return;
            }
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        b();
        invalidate();
    }

    public final void a(int i10) {
        int i11 = this.f5593s;
        if (i11 != i10) {
            qh.b[] bVarArr = this.f5591n;
            bVarArr[i11].f(false, true);
            bVarArr[i10].f(true, true);
            this.f5593s = i10;
            this.f5590f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f7 = this.f5590f.f19333f;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.f47101c;
        rect.set(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f7 / 3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f7 + 1.0f) / 3.0f), measuredHeight);
        int dp = AndroidUtilities.dp(this.f47100b * 7.0f);
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
    public final void z(float f7, int i10) {
    }
}
