package lh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.t00;
public final class ga extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final g61 f12512a;
    public final org.telegram.ui.ActionBar.f6 f12513b;
    public final int f12514c;
    public final int d;
    public final boolean e;
    public final long f12515f;
    public final fa h;

    public ga(Context context, boolean z4, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = i10;
        this.e = z4;
        this.f12514c = i11;
        this.f12515f = j10;
        this.f12513b = f6Var;
        this.h = new fa(j10, i11, i10, z4);
        g61 g61Var = new g61(context, i11, i12, true, new dg.r1(this, 23), new m5(this, 4), null, f6Var);
        this.f12512a = g61Var;
        addView(g61Var, k7.b6.c(-1.0f, -1));
        g61Var.setOnScrollListener(new eg.f2(this, 9));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        g61 g61Var = this.f12512a;
        if (i10 == i12) {
            g61Var.V2.N(true);
            if (g61Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < g61Var.getChildCount(); i13++) {
                    if (!(g61Var.getChildAt(i13) instanceof t00)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f12515f) {
            g61Var.V2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j10 = this.f12515f;
        int i10 = this.f12514c;
        if (j10 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f12512a.V2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j10 = this.f12515f;
        int i10 = this.f12514c;
        if (j10 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
