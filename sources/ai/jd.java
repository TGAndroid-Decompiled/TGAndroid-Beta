package ai;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b71;
public final class jd extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final b71 f1580a;
    public final org.telegram.ui.ActionBar.d6 f1581b;
    public final int f1582c;
    public final int d;
    public final boolean e;
    public final long f1583f;
    public final id h;

    public jd(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f1582c = i11;
        this.f1583f = j10;
        this.f1581b = d6Var;
        this.h = new id(j10, i11, i10, z10);
        b71 b71Var = new b71(context, i11, i12, true, new q(this, 10), new a1.c(this, 11), null, d6Var);
        this.f1580a = b71Var;
        addView(b71Var, w7.z5.c(-1.0f, -1));
        b71Var.setOnScrollListener(new ah.d0(this, 4));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        b71 b71Var = this.f1580a;
        if (i10 == i12) {
            b71Var.W2.N(true);
            if (b71Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < b71Var.getChildCount(); i13++) {
                    if (!(b71Var.getChildAt(i13) instanceof b10)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f1583f) {
            b71Var.W2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = (this.f1583f > 0L ? 1 : (this.f1583f == 0L ? 0 : -1));
        int i11 = this.f1582c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f1580a.W2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = (this.f1583f > 0L ? 1 : (this.f1583f == 0L ? 0 : -1));
        int i11 = this.f1582c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
