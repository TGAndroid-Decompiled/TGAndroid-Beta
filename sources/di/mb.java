package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.yz;
public final class mb extends FrameLayout implements gs {
    public final h51 f9361a;
    public final org.telegram.ui.ActionBar.h6 f9362b;
    public final int f9363c;
    public final int d;
    public final boolean f9364e;
    public final long f9365f;
    public final lb h;
    public org.telegram.ui.Wallet.e4 f9366n;
    public String f9367r;

    public mb(Context context, boolean z10, long j3, int i7, int i10, int i11, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = i7;
        this.f9364e = z10;
        this.f9363c = i10;
        this.f9365f = j3;
        this.f9362b = h6Var;
        this.h = new lb(i10, i7, j3, z10);
        h51 h51Var = new h51(context, i10, i11, true, new bi.b(this, 22), new v6(this, 2), null, h6Var);
        this.f9361a = h51Var;
        addView(h51Var, c8.ma.c(-1.0f, -1));
        h51Var.setOnScrollListener(new bi.u1(this, 11));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ls.B3;
        h51 h51Var = this.f9361a;
        if (i7 == i11) {
            h51Var.f35789g3.O(true);
            if (h51Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < h51Var.getChildCount(); i12++) {
                    if (!(h51Var.getChildAt(i12) instanceof yz)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i7 == ls.F3) {
            if (((Long) objArr[0]).longValue() == this.f9365f) {
                h51Var.f35789g3.O(true);
            }
        } else if (i7 == ls.f25296d4 && this.f9366n != null && !TextUtils.equals(this.f9367r, org.telegram.ui.Wallet.u0.D(this.f9363c).y())) {
            h51Var.f35789g3.O(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = (this.f9365f > 0L ? 1 : (this.f9365f == 0L ? 0 : -1));
        int i10 = this.f9363c;
        if (i7 != 0) {
            ls.f(i10).c(this, ls.F3);
        } else {
            ls.f(i10).c(this, ls.B3);
            if (this.f9364e) {
                ls.f(i10).c(this, ls.f25296d4);
            }
        }
        this.f9361a.f35789g3.O(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = (this.f9365f > 0L ? 1 : (this.f9365f == 0L ? 0 : -1));
        int i10 = this.f9363c;
        if (i7 != 0) {
            ls.f(i10).n(this, ls.F3);
            return;
        }
        ls.f(i10).n(this, ls.B3);
        if (this.f9364e) {
            ls.f(i10).n(this, ls.f25296d4);
        }
    }
}
