package gg;

import android.content.Context;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
public class e extends d {
    public static final int f7296s = 0;
    public int f7297r;

    public e(Context context, c6 c6Var) {
        super(context, c6Var);
        this.d.setTypeface(AndroidUtilities.bold());
    }

    @Override
    public boolean b() {
        return !(this instanceof f);
    }

    @Override
    public void d() {
        int i10;
        int i11;
        float f9;
        float f10;
        int i12;
        float f11;
        float f12;
        int i13 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        this.f7290c.setLayoutParams(f6.d(40, 40.0f, i10 | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 16;
        if (z10) {
            f9 = 20.0f;
        } else {
            f9 = 109.0f;
        }
        if (z10) {
            f10 = 109.0f;
        } else {
            f10 = 20.0f;
        }
        this.d.setLayoutParams(f6.d(-1, -2.0f, i14, f9, 0.0f, f10, 0.0f));
        boolean z11 = LocaleController.isRTL;
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
        this.f7291e.setLayoutParams(f6.d(-1, -2.0f, i15, f11, 0.0f, f12, 0.0f));
        if (LocaleController.isRTL) {
            i13 = 5;
        }
        this.f7292f.setLayoutParams(f6.d(22, 22.0f, i13 | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.f7297r;
    }
}
