package oi;

import android.content.Context;
import android.widget.FrameLayout;
import c8.fa;
import org.telegram.messenger.hd;
public abstract class x extends FrameLayout implements i4 {
    public a f22468a;
    public final m5.b f22469b;
    public int f22470c;
    public int d;
    public int f22471e;
    public int f22472f;
    public int h;

    public x(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f20828a = Long.MIN_VALUE;
        obj.f20829b = -1;
        this.f22469b = obj;
    }

    public final void c(a aVar) {
        this.f22469b.a(aVar, new kg.y1(this, 19));
    }

    public int d() {
        return 0;
    }

    public void e(int i7) {
        int d;
        int i10;
        int i11;
        int i12;
        int d2 = fa.d(this.f22468a);
        int i13 = 0;
        if (i7 <= 0 && d2 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f22468a;
        if (aVar != null && aVar.f21911n) {
            if (aVar.f21909l <= 0) {
                i10 = 0;
            } else {
                i10 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i12, 1, 16, 10));
            }
        } else {
            i10 = this.f22471e;
        }
        a aVar2 = this.f22468a;
        if (aVar2 != null && aVar2.f21912o) {
            if (aVar2.f21910m > 0) {
                i13 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i11, 1, 16, 10));
            }
        } else {
            i13 = this.h;
        }
        int i14 = i7 + d;
        int i15 = d2 + d;
        int i16 = this.d;
        int i17 = this.f22472f;
        if (hd.f24408a0) {
            setPadding(i16 + i15, i10, i17 + i14, i13);
        } else {
            setPadding(i16 + i14, i10, i17 + i15, i13);
        }
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.d = i7;
        this.f22471e = i10;
        this.f22472f = i11;
        this.h = i12;
        int i13 = this.f22470c;
        if (hd.f24408a0) {
            setPadding(i7, i10, i11 + i13, i12);
        } else {
            setPadding(i7 + i13, i10, i11, i12);
        }
    }
}
