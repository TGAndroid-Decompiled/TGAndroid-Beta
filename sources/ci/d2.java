package ci;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.js;
public final class d2 extends z1 {
    public final o1 f4893b;
    public final c2 f4894c;
    public final s4.s d;
    public final b2 f4895e;
    public final k2 f4896f;
    public int h;
    public float f4897n;
    public boolean f4898r;
    public final r2 f4899s;

    public d2(r2 r2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.f4899s = r2Var;
        this.h = 8;
        this.f4897n = -1.0f;
        this.f4898r = false;
        o1 o1Var = new o1(context);
        this.f4893b = o1Var;
        c2 c2Var = new c2(this);
        this.f4894c = c2Var;
        o1Var.setAdapter(c2Var);
        s4.s sVar = new s4.s(this.h);
        this.d = sVar;
        o1Var.setLayoutManager(sVar);
        o1Var.setClipToPadding(true);
        o1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new w1(this, 1);
        o1Var.setOnItemClickListener(new ai.g(this, 4));
        o1Var.setOnScrollListener(new ai.r(this, 2));
        s4.j jVar = new s4.j();
        jVar.f47981c = 220L;
        jVar.f47982e = 220L;
        jVar.f47983f = 160L;
        jVar.f47984g = 160L;
        jVar.f47985i = js.f27628g;
        o1Var.setItemAnimator(jVar);
        addView(o1Var, w7.w5.d(-1.0f, -1));
        c6Var = ((org.telegram.ui.ActionBar.e3) r2Var).resourcesProvider;
        k2 k2Var = new k2(context, c6Var);
        this.f4896f = k2Var;
        k2Var.v = new bi.v(this, 3);
        addView(k2Var, w7.w5.e(-1, -2, 48));
        c6Var2 = ((org.telegram.ui.ActionBar.e3) r2Var).resourcesProvider;
        b2 b2Var = new b2(this, context, c6Var2);
        this.f4895e = b2Var;
        addView(b2Var, w7.w5.d(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        int i12;
        this.f6413a = i10;
        int i13 = 0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4893b.W2 = z10;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 5;
        }
        this.h = i11;
        this.d.y1(i11);
        boolean z11 = this.f4898r;
        c2 c2Var = this.f4894c;
        if (!z11) {
            c2Var.D(null);
        }
        r2 r2Var = this.f4899s;
        int i14 = r2Var.f5881c;
        k2 k2Var = this.f4896f;
        if (i14 >= 0) {
            k2Var.f5310r = true;
            k2Var.d.setText("");
            k2Var.f5310r = false;
            j2 j2Var = k2Var.f5308f;
            if (j2Var != null) {
                j2Var.F1(r2Var.f5881c);
                k2Var.f5308f.D1();
                if (k2Var.f5308f.getSelectedCategory() != null) {
                    c2Var.H = k2Var.f5308f.getSelectedCategory().f24507a;
                    androidx.fragment.app.a0 a0Var = c2Var.M;
                    AndroidUtilities.cancelRunOnUIThread(a0Var);
                    AndroidUtilities.runOnUIThread(a0Var);
                }
            }
        } else if (!TextUtils.isEmpty(r2Var.f5880b)) {
            k2Var.d.setText(r2Var.f5880b);
            j2 j2Var2 = k2Var.f5308f;
            if (j2Var2 != null) {
                j2Var2.G1(null);
                k2Var.f5308f.E1();
            }
            AndroidUtilities.cancelRunOnUIThread(c2Var.M);
            AndroidUtilities.runOnUIThread(c2Var.M);
        } else {
            k2Var.b();
        }
        k2Var.a(i10, r2Var.f5886s);
        i12 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
        if (i10 == 0) {
            i13 = 5;
        }
        mediaDataController.checkStickers(i13);
    }

    @Override
    public final float b() {
        View childAt;
        float f7 = this.f4897n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            o1 o1Var = this.f4893b;
            if (i10 >= o1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = o1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return hg.c.f(102.0f, childAt.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.f4895e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f4896f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        o1 o1Var = this.f4893b;
        o1Var.X2 = max + o1Var.getPaddingTop();
        o1Var.Y2 = o1Var.getHeight() - o1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f7;
        r2 r2Var = this.f4899s;
        i12 = ((org.telegram.ui.ActionBar.e3) r2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.e3) r2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.f4895e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f4896f.setTranslationY(AndroidUtilities.dp(52.0f));
        int dp = AndroidUtilities.dp(5.0f);
        int dp2 = AndroidUtilities.dp(102.0f);
        int dp3 = AndroidUtilities.dp(5.0f);
        int i14 = AndroidUtilities.navigationBarHeight;
        if (r2Var.f5885r) {
            f7 = 0.0f;
        } else {
            f7 = 40.0f;
        }
        this.f4893b.setPadding(dp, dp2, dp3, AndroidUtilities.dp(f7) + i14);
        super.onMeasure(i10, i11);
    }
}
