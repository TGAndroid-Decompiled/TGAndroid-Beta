package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
public class ExtendedBitmapDrawable extends BitmapDrawable {
    private int invert;
    private int orientation;

    public ExtendedBitmapDrawable(Bitmap bitmap, int i, int i2) {
        super(bitmap);
        this.invert = i2;
        this.orientation = i;
    }

    public boolean invertHorizontally() {
        return (this.invert & 1) != 0;
    }

    public boolean invertVertically() {
        return (this.invert & 2) != 0;
    }

    public int getInvert() {
        return this.invert;
    }

    public int getOrientation() {
        return this.orientation;
    }
}
