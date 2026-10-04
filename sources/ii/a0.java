package ii;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import v7.o8;
public abstract class a0 extends FrameLayout implements m4 {
    public a f12204a;
    public final b0 f12205b;
    public int f12206c;
    public int d;
    public int f12207e;
    public int f12208f;
    public int h;

    public a0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f12235b = Long.MIN_VALUE;
        obj.f12234a = -1;
        this.f12205b = obj;
    }

    public final void c(a aVar) {
        this.f12205b.a(aVar, new ei.f(this, 14));
    }

    public int d() {
        return 0;
    }

    public void f(int i10) {
        int d;
        int i11;
        int d10 = o8.d(this.f12204a);
        int i12 = 0;
        if (i10 <= 0 && d10 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f12204a;
        if (aVar != null && aVar.f12197n) {
            int i13 = aVar.f12195l;
            if (i13 <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(hg.c.f(i13, 1, 16, 10));
            }
        } else {
            i11 = this.f12207e;
        }
        a aVar2 = this.f12204a;
        if (aVar2 != null && aVar2.f12198o) {
            int i14 = aVar2.f12196m;
            if (i14 > 0) {
                i12 = AndroidUtilities.dp(hg.c.f(i14, 1, 16, 10));
            }
        } else {
            i12 = this.h;
        }
        int i15 = i10 + d;
        int i16 = d10 + d;
        int i17 = this.d;
        int i18 = this.f12208f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i12);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i12);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.f12207e = i11;
        this.f12208f = i12;
        this.h = i13;
        int i14 = this.f12206c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
