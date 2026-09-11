package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class z1 extends a2 implements NotificationCenter.NotificationCenterDelegate {
    public final bi.o0 f8506b;
    public final w1 f8507c;
    public final l2 d;
    public final y1 f8508e;
    public final s1 f8509f;
    public final ArrayList h;
    public final ArrayList f8510n;
    public final t2 f8511r;

    public z1(t2 t2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.f8511r = t2Var;
        this.f8509f = new Object();
        this.h = new ArrayList();
        this.f8510n = new ArrayList();
        bi.o0 o0Var = new bi.o0(this, context, 1);
        this.f8506b = o0Var;
        w1 w1Var = new w1(this);
        this.f8507c = w1Var;
        o0Var.setAdapter(w1Var);
        y1 y1Var = new y1(this);
        this.f8508e = y1Var;
        o0Var.setLayoutManager(y1Var);
        o0Var.i(new r1(this, 0));
        o0Var.setClipToPadding(true);
        o0Var.setVerticalScrollBarEnabled(false);
        bi.d dVar = new bi.d(this, 3);
        o0Var.setOnTouchListener(new q1(0, this, dVar));
        o0Var.setOnItemClickListener(dVar);
        o0Var.setOnScrollListener(new ah.e0(this, 3));
        addView(o0Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        f6Var = ((org.telegram.ui.ActionBar.f3) t2Var).resourcesProvider;
        l2 l2Var = new l2(context, f6Var);
        this.d = l2Var;
        l2Var.v = new ci.u(this, 2);
        l2Var.a(2, false);
        addView(l2Var, w7.x5.e(-1, -2, 48));
    }

    @Override
    public final void a(int i10) {
        w1 w1Var = this.f8507c;
        w1.E(w1Var, false);
        if (this.f8510n.isEmpty() && TextUtils.isEmpty(this.f8511r.f8167b)) {
            w1Var.G();
        }
        w1Var.H(null);
    }

    @Override
    public final float b() {
        int i10 = 0;
        while (true) {
            bi.o0 o0Var = this.f8506b;
            if (i10 < o0Var.getChildCount()) {
                View childAt = o0Var.getChildAt(i10);
                Object tag = childAt.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                    return Math.max(0, childAt.getBottom());
                }
                i10++;
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            w1.E(this.f8507c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.f8511r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.f8511r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        t2 t2Var = this.f8511r;
        i12 = ((org.telegram.ui.ActionBar.f3) t2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) t2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
