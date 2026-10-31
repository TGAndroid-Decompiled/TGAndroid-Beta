package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.cd;
public abstract class c0 extends FrameLayout implements v4 {
    public a f2881a;
    public final d0 f2882b;
    public int f2883c;
    public int d;
    public int e;
    public int f2884f;
    public int h;

    public c0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f2915b = Long.MIN_VALUE;
        obj.f2914a = -1;
        this.f2882b = obj;
    }

    public final void c(a aVar) {
        this.f2882b.a(aVar, new a1.c(this, 7));
    }

    public int d() {
        return 0;
    }

    public void e(int i10) {
        int d;
        int i11;
        int i12;
        int i13;
        int d10 = v7.a5.d(this.f2881a);
        int i14 = 0;
        if (i10 <= 0 && d10 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f2881a;
        if (aVar != null && aVar.f2827n) {
            if (aVar.f2825l <= 0) {
                i11 = 0;
            } else {
                i11 = org.telegram.messenger.i0.L(i0.a.e(i13, 1, 16, 10));
            }
        } else {
            i11 = this.e;
        }
        a aVar2 = this.f2881a;
        if (aVar2 != null && aVar2.f2828o) {
            if (aVar2.f2826m > 0) {
                i14 = org.telegram.messenger.i0.L(i0.a.e(i12, 1, 16, 10));
            }
        } else {
            i14 = this.h;
        }
        int i15 = i10 + d;
        int i16 = d10 + d;
        int i17 = this.d;
        int i18 = this.f2884f;
        if (cd.X) {
            setPadding(i17 + i16, i11, i18 + i15, i14);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i14);
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.e = i11;
        this.f2884f = i12;
        this.h = i13;
        int i14 = this.f2883c;
        if (cd.X) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
