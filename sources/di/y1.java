package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class y1 extends z1 implements NotificationCenter.NotificationCenterDelegate {
    public final bi.o0 f8119b;
    public final v1 f8120c;
    public final k2 d;
    public final x1 e;
    public final r1 f8121f;
    public final ArrayList h;
    public final ArrayList f8122n;
    public final r2 f8123r;

    public y1(r2 r2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.f8123r = r2Var;
        this.f8121f = new Object();
        this.h = new ArrayList();
        this.f8122n = new ArrayList();
        bi.o0 o0Var = new bi.o0(this, context, 1);
        this.f8119b = o0Var;
        v1 v1Var = new v1(this);
        this.f8120c = v1Var;
        o0Var.setAdapter(v1Var);
        x1 x1Var = new x1(this);
        this.e = x1Var;
        o0Var.setLayoutManager(x1Var);
        o0Var.i(new q1(this, 0));
        o0Var.setClipToPadding(true);
        o0Var.setVerticalScrollBarEnabled(false);
        bi.d dVar = new bi.d(this, 3);
        o0Var.setOnTouchListener(new p1(0, this, dVar));
        o0Var.setOnItemClickListener(dVar);
        o0Var.setOnScrollListener(new ah.d0(this, 2));
        addView(o0Var, w7.a6.a(-1.0f, 0.0f, 58.0f, 0.0f, 40.0f, -1, 119));
        c6Var = ((org.telegram.ui.ActionBar.e3) r2Var).resourcesProvider;
        k2 k2Var = new k2(context, c6Var);
        this.d = k2Var;
        k2Var.v = new ci.u(this, 2);
        k2Var.a(2, false);
        addView(k2Var, w7.a6.e(-1, -2, 48));
    }

    @Override
    public final void a(int i10) {
        v1 v1Var = this.f8120c;
        v1.E(v1Var, false);
        if (this.f8122n.isEmpty() && TextUtils.isEmpty(this.f8123r.f7688b)) {
            v1Var.G();
        }
        v1Var.H(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i10 = 0;
        while (true) {
            bi.o0 o0Var = this.f8119b;
            if (i10 < o0Var.getChildCount()) {
                Object tag = o0Var.getChildAt(i10).getTag();
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
            v1.E(this.f8120c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.e3) this.f8123r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.e3) this.f8123r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        r2 r2Var = this.f8123r;
        i12 = ((org.telegram.ui.ActionBar.e3) r2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.e3) r2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
