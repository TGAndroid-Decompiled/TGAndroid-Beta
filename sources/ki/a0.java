package ki;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public abstract class a0 extends FrameLayout implements l4 {
    public a f15157a;
    public final j5.c f15158b;
    public int f15159c;
    public int d;
    public int e;
    public int f15160f;
    public int h;

    public a0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f14301a = Long.MIN_VALUE;
        obj.f14302b = -1;
        this.f15158b = obj;
    }

    public final void c(a aVar) {
        this.f15158b.a(aVar, new j5.b(this, 2));
    }

    public int d() {
        return 0;
    }

    public void e(int i10) {
        int d;
        int i11;
        int i12;
        int i13;
        int d10 = w7.i.d(this.f15157a);
        int i14 = 0;
        if (i10 <= 0 && d10 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f15157a;
        if (aVar != null && aVar.f15150n) {
            if (aVar.f15148l <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i13, 1, 16, 10));
            }
        } else {
            i11 = this.e;
        }
        a aVar2 = this.f15157a;
        if (aVar2 != null && aVar2.f15151o) {
            if (aVar2.f15149m > 0) {
                i14 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i12, 1, 16, 10));
            }
        } else {
            i14 = this.h;
        }
        int i15 = i10 + d;
        int i16 = d10 + d;
        int i17 = this.d;
        int i18 = this.f15160f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i14);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i14);
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.e = i11;
        this.f15160f = i12;
        this.h = i13;
        int i14 = this.f15159c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
