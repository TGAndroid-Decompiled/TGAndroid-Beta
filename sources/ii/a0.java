package ii;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import v7.n8;
public abstract class a0 extends FrameLayout implements m4 {
    public a f12249a;
    public final b0 f12250b;
    public int f12251c;
    public int d;
    public int f12252e;
    public int f12253f;
    public int h;

    public a0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f12279b = Long.MIN_VALUE;
        obj.f12278a = -1;
        this.f12250b = obj;
    }

    public final void c(a aVar) {
        this.f12250b.a(aVar, new ei.c5(this, 13));
    }

    public int d() {
        return 0;
    }

    public void f(int i10) {
        int d;
        int i11;
        int i12;
        int i13;
        int d10 = n8.d(this.f12249a);
        int i14 = 0;
        if (i10 <= 0 && d10 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f12249a;
        if (aVar != null && aVar.f12242n) {
            if (aVar.f12240l <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(hg.c.g(i13, 1, 16, 10));
            }
        } else {
            i11 = this.f12252e;
        }
        a aVar2 = this.f12249a;
        if (aVar2 != null && aVar2.f12243o) {
            if (aVar2.f12241m > 0) {
                i14 = AndroidUtilities.dp(hg.c.g(i12, 1, 16, 10));
            }
        } else {
            i14 = this.h;
        }
        int i15 = i10 + d;
        int i16 = d10 + d;
        int i17 = this.d;
        int i18 = this.f12253f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i14);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i14);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.f12252e = i11;
        this.f12253f = i12;
        this.h = i13;
        int i14 = this.f12251c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
