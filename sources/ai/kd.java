package ai;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.z00;
public final class kd extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final i71 f1641a;
    public final org.telegram.ui.ActionBar.g6 f1642b;
    public final int f1643c;
    public final int d;
    public final boolean e;
    public final long f1644f;
    public final jd h;

    public kd(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f1643c = i11;
        this.f1644f = j10;
        this.f1642b = g6Var;
        this.h = new jd(j10, i11, i10, z10);
        i71 i71Var = new i71(context, i11, i12, true, new q(this, 10), new a1.c(this, 11), null, g6Var);
        this.f1641a = i71Var;
        addView(i71Var, w7.z5.c(-1.0f, -1));
        i71Var.setOnScrollListener(new ah.d0(this, 4));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        i71 i71Var = this.f1641a;
        if (i10 == i12) {
            i71Var.Z2.N(true);
            if (i71Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < i71Var.getChildCount(); i13++) {
                    if (!(i71Var.getChildAt(i13) instanceof z00)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f1644f) {
            i71Var.Z2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = (this.f1644f > 0L ? 1 : (this.f1644f == 0L ? 0 : -1));
        int i11 = this.f1643c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f1641a.Z2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = (this.f1644f > 0L ? 1 : (this.f1644f == 0L ? 0 : -1));
        int i11 = this.f1643c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
