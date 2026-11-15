package oi;

import android.content.Context;
import android.widget.FrameLayout;
import c8.ca;
import org.telegram.messenger.hd;
public abstract class x extends FrameLayout implements g4 {
    public a f22106a;
    public final m5.b f22107b;
    public int f22108c;
    public int d;
    public int f22109e;
    public int f22110f;
    public int h;

    public x(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f20470a = Long.MIN_VALUE;
        obj.f20471b = -1;
        this.f22107b = obj;
    }

    public final void c(a aVar) {
        this.f22107b.a(aVar, new ki.e(this, 17));
    }

    public int d() {
        return 0;
    }

    public void e(int i7) {
        int d;
        int i10;
        int i11;
        int i12;
        int d2 = ca.d(this.f22106a);
        int i13 = 0;
        if (i7 <= 0 && d2 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f22106a;
        if (aVar != null && aVar.f21554n) {
            if (aVar.f21552l <= 0) {
                i10 = 0;
            } else {
                i10 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i12, 1, 16, 10));
            }
        } else {
            i10 = this.f22109e;
        }
        a aVar2 = this.f22106a;
        if (aVar2 != null && aVar2.f21555o) {
            if (aVar2.f21553m > 0) {
                i13 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i11, 1, 16, 10));
            }
        } else {
            i13 = this.h;
        }
        int i14 = i7 + d;
        int i15 = d2 + d;
        int i16 = this.d;
        int i17 = this.f22110f;
        if (hd.f24104a0) {
            setPadding(i16 + i15, i10, i17 + i14, i13);
        } else {
            setPadding(i16 + i14, i10, i17 + i15, i13);
        }
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.d = i7;
        this.f22109e = i10;
        this.f22110f = i11;
        this.h = i12;
        int i13 = this.f22108c;
        if (hd.f24104a0) {
            setPadding(i7, i10, i11 + i13, i12);
        } else {
            setPadding(i7 + i13, i10, i11, i12);
        }
    }
}
