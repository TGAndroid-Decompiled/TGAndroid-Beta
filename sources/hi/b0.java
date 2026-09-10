package hi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import v7.f8;
public abstract class b0 extends FrameLayout implements o4 {
    public a f9464a;
    public final c0 f9465b;
    public int f9466c;
    public int d;
    public int e;
    public int f9467f;
    public int h;

    public b0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f9483b = Long.MIN_VALUE;
        obj.f9482a = -1;
        this.f9465b = obj;
    }

    public final void c(a aVar) {
        this.f9465b.a(aVar, new a1.c(this, 28));
    }

    public int d() {
        return 0;
    }

    public void f(int i10) {
        int d;
        int i11;
        int d10 = f8.d(this.f9464a);
        int i12 = 0;
        if (i10 <= 0 && d10 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f9464a;
        if (aVar != null && aVar.f9430n) {
            int i13 = aVar.f9428l;
            if (i13 <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(hc.b.B(i13, 1, 16, 10));
            }
        } else {
            i11 = this.e;
        }
        a aVar2 = this.f9464a;
        if (aVar2 != null && aVar2.f9431o) {
            int i14 = aVar2.f9429m;
            if (i14 > 0) {
                i12 = AndroidUtilities.dp(hc.b.B(i14, 1, 16, 10));
            }
        } else {
            i12 = this.h;
        }
        int i15 = i10 + d;
        int i16 = d10 + d;
        int i17 = this.d;
        int i18 = this.f9467f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i12);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i12);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.e = i11;
        this.f9467f = i12;
        this.h = i13;
        int i14 = this.f9466c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
