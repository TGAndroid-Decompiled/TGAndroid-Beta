package org.telegram.messenger.pip;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

public final class PipActivityContentLayout extends FrameLayout {
    public final LaunchActivity activity;
    public boolean isViewInPip;
    public int originalHeight;
    public int originalWidth;

    public PipActivityContentLayout(LaunchActivity launchActivity) {
        super(launchActivity);
        this.activity = launchActivity;
    }

    @Override
    public final void onMeasure(int i, int i2) {
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
}
