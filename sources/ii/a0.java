package ii;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import v7.p8;
public abstract class a0 extends FrameLayout implements m4 {
    public a f11210a;
    public final b0 f11211b;
    public int f11212c;
    public int d;
    public int e;
    public int f11213f;
    public int h;

    public a0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f11238b = Long.MIN_VALUE;
        obj.f11237a = -1;
        this.f11211b = obj;
    }

    public final void c(a aVar) {
        this.f11211b.a(aVar, new ei.d5(this, 13));
    }

    public int d() {
        return 0;
    }

    public void f(int i10) {
        int d;
        int i11;
        int d10 = p8.d(this.f11210a);
        int i12 = 0;
        if (i10 <= 0 && d10 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f11210a;
        if (aVar != null && aVar.f11203n) {
            int i13 = aVar.f11201l;
            if (i13 <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(hg.k0.f(i13, 1, 16, 10));
            }
        } else {
            i11 = this.e;
        }
        a aVar2 = this.f11210a;
        if (aVar2 != null && aVar2.f11204o) {
            int i14 = aVar2.f11202m;
            if (i14 > 0) {
                i12 = AndroidUtilities.dp(hg.k0.f(i14, 1, 16, 10));
            }
        } else {
            i12 = this.h;
        }
        int i15 = i10 + d;
        int i16 = d10 + d;
        int i17 = this.d;
        int i18 = this.f11213f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i12);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i12);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.e = i11;
        this.f11213f = i12;
        this.h = i13;
        int i14 = this.f11212c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
