package lh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class u1 extends v1 implements NotificationCenter.NotificationCenterDelegate {

    public final hh.f1 f16896b;

    public final s1 f16897c;
    public final e2 d;

    public final t1 f16898e;

    public final q1 f16899f;
    public final ArrayList h;

    public final ArrayList f16900n;

    public final l2 f16901r;

    public u1(l2 l2Var, Context context) {
        super(context);
        this.f16901r = l2Var;
        this.f16899f = new q1();
        this.h = new ArrayList();
        this.f16900n = new ArrayList();
        hh.f1 f1Var = new hh.f1(this, context, 2);
        this.f16896b = f1Var;
        s1 s1Var = new s1(this);
        this.f16897c = s1Var;
        f1Var.setAdapter(s1Var);
        t1 t1Var = new t1(this);
        this.f16898e = t1Var;
        f1Var.setLayoutManager(t1Var);
        f1Var.i(new cg.h2(this, 1));
        f1Var.setClipToPadding(true);
        f1Var.setVerticalScrollBarEnabled(false);
        ag.p0 p0Var = new ag.p0(this, 12);
        f1Var.setOnTouchListener(new p1(0, this, p0Var));
        f1Var.setOnItemClickListener(p0Var);
        f1Var.setOnScrollListener(new ag.z2(this, 13));
        addView(f1Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        e2 e2Var = new e2(context, ((org.telegram.ui.ActionBar.e3) l2Var).resourcesProvider);
        this.d = e2Var;
        e2Var.v = new ch.c(this, 25);
        e2Var.a(2, false);
        addView(e2Var, h7.z5.e(-1, -2, 48));
    }

    @Override
    public final void a(int i10) {
        s1 s1Var = this.f16897c;
        s1.E(s1Var, false);
        if (this.f16900n.isEmpty() && TextUtils.isEmpty(this.f16901r.f16285b)) {
            s1Var.G();
        }
        s1Var.H(null);
    }

    @Override
    public final float b() {
        int i10 = 0;
        while (true) {
            hh.f1 f1Var = this.f16896b;
            if (i10 >= f1Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = f1Var.getChildAt(i10);
            Object tag = childAt.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return Math.max(0, childAt.getBottom());
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        this.d.setTranslationY(AndroidUtilities.dp(10.0f) + Math.max(0.0f, b()));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            s1.E(this.f16897c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(((org.telegram.ui.ActionBar.e3) this.f16901r).currentAccount).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(((org.telegram.ui.ActionBar.e3) this.f16901r).currentAccount).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        l2 l2Var = this.f16901r;
        setPadding(((org.telegram.ui.ActionBar.e3) l2Var).backgroundPaddingLeft, 0, ((org.telegram.ui.ActionBar.e3) l2Var).backgroundPaddingLeft, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
