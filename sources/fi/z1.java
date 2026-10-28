package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
public final class z1 extends v1 {
    public final n1 f12049b;
    public final y1 f12050c;
    public final s4.t d;
    public final x1 e;
    public final f2 f12051f;
    public int h;
    public float f12052n;
    public boolean f12053r;
    public final l2 f12054s;

    public z1(l2 l2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        this.f12054s = l2Var;
        this.h = 8;
        this.f12052n = -1.0f;
        this.f12053r = false;
        n1 n1Var = new n1(context);
        this.f12049b = n1Var;
        y1 y1Var = new y1(this);
        this.f12050c = y1Var;
        n1Var.setAdapter(y1Var);
        s4.t tVar = new s4.t(this.h);
        this.d = tVar;
        n1Var.setLayoutManager(tVar);
        n1Var.setClipToPadding(true);
        n1Var.setVerticalScrollBarEnabled(false);
        tVar.O = new ai.l(this, 3);
        n1Var.setOnItemClickListener(new ai.k(this, 9));
        n1Var.setOnScrollListener(new ai.b(this, 10));
        s4.l lVar = new s4.l();
        lVar.f47838c = 220L;
        lVar.e = 220L;
        lVar.f47839f = 160L;
        lVar.f47840g = 160L;
        lVar.f47841i = ds.f27531g;
        n1Var.setItemAnimator(lVar);
        addView(n1Var, kb1.g(-1.0f, -1));
        u6Var = ((org.telegram.ui.ActionBar.k3) l2Var).resourcesProvider;
        f2 f2Var = new f2(context, u6Var);
        this.f12051f = f2Var;
        f2Var.f10857w = new ai.e(this, 17);
        addView(f2Var, kb1.i(-1, -2, 48));
        u6Var2 = ((org.telegram.ui.ActionBar.k3) l2Var).resourcesProvider;
        x1 x1Var = new x1(this, context, u6Var2);
        this.e = x1Var;
        addView(x1Var, kb1.g(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        int i12;
        this.f11779a = i10;
        int i13 = 0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12049b.f11280g3 = z10;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 5;
        }
        this.h = i11;
        this.d.z1(i11);
        boolean z11 = this.f12053r;
        y1 y1Var = this.f12050c;
        if (!z11) {
            y1Var.D(null);
        }
        l2 l2Var = this.f12054s;
        int i14 = l2Var.f11156c;
        f2 f2Var = this.f12051f;
        if (i14 >= 0) {
            f2Var.f10856s = true;
            f2Var.e.setText("");
            f2Var.f10856s = false;
            e2 e2Var = f2Var.h;
            if (e2Var != null) {
                e2Var.K1(l2Var.f11156c);
                f2Var.h.I1();
                if (f2Var.h.getSelectedCategory() != null) {
                    y1Var.H = f2Var.h.getSelectedCategory().f35182a;
                    di.s8 s8Var = y1Var.M;
                    AndroidUtilities.cancelRunOnUIThread(s8Var);
                    AndroidUtilities.runOnUIThread(s8Var);
                }
            }
        } else if (!TextUtils.isEmpty(l2Var.f11155b)) {
            f2Var.e.setText(l2Var.f11155b);
            e2 e2Var2 = f2Var.h;
            if (e2Var2 != null) {
                e2Var2.L1(null);
                f2Var.h.J1();
            }
            AndroidUtilities.cancelRunOnUIThread(y1Var.M);
            AndroidUtilities.runOnUIThread(y1Var.M);
        } else {
            f2Var.b();
        }
        f2Var.a(i10, l2Var.f11160s);
        i12 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
        if (i10 == 0) {
            i13 = 5;
        }
        mediaDataController.checkStickers(i13);
    }

    @Override
    public final float b() {
        View childAt;
        float f7 = this.f12052n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            n1 n1Var = this.f12049b;
            if (i10 >= n1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = n1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return org.telegram.messenger.t.c(102.0f, childAt.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f12051f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        n1 n1Var = this.f12049b;
        n1Var.f11281h3 = max + n1Var.getPaddingTop();
        n1Var.f11282i3 = n1Var.getHeight() - n1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f7;
        l2 l2Var = this.f12054s;
        i12 = ((org.telegram.ui.ActionBar.k3) l2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.k3) l2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f12051f.setTranslationY(AndroidUtilities.dp(52.0f));
        int dp = AndroidUtilities.dp(5.0f);
        int dp2 = AndroidUtilities.dp(102.0f);
        int dp3 = AndroidUtilities.dp(5.0f);
        int i14 = AndroidUtilities.navigationBarHeight;
        if (l2Var.f11159r) {
            f7 = 0.0f;
        } else {
            f7 = 40.0f;
        }
        this.f12049b.setPadding(dp, dp2, dp3, AndroidUtilities.dp(f7) + i14);
        super.onMeasure(i10, i11);
    }
}
