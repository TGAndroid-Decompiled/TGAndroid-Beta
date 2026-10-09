package ii;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import v7.n8;
public abstract class a0 extends FrameLayout implements n4 {
    public a f12251a;
    public final b0 f12252b;
    public int f12253c;
    public int d;
    public int f12254e;
    public int f12255f;
    public int h;

    public a0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f12282b = Long.MIN_VALUE;
        obj.f12281a = -1;
        this.f12252b = obj;
    }

    public final void c(a aVar) {
        this.f12252b.a(aVar, new ei.c5(this, 13));
    }

    public int d() {
        return 0;
    }

    public void f(int i10) {
        int d;
        int i11;
        int i12;
        int i13;
        int d10 = n8.d(this.f12251a);
        int i14 = 0;
        if (i10 <= 0 && d10 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f12251a;
        if (aVar != null && aVar.f12244n) {
            if (aVar.f12242l <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(hg.c.f(i13, 1, 16, 10));
            }
        } else {
            i11 = this.f12254e;
        }
        a aVar2 = this.f12251a;
        if (aVar2 != null && aVar2.f12245o) {
            if (aVar2.f12243m > 0) {
                i14 = AndroidUtilities.dp(hg.c.f(i12, 1, 16, 10));
            }
        } else {
            i14 = this.h;
        }
        int i15 = i10 + d;
        int i16 = d10 + d;
        int i17 = this.d;
        int i18 = this.f12255f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i14);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i14);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.f12254e = i11;
        this.f12255f = i12;
        this.h = i13;
        int i14 = this.f12253c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
