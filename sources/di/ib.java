package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.u41;
public final class ib extends FrameLayout implements is {
    public final u41 f8816a;
    public final org.telegram.ui.ActionBar.e6 f8817b;
    public final int f8818c;
    public final int d;
    public final boolean f8819e;
    public final long f8820f;
    public final hb h;

    public ib(Context context, boolean z10, long j3, int i7, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = i7;
        this.f8819e = z10;
        this.f8818c = i10;
        this.f8820f = j3;
        this.f8817b = e6Var;
        this.h = new hb(i10, i7, j3, z10);
        u41 u41Var = new u41(context, i10, i11, true, new bi.b(this, 23), new z6(this, 1), null, e6Var);
        this.f8816a = u41Var;
        addView(u41Var, c8.ja.c(-1.0f, -1));
        u41Var.setOnScrollListener(new bi.z4(this, 10));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.f25618z3;
        u41 u41Var = this.f8816a;
        if (i7 == i11) {
            u41Var.f39892g3.O(true);
            if (u41Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < u41Var.getChildCount(); i12++) {
                    if (!(u41Var.getChildAt(i12) instanceof pz)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i7 == ns.D3 && ((Long) objArr[0]).longValue() == this.f8820f) {
            u41Var.f39892g3.O(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = (this.f8820f > 0L ? 1 : (this.f8820f == 0L ? 0 : -1));
        int i10 = this.f8818c;
        if (i7 != 0) {
            ns.f(i10).c(this, ns.D3);
        } else {
            ns.f(i10).c(this, ns.f25618z3);
        }
        this.f8816a.f39892g3.O(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = (this.f8820f > 0L ? 1 : (this.f8820f == 0L ? 0 : -1));
        int i10 = this.f8818c;
        if (i7 != 0) {
            ns.f(i10).n(this, ns.D3);
        } else {
            ns.f(i10).n(this, ns.f25618z3);
        }
    }
}
