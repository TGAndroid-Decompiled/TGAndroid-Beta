package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.ui.Wallet.c;
public final class kxa extends FrameLayout implements jm7 {
    public final q7c a;
    public final ylb b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final jxa h;
    public l0c n;
    public String r;

    public kxa(Context context, boolean z, long j, int i, int i2, int i3, ylb ylbVar) {
        super(context);
        this.d = i;
        this.e = z;
        this.c = i2;
        this.f = j;
        this.b = ylbVar;
        this.h = new jxa(i2, i, j, z);
        q7c q7cVar = new q7c(context, i2, i3, true, new vh8(this, (byte) 28), new wta(this, (byte) 1), null, ylbVar);
        this.a = q7cVar;
        addView(q7cVar, qoe.c(-1.0f, -1));
        q7cVar.setOnScrollListener(new so7(this, (byte) 28));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.B3;
        q7c q7cVar = this.a;
        if (i == i3) {
            q7cVar.g3.O(true);
            if (q7cVar.canScrollVertically(1)) {
                for (int i4 = 0; i4 < q7cVar.getChildCount(); i4++) {
                    if (!(q7cVar.getChildAt(i4) instanceof tk4)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i == nm7.F3) {
            if (((Long) objArr[0]).longValue() == this.f) {
                q7cVar.g3.O(true);
            }
        } else if (i == nm7.e4 && this.n != null && !TextUtils.equals(this.r, c.C(this.c).x())) {
            q7cVar.g3.O(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = (this.f > 0L ? 1 : (this.f == 0L ? 0 : -1));
        int i2 = this.c;
        if (i != 0) {
            nm7.f(i2).b(this, nm7.F3);
        } else {
            nm7.f(i2).b(this, nm7.B3);
            if (this.e) {
                nm7.f(i2).b(this, nm7.e4);
            }
        }
        this.a.g3.O(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = (this.f > 0L ? 1 : (this.f == 0L ? 0 : -1));
        int i2 = this.c;
        if (i != 0) {
            nm7.f(i2).n(this, nm7.F3);
            return;
        }
        nm7.f(i2).n(this, nm7.B3);
        if (this.e) {
            nm7.f(i2).n(this, nm7.e4);
        }
    }
}
