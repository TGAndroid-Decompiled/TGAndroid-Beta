package nh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class t1 extends u1 implements NotificationCenter.NotificationCenterDelegate {
    public final jh.e1 f18579b;
    public final r1 f18580c;
    public final d2 d;
    public final s1 f18581e;
    public final p1 f18582f;
    public final ArrayList h;
    public final ArrayList f18583n;
    public final k2 f18584r;

    public t1(k2 k2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.f18584r = k2Var;
        this.f18582f = new Object();
        this.h = new ArrayList();
        this.f18583n = new ArrayList();
        jh.e1 e1Var = new jh.e1(this, context, 2);
        this.f18579b = e1Var;
        r1 r1Var = new r1(this);
        this.f18580c = r1Var;
        e1Var.setAdapter(r1Var);
        s1 s1Var = new s1(this);
        this.f18581e = s1Var;
        e1Var.setLayoutManager(s1Var);
        e1Var.i(new eg.f2(this, 1));
        e1Var.setClipToPadding(true);
        e1Var.setVerticalScrollBarEnabled(false);
        bg.o oVar = new bg.o(this, 14);
        e1Var.setOnTouchListener(new o1(0, this, oVar));
        e1Var.setOnItemClickListener(oVar);
        e1Var.setOnScrollListener(new cg.g2(this, 13));
        addView(e1Var, i7.f6.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        c6Var = ((org.telegram.ui.ActionBar.f3) k2Var).resourcesProvider;
        d2 d2Var = new d2(context, c6Var);
        this.d = d2Var;
        d2Var.v = new bg.t1(this, 26);
        d2Var.a(2, false);
        addView(d2Var, i7.f6.e(-1, -2, 48));
    }

    @Override
    public final void a(int i10) {
        r1 r1Var = this.f18580c;
        r1.E(r1Var, false);
        if (this.f18583n.isEmpty() && TextUtils.isEmpty(this.f18584r.f17990b)) {
            r1Var.G();
        }
        r1Var.H(null);
    }

    @Override
    public final float b() {
        int i10 = 0;
        while (true) {
            jh.e1 e1Var = this.f18579b;
            if (i10 < e1Var.getChildCount()) {
                View childAt = e1Var.getChildAt(i10);
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
            r1.E(this.f18580c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.f18584r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.f18584r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        k2 k2Var = this.f18584r;
        i12 = ((org.telegram.ui.ActionBar.f3) k2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) k2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
