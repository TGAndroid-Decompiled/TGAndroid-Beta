package mh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.u00;
public final class ga extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final i61 f14129a;
    public final org.telegram.ui.ActionBar.g6 f14130b;
    public final int f14131c;
    public final int d;
    public final boolean f14132e;
    public final long f14133f;
    public final fa h;

    public ga(Context context, boolean z4, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = i10;
        this.f14132e = z4;
        this.f14131c = i11;
        this.f14133f = j10;
        this.f14130b = g6Var;
        this.h = new fa(j10, i11, i10, z4);
        i61 i61Var = new i61(context, i11, i12, true, new eg.p1(this, 23), new m5(this, 4), null, g6Var);
        this.f14129a = i61Var;
        addView(i61Var, k7.c6.c(-1.0f, -1));
        i61Var.setOnScrollListener(new fg.e2(this, 9));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        i61 i61Var = this.f14129a;
        if (i10 == i12) {
            i61Var.V2.N(true);
            if (i61Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < i61Var.getChildCount(); i13++) {
                    if (!(i61Var.getChildAt(i13) instanceof u00)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f14133f) {
            i61Var.V2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j10 = this.f14133f;
        int i10 = this.f14131c;
        if (j10 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f14129a.V2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j10 = this.f14133f;
        int i10 = this.f14131c;
        if (j10 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
