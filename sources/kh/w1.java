package kh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class w1 extends x1 implements NotificationCenter.NotificationCenterDelegate {
    public final gh.f1 f16228b;
    public final u1 f16229c;
    public final g2 d;
    public final v1 f16230e;
    public final s1 f16231f;
    public final ArrayList h;
    public final ArrayList f16232n;
    public final n2 f16233r;

    public w1(n2 n2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        this.f16233r = n2Var;
        this.f16231f = new Object();
        this.h = new ArrayList();
        this.f16232n = new ArrayList();
        gh.f1 f1Var = new gh.f1(this, context, 2);
        this.f16228b = f1Var;
        u1 u1Var = new u1(this);
        this.f16229c = u1Var;
        f1Var.setAdapter(u1Var);
        v1 v1Var = new v1(this);
        this.f16230e = v1Var;
        f1Var.setLayoutManager(v1Var);
        f1Var.i(new bg.p2(this, 1));
        f1Var.setClipToPadding(true);
        f1Var.setVerticalScrollBarEnabled(false);
        eh.j jVar = new eh.j(this, 10);
        f1Var.setOnTouchListener(new r1(0, this, jVar));
        f1Var.setOnItemClickListener(jVar);
        f1Var.setOnScrollListener(new bg.o2(this, 12));
        addView(f1Var, g7.e6.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        b6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
        g2 g2Var = new g2(context, b6Var);
        this.d = g2Var;
        g2Var.v = new bh.c(this, 25);
        g2Var.a(2, false);
        addView(g2Var, g7.e6.e(-1, -2, 48));
    }

    @Override
    public final void a(int i9) {
        u1 u1Var = this.f16229c;
        u1.E(u1Var, false);
        if (this.f16232n.isEmpty() && TextUtils.isEmpty(this.f16233r.f15733b)) {
            u1Var.G();
        }
        u1Var.H(null);
    }

    @Override
    public final float b() {
        int i9 = 0;
        while (true) {
            gh.f1 f1Var = this.f16228b;
            if (i9 < f1Var.getChildCount()) {
                View childAt = f1Var.getChildAt(i9);
                Object tag = childAt.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                    return Math.max(0, childAt.getBottom());
                }
                i9++;
            } else {
                return 0.0f;
            }
        }
    }

    @Override
    public final void c() {
        this.d.setTranslationY(AndroidUtilities.dp(10.0f) + Math.max(0.0f, b()));
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.recentDocumentsDidLoad) {
            u1.E(this.f16229c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i9;
        super.onAttachedToWindow();
        i9 = ((org.telegram.ui.ActionBar.f3) this.f16233r).currentAccount;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i9;
        super.onDetachedFromWindow();
        i9 = ((org.telegram.ui.ActionBar.f3) this.f16233r).currentAccount;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        n2 n2Var = this.f16233r;
        i11 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        i12 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        setPadding(i11, 0, i12, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i9, i10);
    }
}
