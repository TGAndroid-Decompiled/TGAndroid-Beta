package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
public class ExtendedBitmapDrawable extends BitmapDrawable {
    private int invert;
    private int orientation;

    public ExtendedBitmapDrawable(Bitmap bitmap, int i10, int i11) {
        super(bitmap);
        this.invert = i11;
        this.orientation = i10;
    }

    public int getInvert() {
        return this.invert;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean invertHorizontally() {
        if ((this.invert & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean invertVertically() {
        if ((this.invert & 2) != 0) {
            return true;
        }
        return false;
    }
}
