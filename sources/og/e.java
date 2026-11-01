package og;

import android.content.Context;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import w7.b6;
public class e extends d {
    public static final int f14185w = 0;
    public int f14186s;

    public e(Context context, p6 p6Var) {
        super(context, p6Var);
        this.d.setTypeface(i0.o());
    }

    @Override
    public boolean b() {
        return !(this instanceof f);
    }

    @Override
    public void d() {
        int i10;
        int i11;
        float f7;
        float f10;
        int i12;
        float f11;
        float f12;
        int i13 = 3;
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        this.f14179c.setLayoutParams(b6.d(40, 40.0f, i10 | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z10 = dd.X;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 16;
        if (z10) {
            f7 = 20.0f;
        } else {
            f7 = 109.0f;
        }
        if (z10) {
            f10 = 109.0f;
        } else {
            f10 = 20.0f;
        }
        this.d.setLayoutParams(b6.d(-1, -2.0f, i14, f7, 0.0f, f10, 0.0f));
        boolean z11 = dd.X;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i15 = i12 | 16;
        if (z11) {
            f11 = 20.0f;
        } else {
            f11 = 109.0f;
        }
        if (z11) {
            f12 = 109.0f;
        } else {
            f12 = 20.0f;
        }
        this.e.setLayoutParams(b6.d(-1, -2.0f, i15, f11, 0.0f, f12, 0.0f));
        if (dd.X) {
            i13 = 5;
        }
        this.f14180f.setLayoutParams(b6.d(22, 22.0f, i13 | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.f14186s;
    }
}
