package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.pr;
public final class e2 extends a2 {
    public final p1 f7182b;
    public final d2 f7183c;
    public final s4.s d;
    public final c2 f7184e;
    public final l2 f7185f;
    public int h;
    public float f7186n;
    public boolean f7187r;
    public final t2 f7188s;

    public e2(t2 t2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.f7188s = t2Var;
        this.h = 8;
        this.f7186n = -1.0f;
        this.f7187r = false;
        p1 p1Var = new p1(context);
        this.f7182b = p1Var;
        d2 d2Var = new d2(this);
        this.f7183c = d2Var;
        p1Var.setAdapter(d2Var);
        s4.s sVar = new s4.s(this.h);
        this.d = sVar;
        p1Var.setLayoutManager(sVar);
        p1Var.setClipToPadding(true);
        p1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new x1(this, 1);
        p1Var.setOnItemClickListener(new bi.d(this, 4));
        p1Var.setOnScrollListener(new ah.e0(this, 4));
        s4.j jVar = new s4.j();
        jVar.f45856c = 220L;
        jVar.f45857e = 220L;
        jVar.f45858f = 160L;
        jVar.f45859g = 160L;
        jVar.f45860i = pr.f29494g;
        p1Var.setItemAnimator(jVar);
        addView(p1Var, w7.x5.c(-1.0f, -1));
        f6Var = ((org.telegram.ui.ActionBar.f3) t2Var).resourcesProvider;
        l2 l2Var = new l2(context, f6Var);
        this.f7185f = l2Var;
        l2Var.v = new ci.u(this, 3);
        addView(l2Var, w7.x5.e(-1, -2, 48));
        f6Var2 = ((org.telegram.ui.ActionBar.f3) t2Var).resourcesProvider;
        c2 c2Var = new c2(this, context, f6Var2);
        this.f7184e = c2Var;
        addView(c2Var, w7.x5.c(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        int i12;
        this.f6926a = i10;
        int i13 = 0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7182b.Y2 = z10;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 5;
        }
        this.h = i11;
        this.d.y1(i11);
        boolean z11 = this.f7187r;
        d2 d2Var = this.f7183c;
        if (!z11) {
            d2Var.D(null);
        }
        t2 t2Var = this.f7188s;
        int i14 = t2Var.f8196c;
        l2 l2Var = this.f7185f;
        if (i14 >= 0) {
            l2Var.f7544r = true;
            l2Var.d.setText("");
            l2Var.f7544r = false;
            k2 k2Var = l2Var.f7542f;
            if (k2Var != null) {
                k2Var.D1(t2Var.f8196c);
                l2Var.f7542f.B1();
                if (l2Var.f7542f.getSelectedCategory() != null) {
                    d2Var.H = l2Var.f7542f.getSelectedCategory().f30132a;
                    bi.oa oaVar = d2Var.M;
                    AndroidUtilities.cancelRunOnUIThread(oaVar);
                    AndroidUtilities.runOnUIThread(oaVar);
                }
            }
        } else if (!TextUtils.isEmpty(t2Var.f8195b)) {
            l2Var.d.setText(t2Var.f8195b);
            k2 k2Var2 = l2Var.f7542f;
            if (k2Var2 != null) {
                k2Var2.E1(null);
                l2Var.f7542f.C1();
            }
            AndroidUtilities.cancelRunOnUIThread(d2Var.M);
            AndroidUtilities.runOnUIThread(d2Var.M);
        } else {
            l2Var.b();
        }
        l2Var.a(i10, t2Var.f8201s);
        i12 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
        if (i10 == 0) {
            i13 = 5;
        }
        mediaDataController.checkStickers(i13);
    }

    @Override
    public final float b() {
        float f7 = this.f7186n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            p1 p1Var = this.f7182b;
            if (i10 >= p1Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = p1Var.getChildAt(i10);
            Object tag = childAt.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return i2.g.f(102.0f, childAt.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.f7184e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f7185f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        p1 p1Var = this.f7182b;
        p1Var.Z2 = max + p1Var.getPaddingTop();
        p1Var.f7841a3 = p1Var.getHeight() - p1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f7;
        t2 t2Var = this.f7188s;
        i12 = ((org.telegram.ui.ActionBar.f3) t2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) t2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.f7184e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f7185f.setTranslationY(AndroidUtilities.dp(52.0f));
        int dp = AndroidUtilities.dp(5.0f);
        int dp2 = AndroidUtilities.dp(102.0f);
        int dp3 = AndroidUtilities.dp(5.0f);
        int i14 = AndroidUtilities.navigationBarHeight;
        if (t2Var.f8200r) {
            f7 = 0.0f;
        } else {
            f7 = 40.0f;
        }
        this.f7182b.setPadding(dp, dp2, dp3, AndroidUtilities.dp(f7) + i14);
        super.onMeasure(i10, i11);
    }
}
