package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.gb1;
public final class u1 extends v1 implements NotificationCenter.NotificationCenterDelegate {
    public final bi.r1 f11742b;
    public final s1 f11743c;
    public final f2 d;
    public final t1 e;
    public final q1 f11744f;
    public final ArrayList h;
    public final ArrayList f11745n;
    public final l2 f11746r;

    public u1(l2 l2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        this.f11746r = l2Var;
        this.f11744f = new Object();
        this.h = new ArrayList();
        this.f11745n = new ArrayList();
        bi.r1 r1Var = new bi.r1(this, context, 2);
        this.f11742b = r1Var;
        s1 s1Var = new s1(this);
        this.f11743c = s1Var;
        r1Var.setAdapter(s1Var);
        t1 t1Var = new t1(this);
        this.e = t1Var;
        r1Var.setLayoutManager(t1Var);
        r1Var.i(new p1(this, 0));
        r1Var.setClipToPadding(true);
        r1Var.setVerticalScrollBarEnabled(false);
        ai.k kVar = new ai.k(this, 8);
        r1Var.setOnTouchListener(new o1(0, this, kVar));
        r1Var.setOnItemClickListener(kVar);
        r1Var.setOnScrollListener(new ai.b(this, 9));
        addView(r1Var, gb1.h(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        u6Var = ((org.telegram.ui.ActionBar.k3) l2Var).resourcesProvider;
        f2 f2Var = new f2(context, u6Var);
        this.d = f2Var;
        f2Var.f10858w = new ai.e(this, 16);
        f2Var.a(2, false);
        addView(f2Var, gb1.i(-1, -2, 48));
    }

    @Override
    public final void a(int i10) {
        s1 s1Var = this.f11743c;
        s1.E(s1Var, false);
        if (this.f11745n.isEmpty() && TextUtils.isEmpty(this.f11746r.f11156b)) {
            s1Var.G();
        }
        s1Var.H(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i10 = 0;
        while (true) {
            bi.r1 r1Var = this.f11742b;
            if (i10 < r1Var.getChildCount()) {
                Object tag = r1Var.getChildAt(i10).getTag();
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
            s1.E(this.f11743c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.k3) this.f11746r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.k3) this.f11746r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        l2 l2Var = this.f11746r;
        i12 = ((org.telegram.ui.ActionBar.k3) l2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.k3) l2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
