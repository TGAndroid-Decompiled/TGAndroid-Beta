package ii;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import v7.o8;
public abstract class a0 extends FrameLayout implements l4 {
    public a f11220a;
    public final b0 f11221b;
    public int f11222c;
    public int d;
    public int e;
    public int f11223f;
    public int h;

    public a0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f11249b = Long.MIN_VALUE;
        obj.f11248a = -1;
        this.f11221b = obj;
    }

    public final void c(a aVar) {
        this.f11221b.a(aVar, new ei.d5(this, 14));
    }

    public int d() {
        return 0;
    }

    public void f(int i10) {
        int d;
        int i11;
        int d10 = o8.d(this.f11220a);
        int i12 = 0;
        if (i10 <= 0 && d10 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f11220a;
        if (aVar != null && aVar.f11213n) {
            int i13 = aVar.f11211l;
            if (i13 <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(hg.k0.f(i13, 1, 16, 10));
            }
        } else {
            i11 = this.e;
        }
        a aVar2 = this.f11220a;
        if (aVar2 != null && aVar2.f11214o) {
            int i14 = aVar2.f11212m;
            if (i14 > 0) {
                i12 = AndroidUtilities.dp(hg.k0.f(i14, 1, 16, 10));
            }
        } else {
            i12 = this.h;
        }
        int i15 = i10 + d;
        int i16 = d10 + d;
        int i17 = this.d;
        int i18 = this.f11223f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i12);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i12);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.e = i11;
        this.f11223f = i12;
        this.h = i13;
        int i14 = this.f11222c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
