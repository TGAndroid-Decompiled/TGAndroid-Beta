package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.wz;
public final class mb extends FrameLayout implements fs {
    public final e51 f9334a;
    public final org.telegram.ui.ActionBar.i6 f9335b;
    public final int f9336c;
    public final int d;
    public final boolean f9337e;
    public final long f9338f;
    public final lb h;
    public org.telegram.ui.Wallet.e4 f9339n;
    public String f9340r;

    public mb(Context context, boolean z10, long j3, int i7, int i10, int i11, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.d = i7;
        this.f9337e = z10;
        this.f9336c = i10;
        this.f9338f = j3;
        this.f9335b = i6Var;
        this.h = new lb(i10, i7, j3, z10);
        e51 e51Var = new e51(context, i10, i11, true, new bi.b(this, 22), new c7(this, 1), null, i6Var);
        this.f9334a = e51Var;
        addView(e51Var, c8.ma.c(-1.0f, -1));
        e51Var.setOnScrollListener(new bi.q1(this, 11));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.B3;
        e51 e51Var = this.f9334a;
        if (i7 == i11) {
            e51Var.f34607g3.O(true);
            if (e51Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < e51Var.getChildCount(); i12++) {
                    if (!(e51Var.getChildAt(i12) instanceof wz)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i7 == ks.F3) {
            if (((Long) objArr[0]).longValue() == this.f9338f) {
                e51Var.f34607g3.O(true);
            }
        } else if (i7 == ks.f25102d4 && this.f9339n != null && !TextUtils.equals(this.f9340r, org.telegram.ui.Wallet.u0.D(this.f9336c).y())) {
            e51Var.f34607g3.O(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = (this.f9338f > 0L ? 1 : (this.f9338f == 0L ? 0 : -1));
        int i10 = this.f9336c;
        if (i7 != 0) {
            ks.f(i10).c(this, ks.F3);
        } else {
            ks.f(i10).c(this, ks.B3);
            if (this.f9337e) {
                ks.f(i10).c(this, ks.f25102d4);
            }
        }
        this.f9334a.f34607g3.O(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = (this.f9338f > 0L ? 1 : (this.f9338f == 0L ? 0 : -1));
        int i10 = this.f9336c;
        if (i7 != 0) {
            ks.f(i10).n(this, ks.F3);
            return;
        }
        ks.f(i10).n(this, ks.B3);
        if (this.f9337e) {
            ks.f(i10).n(this, ks.f25102d4);
        }
    }
}
