package ci;

import android.content.Context;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.l41;
public final class tb extends FrameLayout implements cs {
    public final l41 f6049a;
    public final org.telegram.ui.ActionBar.e6 f6050b;
    public final int f6051c;
    public final int d;
    public final boolean f6052e;
    public final long f6053f;
    public final sb h;

    public tb(Context context, boolean z10, long j10, int i3, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = i3;
        this.f6052e = z10;
        this.f6051c = i10;
        this.f6053f = j10;
        this.f6050b = e6Var;
        this.h = new sb(i10, i3, j10, z10);
        l41 l41Var = new l41(context, i10, i11, true, new ai.c(this, 22), new a1.c(this, 20), null, e6Var);
        this.f6049a = l41Var;
        addView(l41Var, mf.c(-1.0f, -1));
        l41Var.setOnScrollListener(new ai.j5(this, 9));
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.f23350z3;
        l41 l41Var = this.f6049a;
        if (i3 == i11) {
            l41Var.f35594g3.O(true);
            if (l41Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < l41Var.getChildCount(); i12++) {
                    if (!(l41Var.getChildAt(i12) instanceof iz)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i3 == hs.D3 && ((Long) objArr[0]).longValue() == this.f6053f) {
            l41Var.f35594g3.O(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = (this.f6053f > 0L ? 1 : (this.f6053f == 0L ? 0 : -1));
        int i10 = this.f6051c;
        if (i3 != 0) {
            hs.f(i10).c(this, hs.D3);
        } else {
            hs.f(i10).c(this, hs.f23350z3);
        }
        this.f6049a.f35594g3.O(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = (this.f6053f > 0L ? 1 : (this.f6053f == 0L ? 0 : -1));
        int i10 = this.f6051c;
        if (i3 != 0) {
            hs.f(i10).n(this, hs.D3);
        } else {
            hs.f(i10).n(this, hs.f23350z3);
        }
    }
}
