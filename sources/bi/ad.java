package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.r41;
public final class ad extends FrameLayout implements ls {
    public final r41 f3471a;
    public final org.telegram.ui.ActionBar.h6 f3472b;
    public final int f3473c;
    public final int d;
    public final boolean f3474e;
    public final long f3475f;
    public final zc h;

    public ad(Context context, boolean z9, long j3, int i7, int i10, int i11, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = i7;
        this.f3474e = z9;
        this.f3473c = i10;
        this.f3475f = j3;
        this.f3472b = h6Var;
        this.h = new zc(i10, i7, j3, z9);
        r41 r41Var = new r41(context, i10, i11, true, new ai.e(this, 12), new a1.c(this, 19), null, h6Var);
        this.f3471a = r41Var;
        addView(r41Var, c8.ha.c(-1.0f, -1));
        r41Var.setOnScrollListener(new ai.b(this, 6));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.f25125z3;
        r41 r41Var = this.f3471a;
        if (i7 == i11) {
            r41Var.f37496f3.O(true);
            if (r41Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < r41Var.getChildCount(); i12++) {
                    if (!(r41Var.getChildAt(i12) instanceof lz)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i7 == qs.D3 && ((Long) objArr[0]).longValue() == this.f3475f) {
            r41Var.f37496f3.O(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = (this.f3475f > 0L ? 1 : (this.f3475f == 0L ? 0 : -1));
        int i10 = this.f3473c;
        if (i7 != 0) {
            qs.f(i10).c(this, qs.D3);
        } else {
            qs.f(i10).c(this, qs.f25125z3);
        }
        this.f3471a.f37496f3.O(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = (this.f3475f > 0L ? 1 : (this.f3475f == 0L ? 0 : -1));
        int i10 = this.f3473c;
        if (i7 != 0) {
            qs.f(i10).n(this, qs.D3);
        } else {
            qs.f(i10).n(this, qs.f25125z3);
        }
    }
}
