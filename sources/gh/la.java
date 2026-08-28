package gh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.i51;
public final class la extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final i51 f8515a;
    public final org.telegram.ui.ActionBar.b6 f8516b;
    public final int f8517c;
    public final int d;
    public final boolean f8518e;
    public final long f8519f;
    public final ka h;

    public la(Context context, boolean z10, long j10, int i9, int i10, int i11, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.d = i9;
        this.f8518e = z10;
        this.f8517c = i10;
        this.f8519f = j10;
        this.f8516b = b6Var;
        this.h = new ka(j10, i10, i9, z10);
        i51 i51Var = new i51(context, i10, i11, true, new bh.c(this, 22), new i3(this, 7), null, b6Var);
        this.f8515a = i51Var;
        addView(i51Var, g7.e6.c(-1.0f, -1));
        i51Var.setOnScrollListener(new bg.o2(this, 8));
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.starTransactionsLoaded;
        i51 i51Var = this.f8515a;
        if (i9 == i11) {
            i51Var.U2.N(true);
            if (i51Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < i51Var.getChildCount(); i12++) {
                    if (!(i51Var.getChildAt(i12) instanceof e00)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i9 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f8519f) {
            i51Var.U2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j10 = this.f8519f;
        int i9 = this.f8517c;
        if (j10 != 0) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f8515a.U2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j10 = this.f8519f;
        int i9 = this.f8517c;
        if (j10 != 0) {
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
