package ci;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.qr;
public final class e2 extends a2 {
    public final p1 f4585b;
    public final d2 f4586c;
    public final s4.s d;
    public final c2 e;
    public final l2 f4587f;
    public int h;
    public float f4588n;
    public boolean f4589r;
    public final t2 f4590s;

    public e2(t2 t2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        this.f4590s = t2Var;
        this.h = 8;
        this.f4588n = -1.0f;
        this.f4589r = false;
        p1 p1Var = new p1(context);
        this.f4585b = p1Var;
        d2 d2Var = new d2(this);
        this.f4586c = d2Var;
        p1Var.setAdapter(d2Var);
        s4.s sVar = new s4.s(this.h);
        this.d = sVar;
        p1Var.setLayoutManager(sVar);
        p1Var.setClipToPadding(true);
        p1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new x1(this, 1);
        p1Var.setOnItemClickListener(new ai.g(this, 4));
        p1Var.setOnScrollListener(new ai.r(this, 3));
        s4.j jVar = new s4.j();
        jVar.f42752c = 220L;
        jVar.e = 220L;
        jVar.f42753f = 160L;
        jVar.f42754g = 160L;
        jVar.f42755i = qr.f27421g;
        p1Var.setItemAnimator(jVar);
        addView(p1Var, w7.x5.c(-1.0f, -1));
        e6Var = ((org.telegram.ui.ActionBar.f3) t2Var).resourcesProvider;
        l2 l2Var = new l2(context, e6Var);
        this.f4587f = l2Var;
        l2Var.v = new bi.v(this, 3);
        addView(l2Var, w7.x5.e(-1, -2, 48));
        e6Var2 = ((org.telegram.ui.ActionBar.f3) t2Var).resourcesProvider;
        c2 c2Var = new c2(this, context, e6Var2);
        this.e = c2Var;
        addView(c2Var, w7.x5.c(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        int i12;
        this.f4343a = i10;
        int i13 = 0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4585b.Y2 = z10;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 5;
        }
        this.h = i11;
        this.d.y1(i11);
        boolean z11 = this.f4589r;
        d2 d2Var = this.f4586c;
        if (!z11) {
            d2Var.D(null);
        }
        t2 t2Var = this.f4590s;
        int i14 = t2Var.f5545c;
        l2 l2Var = this.f4587f;
        if (i14 >= 0) {
            l2Var.f4920r = true;
            l2Var.d.setText("");
            l2Var.f4920r = false;
            k2 k2Var = l2Var.f4918f;
            if (k2Var != null) {
                k2Var.E1(t2Var.f5545c);
                l2Var.f4918f.C1();
                if (l2Var.f4918f.getSelectedCategory() != null) {
                    d2Var.H = l2Var.f4918f.getSelectedCategory().f27980a;
                    androidx.fragment.app.a0 a0Var = d2Var.M;
                    AndroidUtilities.cancelRunOnUIThread(a0Var);
                    AndroidUtilities.runOnUIThread(a0Var);
                }
            }
        } else if (!TextUtils.isEmpty(t2Var.f5544b)) {
            l2Var.d.setText(t2Var.f5544b);
            k2 k2Var2 = l2Var.f4918f;
            if (k2Var2 != null) {
                k2Var2.F1(null);
                l2Var.f4918f.D1();
            }
            AndroidUtilities.cancelRunOnUIThread(d2Var.M);
            AndroidUtilities.runOnUIThread(d2Var.M);
        } else {
            l2Var.b();
        }
        l2Var.a(i10, t2Var.f5549s);
        i12 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
        if (i10 == 0) {
            i13 = 5;
        }
        mediaDataController.checkStickers(i13);
    }

    @Override
    public final float b() {
        float f7 = this.f4588n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            p1 p1Var = this.f4585b;
            if (i10 >= p1Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = p1Var.getChildAt(i10);
            Object tag = childAt.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return hg.c.f(102.0f, childAt.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f4587f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        p1 p1Var = this.f4585b;
        p1Var.Z2 = max + p1Var.getPaddingTop();
        p1Var.f5291a3 = p1Var.getHeight() - p1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f7;
        t2 t2Var = this.f4590s;
        i12 = ((org.telegram.ui.ActionBar.f3) t2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) t2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f4587f.setTranslationY(AndroidUtilities.dp(52.0f));
        int dp = AndroidUtilities.dp(5.0f);
        int dp2 = AndroidUtilities.dp(102.0f);
        int dp3 = AndroidUtilities.dp(5.0f);
        int i14 = AndroidUtilities.navigationBarHeight;
        if (t2Var.f5548r) {
            f7 = 0.0f;
        } else {
            f7 = 40.0f;
        }
        this.f4585b.setPadding(dp, dp2, dp3, AndroidUtilities.dp(f7) + i14);
        super.onMeasure(i10, i11);
    }
}
