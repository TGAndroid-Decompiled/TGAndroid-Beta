package ai;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.c71;
public final class jd extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final c71 f1593a;
    public final org.telegram.ui.ActionBar.d6 f1594b;
    public final int f1595c;
    public final int d;
    public final boolean e;
    public final long f1596f;
    public final id h;

    public jd(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f1595c = i11;
        this.f1596f = j10;
        this.f1594b = d6Var;
        this.h = new id(j10, i11, i10, z10);
        c71 c71Var = new c71(context, i11, i12, true, new q(this, 10), new a1.c(this, 11), null, d6Var);
        this.f1593a = c71Var;
        addView(c71Var, w7.z5.c(-1.0f, -1));
        c71Var.setOnScrollListener(new ah.d0(this, 4));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        c71 c71Var = this.f1593a;
        if (i10 == i12) {
            c71Var.W2.N(true);
            if (c71Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < c71Var.getChildCount(); i13++) {
                    if (!(c71Var.getChildAt(i13) instanceof b10)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f1596f) {
            c71Var.W2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = (this.f1596f > 0L ? 1 : (this.f1596f == 0L ? 0 : -1));
        int i11 = this.f1595c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f1593a.W2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = (this.f1596f > 0L ? 1 : (this.f1596f == 0L ? 0 : -1));
        int i11 = this.f1595c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
