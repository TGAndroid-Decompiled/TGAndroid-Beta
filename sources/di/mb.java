package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.vz;
public final class mb extends FrameLayout implements fs {
    public final g51 f9322a;
    public final org.telegram.ui.ActionBar.i6 f9323b;
    public final int f9324c;
    public final int d;
    public final boolean f9325e;
    public final long f9326f;
    public final lb h;
    public org.telegram.ui.Wallet.f4 f9327n;
    public String f9328r;

    public mb(Context context, boolean z10, long j3, int i7, int i10, int i11, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.d = i7;
        this.f9325e = z10;
        this.f9324c = i10;
        this.f9326f = j3;
        this.f9323b = i6Var;
        this.h = new lb(i10, i7, j3, z10);
        g51 g51Var = new g51(context, i10, i11, true, new bi.b(this, 22), new v6(this, 2), null, i6Var);
        this.f9322a = g51Var;
        addView(g51Var, c8.na.c(-1.0f, -1));
        g51Var.setOnScrollListener(new bi.v1(this, 11));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.B3;
        g51 g51Var = this.f9322a;
        if (i7 == i11) {
            g51Var.f35323g3.O(true);
            if (g51Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < g51Var.getChildCount(); i12++) {
                    if (!(g51Var.getChildAt(i12) instanceof vz)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i7 == ks.F3) {
            if (((Long) objArr[0]).longValue() == this.f9326f) {
                g51Var.f35323g3.O(true);
            }
        } else if (i7 == ks.f25201d4 && this.f9327n != null && !TextUtils.equals(this.f9328r, org.telegram.ui.Wallet.v0.D(this.f9324c).y())) {
            g51Var.f35323g3.O(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = (this.f9326f > 0L ? 1 : (this.f9326f == 0L ? 0 : -1));
        int i10 = this.f9324c;
        if (i7 != 0) {
            ks.f(i10).c(this, ks.F3);
        } else {
            ks.f(i10).c(this, ks.B3);
            if (this.f9325e) {
                ks.f(i10).c(this, ks.f25201d4);
            }
        }
        this.f9322a.f35323g3.O(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = (this.f9326f > 0L ? 1 : (this.f9326f == 0L ? 0 : -1));
        int i10 = this.f9324c;
        if (i7 != 0) {
            ks.f(i10).n(this, ks.F3);
            return;
        }
        ks.f(i10).n(this, ks.B3);
        if (this.f9325e) {
            ks.f(i10).n(this, ks.f25201d4);
        }
    }
}
