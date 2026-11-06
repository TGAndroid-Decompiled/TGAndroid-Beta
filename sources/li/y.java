package li;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.hd;
public abstract class y extends FrameLayout implements j4 {
    public a f18986a;
    public final z f18987b;
    public int f18988c;
    public int d;
    public int f18989e;
    public int f18990f;
    public int h;

    public y(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f19033b = Long.MIN_VALUE;
        obj.f19032a = -1;
        this.f18987b = obj;
    }

    public final void c(a aVar) {
        this.f18987b.a(aVar, new l2.y(this, 4));
    }

    public int d() {
        return 0;
    }

    public void e(int i7) {
        int d;
        int i10;
        int i11;
        int i12;
        int d2 = c8.l1.d(this.f18986a);
        int i13 = 0;
        if (i7 <= 0 && d2 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f18986a;
        if (aVar != null && aVar.f18399n) {
            if (aVar.f18397l <= 0) {
                i10 = 0;
            } else {
                i10 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i12, 1, 16, 10));
            }
        } else {
            i10 = this.f18989e;
        }
        a aVar2 = this.f18986a;
        if (aVar2 != null && aVar2.f18400o) {
            if (aVar2.f18398m > 0) {
                i13 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i11, 1, 16, 10));
            }
        } else {
            i13 = this.h;
        }
        int i14 = i7 + d;
        int i15 = d2 + d;
        int i16 = this.d;
        int i17 = this.f18990f;
        if (hd.f22871a0) {
            setPadding(i16 + i15, i10, i17 + i14, i13);
        } else {
            setPadding(i16 + i14, i10, i17 + i15, i13);
        }
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.d = i7;
        this.f18989e = i10;
        this.f18990f = i11;
        this.h = i12;
        int i13 = this.f18988c;
        if (hd.f22871a0) {
            setPadding(i7, i10, i11 + i13, i12);
        } else {
            setPadding(i7 + i13, i10, i11, i12);
        }
    }
}
