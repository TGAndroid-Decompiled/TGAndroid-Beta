package ei;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.bs;
public final class b2 extends w1 {
    public final o1 f8771b;
    public final a2 f8772c;
    public final s4.s d;
    public final y1 e;
    public final h2 f8773f;
    public int h;
    public float f8774n;
    public boolean f8775r;
    public final n2 f8776s;

    public b2(n2 n2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.f8776s = n2Var;
        this.h = 8;
        this.f8774n = -1.0f;
        this.f8775r = false;
        o1 o1Var = new o1(context);
        this.f8771b = o1Var;
        a2 a2Var = new a2(this);
        this.f8772c = a2Var;
        o1Var.setAdapter(a2Var);
        s4.s sVar = new s4.s(this.h);
        this.d = sVar;
        o1Var.setLayoutManager(sVar);
        o1Var.setClipToPadding(true);
        o1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new ai.q1(this, 2);
        o1Var.setOnItemClickListener(new ai.wa(this, 8));
        o1Var.setOnScrollListener(new ah.d0(this, 7));
        s4.k kVar = new s4.k();
        kVar.f45989c = 220L;
        kVar.e = 220L;
        kVar.f45990f = 160L;
        kVar.f45991g = 160L;
        kVar.f45992i = bs.f25015g;
        o1Var.setItemAnimator(kVar);
        addView(o1Var, w7.z5.c(-1.0f, -1));
        d6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
        h2 h2Var = new h2(context, d6Var);
        this.f8773f = h2Var;
        h2Var.v = new ai.q(this, 14);
        addView(h2Var, w7.z5.e(-1, -2, 48));
        d6Var2 = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
        y1 y1Var = new y1(this, context, d6Var2);
        this.e = y1Var;
        addView(y1Var, w7.z5.c(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        int i12;
        this.f10038a = i10;
        int i13 = 0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8771b.W2 = z10;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 5;
        }
        this.h = i11;
        this.d.y1(i11);
        boolean z11 = this.f8775r;
        a2 a2Var = this.f8772c;
        if (!z11) {
            a2Var.D(null);
        }
        n2 n2Var = this.f8776s;
        int i14 = n2Var.f9502c;
        h2 h2Var = this.f8773f;
        if (i14 >= 0) {
            h2Var.f9151r = true;
            h2Var.d.setText("");
            h2Var.f9151r = false;
            g2 g2Var = h2Var.f9149f;
            if (g2Var != null) {
                g2Var.F1(n2Var.f9502c);
                h2Var.f9149f.D1();
                if (h2Var.f9149f.getSelectedCategory() != null) {
                    a2Var.H = h2Var.f9149f.getSelectedCategory().f28620a;
                    com.google.firebase.messaging.s sVar = a2Var.M;
                    AndroidUtilities.cancelRunOnUIThread(sVar);
                    AndroidUtilities.runOnUIThread(sVar);
                }
            }
        } else if (!TextUtils.isEmpty(n2Var.f9501b)) {
            h2Var.d.setText(n2Var.f9501b);
            g2 g2Var2 = h2Var.f9149f;
            if (g2Var2 != null) {
                g2Var2.G1(null);
                h2Var.f9149f.E1();
            }
            AndroidUtilities.cancelRunOnUIThread(a2Var.M);
            AndroidUtilities.runOnUIThread(a2Var.M);
        } else {
            h2Var.b();
        }
        h2Var.a(i10, n2Var.f9506s);
        i12 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
        if (i10 == 0) {
            i13 = 5;
        }
        mediaDataController.checkStickers(i13);
    }

    @Override
    public final float b() {
        View childAt;
        float f7 = this.f8774n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            o1 o1Var = this.f8771b;
            if (i10 >= o1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = o1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return org.telegram.messenger.g0.b(102.0f, childAt.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f8773f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        o1 o1Var = this.f8771b;
        o1Var.X2 = max + o1Var.getPaddingTop();
        o1Var.Y2 = o1Var.getHeight() - o1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f7;
        n2 n2Var = this.f8776s;
        i12 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f8773f.setTranslationY(AndroidUtilities.dp(52.0f));
        int dp = AndroidUtilities.dp(5.0f);
        int dp2 = AndroidUtilities.dp(102.0f);
        int dp3 = AndroidUtilities.dp(5.0f);
        int i14 = AndroidUtilities.navigationBarHeight;
        if (n2Var.f9505r) {
            f7 = 0.0f;
        } else {
            f7 = 40.0f;
        }
        this.f8771b.setPadding(dp, dp2, dp3, AndroidUtilities.dp(f7) + i14);
        super.onMeasure(i10, i11);
    }
}
