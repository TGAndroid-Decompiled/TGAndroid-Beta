package nh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.jr;
public final class y1 extends u1 {
    public final n1 f18853b;
    public final x1 f18854c;
    public final f2.w d;
    public final w1 f18855e;
    public final d2 f18856f;
    public int h;
    public float f18857n;
    public boolean f18858r;
    public final k2 f18859s;

    public y1(k2 k2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.f18859s = k2Var;
        this.h = 8;
        this.f18857n = -1.0f;
        this.f18858r = false;
        n1 n1Var = new n1(context);
        this.f18853b = n1Var;
        x1 x1Var = new x1(this);
        this.f18854c = x1Var;
        n1Var.setAdapter(x1Var);
        f2.w wVar = new f2.w(this.h);
        this.d = wVar;
        n1Var.setLayoutManager(wVar);
        n1Var.setClipToPadding(true);
        n1Var.setVerticalScrollBarEnabled(false);
        wVar.O = new ih.n5(this, 3);
        n1Var.setOnItemClickListener(new bg.o(this, 15));
        n1Var.setOnScrollListener(new cg.g2(this, 14));
        f2.l lVar = new f2.l();
        lVar.f6486c = 220L;
        lVar.f6487e = 220L;
        lVar.f6488f = 160L;
        lVar.f6489g = 160L;
        lVar.f6490i = jr.f29801g;
        n1Var.setItemAnimator(lVar);
        addView(n1Var, i7.f6.c(-1.0f, -1));
        c6Var = ((org.telegram.ui.ActionBar.f3) k2Var).resourcesProvider;
        d2 d2Var = new d2(context, c6Var);
        this.f18856f = d2Var;
        d2Var.v = new bg.t1(this, 27);
        addView(d2Var, i7.f6.e(-1, -2, 48));
        c6Var2 = ((org.telegram.ui.ActionBar.f3) k2Var).resourcesProvider;
        w1 w1Var = new w1(this, context, c6Var2);
        this.f18855e = w1Var;
        addView(w1Var, i7.f6.c(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        int i12;
        this.f18712a = i10;
        int i13 = 0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18853b.U2 = z10;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 5;
        }
        this.h = i11;
        this.d.y1(i11);
        boolean z11 = this.f18858r;
        x1 x1Var = this.f18854c;
        if (!z11) {
            x1Var.D(null);
        }
        k2 k2Var = this.f18859s;
        int i14 = k2Var.f17991c;
        d2 d2Var = this.f18856f;
        if (i14 >= 0) {
            d2Var.f17526r = true;
            d2Var.d.setText("");
            d2Var.f17526r = false;
            c2 c2Var = d2Var.f17524f;
            if (c2Var != null) {
                c2Var.E1(k2Var.f17991c);
                d2Var.f17524f.C1();
                if (d2Var.f17524f.getSelectedCategory() != null) {
                    x1Var.D = d2Var.f17524f.getSelectedCategory().f30158a;
                    lh.m5 m5Var = x1Var.I;
                    AndroidUtilities.cancelRunOnUIThread(m5Var);
                    AndroidUtilities.runOnUIThread(m5Var);
                }
            }
        } else if (!TextUtils.isEmpty(k2Var.f17990b)) {
            d2Var.d.setText(k2Var.f17990b);
            c2 c2Var2 = d2Var.f17524f;
            if (c2Var2 != null) {
                c2Var2.F1(null);
                d2Var.f17524f.D1();
            }
            AndroidUtilities.cancelRunOnUIThread(x1Var.I);
            AndroidUtilities.runOnUIThread(x1Var.I);
        } else {
            d2Var.b();
        }
        d2Var.a(i10, k2Var.f17996s);
        i12 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
        if (i10 == 0) {
            i13 = 5;
        }
        mediaDataController.checkStickers(i13);
    }

    @Override
    public final float b() {
        float f9 = this.f18857n;
        if (f9 >= 0.0f) {
            return f9;
        }
        int i10 = 0;
        while (true) {
            n1 n1Var = this.f18853b;
            if (i10 >= n1Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = n1Var.getChildAt(i10);
            Object tag = childAt.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return j7.l1.d(102.0f, childAt.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.f18855e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f18856f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        n1 n1Var = this.f18853b;
        n1Var.V2 = max + n1Var.getPaddingTop();
        n1Var.W2 = n1Var.getHeight() - n1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f9;
        k2 k2Var = this.f18859s;
        i12 = ((org.telegram.ui.ActionBar.f3) k2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) k2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.f18855e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f18856f.setTranslationY(AndroidUtilities.dp(52.0f));
        int dp = AndroidUtilities.dp(5.0f);
        int dp2 = AndroidUtilities.dp(102.0f);
        int dp3 = AndroidUtilities.dp(5.0f);
        int i14 = AndroidUtilities.navigationBarHeight;
        if (k2Var.f17995r) {
            f9 = 0.0f;
        } else {
            f9 = 40.0f;
        }
        this.f18853b.setPadding(dp, dp2, dp3, AndroidUtilities.dp(f9) + i14);
        super.onMeasure(i10, i11);
    }
}
