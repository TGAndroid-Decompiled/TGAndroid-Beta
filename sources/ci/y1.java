package ci;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class y1 extends z1 implements NotificationCenter.NotificationCenterDelegate {
    public final ai.w0 f6341b;
    public final v1 f6342c;
    public final k2 d;
    public final x1 f6343e;
    public final r1 f6344f;
    public final ArrayList h;
    public final ArrayList f6345n;
    public final r2 f6346r;

    public y1(r2 r2Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.f6346r = r2Var;
        this.f6344f = new Object();
        this.h = new ArrayList();
        this.f6345n = new ArrayList();
        ai.w0 w0Var = new ai.w0(this, context, 1);
        this.f6341b = w0Var;
        v1 v1Var = new v1(this);
        this.f6342c = v1Var;
        w0Var.setAdapter(v1Var);
        x1 x1Var = new x1(this);
        this.f6343e = x1Var;
        w0Var.setLayoutManager(x1Var);
        w0Var.i(new q1(this, 0));
        w0Var.setClipToPadding(true);
        w0Var.setVerticalScrollBarEnabled(false);
        ai.g gVar = new ai.g(this, 3);
        w0Var.setOnTouchListener(new p1(0, this, gVar));
        w0Var.setOnItemClickListener(gVar);
        w0Var.setOnScrollListener(new ai.r(this, 1));
        addView(w0Var, w7.x5.a(-1.0f, 0.0f, 58.0f, 0.0f, 40.0f, -1, 119));
        e6Var = ((org.telegram.ui.ActionBar.f3) r2Var).resourcesProvider;
        k2 k2Var = new k2(context, e6Var);
        this.d = k2Var;
        k2Var.v = new bi.v(this, 2);
        k2Var.a(2, false);
        addView(k2Var, w7.x5.e(-1, -2, 48));
    }

    @Override
    public final void a(int i10) {
        v1 v1Var = this.f6342c;
        v1.E(v1Var, false);
        if (this.f6345n.isEmpty() && TextUtils.isEmpty(this.f6346r.f5882b)) {
            v1Var.G();
        }
        v1Var.H(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i10 = 0;
        while (true) {
            ai.w0 w0Var = this.f6341b;
            if (i10 < w0Var.getChildCount()) {
                Object tag = w0Var.getChildAt(i10).getTag();
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
            v1.E(this.f6342c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.f6346r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.f3) this.f6346r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        r2 r2Var = this.f6346r;
        i12 = ((org.telegram.ui.ActionBar.f3) r2Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.f3) r2Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
