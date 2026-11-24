package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.ui.SaveToGallerySettingsActivity;
public final class qr9 extends io {
    public boolean s;
    public final ln w;
    public final SaveToGallerySettingsActivity x;

    public qr9(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.x = saveToGallerySettingsActivity;
        this.w = new ln(this);
        getDrawable().K = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        if (this.s) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ln lnVar = this.w;
        lnVar.e(false, f);
        int i = cmb.x6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.x;
        setTextColor(on2.f(lnVar.c, saveToGallerySettingsActivity.getThemedColor(i), saveToGallerySettingsActivity.getThemedColor(cmb.m6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z, boolean z2) {
        float f;
        if (this.s != z) {
            this.s = z;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.w.e(z2, f);
            invalidate();
        }
    }
}
