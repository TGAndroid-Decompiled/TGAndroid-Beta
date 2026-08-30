package ig;

import android.content.Context;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
public class e extends d {
    public static final int f7506s = 0;
    public int f7507r;

    public e(Context context, f6 f6Var) {
        super(context, f6Var);
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
        float f10;
        float f11;
        int i12;
        float f12;
        float f13;
        int i13 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        this.f7501c.setLayoutParams(b6.d(40, 40.0f, i10 | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 16;
        if (z4) {
            f10 = 20.0f;
        } else {
            f10 = 109.0f;
        }
        if (z4) {
            f11 = 109.0f;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(b6.d(-1, -2.0f, i14, f10, 0.0f, f11, 0.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i15 = i12 | 16;
        if (z10) {
            f12 = 20.0f;
        } else {
            f12 = 109.0f;
        }
        if (z10) {
            f13 = 109.0f;
        } else {
            f13 = 20.0f;
        }
        this.e.setLayoutParams(b6.d(-1, -2.0f, i15, f12, 0.0f, f13, 0.0f));
        if (LocaleController.isRTL) {
            i13 = 5;
        }
        this.f7502f.setLayoutParams(b6.d(22, 22.0f, i13 | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.f7507r;
    }
}
