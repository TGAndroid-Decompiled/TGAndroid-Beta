package kh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.gr;
public final class b2 extends x1 {
    public final q1 f14982b;
    public final a2 f14983c;
    public final f2.y d;
    public final z1 f14984e;
    public final g2 f14985f;
    public int h;
    public float f14986n;
    public boolean f14987r;
    public final n2 f14988s;

    public b2(n2 n2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        this.f14988s = n2Var;
        this.h = 8;
        this.f14986n = -1.0f;
        this.f14987r = false;
        q1 q1Var = new q1(context);
        this.f14982b = q1Var;
        a2 a2Var = new a2(this);
        this.f14983c = a2Var;
        q1Var.setAdapter(a2Var);
        f2.y yVar = new f2.y(this.h);
        this.d = yVar;
        q1Var.setLayoutManager(yVar);
        q1Var.setClipToPadding(true);
        q1Var.setVerticalScrollBarEnabled(false);
        yVar.O = new fh.c6(this, 3);
        q1Var.setOnItemClickListener(new eh.j(this, 11));
        q1Var.setOnScrollListener(new bg.o2(this, 13));
        f2.n nVar = new f2.n();
        nVar.f5548c = 220L;
        nVar.f5549e = 220L;
        nVar.f5550f = 160L;
        nVar.f5551g = 160L;
        nVar.f5552i = gr.f28845g;
        q1Var.setItemAnimator(nVar);
        addView(q1Var, g7.e6.c(-1.0f, -1));
        b6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
        g2 g2Var = new g2(context, b6Var);
        this.f14985f = g2Var;
        g2Var.v = new bh.c(this, 26);
        addView(g2Var, g7.e6.e(-1, -2, 48));
        b6Var2 = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
        z1 z1Var = new z1(this, context, b6Var2);
        this.f14984e = z1Var;
        addView(z1Var, g7.e6.c(36.0f, -1));
    }

    @Override
    public final void a(int i9) {
        boolean z10;
        int i10;
        int i11;
        this.f16337a = i9;
        int i12 = 0;
        if (i9 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14982b.U2 = z10;
        if (i9 == 0) {
            i10 = 8;
        } else {
            i10 = 5;
        }
        this.h = i10;
        this.d.y1(i10);
        boolean z11 = this.f14987r;
        a2 a2Var = this.f14983c;
        if (!z11) {
            a2Var.D(null);
        }
        n2 n2Var = this.f14988s;
        int i13 = n2Var.f15734c;
        g2 g2Var = this.f14985f;
        if (i13 >= 0) {
            g2Var.f15262r = true;
            g2Var.d.setText("");
            g2Var.f15262r = false;
            f2 f2Var = g2Var.f15260f;
            if (f2Var != null) {
                f2Var.E1(n2Var.f15734c);
                g2Var.f15260f.C1();
                if (g2Var.f15260f.getSelectedCategory() != null) {
                    a2Var.D = g2Var.f15260f.getSelectedCategory().f26914a;
                    f1 f1Var = a2Var.I;
                    AndroidUtilities.cancelRunOnUIThread(f1Var);
                    AndroidUtilities.runOnUIThread(f1Var);
                }
            }
        } else if (!TextUtils.isEmpty(n2Var.f15733b)) {
            g2Var.d.setText(n2Var.f15733b);
            f2 f2Var2 = g2Var.f15260f;
            if (f2Var2 != null) {
                f2Var2.F1(null);
                g2Var.f15260f.D1();
            }
            AndroidUtilities.cancelRunOnUIThread(a2Var.I);
            AndroidUtilities.runOnUIThread(a2Var.I);
        } else {
            g2Var.b();
        }
        g2Var.a(i9, n2Var.f15739s);
        i11 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        if (i9 == 0) {
            i12 = 5;
        }
        mediaDataController.checkStickers(i12);
    }

    @Override
    public final float b() {
        float f10 = this.f14986n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i9 = 0;
        while (true) {
            q1 q1Var = this.f14982b;
            if (i9 >= q1Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = q1Var.getChildAt(i9);
            Object tag = childAt.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return org.telegram.messenger.l0.b(102.0f, childAt.getBottom(), 0);
            }
            i9++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.f14984e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f14985f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        q1 q1Var = this.f14982b;
        q1Var.V2 = max + q1Var.getPaddingTop();
        q1Var.W2 = q1Var.getHeight() - q1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        float f10;
        n2 n2Var = this.f14988s;
        i11 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        i12 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        setPadding(i11, 0, i12, 0);
        this.f14984e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f14985f.setTranslationY(AndroidUtilities.dp(52.0f));
        int dp = AndroidUtilities.dp(5.0f);
        int dp2 = AndroidUtilities.dp(102.0f);
        int dp3 = AndroidUtilities.dp(5.0f);
        int i13 = AndroidUtilities.navigationBarHeight;
        if (n2Var.f15738r) {
            f10 = 0.0f;
        } else {
            f10 = 40.0f;
        }
        this.f14982b.setPadding(dp, dp2, dp3, AndroidUtilities.dp(f10) + i13);
        super.onMeasure(i9, i10);
    }
}
