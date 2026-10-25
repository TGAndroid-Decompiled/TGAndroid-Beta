package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.r71;
public final class ad extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final r71 f4289a;
    public final org.telegram.ui.ActionBar.u6 f4290b;
    public final int f4291c;
    public final int d;
    public final boolean e;
    public final long f4292f;
    public final zc h;

    public ad(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f4291c = i11;
        this.f4292f = j10;
        this.f4290b = u6Var;
        this.h = new zc(j10, i11, i10, z10);
        r71 r71Var = new r71(context, i11, i12, true, new ai.e(this, 13), new a1.c(this, 13), null, u6Var);
        this.f4289a = r71Var;
        addView(r71Var, gb1.g(-1.0f, -1));
        r71Var.setOnScrollListener(new ai.b(this, 7));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        r71 r71Var = this.f4289a;
        if (i10 == i12) {
            r71Var.f32150g3.O(true);
            if (r71Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < r71Var.getChildCount(); i13++) {
                    if (!(r71Var.getChildAt(i13) instanceof c10)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f4292f) {
            r71Var.f32150g3.O(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = (this.f4292f > 0L ? 1 : (this.f4292f == 0L ? 0 : -1));
        int i11 = this.f4291c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f4289a.f32150g3.O(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = (this.f4292f > 0L ? 1 : (this.f4292f == 0L ? 0 : -1));
        int i11 = this.f4291c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
