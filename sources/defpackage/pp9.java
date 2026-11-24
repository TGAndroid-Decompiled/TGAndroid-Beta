package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.ui.SaveToGallerySettingsActivity;
public final class pp9 extends hn {
    public boolean s;
    public final lm w;
    public final SaveToGallerySettingsActivity x;

    public pp9(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.x = saveToGallerySettingsActivity;
        this.w = new lm(this);
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
        lm lmVar = this.w;
        lmVar.e(false, f);
        int i = bkb.x6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.x;
        setTextColor(bm2.f(lmVar.c, saveToGallerySettingsActivity.getThemedColor(i), saveToGallerySettingsActivity.getThemedColor(bkb.m6)));
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
