package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.yz;
public final class mb extends FrameLayout implements gs {
    public final h51 f9326a;
    public final org.telegram.ui.ActionBar.h6 f9327b;
    public final int f9328c;
    public final int d;
    public final boolean f9329e;
    public final long f9330f;
    public final lb h;
    public org.telegram.ui.Wallet.e4 f9331n;
    public String f9332r;

    public mb(Context context, boolean z10, long j3, int i7, int i10, int i11, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = i7;
        this.f9329e = z10;
        this.f9328c = i10;
        this.f9330f = j3;
        this.f9327b = h6Var;
        this.h = new lb(i10, i7, j3, z10);
        h51 h51Var = new h51(context, i10, i11, true, new bi.b(this, 22), new v6(this, 2), null, h6Var);
        this.f9326a = h51Var;
        addView(h51Var, c8.na.c(-1.0f, -1));
        h51Var.setOnScrollListener(new bi.v1(this, 11));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ls.B3;
        h51 h51Var = this.f9326a;
        if (i7 == i11) {
            h51Var.f35742g3.O(true);
            if (h51Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < h51Var.getChildCount(); i12++) {
                    if (!(h51Var.getChildAt(i12) instanceof yz)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i7 == ls.F3) {
            if (((Long) objArr[0]).longValue() == this.f9330f) {
                h51Var.f35742g3.O(true);
            }
        } else if (i7 == ls.f25260d4 && this.f9331n != null && !TextUtils.equals(this.f9332r, org.telegram.ui.Wallet.u0.D(this.f9328c).y())) {
            h51Var.f35742g3.O(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = (this.f9330f > 0L ? 1 : (this.f9330f == 0L ? 0 : -1));
        int i10 = this.f9328c;
        if (i7 != 0) {
            ls.f(i10).c(this, ls.F3);
        } else {
            ls.f(i10).c(this, ls.B3);
            if (this.f9329e) {
                ls.f(i10).c(this, ls.f25260d4);
            }
        }
        this.f9326a.f35742g3.O(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = (this.f9330f > 0L ? 1 : (this.f9330f == 0L ? 0 : -1));
        int i10 = this.f9328c;
        if (i7 != 0) {
            ls.f(i10).n(this, ls.F3);
            return;
        }
        ls.f(i10).n(this, ls.B3);
        if (this.f9329e) {
            ls.f(i10).n(this, ls.f25260d4);
        }
    }
}
