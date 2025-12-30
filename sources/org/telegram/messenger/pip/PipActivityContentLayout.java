package org.telegram.messenger.pip;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

class PipActivityContentLayout extends FrameLayout {
    private final Activity activity;
    private boolean isViewInPip;
    private int originalHeight;
    private int originalWidth;

    PipActivityContentLayout(Activity activity) {
        super(activity);
        this.activity = activity;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean zIsInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.activity);
        if (!zIsInPictureInPictureMode) {
            this.originalWidth = size;
            this.originalHeight = size2;
        }
        this.isViewInPip = zIsInPictureInPictureMode && size < this.originalWidth && size2 < this.originalHeight;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public boolean isViewInPip() {
        return this.isViewInPip;
    }
}
