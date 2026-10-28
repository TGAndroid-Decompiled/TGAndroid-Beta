package li;

import a8.zd;
import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public abstract class z extends FrameLayout implements l4 {
    public a f17652a;
    public final k5.b f17653b;
    public int f17654c;
    public int d;
    public int e;
    public int f17655f;
    public int h;

    public z(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f16387a = Long.MIN_VALUE;
        obj.f16388b = -1;
        this.f17653b = obj;
    }

    public final void c(a aVar) {
        this.f17653b.a(aVar, new jg.e1(this, 6));
    }

    public int d() {
        return 0;
    }

    public void e(int i10) {
        int d;
        int i11;
        int i12;
        int i13;
        int d10 = zd.d(this.f17652a);
        int i14 = 0;
        if (i10 <= 0 && d10 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f17652a;
        if (aVar != null && aVar.f17062n) {
            if (aVar.f17060l <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(c3.h0.w(i13, 1, 16, 10));
            }
        } else {
            i11 = this.e;
        }
        a aVar2 = this.f17652a;
        if (aVar2 != null && aVar2.f17063o) {
            if (aVar2.f17061m > 0) {
                i14 = AndroidUtilities.dp(c3.h0.w(i12, 1, 16, 10));
            }
        } else {
            i14 = this.h;
        }
        int i15 = i10 + d;
        int i16 = d10 + d;
        int i17 = this.d;
        int i18 = this.f17655f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i14);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i14);
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.e = i11;
        this.f17655f = i12;
        this.h = i13;
        int i14 = this.f17654c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
