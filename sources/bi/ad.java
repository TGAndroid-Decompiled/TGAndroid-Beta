package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.lz;
public final class ad extends FrameLayout implements ls {
    public final k41 f3468a;
    public final org.telegram.ui.ActionBar.f6 f3469b;
    public final int f3470c;
    public final int d;
    public final boolean f3471e;
    public final long f3472f;
    public final zc h;

    public ad(Context context, boolean z9, long j3, int i7, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = i7;
        this.f3471e = z9;
        this.f3470c = i10;
        this.f3472f = j3;
        this.f3469b = f6Var;
        this.h = new zc(i10, i7, j3, z9);
        k41 k41Var = new k41(context, i10, i11, true, new ai.e(this, 12), new a1.c(this, 19), null, f6Var);
        this.f3468a = k41Var;
        addView(k41Var, c8.ha.c(-1.0f, -1));
        k41Var.setOnScrollListener(new ai.b(this, 6));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.f25104z3;
        k41 k41Var = this.f3468a;
        if (i7 == i11) {
            k41Var.f35167f3.O(true);
            if (k41Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < k41Var.getChildCount(); i12++) {
                    if (!(k41Var.getChildAt(i12) instanceof lz)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i7 == qs.D3 && ((Long) objArr[0]).longValue() == this.f3472f) {
            k41Var.f35167f3.O(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = (this.f3472f > 0L ? 1 : (this.f3472f == 0L ? 0 : -1));
        int i10 = this.f3470c;
        if (i7 != 0) {
            qs.f(i10).c(this, qs.D3);
        } else {
            qs.f(i10).c(this, qs.f25104z3);
        }
        this.f3468a.f35167f3.O(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = (this.f3472f > 0L ? 1 : (this.f3472f == 0L ? 0 : -1));
        int i10 = this.f3470c;
        if (i7 != 0) {
            qs.f(i10).n(this, qs.D3);
        } else {
            qs.f(i10).n(this, qs.f25104z3);
        }
    }
}
