package ki;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public abstract class a0 extends FrameLayout implements l4 {
    public a f15113a;
    public final j5.c f15114b;
    public int f15115c;
    public int d;
    public int e;
    public int f15116f;
    public int h;

    public a0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f14258a = Long.MIN_VALUE;
        obj.f14259b = -1;
        this.f15114b = obj;
    }

    public final void c(a aVar) {
        this.f15114b.a(aVar, new j5.b(this, 2));
    }

    public int e() {
        return 0;
    }

    public void f(int i10) {
        int e;
        int i11;
        int i12;
        int i13;
        int d = w7.i.d(this.f15113a);
        int i14 = 0;
        if (i10 <= 0 && d <= 0) {
            e = 0;
        } else {
            e = e();
        }
        a aVar = this.f15113a;
        if (aVar != null && aVar.f15106n) {
            if (aVar.f15104l <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i13, 1, 16, 10));
            }
        } else {
            i11 = this.e;
        }
        a aVar2 = this.f15113a;
        if (aVar2 != null && aVar2.f15107o) {
            if (aVar2.f15105m > 0) {
                i14 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i12, 1, 16, 10));
            }
        } else {
            i14 = this.h;
        }
        int i15 = i10 + e;
        int i16 = d + e;
        int i17 = this.d;
        int i18 = this.f15116f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i14);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i14);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.e = i11;
        this.f15116f = i12;
        this.h = i13;
        int i14 = this.f15115c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
