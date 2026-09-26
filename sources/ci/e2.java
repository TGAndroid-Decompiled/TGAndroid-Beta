package ci;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.rr;
public final class e2 extends a2 {
    public final p1 f4594b;
    public final d2 f4595c;
    public final s4.s d;
    public final c2 e;
    public final l2 f4596f;
    public int h;
    public float f4597n;
    public boolean f4598r;
    public final s2 f4599s;

    public e2(s2 s2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.f4599s = s2Var;
        this.h = 8;
        this.f4597n = -1.0f;
        this.f4598r = false;
        p1 p1Var = new p1(context);
        this.f4594b = p1Var;
        d2 d2Var = new d2(this);
        this.f4595c = d2Var;
        p1Var.setAdapter(d2Var);
        s4.s sVar = new s4.s(this.h);
        this.d = sVar;
        p1Var.setLayoutManager(sVar);
        p1Var.setClipToPadding(true);
        p1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new x1(this, 1);
        p1Var.setOnItemClickListener(new ai.g(this, 4));
        p1Var.setOnScrollListener(new ai.r(this, 2));
        s4.j jVar = new s4.j();
        jVar.f43041c = 220L;
        jVar.e = 220L;
        jVar.f43042f = 160L;
        jVar.f43043g = 160L;
        jVar.f43044i = rr.f28031g;
        p1Var.setItemAnimator(jVar);
        addView(p1Var, w7.y5.c(-1.0f, -1));
        d6Var = ((org.telegram.ui.ActionBar.e3) s2Var).resourcesProvider;
        l2 l2Var = new l2(context, d6Var);
        this.f4596f = l2Var;
        l2Var.v = new bi.v(this, 3);
        addView(l2Var, w7.y5.e(-1, -2, 48));
        d6Var2 = ((org.telegram.ui.ActionBar.e3) s2Var).resourcesProvider;
        c2 c2Var = new c2(this, context, d6Var2);
        this.e = c2Var;
        addView(c2Var, w7.y5.c(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        int i12;
        this.f4338a = i10;
        int i13 = 0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4594b.Y2 = z10;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 5;
        }
        this.h = i11;
        this.d.y1(i11);
        boolean z11 = this.f4598r;
        d2 d2Var = this.f4595c;
        if (!z11) {
            d2Var.D(null);
        }
        s2 s2Var = this.f4599s;
        int i14 = s2Var.f5473c;
        l2 l2Var = this.f4596f;
        if (i14 >= 0) {
            l2Var.f4952r = true;
            l2Var.d.setText("");
            l2Var.f4952r = false;
            k2 k2Var = l2Var.f4950f;
            if (k2Var != null) {
                k2Var.E1(s2Var.f5473c);
                l2Var.f4950f.C1();
                if (l2Var.f4950f.getSelectedCategory() != null) {
                    d2Var.H = l2Var.f4950f.getSelectedCategory().f23408a;
                    androidx.fragment.app.a0 a0Var = d2Var.M;
                    AndroidUtilities.cancelRunOnUIThread(a0Var);
                    AndroidUtilities.runOnUIThread(a0Var);
                }
            }
        } else if (!TextUtils.isEmpty(s2Var.f5472b)) {
            l2Var.d.setText(s2Var.f5472b);
            k2 k2Var2 = l2Var.f4950f;
            if (k2Var2 != null) {
                k2Var2.F1(null);
                l2Var.f4950f.D1();
            }
            AndroidUtilities.cancelRunOnUIThread(d2Var.M);
            AndroidUtilities.runOnUIThread(d2Var.M);
        } else {
            l2Var.b();
        }
        l2Var.a(i10, s2Var.f5477s);
        i12 = ((org.telegram.ui.ActionBar.e3) s2Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
        if (i10 == 0) {
            i13 = 5;
        }
        mediaDataController.checkStickers(i13);
    }

    @Override
    public final float b() {
        float f7 = this.f4597n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            p1 p1Var = this.f4594b;
            if (i10 >= p1Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = p1Var.getChildAt(i10);
            Object tag = childAt.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return org.telegram.messenger.f0.b(102.0f, childAt.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f4596f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        p1 p1Var = this.f4594b;
        p1Var.Z2 = max + p1Var.getPaddingTop();
        p1Var.f5276a3 = p1Var.getHeight() - p1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f7;
        s2 s2Var = this.f4599s;
        i12 = ((org.telegram.ui.ActionBar.e3) s2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.e3) s2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f4596f.setTranslationY(AndroidUtilities.dp(52.0f));
        int dp = AndroidUtilities.dp(5.0f);
        int dp2 = AndroidUtilities.dp(102.0f);
        int dp3 = AndroidUtilities.dp(5.0f);
        int i14 = AndroidUtilities.navigationBarHeight;
        if (s2Var.f5476r) {
            f7 = 0.0f;
        } else {
            f7 = 40.0f;
        }
        this.f4594b.setPadding(dp, dp2, dp3, AndroidUtilities.dp(f7) + i14);
        super.onMeasure(i10, i11);
    }
}
