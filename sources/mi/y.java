package mi;

import android.content.Context;
import android.widget.FrameLayout;
import b8.ne;
import org.telegram.messenger.bd;
public abstract class y extends FrameLayout implements k4 {
    public a f20029a;
    public final l5.c f20030b;
    public int f20031c;
    public int d;
    public int f20032e;
    public int f20033f;
    public int h;

    public y(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f18042a = Long.MIN_VALUE;
        obj.f18043b = -1;
        this.f20030b = obj;
    }

    public final void c(a aVar) {
        this.f20030b.a(aVar, new l5.b(this, 6));
    }

    public int d() {
        return 0;
    }

    public void e(int i3) {
        int d;
        int i10;
        int i11;
        int i12;
        int d10 = ne.d(this.f20029a);
        int i13 = 0;
        if (i3 <= 0 && d10 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f20029a;
        if (aVar != null && aVar.f19441n) {
            if (aVar.f19439l <= 0) {
                i10 = 0;
            } else {
                i10 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i12, 1, 16, 10));
            }
        } else {
            i10 = this.f20032e;
        }
        a aVar2 = this.f20029a;
        if (aVar2 != null && aVar2.f19442o) {
            if (aVar2.f19440m > 0) {
                i13 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(i11, 1, 16, 10));
            }
        } else {
            i13 = this.h;
        }
        int i14 = i3 + d;
        int i15 = d10 + d;
        int i16 = this.d;
        int i17 = this.f20033f;
        if (bd.f21784a0) {
            setPadding(i16 + i15, i10, i17 + i14, i13);
        } else {
            setPadding(i16 + i14, i10, i17 + i15, i13);
        }
    }

    public final void f(int i3, int i10, int i11, int i12) {
        this.d = i3;
        this.f20032e = i10;
        this.f20033f = i11;
        this.h = i12;
        int i13 = this.f20031c;
        if (bd.f21784a0) {
            setPadding(i3, i10, i11 + i13, i12);
        } else {
            setPadding(i3 + i13, i10, i11, i12);
        }
    }
}
