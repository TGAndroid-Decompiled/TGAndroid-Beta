package ai;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.b10;
public final class id extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final a71 f1530a;
    public final org.telegram.ui.ActionBar.d6 f1531b;
    public final int f1532c;
    public final int d;
    public final boolean e;
    public final long f1533f;
    public final hd h;

    public id(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f1532c = i11;
        this.f1533f = j10;
        this.f1531b = d6Var;
        this.h = new hd(j10, i11, i10, z10);
        a71 a71Var = new a71(context, i11, i12, true, new q(this, 10), new a1.c(this, 11), null, d6Var);
        this.f1530a = a71Var;
        addView(a71Var, w7.z5.d(-1.0f, -1));
        a71Var.setOnScrollListener(new ah.d0(this, 4));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        a71 a71Var = this.f1530a;
        if (i10 == i12) {
            a71Var.W2.N(true);
            if (a71Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < a71Var.getChildCount(); i13++) {
                    if (!(a71Var.getChildAt(i13) instanceof b10)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f1533f) {
            a71Var.W2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = (this.f1533f > 0L ? 1 : (this.f1533f == 0L ? 0 : -1));
        int i11 = this.f1532c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f1530a.W2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = (this.f1533f > 0L ? 1 : (this.f1533f == 0L ? 0 : -1));
        int i11 = this.f1532c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
