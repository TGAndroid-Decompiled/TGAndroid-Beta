package lh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.er;

public final class z1 extends v1 {

    public final o1 f17173b;

    public final y1 f17174c;
    public final f2.x d;

    public final x1 f17175e;

    public final e2 f17176f;
    public int h;

    public float f17177n;

    public boolean f17178r;

    public final l2 f17179s;

    public z1(l2 l2Var, Context context) {
        super(context);
        this.f17179s = l2Var;
        this.h = 8;
        this.f17177n = -1.0f;
        this.f17178r = false;
        o1 o1Var = new o1(context);
        this.f17173b = o1Var;
        y1 y1Var = new y1(this);
        this.f17174c = y1Var;
        o1Var.setAdapter(y1Var);
        f2.x xVar = new f2.x(this.h);
        this.d = xVar;
        o1Var.setLayoutManager(xVar);
        o1Var.setClipToPadding(true);
        o1Var.setVerticalScrollBarEnabled(false);
        xVar.O = new gh.u5(this, 3);
        o1Var.setOnItemClickListener(new ag.p0(this, 13));
        o1Var.setOnScrollListener(new ag.z2(this, 14));
        f2.l lVar = new f2.l();
        lVar.f5842c = 220L;
        lVar.f5843e = 220L;
        lVar.f5844f = 160L;
        lVar.f5845g = 160L;
        lVar.f5846i = er.f28123g;
        o1Var.setItemAnimator(lVar);
        addView(o1Var, h7.z5.c(-1.0f, -1));
        e2 e2Var = new e2(context, ((org.telegram.ui.ActionBar.e3) l2Var).resourcesProvider);
        this.f17176f = e2Var;
        e2Var.v = new ch.c(this, 26);
        addView(e2Var, h7.z5.e(-1, -2, 48));
        x1 x1Var = new x1(this, context, ((org.telegram.ui.ActionBar.e3) l2Var).resourcesProvider);
        this.f17175e = x1Var;
        addView(x1Var, h7.z5.c(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        this.f16935a = i10;
        this.f17173b.U2 = i10 == 0;
        int i11 = i10 == 0 ? 8 : 5;
        this.h = i11;
        this.d.y1(i11);
        boolean z10 = this.f17178r;
        y1 y1Var = this.f17174c;
        if (!z10) {
            y1Var.D(null);
        }
        l2 l2Var = this.f17179s;
        int i12 = l2Var.f16286c;
        e2 e2Var = this.f17176f;
        if (i12 >= 0) {
            e2Var.f15925r = true;
            e2Var.d.setText("");
            e2Var.f15925r = false;
            d2 d2Var = e2Var.f15923f;
            if (d2Var != null) {
                d2Var.E1(l2Var.f16286c);
                e2Var.f15923f.C1();
                if (e2Var.f15923f.getSelectedCategory() != null) {
                    y1Var.D = e2Var.f15923f.getSelectedCategory().f27559a;
                    kh.c cVar = y1Var.I;
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    AndroidUtilities.runOnUIThread(cVar);
                }
            }
        } else if (TextUtils.isEmpty(l2Var.f16285b)) {
            e2Var.b();
        } else {
            e2Var.d.setText(l2Var.f16285b);
            d2 d2Var2 = e2Var.f15923f;
            if (d2Var2 != null) {
                d2Var2.F1(null);
                e2Var.f15923f.D1();
            }
            AndroidUtilities.cancelRunOnUIThread(y1Var.I);
            AndroidUtilities.runOnUIThread(y1Var.I);
        }
        e2Var.a(i10, l2Var.f16291s);
        MediaDataController.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount).checkStickers(i10 == 0 ? 5 : 0);
    }

    @Override
    public final float b() {
        float f10 = this.f17177n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i10 = 0;
        while (true) {
            o1 o1Var = this.f17173b;
            if (i10 >= o1Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = o1Var.getChildAt(i10);
            Object tag = childAt.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return i0.a.d(102.0f, childAt.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        float fMax = Math.max(0.0f, b());
        this.f17175e.setTranslationY(AndroidUtilities.dp(16.0f) + fMax);
        this.f17176f.setTranslationY(AndroidUtilities.dp(52.0f) + fMax);
        o1 o1Var = this.f17173b;
        float paddingTop = fMax + o1Var.getPaddingTop();
        float height = o1Var.getHeight() - o1Var.getPaddingBottom();
        o1Var.V2 = paddingTop;
        o1Var.W2 = height;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        l2 l2Var = this.f17179s;
        setPadding(((org.telegram.ui.ActionBar.e3) l2Var).backgroundPaddingLeft, 0, ((org.telegram.ui.ActionBar.e3) l2Var).backgroundPaddingLeft, 0);
        this.f17175e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f17176f.setTranslationY(AndroidUtilities.dp(52.0f));
        this.f17173b.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(102.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(l2Var.f16290r ? 0.0f : 40.0f) + AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
