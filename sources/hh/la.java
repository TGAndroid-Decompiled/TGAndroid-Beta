package hh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.k51;

public final class la extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {

    public final k51 f9688a;

    public final org.telegram.ui.ActionBar.c6 f9689b;

    public final int f9690c;
    public final int d;

    public final boolean f9691e;

    public final long f9692f;
    public final ka h;

    public la(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = i10;
        this.f9691e = z10;
        this.f9690c = i11;
        this.f9692f = j10;
        this.f9689b = c6Var;
        this.h = new ka(j10, i11, i10, z10);
        k51 k51Var = new k51(context, i11, i12, true, new ch.c(this, 22), new h3.x(this, 13), null, c6Var);
        this.f9688a = k51Var;
        addView(k51Var, h7.z5.c(-1.0f, -1));
        k51Var.setOnScrollListener(new ag.z2(this, 9));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        k51 k51Var = this.f9688a;
        if (i10 != i12) {
            if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f9692f) {
                k51Var.U2.N(true);
                return;
            }
            return;
        }
        k51Var.U2.N(true);
        if (k51Var.canScrollVertically(1)) {
            for (int i13 = 0; i13 < k51Var.getChildCount(); i13++) {
                if (!(k51Var.getChildAt(i13) instanceof h00)) {
                }
            }
            return;
        }
        this.h.run();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j10 = this.f9692f;
        int i10 = this.f9690c;
        if (j10 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f9688a.U2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j10 = this.f9692f;
        int i10 = this.f9690c;
        if (j10 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
