package ci;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class z1 extends a2 implements NotificationCenter.NotificationCenterDelegate {
    public final ai.w0 f5902b;
    public final w1 f5903c;
    public final l2 d;
    public final y1 e;
    public final s1 f5904f;
    public final ArrayList h;
    public final ArrayList f5905n;
    public final s2 f5906r;

    public z1(s2 s2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        this.f5906r = s2Var;
        this.f5904f = new Object();
        this.h = new ArrayList();
        this.f5905n = new ArrayList();
        ai.w0 w0Var = new ai.w0(this, context, 1);
        this.f5902b = w0Var;
        w1 w1Var = new w1(this);
        this.f5903c = w1Var;
        w0Var.setAdapter(w1Var);
        y1 y1Var = new y1(this);
        this.e = y1Var;
        w0Var.setLayoutManager(y1Var);
        w0Var.i(new r1(this, 0));
        w0Var.setClipToPadding(true);
        w0Var.setVerticalScrollBarEnabled(false);
        ai.g gVar = new ai.g(this, 3);
        w0Var.setOnTouchListener(new q1(0, this, gVar));
        w0Var.setOnItemClickListener(gVar);
        w0Var.setOnScrollListener(new ai.r(this, 1));
        addView(w0Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        d6Var = ((org.telegram.ui.ActionBar.f3) s2Var).resourcesProvider;
        l2 l2Var = new l2(context, d6Var);
        this.d = l2Var;
        l2Var.v = new bi.v(this, 2);
        l2Var.a(2, false);
        addView(l2Var, w7.x5.e(-1, -2, 48));
    }

    @Override
    public final void a(int i10) {
        w1 w1Var = this.f5903c;
        w1.E(w1Var, false);
        if (this.f5905n.isEmpty() && TextUtils.isEmpty(this.f5906r.f5472b)) {
            w1Var.G();
        }
        w1Var.H(null);
    }

    @Override
    public final float b() {
        int i10 = 0;
        while (true) {
            ai.w0 w0Var = this.f5902b;
            if (i10 < w0Var.getChildCount()) {
                View childAt = w0Var.getChildAt(i10);
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
            w1.E(this.f5903c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.f5906r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.f5906r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        s2 s2Var = this.f5906r;
        i12 = ((org.telegram.ui.ActionBar.f3) s2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) s2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
