package oi;

import android.content.Context;
import android.widget.FrameLayout;
import c8.ea;
import org.telegram.messenger.gd;
public abstract class y extends FrameLayout implements j4 {
    public a f22528a;
    public final m5.b f22529b;
    public int f22530c;
    public int d;
    public int f22531e;
    public int f22532f;
    public int h;

    public y(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f20859a = Long.MIN_VALUE;
        obj.f20860b = -1;
        this.f22529b = obj;
    }

    public final void c(a aVar) {
        this.f22529b.a(aVar, new kg.x1(this, 19));
    }

    public int d() {
        return 0;
    }

    public void e(int i7) {
        int d;
        int i10;
        int i11;
        int i12;
        int d2 = ea.d(this.f22528a);
        int i13 = 0;
        if (i7 <= 0 && d2 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f22528a;
        if (aVar != null && aVar.f21942n) {
            if (aVar.f21940l <= 0) {
                i10 = 0;
            } else {
                i10 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i12, 1, 16, 10));
            }
        } else {
            i10 = this.f22531e;
        }
        a aVar2 = this.f22528a;
        if (aVar2 != null && aVar2.f21943o) {
            if (aVar2.f21941m > 0) {
                i13 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(i11, 1, 16, 10));
            }
        } else {
            i13 = this.h;
        }
        int i14 = i7 + d;
        int i15 = d2 + d;
        int i16 = this.d;
        int i17 = this.f22532f;
        if (gd.f24241a0) {
            setPadding(i16 + i15, i10, i17 + i14, i13);
        } else {
            setPadding(i16 + i14, i10, i17 + i15, i13);
        }
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.d = i7;
        this.f22531e = i10;
        this.f22532f = i11;
        this.h = i12;
        int i13 = this.f22530c;
        if (gd.f24241a0) {
            setPadding(i7, i10, i11 + i13, i12);
        } else {
            setPadding(i7 + i13, i10, i11, i12);
        }
    }
}
