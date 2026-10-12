package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.es;
public final class d2 extends z1 {
    public final o1 f6780b;
    public final c2 f6781c;
    public final s4.s d;
    public final b2 e;
    public final k2 f6782f;
    public int h;
    public float f6783n;
    public boolean f6784r;
    public final r2 f6785s;

    public d2(r2 r2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.f6785s = r2Var;
        this.h = 8;
        this.f6783n = -1.0f;
        this.f6784r = false;
        o1 o1Var = new o1(context);
        this.f6780b = o1Var;
        c2 c2Var = new c2(this);
        this.f6781c = c2Var;
        o1Var.setAdapter(c2Var);
        s4.s sVar = new s4.s(this.h);
        this.d = sVar;
        o1Var.setLayoutManager(sVar);
        o1Var.setClipToPadding(true);
        o1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new w1(this, 1);
        o1Var.setOnItemClickListener(new bi.d(this, 4));
        o1Var.setOnScrollListener(new ah.d0(this, 3));
        s4.k kVar = new s4.k();
        kVar.f44917c = 220L;
        kVar.e = 220L;
        kVar.f44918f = 160L;
        kVar.f44919g = 160L;
        kVar.f44920i = es.f24772g;
        o1Var.setItemAnimator(kVar);
        addView(o1Var, w7.a6.d(-1.0f, -1));
        c6Var = ((org.telegram.ui.ActionBar.e3) r2Var).resourcesProvider;
        k2 k2Var = new k2(context, c6Var);
        this.f6782f = k2Var;
        k2Var.v = new ci.u(this, 3);
        addView(k2Var, w7.a6.e(-1, -2, 48));
        c6Var2 = ((org.telegram.ui.ActionBar.e3) r2Var).resourcesProvider;
        b2 b2Var = new b2(this, context, c6Var2);
        this.e = b2Var;
        addView(b2Var, w7.a6.d(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        int i12;
        this.f8175a = i10;
        int i13 = 0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6780b.W2 = z10;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 5;
        }
        this.h = i11;
        this.d.y1(i11);
        boolean z11 = this.f6784r;
        c2 c2Var = this.f6781c;
        if (!z11) {
            c2Var.D(null);
        }
        r2 r2Var = this.f6785s;
        int i14 = r2Var.f7689c;
        k2 k2Var = this.f6782f;
        if (i14 >= 0) {
            k2Var.f7160r = true;
            k2Var.d.setText("");
            k2Var.f7160r = false;
            j2 j2Var = k2Var.f7158f;
            if (j2Var != null) {
                j2Var.F1(r2Var.f7689c);
                k2Var.f7158f.D1();
                if (k2Var.f7158f.getSelectedCategory() != null) {
                    c2Var.H = k2Var.f7158f.getSelectedCategory().f28689a;
                    bi.la laVar = c2Var.M;
                    AndroidUtilities.cancelRunOnUIThread(laVar);
                    AndroidUtilities.runOnUIThread(laVar);
                }
            }
        } else if (!TextUtils.isEmpty(r2Var.f7688b)) {
            k2Var.d.setText(r2Var.f7688b);
            j2 j2Var2 = k2Var.f7158f;
            if (j2Var2 != null) {
                j2Var2.G1(null);
                k2Var.f7158f.E1();
            }
            AndroidUtilities.cancelRunOnUIThread(c2Var.M);
            AndroidUtilities.runOnUIThread(c2Var.M);
        } else {
            k2Var.b();
        }
        k2Var.a(i10, r2Var.f7693s);
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
        float f7 = this.f6783n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            o1 o1Var = this.f6780b;
            if (i10 >= o1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = o1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return org.telegram.messenger.q.c(102.0f, childAt.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f6782f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        o1 o1Var = this.f6780b;
        o1Var.X2 = max + o1Var.getPaddingTop();
        o1Var.Y2 = o1Var.getHeight() - o1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f7;
        r2 r2Var = this.f6785s;
        i12 = ((org.telegram.ui.ActionBar.e3) r2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.e3) r2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f6782f.setTranslationY(AndroidUtilities.dp(52.0f));
        int dp = AndroidUtilities.dp(5.0f);
        int dp2 = AndroidUtilities.dp(102.0f);
        int dp3 = AndroidUtilities.dp(5.0f);
        int i14 = AndroidUtilities.navigationBarHeight;
        if (r2Var.f7692r) {
            f7 = 0.0f;
        } else {
            f7 = 40.0f;
        }
        this.f6780b.setPadding(dp, dp2, dp3, AndroidUtilities.dp(f7) + i14);
        super.onMeasure(i10, i11);
    }
}
