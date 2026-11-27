package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.ui.SaveToGallerySettingsActivity;
public final class ht9 extends in {
    public boolean s;
    public final mm w;
    public final SaveToGallerySettingsActivity x;

    public ht9(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.x = saveToGallerySettingsActivity;
        this.w = new mm(this);
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
        mm mmVar = this.w;
        mmVar.e(false, f);
        int i = aob.y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.x;
        setTextColor(vm2.f(mmVar.c, saveToGallerySettingsActivity.getThemedColor(i), saveToGallerySettingsActivity.getThemedColor(aob.n6)));
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
