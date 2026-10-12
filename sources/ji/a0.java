package ji;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import v7.u8;
public abstract class a0 extends FrameLayout implements n4 {
    public a f13119a;
    public final j5.b f13120b;
    public int f13121c;
    public int d;
    public int e;
    public int f13122f;
    public int h;

    public a0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f12840a = Long.MIN_VALUE;
        obj.f12841b = -1;
        this.f13120b = obj;
    }

    public final void c(a aVar) {
        this.f13120b.a(aVar, new f1.a(this, 22));
    }

    public int e() {
        return 0;
    }

    public void f(int i10) {
        int e;
        int i11;
        int i12;
        int i13;
        int d = u8.d(this.f13119a);
        int i14 = 0;
        if (i10 <= 0 && d <= 0) {
            e = 0;
        } else {
            e = e();
        }
        a aVar = this.f13119a;
        if (aVar != null && aVar.f13112n) {
            if (aVar.f13110l <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i13, 1, 16, 10));
            }
        } else {
            i11 = this.e;
        }
        a aVar2 = this.f13119a;
        if (aVar2 != null && aVar2.f13113o) {
            if (aVar2.f13111m > 0) {
                i14 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i12, 1, 16, 10));
            }
        } else {
            i14 = this.h;
        }
        int i15 = i10 + e;
        int i16 = d + e;
        int i17 = this.d;
        int i18 = this.f13122f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i14);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i14);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.e = i11;
        this.f13122f = i12;
        this.h = i13;
        int i14 = this.f13121c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
