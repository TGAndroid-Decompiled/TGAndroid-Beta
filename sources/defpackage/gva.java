package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.ui.Wallet.c;
public final class gva extends FrameLayout implements gk7 {
    public final q5c a;
    public final wjb b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final fva h;
    public kyb n;
    public String r;

    public gva(Context context, boolean z, long j, int i, int i2, int i3, wjb wjbVar) {
        super(context);
        this.d = i;
        this.e = z;
        this.c = i2;
        this.f = j;
        this.b = wjbVar;
        this.h = new fva(i2, i, j, z);
        q5c q5cVar = new q5c(context, i2, i3, true, new tf8(this, (byte) 28), new wh9(this, (byte) 27), null, wjbVar);
        this.a = q5cVar;
        addView(q5cVar, nme.c(-1.0f, -1));
        q5cVar.setOnScrollListener(new n58(this, (byte) 27));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.A3;
        q5c q5cVar = this.a;
        if (i == i3) {
            q5cVar.g3.O(true);
            if (q5cVar.canScrollVertically(1)) {
                for (int i4 = 0; i4 < q5cVar.getChildCount(); i4++) {
                    if (!(q5cVar.getChildAt(i4) instanceof pi4)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i == kk7.E3) {
            if (((Long) objArr[0]).longValue() == this.f) {
                q5cVar.g3.O(true);
            }
        } else if (i == kk7.c4 && this.n != null && !TextUtils.equals(this.r, c.C(this.c).x())) {
            q5cVar.g3.O(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = (this.f > 0L ? 1 : (this.f == 0L ? 0 : -1));
        int i2 = this.c;
        if (i != 0) {
            kk7.f(i2).b(this, kk7.E3);
        } else {
            kk7.f(i2).b(this, kk7.A3);
            if (this.e) {
                kk7.f(i2).b(this, kk7.c4);
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
            kk7.f(i2).n(this, kk7.E3);
            return;
        }
        kk7.f(i2).n(this, kk7.A3);
        if (this.e) {
            kk7.f(i2).n(this, kk7.c4);
        }
    }
}
