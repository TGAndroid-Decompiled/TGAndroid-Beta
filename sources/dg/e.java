package dg;

import android.content.Context;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
public class e extends d {
    public static final int f4507s = 0;
    public int f4508r;

    public e(Context context, b6 b6Var) {
        super(context, b6Var);
        this.d.setTypeface(AndroidUtilities.bold());
    }

    @Override
    public boolean b() {
        return !(this instanceof f);
    }

    @Override
    public void d() {
        int i9;
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        int i12 = 3;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        this.f4500c.setLayoutParams(e6.d(40, 40.0f, i9 | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i13 = i10 | 16;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = 109.0f;
        }
        if (z10) {
            f11 = 109.0f;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(e6.d(-1, -2.0f, i13, f10, 0.0f, f11, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 16;
        if (z11) {
            f12 = 20.0f;
        } else {
            f12 = 109.0f;
        }
        if (z11) {
            f13 = 109.0f;
        } else {
            f13 = 20.0f;
        }
        this.f4501e.setLayoutParams(e6.d(-1, -2.0f, i14, f12, 0.0f, f13, 0.0f));
        if (LocaleController.isRTL) {
            i12 = 5;
        }
        this.f4502f.setLayoutParams(e6.d(22, 22.0f, i12 | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.f4508r;
    }
}
