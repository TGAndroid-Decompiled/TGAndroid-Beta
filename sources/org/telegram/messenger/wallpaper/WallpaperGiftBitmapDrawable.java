package org.telegram.messenger.wallpaper;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.List;

public final class WallpaperGiftBitmapDrawable extends BitmapDrawable {
    public final List patternPositions;

    public WallpaperGiftBitmapDrawable(Bitmap bitmap, List list) {
        super(bitmap);
        this.patternPositions = list;
    }

    public static BitmapDrawable create(Bitmap bitmap, List list) {
        if (bitmap == null) {
            return null;
        }
        return (list == null || list.isEmpty()) ? new BitmapDrawable(bitmap) : new WallpaperGiftBitmapDrawable(bitmap, list);
    }
}
