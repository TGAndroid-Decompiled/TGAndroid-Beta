package li;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.id;
public abstract class y extends FrameLayout implements j4 {
    public a f18989a;
    public final z f18990b;
    public int f18991c;
    public int d;
    public int f18992e;
    public int f18993f;
    public int h;

    public y(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f19036b = Long.MIN_VALUE;
        obj.f19035a = -1;
        this.f18990b = obj;
    }

    public final void c(a aVar) {
        this.f18990b.a(aVar, new l2.y(this, 4));
    }

    public int d() {
        return 0;
    }

    public void e(int i7) {
        int d;
        int i10;
        int i11;
        int i12;
        int d2 = c8.l1.d(this.f18989a);
        int i13 = 0;
        if (i7 <= 0 && d2 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f18989a;
        if (aVar != null && aVar.f18402n) {
            if (aVar.f18400l <= 0) {
                i10 = 0;
            } else {
                i10 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i12, 1, 16, 10));
            }
        } else {
            i10 = this.f18992e;
        }
        a aVar2 = this.f18989a;
        if (aVar2 != null && aVar2.f18403o) {
            if (aVar2.f18401m > 0) {
                i13 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i11, 1, 16, 10));
            }
        } else {
            i13 = this.h;
        }
        int i14 = i7 + d;
        int i15 = d2 + d;
        int i16 = this.d;
        int i17 = this.f18993f;
        if (id.f23157a0) {
            setPadding(i16 + i15, i10, i17 + i14, i13);
        } else {
            setPadding(i16 + i14, i10, i17 + i15, i13);
        }
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.d = i7;
        this.f18992e = i10;
        this.f18993f = i11;
        this.h = i12;
        int i13 = this.f18991c;
        if (id.f23157a0) {
            setPadding(i7, i10, i11 + i13, i12);
        } else {
            setPadding(i7 + i13, i10, i11, i12);
        }
    }
}
