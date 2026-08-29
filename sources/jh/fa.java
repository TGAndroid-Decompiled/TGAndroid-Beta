package jh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.u51;
public final class fa extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final u51 f12073a;
    public final org.telegram.ui.ActionBar.c6 f12074b;
    public final int f12075c;
    public final int d;
    public final boolean f12076e;
    public final long f12077f;
    public final ea h;

    public fa(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = i10;
        this.f12076e = z10;
        this.f12075c = i11;
        this.f12077f = j10;
        this.f12074b = c6Var;
        this.h = new ea(j10, i11, i10, z10);
        u51 u51Var = new u51(context, i11, i12, true, new bg.t1(this, 23), new eg.n(this, 26), null, c6Var);
        this.f12073a = u51Var;
        addView(u51Var, i7.f6.c(-1.0f, -1));
        u51Var.setOnScrollListener(new cg.g2(this, 9));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        u51 u51Var = this.f12073a;
        if (i10 == i12) {
            u51Var.U2.N(true);
            if (u51Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < u51Var.getChildCount(); i13++) {
                    if (!(u51Var.getChildAt(i13) instanceof p00)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f12077f) {
            u51Var.U2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j10 = this.f12077f;
        int i10 = this.f12075c;
        if (j10 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f12073a.U2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j10 = this.f12077f;
        int i10 = this.f12075c;
        if (j10 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
