package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public class ExtendedBitmapDrawable extends BitmapDrawable {
    private boolean canInvert;
    private int orientation;

    public ExtendedBitmapDrawable(Bitmap bitmap, boolean z, int i) {
        super(bitmap);
        this.canInvert = z;
        this.orientation = i;
    }

    public boolean isCanInvert() {
        return this.canInvert;
    }

    public int getOrientation() {
        return this.orientation;
    }
}
