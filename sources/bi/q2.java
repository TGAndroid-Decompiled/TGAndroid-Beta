package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.wr;
public final class q2 extends l2 {
    public final w1 f3442b;
    public final p2 f3443c;
    public final s4.s d;
    public final n2 e;
    public final x2 f3444f;
    public int h;
    public float f3445n;
    public boolean f3446r;
    public final f3 f3447s;

    public q2(f3 f3Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.f3447s = f3Var;
        this.h = 8;
        this.f3445n = -1.0f;
        this.f3446r = false;
        w1 w1Var = new w1(context);
        this.f3442b = w1Var;
        p2 p2Var = new p2(this);
        this.f3443c = p2Var;
        w1Var.setAdapter(p2Var);
        s4.s sVar = new s4.s(this.h);
        this.d = sVar;
        w1Var.setLayoutManager(sVar);
        w1Var.setClipToPadding(true);
        w1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new i2(this, 1);
        w1Var.setOnItemClickListener(new ai.g(this, 3));
        w1Var.setOnScrollListener(new a2(this, 1));
        s4.j jVar = new s4.j();
        jVar.f41691c = 220L;
        jVar.e = 220L;
        jVar.f41692f = 160L;
        jVar.f41693g = 160L;
        jVar.f41694i = wr.f28820g;
        w1Var.setItemAnimator(jVar);
        addView(w1Var, w7.a6.c(-1.0f, -1));
        f6Var = ((org.telegram.ui.ActionBar.h3) f3Var).resourcesProvider;
        x2 x2Var = new x2(context, f6Var);
        this.f3444f = x2Var;
        x2Var.v = new ai.c0(this, 3);
        addView(x2Var, w7.a6.e(-1, -2, 48));
        f6Var2 = ((org.telegram.ui.ActionBar.h3) f3Var).resourcesProvider;
        n2 n2Var = new n2(this, context, f6Var2);
        this.e = n2Var;
        addView(n2Var, w7.a6.c(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        int i12;
        this.f3035a = i10;
        int i13 = 0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3442b.Y2 = z10;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 5;
        }
        this.h = i11;
        this.d.y1(i11);
        boolean z11 = this.f3446r;
        p2 p2Var = this.f3443c;
        if (!z11) {
            p2Var.D(null);
        }
        f3 f3Var = this.f3447s;
        int i14 = f3Var.f2692c;
        x2 x2Var = this.f3444f;
        if (i14 >= 0) {
            x2Var.f3873r = true;
            x2Var.d.setText("");
            x2Var.f3873r = false;
            w2 w2Var = x2Var.f3871f;
            if (w2Var != null) {
                w2Var.D1(f3Var.f2692c);
                x2Var.f3871f.B1();
                if (x2Var.f3871f.getSelectedCategory() != null) {
                    p2Var.H = x2Var.f3871f.getSelectedCategory().f22495a;
                    a3.d dVar = p2Var.M;
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar);
                }
            }
        } else if (!TextUtils.isEmpty(f3Var.f2691b)) {
            x2Var.d.setText(f3Var.f2691b);
            w2 w2Var2 = x2Var.f3871f;
            if (w2Var2 != null) {
                w2Var2.E1(null);
                x2Var.f3871f.C1();
            }
            AndroidUtilities.cancelRunOnUIThread(p2Var.M);
            AndroidUtilities.runOnUIThread(p2Var.M);
        } else {
            x2Var.b();
        }
        x2Var.a(i10, f3Var.f2696s);
        i12 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
        if (i10 == 0) {
            i13 = 5;
        }
        mediaDataController.checkStickers(i13);
    }

    @Override
    public final float b() {
        float f7 = this.f3445n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            w1 w1Var = this.f3442b;
            if (i10 >= w1Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = w1Var.getChildAt(i10);
            Object tag = childAt.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return hc.b.g(102.0f, childAt.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f3444f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        w1 w1Var = this.f3442b;
        w1Var.Z2 = max + w1Var.getPaddingTop();
        w1Var.f3816a3 = w1Var.getHeight() - w1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f7;
        f3 f3Var = this.f3447s;
        i12 = ((org.telegram.ui.ActionBar.h3) f3Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.h3) f3Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f3444f.setTranslationY(AndroidUtilities.dp(52.0f));
        int dp = AndroidUtilities.dp(5.0f);
        int dp2 = AndroidUtilities.dp(102.0f);
        int dp3 = AndroidUtilities.dp(5.0f);
        int i14 = AndroidUtilities.navigationBarHeight;
        if (f3Var.f2695r) {
            f7 = 0.0f;
        } else {
            f7 = 40.0f;
        }
        this.f3442b.setPadding(dp, dp2, dp3, AndroidUtilities.dp(f7) + i14);
        super.onMeasure(i10, i11);
    }
}
