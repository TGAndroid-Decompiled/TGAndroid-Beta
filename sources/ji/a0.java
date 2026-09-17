package ji;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import v7.c9;
public abstract class a0 extends FrameLayout implements l4 {
    public a f13749a;
    public final j5.b f13750b;
    public int f13751c;
    public int d;
    public int f13752e;
    public int f13753f;
    public int h;

    public a0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f13512a = Long.MIN_VALUE;
        obj.f13513b = -1;
        this.f13750b = obj;
    }

    public final void c(a aVar) {
        this.f13750b.a(aVar, new fi.f(this, 22));
    }

    public int e() {
        return 0;
    }

    public void f(int i10) {
        int e7;
        int i11;
        int d = c9.d(this.f13749a);
        int i12 = 0;
        if (i10 <= 0 && d <= 0) {
            e7 = 0;
        } else {
            e7 = e();
        }
        a aVar = this.f13749a;
        if (aVar != null && aVar.f13742n) {
            int i13 = aVar.f13740l;
            if (i13 <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(i13, 1, 16, 10));
            }
        } else {
            i11 = this.f13752e;
        }
        a aVar2 = this.f13749a;
        if (aVar2 != null && aVar2.f13743o) {
            int i14 = aVar2.f13741m;
            if (i14 > 0) {
                i12 = AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(i14, 1, 16, 10));
            }
        } else {
            i12 = this.h;
        }
        int i15 = i10 + e7;
        int i16 = d + e7;
        int i17 = this.d;
        int i18 = this.f13753f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i12);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i12);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.f13752e = i11;
        this.f13753f = i12;
        this.h = i13;
        int i14 = this.f13751c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
